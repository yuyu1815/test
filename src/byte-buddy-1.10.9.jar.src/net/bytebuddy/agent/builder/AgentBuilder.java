/*
 * Copyright 2014 - 2020 Rafael Winterhalter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bytebuddy.agent.builder;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.EntryPoint;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.modifier.*;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.*;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.ExceptionMethod;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.Type;

import java.io.*;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static net.bytebuddy.matcher.ElementMatchers.*;

/**
 * <p>
 * An agent builder provides a convenience API for defining a
 * <a href="http://docs.oracle.com/javase/6/docs/api/java/lang/instrument/package-summary.html">Java agent</a>. By default,
 * this transformation is applied by rebasing the type if not specified otherwise by setting a
 * {@link TypeStrategy}.
 * </p>
 * <p>
 * When defining several {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s, the agent builder always
 * applies the transformers that were supplied with the last applicable matcher. Therefore, more general transformers
 * should be defined first.
 * </p>
 * <p>
 * <b>Note</b>: Any transformation is performed using the {@link AccessControlContext} of an agent's creator.
 * </p>
 * <p>
 * <b>Important</b>: Types that implement lambda expressions (functional interfaces) are not instrumented by default but
 * only when enabling the builder's {@link LambdaInstrumentationStrategy}.
 * </p>
 */
public interface AgentBuilder {

    /**
     * Defines the given {@link net.bytebuddy.ByteBuddy} instance to be used by the created agent.
     *
     * @param byteBuddy The Byte Buddy instance to be used.
     * @return A new instance of this agent builder which makes use of the given {@code byteBuddy} instance.
     */
    AgentBuilder with(ByteBuddy byteBuddy);

    /**
     * Defines the given {@link net.bytebuddy.agent.builder.AgentBuilder.Listener} to be notified by the created agent.
     * The given listener is notified after any other listener that is already registered. If a listener is registered
     * twice, it is also notified twice.
     *
     * @param listener The listener to be notified.
     * @return A new instance of this agent builder which creates an agent that informs the given listener about
     * events.
     */
    AgentBuilder with(Listener listener);

    /**
     * Defines a circularity lock that is acquired upon executing code that potentially loads new classes. While the
     * lock is acquired, any class file transformer refrains from transforming any classes. By default, all created
     * agents use a shared {@link CircularityLock} to avoid that any classes that are required to execute an agent
     * causes a {@link ClassCircularityError}.
     *
     * @param circularityLock The circularity lock to use.
     * @return A new instance of this agent builder which creates an agent that uses the supplied circularity lock.
     */
    AgentBuilder with(CircularityLock circularityLock);

    /**
     * Defines the use of the given type locator for locating a {@link TypeDescription} for an instrumented type.
     *
     * @param poolStrategy The type locator to use.
     * @return A new instance of this agent builder which uses the given type locator for looking up class files.
     */
    AgentBuilder with(PoolStrategy poolStrategy);

    /**
     * Defines the use of the given location strategy for locating binary data to given class names.
     *
     * @param locationStrategy The location strategy to use.
     * @return A new instance of this agent builder which uses the given location strategy for looking up class files.
     */
    AgentBuilder with(LocationStrategy locationStrategy);

    /**
     * Defines how types should be transformed, e.g. if they should be rebased or redefined by the created agent.
     *
     * @param typeStrategy The type strategy to use.
     * @return A new instance of this agent builder which uses the given type strategy.
     */
    AgentBuilder with(TypeStrategy typeStrategy);

    /**
     * Defines a given initialization strategy to be applied to generated types. An initialization strategy is responsible
     * for setting up a type after it was loaded. This initialization must be performed after the transformation because
     * a Java agent is only invoked before loading a type. By default, the initialization logic is added to a class's type
     * initializer which queries a global object for any objects that are to be injected into the generated type.
     *
     * @param initializationStrategy The initialization strategy to use.
     * @return A new instance of this agent builder that applies the given initialization strategy.
     */
    AgentBuilder with(InitializationStrategy initializationStrategy);

    /**
     * <p>
     * Specifies a strategy for modifying types that were already loaded prior to the installation of this transformer.
     * </p>
     * <p>
     * <b>Note</b>: Defining a redefinition strategy resets any refinements of a previously set redefinition strategy.
     * </p>
     * <p>
     * <b>Important</b>: Most JVMs do not support changes of a class's structure after a class was already
     * loaded. Therefore, it is typically required that this class file transformer was built while enabling
     * {@link AgentBuilder#disableClassFormatChanges()}.
     * </p>
     *
     * @param redefinitionStrategy The redefinition strategy to apply.
     * @return A new instance of this agent builder that applies the given redefinition strategy.
     */
    RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy);

    /**
     * <p>
     * Enables or disables management of the JVM's {@code LambdaMetafactory} which is responsible for creating classes that
     * implement lambda expressions. Without this feature enabled, classes that are represented by lambda expressions are
     * not instrumented by the JVM such that Java agents have no effect on them when a lambda expression's class is loaded
     * for the first time.
     * </p>
     * <p>
     * When activating this feature, Byte Buddy instruments the {@code LambdaMetafactory} and takes over the responsibility
     * of creating classes that represent lambda expressions. In doing so, Byte Buddy has the opportunity to apply the built
     * class file transformer. If the current VM does not support lambda expressions, activating this feature has no effect.
     * </p>
     * <p>
     * <b>Important</b>: If this feature is active, it is important to release the built class file transformer when
     * deactivating it. Normally, it is sufficient to call {@link Instrumentation#removeTransformer(ClassFileTransformer)}.
     * When this feature is enabled, it is however also required to invoke
     * {@link LambdaInstrumentationStrategy#release(ClassFileTransformer, Instrumentation)}. Otherwise, the executing VMs class
     * loader retains a reference to the class file transformer what can cause a memory leak.
     * </p>
     *
     * @param lambdaInstrumentationStrategy {@code true} if this feature should be enabled.
     * @return A new instance of this agent builder where this feature is explicitly enabled or disabled.
     */
    AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy);

    /**
     * Specifies a strategy to be used for resolving {@link TypeDescription} for any type handled by the created transformer.
     *
     * @param descriptionStrategy The description strategy to use.
     * @return A new instance of this agent builder that applies the given description strategy.
     */
    AgentBuilder with(DescriptionStrategy descriptionStrategy);

    /**
     * Specifies a fallback strategy to that this agent builder applies upon installing an agent and during class file transformation.
     *
     * @param fallbackStrategy The fallback strategy to be used.
     * @return A new agent builder that applies the supplied fallback strategy.
     */
    AgentBuilder with(FallbackStrategy fallbackStrategy);

    /**
     * Specifies a class file buffer strategy that determines the use of the buffer supplied to a class file transformer.
     *
     * @param classFileBufferStrategy The class file buffer strategy to use.
     * @return A new agent builder that applies the supplied class file buffer strategy.
     */
    AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy);

    /**
     * Adds an installation listener that is notified during installation events. Installation listeners are only invoked if
     * a class file transformer is installed using this agent builder's installation methods and uninstalled via the created
     * {@link ResettableClassFileTransformer}'s {@code reset} methods.
     *
     * @param installationListener The installation listener to register.
     * @return A new agent builder that applies the supplied installation listener.
     */
    AgentBuilder with(InstallationListener installationListener);

    /**
     * Defines a strategy for injecting auxiliary types into the target class loader.
     *
     * @param injectionStrategy The injection strategy to use.
     * @return A new agent builder with the supplied injection strategy configured.
     */
    AgentBuilder with(InjectionStrategy injectionStrategy);

    /**
     * Adds a decorator for the created class file transformer.
     *
     * @param transformerDecorator A decorator to wrap the created class file transformer.
     * @return A new agent builder that applies the supplied transformer decorator.
     */
    AgentBuilder with(TransformerDecorator transformerDecorator);

    /**
     * Enables the use of the given native method prefix for instrumented methods. Note that this prefix is also
     * applied when preserving non-native methods. The use of this prefix is also registered when installing the
     * final agent with an {@link java.lang.instrument.Instrumentation}.
     *
     * @param prefix The prefix to be used.
     * @return A new instance of this agent builder which uses the given native method prefix.
     */
    AgentBuilder enableNativeMethodPrefix(String prefix);

    /**
     * Disables the use of a native method prefix for instrumented methods.
     *
     * @return A new instance of this agent builder which does not use a native method prefix.
     */
    AgentBuilder disableNativeMethodPrefix();

    /**
     * <p>
     * Disables all implicit changes on a class file that Byte Buddy would apply for certain instrumentations. When
     * using this option, it is no longer possible to rebase a method, i.e. intercepted methods are fully replaced. Furthermore,
     * it is no longer possible to implicitly apply loaded type initializers for explicitly initializing the generated type.
     * </p>
     * <p>
     * This is equivalent to setting {@link InitializationStrategy.NoOp} and {@link TypeStrategy.Default#REDEFINE_FROZEN}
     * (unless it is configured as {@link TypeStrategy.Default#DECORATE} where this strategy is retained)
     * as well as configuring the underlying {@link ByteBuddy} instance to use a {@link net.bytebuddy.implementation.Implementation.Context.Disabled}.
     * Using this strategy also configures Byte Buddy to create frozen instrumented types and discards any explicit configuration.
     * </p>
     *
     * @return A new instance of this agent builder that does not apply any implicit changes to the received class file.
     */
    AgentBuilder disableClassFormatChanges();

    /**
     * Assures that all modules of the supplied types are read by the module of any instrumented type. If the current VM does not support
     * the Java module system, calling this method has no effect and this instance is returned.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param type            The types for which to assure their module-visibility from any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... type);

    /**
     * Assures that all supplied modules are read by the module of any instrumented type.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param module          The modules for which to assure their module-visibility from any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... module);

    /**
     * Assures that all supplied modules are read by the module of any instrumented type.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param modules         The modules for which to assure their module-visibility from any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules);

    /**
     * Assures that all modules of the supplied types are read by the module of any instrumented type and vice versa.
     * If the current VM does not support the Java module system, calling this method has no effect and this instance is returned.
     * Setting this option will also ensure that the instrumented type's package is opened to the target module, if applicable.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param type            The types for which to assure their module-visibility from and to any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... type);

    /**
     * Assures that all supplied modules are read by the module of any instrumented type and vice versa.
     * Setting this option will also ensure that the instrumented type's package is opened to the target module.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param module          The modules for which to assure their module-visibility from and to any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... module);

    /**
     * Assures that all supplied modules are read by the module of any instrumented type and vice versa.
     * Setting this option will also ensure that the instrumented type's package is opened to the target module.
     *
     * @param instrumentation The instrumentation instance that is used for adding a module read-dependency.
     * @param modules         The modules for which to assure their module-visibility from and to any instrumented class.
     * @return A new instance of this agent builder that assures the supplied types module visibility.
     * @see Listener.ModuleReadEdgeCompleting
     */
    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules);

    /**
     * <p>
     * Matches a type being loaded in order to apply the supplied {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s before loading this type.
     * If several matchers positively match a type only the latest registered matcher is considered for transformation.
     * </p>
     * <p>
     * If this matcher is chained with additional subsequent matchers, any matcher is executed in registration order with matchers that were registered
     * first being executed first. Doing so, later transformations can override transformations that are applied by this matcher. To avoid this, it is
     * possible to register this transformation as terminal via {@link Identified.Extendable#asTerminalTransformation()} where no subsequent matchers
     * are applied if this matcher matched a given type.
     * </p>
     * <p>
     * <b>Note</b>: When applying a matcher, regard the performance implications by {@link AgentBuilder#ignore(ElementMatcher)}. The former
     * matcher is applied first such that it makes sense to ignore name spaces that are irrelevant to instrumentation. If possible, it is
     * also recommended, to exclude class loaders such as for example the bootstrap class loader by using
     * {@link AgentBuilder#type(ElementMatcher, ElementMatcher)} instead.
     * </p>
     *
     * @param typeMatcher An {@link net.bytebuddy.matcher.ElementMatcher} that is applied on the type being loaded that
     *                    decides if the entailed {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s should
     *                    be applied for that type.
     * @return A definable that represents this agent builder which allows for the definition of one or several
     * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s to be applied when the given {@code typeMatcher}
     * indicates a match.
     */
    Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher);

    /**
     * <p>
     * Matches a type being loaded in order to apply the supplied {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s before loading this type.
     * If several matchers positively match a type only the latest registered matcher is considered for transformation.
     * </p>
     * <p>
     * If this matcher is chained with additional subsequent matchers, any matcher is executed in registration order with matchers that were registered
     * first being executed first. Doing so, later transformations can override transformations that are applied by this matcher. To avoid this, it is
     * possible to register this transformation as terminal via {@link Identified.Extendable#asTerminalTransformation()} where no subsequent matchers
     * are applied if this matcher matched a given type.
     * </p>
     * <p>
     * <b>Note</b>: When applying a matcher, regard the performance implications by {@link AgentBuilder#ignore(ElementMatcher)}. The former
     * matcher is applied first such that it makes sense to ignore name spaces that are irrelevant to instrumentation. If possible, it
     * is also recommended, to exclude class loaders such as for example the bootstrap class loader.
     * </p>
     *
     * @param typeMatcher        An {@link net.bytebuddy.matcher.ElementMatcher} that is applied on the type being
     *                           loaded that decides if the entailed
     *                           {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s should be applied for
     *                           that type.
     * @param classLoaderMatcher An {@link net.bytebuddy.matcher.ElementMatcher} that is applied to the
     *                           {@link java.lang.ClassLoader} that is loading the type being loaded. This matcher
     *                           is always applied first where the type matcher is not applied in case that this
     *                           matcher does not indicate a match.
     * @return A definable that represents this agent builder which allows for the definition of one or several
     * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s to be applied when both the given
     * {@code typeMatcher} and {@code classLoaderMatcher} indicate a match.
     */
    Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher);

    /**
     * <p>
     * Matches a type being loaded in order to apply the supplied {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s before loading this type.
     * If several matchers positively match a type only the latest registered matcher is considered for transformation.
     * </p>
     * <p>
     * If this matcher is chained with additional subsequent matchers, any matcher is executed in registration order with matchers that were registered
     * first being executed first. Doing so, later transformations can override transformations that are applied by this matcher. To avoid this, it is
     * possible to register this transformation as terminal via {@link Identified.Extendable#asTerminalTransformation()} where no subsequent matchers
     * are applied if this matcher matched a given type.
     * </p>
     * <p>
     * <b>Note</b>: When applying a matcher, regard the performance implications by {@link AgentBuilder#ignore(ElementMatcher)}. The former
     * matcher is applied first such that it makes sense to ignore name spaces that are irrelevant to instrumentation. If possible, it
     * is also recommended, to exclude class loaders such as for example the bootstrap class loader.
     * </p>
     *
     * @param typeMatcher        An {@link net.bytebuddy.matcher.ElementMatcher} that is applied on the type being
     *                           loaded that decides if the entailed
     *                           {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s should be applied for
     *                           that type.
     * @param classLoaderMatcher An {@link net.bytebuddy.matcher.ElementMatcher} that is applied to the
     *                           {@link java.lang.ClassLoader} that is loading the type being loaded. This matcher
     *                           is always applied second where the type matcher is not applied in case that this
     *                           matcher does not indicate a match.
     * @param moduleMatcher      An {@link net.bytebuddy.matcher.ElementMatcher} that is applied to the {@link JavaModule}
     *                           of the type being loaded. This matcher is always applied first where the class loader and
     *                           type matchers are not applied in case that this matcher does not indicate a match. On a JVM
     *                           that does not support the Java modules system, this matcher is not applied.
     * @return A definable that represents this agent builder which allows for the definition of one or several
     * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s to be applied when both the given
     * {@code typeMatcher} and {@code classLoaderMatcher} indicate a match.
     */
    Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher,
                               ElementMatcher<? super ClassLoader> classLoaderMatcher,
                               ElementMatcher<? super JavaModule> moduleMatcher);

    /**
     * <p>
     * Matches a type being loaded in order to apply the supplied {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s before loading this type.
     * If several matchers positively match a type only the latest registered matcher is considered for transformation.
     * </p>
     * <p>
     * If this matcher is chained with additional subsequent matchers, any matcher is executed in registration order with matchers that were registered
     * first being executed first. Doing so, later transformations can override transformations that are applied by this matcher. To avoid this, it is
     * possible to register this transformation as terminal via {@link Identified.Extendable#asTerminalTransformation()} where no subsequent matchers
     * are applied if this matcher matched a given type.
     * </p>
     * <p>
     * <b>Note</b>: When applying a matcher, regard the performance implications by {@link AgentBuilder#ignore(ElementMatcher)}. The former
     * matcher is applied first such that it makes sense to ignore name spaces that are irrelevant to instrumentation. If possible, it
     * is also recommended, to exclude class loaders such as for example the bootstrap class loader.
     * </p>
     *
     * @param matcher A matcher that decides if the entailed {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s should be
     *                applied for a type that is being loaded.
     * @return A definable that represents this agent builder which allows for the definition of one or several
     * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s to be applied when the given {@code matcher}
     * indicates a match.
     */
    Identified.Narrowable type(RawMatcher matcher);

    /**
     * <p>
     * Excludes any type that is matched by the provided matcher from instrumentation and considers types by all {@link ClassLoader}s.
     * By default, Byte Buddy does not instrument synthetic types or types that are loaded by the bootstrap class loader.
     * </p>
     * <p>
     * When ignoring a type, any subsequently chained matcher is applied after this matcher in the order of their registration. Also, if
     * any matcher indicates that a type is to be ignored, none of the following chained matchers is executed.
     * </p>
     * <p>
     * <b>Note</b>: For performance reasons, it is recommended to always include a matcher that excludes as many namespaces
     * as possible. Byte Buddy can determine a type's name without parsing its class file and can therefore discard such
     * types with minimal overhead. When a different property of a type - such as for example its modifiers or its annotations
     * is accessed - Byte Buddy parses the class file lazily in order to allow for such a matching. Therefore, any exclusion
     * of a name should always be done as a first step and even if it does not influence the selection of what types are
     * matched. Without changing this property, the class file of every type is being parsed!
     * </p>
     * <p>
     * <b>Warning</b>: If a type is loaded during the instrumentation of the same type, this causes the original call site that loads the type
     * to remain unbound, causing a {@link LinkageError}. It is therefore important to not instrument types that may be loaded during the application
     * of a {@link Transformer}. For this reason, it is not recommended to instrument classes of the bootstrap class loader that Byte Buddy might
     * require for instrumenting a class or to instrument any of Byte Buddy's classes. If such instrumentation is desired, it is important to
     * assert for each class that they are not loaded during instrumentation.
     * </p>
     *
     * @param typeMatcher A matcher that identifies types that should not be instrumented.
     * @return A new instance of this agent builder that ignores all types that are matched by the provided matcher.
     * All previous matchers for ignored types are discarded.
     */
    Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher);

    /**
     * <p>
     * Excludes any type that is matched by the provided matcher and is loaded by a class loader matching the second matcher.
     * By default, Byte Buddy does not instrument synthetic types, types within a {@code net.bytebuddy.*} package or types that
     * are loaded by the bootstrap class loader.
     * </p>
     * <p>
     * When ignoring a type, any subsequently chained matcher is applied after this matcher in the order of their registration. Also, if
     * any matcher indicates that a type is to be ignored, none of the following chained matchers is executed.
     * </p>
     * <p>
     * <b>Note</b>: For performance reasons, it is recommended to always include a matcher that excludes as many namespaces
     * as possible. Byte Buddy can determine a type's name without parsing its class file and can therefore discard such
     * types with minimal overhead. When a different property of a type - such as for example its modifiers or its annotations
     * is accessed - Byte Buddy parses the class file lazily in order to allow for such a matching. Therefore, any exclusion
     * of a name should always be done as a first step and even if it does not influence the selection of what types are
     * matched. Without changing this property, the class file of every type is being parsed!
     * </p>
     * <p>
     * <b>Warning</b>: If a type is loaded during the instrumentation of the same type, this causes the original call site that loads the type
     * to remain unbound, causing a {@link LinkageError}. It is therefore important to not instrument types that may be loaded during the application
     * of a {@link Transformer}. For this reason, it is not recommended to instrument classes of the bootstrap class loader that Byte Buddy might
     * require for instrumenting a class or to instrument any of Byte Buddy's classes. If such instrumentation is desired, it is important to
     * assert for each class that they are not loaded during instrumentation.
     * </p>
     *
     * @param typeMatcher        A matcher that identifies types that should not be instrumented.
     * @param classLoaderMatcher A matcher that identifies a class loader that identifies classes that should not be instrumented.
     * @return A new instance of this agent builder that ignores all types that are matched by the provided matcher.
     * All previous matchers for ignored types are discarded.
     */
    Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher);

    /**
     * <p>
     * Excludes any type that is matched by the provided matcher and is loaded by a class loader matching the second matcher.
     * By default, Byte Buddy does not instrument synthetic types, types within a {@code net.bytebuddy.*} package or types that
     * are loaded by the bootstrap class loader.
     * </p>
     * <p>
     * When ignoring a type, any subsequently chained matcher is applied after this matcher in the order of their registration. Also, if
     * any matcher indicates that a type is to be ignored, none of the following chained matchers is executed.
     * </p>
     * <p>
     * <b>Note</b>: For performance reasons, it is recommended to always include a matcher that excludes as many namespaces
     * as possible. Byte Buddy can determine a type's name without parsing its class file and can therefore discard such
     * types with minimal overhead. When a different property of a type - such as for example its modifiers or its annotations
     * is accessed - Byte Buddy parses the class file lazily in order to allow for such a matching. Therefore, any exclusion
     * of a name should always be done as a first step and even if it does not influence the selection of what types are
     * matched. Without changing this property, the class file of every type is being parsed!
     * </p>
     * <p>
     * <b>Warning</b>: If a type is loaded during the instrumentation of the same type, this causes the original call site that loads the type
     * to remain unbound, causing a {@link LinkageError}. It is therefore important to not instrument types that may be loaded during the application
     * of a {@link Transformer}. For this reason, it is not recommended to instrument classes of the bootstrap class loader that Byte Buddy might
     * require for instrumenting a class or to instrument any of Byte Buddy's classes. If such instrumentation is desired, it is important to
     * assert for each class that they are not loaded during instrumentation.
     * </p>
     *
     * @param typeMatcher        A matcher that identifies types that should not be instrumented.
     * @param classLoaderMatcher A matcher that identifies a class loader that identifies classes that should not be instrumented.
     * @param moduleMatcher      A matcher that identifies a module that identifies classes that should not be instrumented. On a JVM
     *                           that does not support the Java modules system, this matcher is not applied.
     * @return A new instance of this agent builder that ignores all types that are matched by the provided matcher.
     * All previous matchers for ignored types are discarded.
     */
    Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher,
                   ElementMatcher<? super ClassLoader> classLoaderMatcher,
                   ElementMatcher<? super JavaModule> moduleMatcher);

    /**
     * <p>
     * Excludes any type that is matched by the raw matcher provided to this method. By default, Byte Buddy does not
     * instrument synthetic types, types within a {@code net.bytebuddy.*} package or types that are loaded by the bootstrap class loader.
     * </p>
     * <p>
     * When ignoring a type, any subsequently chained matcher is applied after this matcher in the order of their registration. Also, if
     * any matcher indicates that a type is to be ignored, none of the following chained matchers is executed.
     * </p>
     * <p>
     * <b>Note</b>: For performance reasons, it is recommended to always include a matcher that excludes as many namespaces
     * as possible. Byte Buddy can determine a type's name without parsing its class file and can therefore discard such
     * types with minimal overhead. When a different property of a type - such as for example its modifiers or its annotations
     * is accessed - Byte Buddy parses the class file lazily in order to allow for such a matching. Therefore, any exclusion
     * of a name should always be done as a first step and even if it does not influence the selection of what types are
     * matched. Without changing this property, the class file of every type is being parsed!
     * </p>
     * <p>
     * <b>Warning</b>: If a type is loaded during the instrumentation of the same type, this causes the original call site that loads the type
     * to remain unbound, causing a {@link LinkageError}. It is therefore important to not instrument types that may be loaded during the application
     * of a {@link Transformer}. For this reason, it is not recommended to instrument classes of the bootstrap class loader that Byte Buddy might
     * require for instrumenting a class or to instrument any of Byte Buddy's classes. If such instrumentation is desired, it is important to
     * assert for each class that they are not loaded during instrumentation.
     * </p>
     *
     * @param rawMatcher A raw matcher that identifies types that should not be instrumented.
     * @return A new instance of this agent builder that ignores all types that are matched by the provided matcher.
     * All previous matchers for ignored types are discarded.
     */
    Ignored ignore(RawMatcher rawMatcher);

    /**
     * Creates a {@link ResettableClassFileTransformer} that implements the configuration of this
     * agent builder. When using a raw class file transformer, the {@link InstallationListener} callbacks are
     * not invoked and the set {@link RedefinitionStrategy} is not applied onto currently loaded classes.
     *
     * @return A class file transformer that implements the configuration of this agent builder.
     */
    ClassFileTransformer makeRaw();

    /**
     * <p>
     * Creates and installs a {@link ResettableClassFileTransformer} that implements the configuration of
     * this agent builder with a given {@link java.lang.instrument.Instrumentation}. If retransformation is enabled,
     * the installation also causes all loaded types to be retransformed.
     * </p>
     * <p>
     * In order to assure the correct handling of the {@link InstallationListener}, an uninstallation should be applied
     * via the {@link ResettableClassFileTransformer}'s {@code reset} methods.
     * </p>
     *
     * @param instrumentation The instrumentation on which this agent builder's configuration is to be installed.
     * @return The installed class file transformer.
     */
    ResettableClassFileTransformer installOn(Instrumentation instrumentation);

    /**
     * <p>
     * Creates and installs a {@link ResettableClassFileTransformer} that implements the configuration of
     * this agent builder with the Byte Buddy-agent which must be installed prior to calling this method. If retransformation
     * is enabled, the installation also causes all loaded types to be retransformed.
     * </p>
     * <p>
     * In order to assure the correct handling of the {@link InstallationListener}, an uninstallation should be applied
     * via the {@link ResettableClassFileTransformer}'s {@code reset} methods.
     * </p>
     *
     * @return The installed class file transformer.
     * @see AgentBuilder#installOn(Instrumentation)
     */
    ResettableClassFileTransformer installOnByteBuddyAgent();

    /**
     * <p>
     * Creates and installs a {@link ResettableClassFileTransformer} that implements the configuration of
     * this agent builder with a given {@link java.lang.instrument.Instrumentation}. If retransformation is enabled,
     * the installation also causes all loaded types to be retransformed which have changed compared to the previous
     * class file transformer that is provided as an argument.
     * </p>
     * <p>
     * In order to assure the correct handling of the {@link InstallationListener}, an uninstallation should be applied
     * via the {@link ResettableClassFileTransformer}'s {@code reset} methods.
     * </p>
     *
     * @param instrumentation      The instrumentation on which this agent builder's configuration is to be installed.
     * @param classFileTransformer The class file transformer that is being patched.
     * @return The installed class file transformer.
     */
    ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer);

    /**
     * <p>
     * Creates and installs a {@link ResettableClassFileTransformer} that implements the configuration of
     * this agent builder with the Byte Buddy-agent which must be installed prior to calling this method. If retransformation
     * is enabled, the installation also causes all loaded types to be retransformed which have changed compared to the previous
     * class file transformer that is provided as an argument.
     * </p>
     * <p>
     * In order to assure the correct handling of the {@link InstallationListener}, an uninstallation should be applied
     * via the {@link ResettableClassFileTransformer}'s {@code reset} methods.
     * </p>
     *
     * @param classFileTransformer The class file transformer that is being patched.
     * @return The installed class file transformer.
     * @see AgentBuilder#patchOn(Instrumentation, ResettableClassFileTransformer)
     */
    ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer classFileTransformer);

    /**
     * An abstraction for extending a matcher.
     *
     * @param <T> The type that is produced by chaining a matcher.
     */
    interface Matchable<T extends Matchable<T>> {

        /**
         * Defines a matching that is positive if both the previous matcher and the supplied matcher are matched. When matching a
         * type, class loaders are not considered.
         *
         * @param typeMatcher A matcher for the type being matched.
         * @return A chained matcher.
         */
        T and(ElementMatcher<? super TypeDescription> typeMatcher);

        /**
         * Defines a matching that is positive if both the previous matcher and the supplied matcher are matched.
         *
         * @param typeMatcher        A matcher for the type being matched.
         * @param classLoaderMatcher A matcher for the type's class loader.
         * @return A chained matcher.
         */
        T and(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher);

        /**
         * Defines a matching that is positive if both the previous matcher and the supplied matcher are matched.
         *
         * @param typeMatcher        A matcher for the type being matched.
         * @param classLoaderMatcher A matcher for the type's class loader.
         * @param moduleMatcher      A matcher for the type's module. On a JVM that does not support modules, the Java module is represented by {@code null}.
         * @return A chained matcher.
         */
        T and(ElementMatcher<? super TypeDescription> typeMatcher,
              ElementMatcher<? super ClassLoader> classLoaderMatcher,
              ElementMatcher<? super JavaModule> moduleMatcher);

        /**
         * Defines a matching that is positive if both the previous matcher and the supplied matcher are matched.
         *
         * @param rawMatcher A raw matcher for the type being matched.
         * @return A chained matcher.
         */
        T and(RawMatcher rawMatcher);

        /**
         * Defines a matching that is positive if the previous matcher or the supplied matcher are matched. When matching a
         * type, the class loader is not considered.
         *
         * @param typeMatcher A matcher for the type being matched.
         * @return A chained matcher.
         */
        T or(ElementMatcher<? super TypeDescription> typeMatcher);

        /**
         * Defines a matching that is positive if the previous matcher or the supplied matcher are matched.
         *
         * @param typeMatcher        A matcher for the type being matched.
         * @param classLoaderMatcher A matcher for the type's class loader.
         * @return A chained matcher.
         */
        T or(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher);

        /**
         * Defines a matching that is positive if the previous matcher or the supplied matcher are matched.
         *
         * @param typeMatcher        A matcher for the type being matched.
         * @param classLoaderMatcher A matcher for the type's class loader.
         * @param moduleMatcher      A matcher for the type's module. On a JVM that does not support modules, the Java module is represented by {@code null}.
         * @return A chained matcher.
         */
        T or(ElementMatcher<? super TypeDescription> typeMatcher,
             ElementMatcher<? super ClassLoader> classLoaderMatcher,
             ElementMatcher<? super JavaModule> moduleMatcher);

        /**
         * Defines a matching that is positive if the previous matcher or the supplied matcher are matched.
         *
         * @param rawMatcher A raw matcher for the type being matched.
         * @return A chained matcher.
         */
        T or(RawMatcher rawMatcher);

        /**
         * An abstract base implementation of a matchable.
         *
         * @param <S> The type that is produced by chaining a matcher.
         */
        abstract class AbstractBase<S extends Matchable<S>> implements Matchable<S> {

            /**
             * {@inheritDoc}
             */
            public S and(ElementMatcher<? super TypeDescription> typeMatcher) {
                return and(typeMatcher, any());
            }

            /**
             * {@inheritDoc}
             */
            public S and(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher) {
                return and(typeMatcher, classLoaderMatcher, any());
            }

            /**
             * {@inheritDoc}
             */
            public S and(ElementMatcher<? super TypeDescription> typeMatcher,
                         ElementMatcher<? super ClassLoader> classLoaderMatcher,
                         ElementMatcher<? super JavaModule> moduleMatcher) {
                return and(new RawMatcher.ForElementMatchers(typeMatcher, classLoaderMatcher, moduleMatcher));
            }

            /**
             * {@inheritDoc}
             */
            public S or(ElementMatcher<? super TypeDescription> typeMatcher) {
                return or(typeMatcher, any());
            }

            /**
             * {@inheritDoc}
             */
            public S or(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher) {
                return or(typeMatcher, classLoaderMatcher, any());
            }

            /**
             * {@inheritDoc}
             */
            public S or(ElementMatcher<? super TypeDescription> typeMatcher,
                        ElementMatcher<? super ClassLoader> classLoaderMatcher,
                        ElementMatcher<? super JavaModule> moduleMatcher) {
                return or(new RawMatcher.ForElementMatchers(typeMatcher, classLoaderMatcher, moduleMatcher));
            }
        }
    }

    /**
     * Allows to further specify ignored types.
     */
    interface Ignored extends Matchable<Ignored>, AgentBuilder {
        /* this is merely a unionizing interface that does not declare methods */
    }

    /**
     * An agent builder configuration that allows the registration of listeners to the redefinition process.
     */
    interface RedefinitionListenable extends AgentBuilder {

        /**
         * <p>
         * A redefinition listener is invoked before each batch of type redefinitions and on every error as well as
         * after the redefinition was completed. A redefinition listener can be used for debugging or logging purposes
         * and to apply actions between each batch, e.g. to pause or wait in order to avoid rendering the current VM
         * non-responsive if a lot of classes are redefined.
         * </p>
         * <p>
         * Adding several listeners does not replace previous listeners but applies them in the registration order.
         * </p>
         *
         * @param redefinitionListener The listener to register.
         * @return A new instance of this agent builder which notifies the specified listener upon type redefinitions.
         */
        RedefinitionListenable with(RedefinitionStrategy.Listener redefinitionListener);

        /**
         * Enables resubmission of failed transformations by applying a retransformation of the loaded type. This can be meaningful if
         * class files cannot be located from the class loader as a resource where the loaded type becomes available.
         *
         * @param resubmissionScheduler A scheduler which is responsible for scheduling the resubmission job.
         * @return A new instance of this agent builder that applies resubmission.
         */
        AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler);

        /**
         * Enables resubmission of failed transformations by applying a retransformation of the loaded type. This can be meaningful if
         * class files cannot be located from the class loader as a resource where the loaded type becomes available.
         *
         * @param resubmissionScheduler A scheduler which is responsible for scheduling the resubmission job.
         * @param matcher               A matcher that filters throwable instances where non-matched throwables are not triggering a resubmission.
         * @return A new instance of this agent builder that applies resubmission.
         */
        AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> matcher);

        /**
         * An agent builder configuration strategy that allows the definition of a discovery strategy.
         */
        interface WithImplicitDiscoveryStrategy extends RedefinitionListenable {

            /**
             * Limits the redefinition attempt to the specified types.
             *
             * @param type The types to consider for redefinition.
             * @return A new instance of this agent builder which only considers the supplied types for redefinition.
             */
            RedefinitionListenable redefineOnly(Class<?>... type);

            /**
             * A discovery strategy is responsible for locating loaded types that should be considered for redefinition.
             *
             * @param redefinitionDiscoveryStrategy The redefinition discovery strategy to use.
             * @return A new instance of this agent builder which makes use of the specified discovery strategy.
             */
            RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy);
        }

        /**
         * An agent builder configuration that allows the configuration of a batching strategy.
         */
        interface WithoutBatchStrategy extends WithImplicitDiscoveryStrategy {

            /**
             * A batch allocator is responsible for diving a redefining of existing types into several chunks. This allows
             * to narrow down errors for the redefining of specific types or to apply a {@link RedefinitionStrategy.Listener}
             * action between chunks.
             *
             * @param redefinitionBatchAllocator The batch allocator to use.
             * @return A new instance of this agent builder which makes use of the specified batch allocator.
             */
            WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator);
        }
    }

    /**
     * Describes an {@link net.bytebuddy.agent.builder.AgentBuilder} which was handed a matcher for identifying
     * types to instrumented in order to supply one or several
     * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s.
     */
    interface Identified {

        /**
         * Applies the given transformer for the already supplied matcher.
         *
         * @param transformer The transformer to apply.
         * @return A new instance of this agent builder with the transformer being applied when the previously supplied matcher
         * identified a type for instrumentation which also allows for the registration of subsequent transformers.
         */
        Extendable transform(Transformer transformer);

        /**
         * Allows to specify a type matcher for a type to instrument.
         */
        interface Narrowable extends Matchable<Narrowable>, Identified {
            /* this is merely a unionizing interface that does not declare methods */
        }

        /**
         * This interface is used to allow for optionally providing several
         * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer} to applied when a matcher identifies a type
         * to be instrumented. Any subsequent transformers are applied in the order they are registered.
         */
        interface Extendable extends AgentBuilder, Identified {

            /**
             * Applies the previously defined transformation as terminal such that no subsequent transformers are applied even
             * if their matchers would include the type that was matched for applying this transformer. If this option is not set,
             * subsequent transformations are applied after this transformation such that it is possible that they override non-additive
             * type transformations.
             *
             * @return A new agent builder that applies the previously configured transformer terminally.
             */
            AgentBuilder asTerminalTransformation();
        }
    }

    /**
     * A matcher that allows to determine if a {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}
     * should be applied during the execution of a {@link java.lang.instrument.ClassFileTransformer} that was
     * generated by an {@link net.bytebuddy.agent.builder.AgentBuilder}.
     */
    interface RawMatcher {

        /**
         * Decides if the given {@code typeDescription} should be instrumented with the entailed
         * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s.
         *
         * @param typeDescription     A description of the type to be instrumented.
         * @param classLoader         The class loader of the instrumented type. Might be {@code null} if this class
         *                            loader represents the bootstrap class loader.
         * @param module              The transformed type's module or {@code null} if the current VM does not support modules.
         * @param classBeingRedefined The class being redefined which is only not {@code null} if a retransformation
         *                            is applied.
         * @param protectionDomain    The protection domain of the type being transformed.
         * @return {@code true} if the entailed {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s should
         * be applied for the given {@code typeDescription}.
         */
        boolean matches(TypeDescription typeDescription,
                        ClassLoader classLoader,
                        JavaModule module,
                        Class<?> classBeingRedefined,
                        ProtectionDomain protectionDomain);

        /**
         * A matcher that always or never matches a type.
         */
        enum Trivial implements RawMatcher {

            /**
             * Always matches a type.
             */
            MATCHING(true),

            /**
             * Never matches a type.
             */
            NON_MATCHING(false);

            /**
             * {@code true} if this matcher always matches a type.
             */
            private final boolean matches;

            /**
             * Creates a new trivial raw matcher.
             *
             * @param matches {@code true} if this matcher always matches a type.
             */
            Trivial(boolean matches) {
                this.matches = matches;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return matches;
            }
        }

        /**
         * A raw matcher indicating the state of a type's class loading.
         */
        enum ForLoadState implements RawMatcher {

            /**
             * Indicates that a type was already loaded.
             */
            LOADED(false),

            /**
             * Indicates that a type was not yet loaded.
             */
            UNLOADED(true);

            /**
             * {@code true} if a type is expected to be unloaded..
             */
            private final boolean unloaded;

            /**
             * Creates a new load state matcher.
             *
             * @param unloaded {@code true} if a type is expected to be unloaded..
             */
            ForLoadState(boolean unloaded) {
                this.unloaded = unloaded;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return classBeingRedefined == null == unloaded;
            }
        }

        /**
         * Only matches loaded types that can be fully resolved. Types with missing dependencies might not be
         * resolvable and can therefore trigger errors during redefinition.
         */
        enum ForResolvableTypes implements RawMatcher {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                if (classBeingRedefined != null) {
                    try {
                        return Class.forName(classBeingRedefined.getName(), true, classLoader) == classBeingRedefined;
                    } catch (Throwable ignored) {
                        return false;
                    }
                } else {
                    return true;
                }
            }

            /**
             * Returns an inverted version of this matcher.
             *
             * @return An inverted version of this matcher.
             */
            public RawMatcher inverted() {
                return new Inversion(this);
            }
        }

        /**
         * A conjunction of two raw matchers.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Conjunction implements RawMatcher {

            /**
             * The left matcher which is applied first.
             */
            private final RawMatcher left;

            /**
             * The right matcher which is applied second.
             */
            private final RawMatcher right;

            /**
             * Creates a new conjunction of two raw matchers.
             *
             * @param left  The left matcher which is applied first.
             * @param right The right matcher which is applied second.
             */
            protected Conjunction(RawMatcher left, RawMatcher right) {
                this.left = left;
                this.right = right;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return left.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)
                        && right.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain);
            }
        }

        /**
         * A disjunction of two raw matchers.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Disjunction implements RawMatcher {

            /**
             * The left matcher which is applied first.
             */
            private final RawMatcher left;

            /**
             * The right matcher which is applied second.
             */
            private final RawMatcher right;

            /**
             * Creates a new disjunction of two raw matchers.
             *
             * @param left  The left matcher which is applied first.
             * @param right The right matcher which is applied second.
             */
            protected Disjunction(RawMatcher left, RawMatcher right) {
                this.left = left;
                this.right = right;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return left.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)
                        || right.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain);
            }
        }

        /**
         * A raw matcher that inverts a raw matcher's result.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Inversion implements RawMatcher {

            /**
             * The matcher to invert.
             */
            private final RawMatcher matcher;

            /**
             * Creates a raw matcher that inverts its result.
             *
             * @param matcher The matcher to invert.
             */
            public Inversion(RawMatcher matcher) {
                this.matcher = matcher;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return !matcher.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain);
            }
        }

        /**
         * A raw matcher implementation that checks a {@link TypeDescription}
         * and its {@link java.lang.ClassLoader} against two suitable matchers in order to determine if the matched
         * type should be instrumented.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ForElementMatchers implements RawMatcher {

            /**
             * The type matcher to apply to a {@link TypeDescription}.
             */
            private final ElementMatcher<? super TypeDescription> typeMatcher;

            /**
             * The class loader matcher to apply to a {@link java.lang.ClassLoader}.
             */
            private final ElementMatcher<? super ClassLoader> classLoaderMatcher;

            /**
             * A module matcher to apply to a {@code java.lang.Module}.
             */
            private final ElementMatcher<? super JavaModule> moduleMatcher;


            /**
             * Creates a new {@link net.bytebuddy.agent.builder.AgentBuilder.RawMatcher} that only matches the
             * supplied {@link TypeDescription} against a supplied matcher.
             *
             * @param typeMatcher The type matcher to apply to a {@link TypeDescription}.
             */
            public ForElementMatchers(ElementMatcher<? super TypeDescription> typeMatcher) {
                this(typeMatcher, any());
            }

            /**
             * Creates a new {@link net.bytebuddy.agent.builder.AgentBuilder.RawMatcher} that only matches the
             * supplied {@link TypeDescription} and its {@link java.lang.ClassLoader} against two matcher in order
             * to decided if an instrumentation should be conducted.
             *
             * @param typeMatcher        The type matcher to apply to a {@link TypeDescription}.
             * @param classLoaderMatcher The class loader matcher to apply to a {@link java.lang.ClassLoader}.
             */
            public ForElementMatchers(ElementMatcher<? super TypeDescription> typeMatcher,
                                      ElementMatcher<? super ClassLoader> classLoaderMatcher) {
                this(typeMatcher, classLoaderMatcher, any());
            }

            /**
             * Creates a new {@link net.bytebuddy.agent.builder.AgentBuilder.RawMatcher} that only matches the
             * supplied {@link TypeDescription}, its {@link java.lang.ClassLoader} and module against element
             * suitable matchers.
             *
             * @param typeMatcher        The type matcher to apply to a {@link TypeDescription}.
             * @param classLoaderMatcher The class loader matcher to apply to a {@link java.lang.ClassLoader}.
             * @param moduleMatcher      A module matcher to apply to a {@code java.lang.Module}.
             */
            public ForElementMatchers(ElementMatcher<? super TypeDescription> typeMatcher,
                                      ElementMatcher<? super ClassLoader> classLoaderMatcher,
                                      ElementMatcher<? super JavaModule> moduleMatcher) {
                this.typeMatcher = typeMatcher;
                this.classLoaderMatcher = classLoaderMatcher;
                this.moduleMatcher = moduleMatcher;
            }

            /**
             * {@inheritDoc}
             */
            public boolean matches(TypeDescription typeDescription,
                                   ClassLoader classLoader,
                                   JavaModule module,
                                   Class<?> classBeingRedefined,
                                   ProtectionDomain protectionDomain) {
                return moduleMatcher.matches(module) && classLoaderMatcher.matches(classLoader) && typeMatcher.matches(typeDescription);
            }
        }
    }

    /**
     * A listener that is informed about events that occur during an instrumentation process.
     */
    interface Listener {

        /**
         * Indicates that a transformed type is loaded.
         */
        boolean LOADED = true;

        /**
         * Invoked upon a type being supplied to a transformer.
         *
         * @param typeName    The binary name of the instrumented type.
         * @param classLoader The class loader which is loading this type.
         * @param module      The instrumented type's module or {@code null} if the current VM does not support modules.
         * @param loaded      {@code true} if the type is already loaded.
         */
        void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded);

        /**
         * Invoked prior to a successful transformation being applied.
         *
         * @param typeDescription The type that is being transformed.
         * @param classLoader     The class loader which is loading this type.
         * @param module          The transformed type's module or {@code null} if the current VM does not support modules.
         * @param loaded          {@code true} if the type is already loaded.
         * @param dynamicType     The dynamic type that was created.
         */
        void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType);

        /**
         * Invoked when a type is not transformed but ignored.
         *
         * @param typeDescription The type being ignored for transformation.
         * @param classLoader     The class loader which is loading this type.
         * @param module          The ignored type's module or {@code null} if the current VM does not support modules.
         * @param loaded          {@code true} if the type is already loaded.
         */
        void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded);

        /**
         * Invoked when an error has occurred during transformation.
         *
         * @param typeName    The binary name of the instrumented type.
         * @param classLoader The class loader which is loading this type.
         * @param module      The instrumented type's module or {@code null} if the current VM does not support modules.
         * @param loaded      {@code true} if the type is already loaded.
         * @param throwable   The occurred error.
         */
        void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable);

        /**
         * Invoked after a class was attempted to be loaded, independently of its treatment.
         *
         * @param typeName    The binary name of the instrumented type.
         * @param classLoader The class loader which is loading this type.
         * @param module      The instrumented type's module or {@code null} if the current VM does not support modules.
         * @param loaded      {@code true} if the type is already loaded.
         */
        void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded);

        /**
         * A no-op implementation of a {@link net.bytebuddy.agent.builder.AgentBuilder.Listener}.
         */
        enum NoOp implements Listener {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }
        }

        /**
         * An adapter for a listener where all methods are implemented as non-operational.
         */
        abstract class Adapter implements Listener {

            /**
             * {@inheritDoc}
             */
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                /* do nothing */
            }
        }

        /**
         * A listener that writes events to a {@link PrintStream}. This listener prints a line per event, including the event type and
         * the name of the type in question.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class StreamWriting implements Listener {

            /**
             * The prefix that is appended to all written messages.
             */
            protected static final String PREFIX = "[Byte Buddy]";

            /**
             * The print stream written to.
             */
            private final PrintStream printStream;

            /**
             * Creates a new stream writing listener.
             *
             * @param printStream The print stream written to.
             */
            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            /**
             * Creates a new stream writing listener that writes to {@link System#out}.
             *
             * @return A listener writing events to the standard output stream.
             */
            public static StreamWriting toSystemOut() {
                return new StreamWriting(System.out);
            }

            /**
             * Creates a new stream writing listener that writes to {@link System#err}.
             *
             * @return A listener writing events to the standard error stream.
             */
            public static StreamWriting toSystemError() {
                return new StreamWriting(System.err);
            }

            /**
             * Returns a version of this listener that only reports successfully transformed classes and failed transformations.
             *
             * @return A version of this listener that only reports successfully transformed classes and failed transformations.
             */
            public Listener withTransformationsOnly() {
                return new WithTransformationsOnly(this);
            }

            /**
             * Returns a version of this listener that only reports failed transformations.
             *
             * @return A version of this listener that only reports failed transformations.
             */
            public Listener withErrorsOnly() {
                return new WithErrorsOnly(this);
            }

            /**
             * {@inheritDoc}
             */
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                printStream.printf(PREFIX + " DISCOVERY %s [%s, %s, loaded=%b]%n", typeName, classLoader, module, loaded);
            }

            /**
             * {@inheritDoc}
             */
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                printStream.printf(PREFIX + " TRANSFORM %s [%s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, module, loaded);
            }

            /**
             * {@inheritDoc}
             */
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {
                printStream.printf(PREFIX + " IGNORE %s [%s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, module, loaded);
            }

            /**
             * {@inheritDoc}
             */
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                synchronized (printStream) {
                    printStream.printf(PREFIX + " ERROR %s [%s, %s, loaded=%b]%n", typeName, classLoader, module, loaded);
                    throwable.printStackTrace(printStream);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                printStream.printf(PREFIX + " COMPLETE %s [%s, %s, loaded=%b]%n", typeName, classLoader, module, loaded);
            }
        }

        /**
         * A listener that filters types with a given name from being logged.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Filtering implements Listener {

            /**
             * The matcher to decide upon a type should be logged.
             */
            private final ElementMatcher<? super String> matcher;

            /**
             * The delegate listener.
             */
            private final Listener delegate;

            /**
             * Creates a new filtering listener.
             *
             * @param matcher  The matcher to decide upon a type should be logged.
             * @param delegate The delegate listener.
             */
            public Filtering(ElementMatcher<? super String> matcher, Listener delegate) {
                this.matcher = matcher;
                this.delegate = delegate;
            }

            /**
             * {@inheritDoc}
             */
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                if (matcher.matches(typeName)) {
                    delegate.onDiscovery(typeName, classLoader, module, loaded);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                if (matcher.matches(typeDescription.getName())) {
                    delegate.onTransformation(typeDescription, classLoader, module, loaded, dynamicType);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {
                if (matcher.matches(typeDescription.getName())) {
                    delegate.onIgnored(typeDescription, classLoader, module, loaded);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                if (matcher.matches(typeName)) {
                    delegate.onError(typeName, classLoader, module, loaded, throwable);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                if (matcher.matches(typeName)) {
                    delegate.onComplete(typeName, classLoader, module, loaded);
                }
            }
        }

        /**
         * A listener that only delegates events if they are successful or failed transformations.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class WithTransformationsOnly extends Adapter {

            /**
             * The delegate listener.
             */
            private final Listener delegate;

            /**
             * Creates a new listener that only delegates events if they are successful or failed transformations.
             *
             * @param delegate The delegate listener.
             */
            public WithTransformationsOnly(Listener delegate) {
                this.delegate = delegate;
            }

            @Override
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                delegate.onTransformation(typeDescription, classLoader, module, loaded, dynamicType);
            }

            @Override
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                delegate.onError(typeName, classLoader, module, loaded, throwable);
            }
        }

        /**
         * A listener that only delegates events if they are failed transformations.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class WithErrorsOnly extends Adapter {

            /**
             * The delegate listener.
             */
            private final Listener delegate;

            /**
             * Creates a new listener that only delegates events if they are failed transformations.
             *
             * @param delegate The delegate listener.
             */
            public WithErrorsOnly(Listener delegate) {
                this.delegate = delegate;
            }

            @Override
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                delegate.onError(typeName, classLoader, module, loaded, throwable);
            }
        }

        /**
         * A listener that adds read-edges to any module of an instrumented class upon its transformation and opens the class's package to the module.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ModuleReadEdgeCompleting extends Adapter {

            /**
             * The instrumentation instance used for adding read edges.
             */
            private final Instrumentation instrumentation;

            /**
             * {@code true} if the listener should also add a read-edge from the supplied modules to the instrumented type's module.
             * This will also ensure that the package of the instrumented type is exported to the target module.
             */
            private final boolean addTargetEdge;

            /**
             * The modules to add as a read edge to any transformed class's module.
             */
            private final Set<? extends JavaModule> modules;

            /**
             * Creates a new module read-edge completing listener.
             *
             * @param instrumentation The instrumentation instance used for adding read edges.
             * @param addTargetEdge   {@code true} if the listener should also add a read-edge from the supplied
             *                        modules to the instrumented type's module. This will also ensure that the package
             *                        of the instrumented type is exported to the target module.
             * @param modules         The modules to add as a read edge to any transformed class's module.
             */
            public ModuleReadEdgeCompleting(Instrumentation instrumentation, boolean addTargetEdge, Set<? extends JavaModule> modules) {
                this.instrumentation = instrumentation;
                this.addTargetEdge = addTargetEdge;
                this.modules = modules;
            }

            /**
             * Resolves a listener that adds module edges from and to the instrumented type's module.
             *
             * @param instrumentation The instrumentation instance used for adding read edges.
             * @param addTargetEdge   {@code true} if the listener should also add a read-edge from the supplied
             *                        modules to the instrumented type's module. This will also ensure that the package
             *                        of the instrumented type is exported to the target module.
             * @param type            The types for which to extract the modules.
             * @return An appropriate listener.
             */
            public static Listener of(Instrumentation instrumentation, boolean addTargetEdge, Class<?>... type) {
                Set<JavaModule> modules = new HashSet<JavaModule>();
                for (Class<?> aType : type) {
                    modules.add(JavaModule.ofType(aType));
                }
                return modules.isEmpty()
                        ? Listener.NoOp.INSTANCE
                        : new Listener.ModuleReadEdgeCompleting(instrumentation, addTargetEdge, modules);
            }

            @Override
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                if (module != JavaModule.UNSUPPORTED && module.isNamed()) {
                    for (JavaModule target : modules) {
                        if (!module.canRead(target) || addTargetEdge && !module.isOpened(typeDescription.getPackage(), target)) {
                            module.modify(instrumentation,
                                    Collections.singleton(target),
                                    Collections.<String, Set<JavaModule>>emptyMap(),
                                    !addTargetEdge || typeDescription.getPackage() == null
                                            ? Collections.<String, Set<JavaModule>>emptyMap()
                                            : Collections.singletonMap(typeDescription.getPackage().getName(), Collections.singleton(target)),
                                    Collections.<Class<?>>emptySet(),
                                    Collections.<Class<?>, List<Class<?>>>emptyMap());
                        }
                        if (addTargetEdge && !target.canRead(module)) {
                            target.modify(instrumentation,
                                    Collections.singleton(module),
                                    Collections.<String, Set<JavaModule>>emptyMap(),
                                    Collections.<String, Set<JavaModule>>emptyMap(),
                                    Collections.<Class<?>>emptySet(),
                                    Collections.<Class<?>, List<Class<?>>>emptyMap());
                        }
                    }
                }
            }
        }

        /**
         * A compound listener that allows to group several listeners in one instance.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Compound implements Listener {

            /**
             * The listeners that are represented by this compound listener in their application order.
             */
            private final List<Listener> listeners;

            /**
             * Creates a new compound listener.
             *
             * @param listener The listeners to apply in their application order.
             */
            public Compound(Listener... listener) {
                this(Arrays.asList(listener));
            }

            /**
             * Creates a new compound listener.
             *
             * @param listeners The listeners to apply in their application order.
             */
            public Compound(List<? extends Listener> listeners) {
                this.listeners = new ArrayList<Listener>();
                for (Listener listener : listeners) {
                    if (listener instanceof Compound) {
                        this.listeners.addAll(((Compound) listener).listeners);
                    } else if (!(listener instanceof NoOp)) {
                        this.listeners.add(listener);
                    }
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                for (Listener listener : listeners) {
                    listener.onDiscovery(typeName, classLoader, module, loaded);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded, DynamicType dynamicType) {
                for (Listener listener : listeners) {
                    listener.onTransformation(typeDescription, classLoader, module, loaded, dynamicType);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, boolean loaded) {
                for (Listener listener : listeners) {
                    listener.onIgnored(typeDescription, classLoader, module, loaded);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                for (Listener listener : listeners) {
                    listener.onError(typeName, classLoader, module, loaded, throwable);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
                for (Listener listener : listeners) {
                    listener.onComplete(typeName, classLoader, module, loaded);
                }
            }
        }
    }

    /**
     * A circularity lock is responsible for preventing that a {@link ClassFileLocator} is used recursively.
     * This can happen when a class file transformation causes another class to be loaded. Without avoiding
     * such circularities, a class loading is aborted by a {@link ClassCircularityError} which causes the
     * class loading to fail.
     */
    interface CircularityLock {

        /**
         * Attempts to acquire a circularity lock.
         *
         * @return {@code true} if the lock was acquired successfully, {@code false} if it is already hold.
         */
        boolean acquire();

        /**
         * Releases the circularity lock if it is currently acquired.
         */
        void release();

        /**
         * An inactive circularity lock which is always acquirable.
         */
        enum Inactive implements CircularityLock {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public boolean acquire() {
                return true;
            }

            /**
             * {@inheritDoc}
             */
            public void release() {
                /* do nothing */
            }
        }

        /**
         * A default implementation of a circularity lock. Since class loading already synchronizes on a class loader,
         * it suffices to apply a thread-local lock.
         */
        class Default extends ThreadLocal<Boolean> implements CircularityLock {

            /**
             * Indicates that the circularity lock is not currently acquired.
             */
            private static final Boolean NOT_ACQUIRED = null;

            /**
             * {@inheritDoc}
             */
            public boolean acquire() {
                if (get() == NOT_ACQUIRED) {
                    set(true);
                    return true;
                } else {
                    return false;
                }
            }

            /**
             * {@inheritDoc}
             */
            public void release() {
                set(NOT_ACQUIRED);
            }
        }

        /**
         * A circularity lock that holds a global monitor and does not permit concurrent access.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Global implements CircularityLock {

            /**
             * The lock to hold.
             */
            private final Lock lock;

            /**
             * The time to wait for the lock.
             */
            private final long time;

            /**
             * The time's time unit.
             */
            private final TimeUnit timeUnit;

            /**
             * Creates a new global circularity lock that does not wait for a release.
             */
            public Global() {
                this(0, TimeUnit.MILLISECONDS);
            }

            /**
             * Creates a new global circularity lock.
             *
             * @param time     The time to wait for the lock.
             * @param timeUnit The time's time unit.
             */
            public Global(long time, TimeUnit timeUnit) {
                lock = new ReentrantLock();
                this.time = time;
                this.timeUnit = timeUnit;
            }

            /**
             * {@inheritDoc}
             */
            public boolean acquire() {
                try {
                    return time == 0
                            ? lock.tryLock()
                            : lock.tryLock(time, timeUnit);
                } catch (InterruptedException ignored) {
                    return false;
                }
            }

            /**
             * {@inheritDoc}
             */
            public void release() {
                lock.unlock();
            }
        }
    }

    /**
     * A type strategy is responsible for creating a type builder for a type that is being instrumented.
     */
    interface TypeStrategy {

        /**
         * Creates a type builder for a given type.
         *
         * @param typeDescription       The type being instrumented.
         * @param byteBuddy             The Byte Buddy configuration.
         * @param classFileLocator      The class file locator to use.
         * @param methodNameTransformer The method name transformer to use.
         * @param classLoader           The instrumented type's class loader or {@code null} if the type is loaded by the bootstrap loader.
         * @param module                The instrumented type's module or {@code null} if it is not declared by a module.
         * @param protectionDomain      The instrumented type's protection domain or {@code null} if it does not define a protection domain.
         * @return A type builder for the given arguments.
         */
        DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                       ByteBuddy byteBuddy,
                                       ClassFileLocator classFileLocator,
                                       MethodNameTransformer methodNameTransformer,
                                       ClassLoader classLoader,
                                       JavaModule module,
                                       ProtectionDomain protectionDomain);

        /**
         * Default implementations of type strategies.
         */
        enum Default implements TypeStrategy {

            /**
             * A definition handler that performs a rebasing for all types.
             */
            REBASE {
                /** {@inheritDoc} */
                public DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                                      ByteBuddy byteBuddy,
                                                      ClassFileLocator classFileLocator,
                                                      MethodNameTransformer methodNameTransformer,
                                                      ClassLoader classLoader,
                                                      JavaModule module,
                                                      ProtectionDomain protectionDomain) {
                    return byteBuddy.rebase(typeDescription, classFileLocator, methodNameTransformer);
                }
            },

            /**
             * <p>
             * A definition handler that performs a redefinition for all types.
             * </p>
             * <p>
             * Note that the default agent builder is configured to apply a self initialization where a static class initializer
             * is added to the redefined class. This can be disabled by for example using a {@link InitializationStrategy.Minimal} or
             * {@link InitializationStrategy.NoOp}. Also, consider the constraints implied by {@link ByteBuddy#redefine(TypeDescription, ClassFileLocator)}.
             * </p>
             * <p>
             * For prohibiting any changes on a class file, use {@link AgentBuilder#disableClassFormatChanges()}
             * </p>
             */
            REDEFINE {
                /** {@inheritDoc} */
                public DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                                      ByteBuddy byteBuddy,
                                                      ClassFileLocator classFileLocator,
                                                      MethodNameTransformer methodNameTransformer,
                                                      ClassLoader classLoader,
                                                      JavaModule module,
                                                      ProtectionDomain protectionDomain) {
                    return byteBuddy.redefine(typeDescription, classFileLocator);
                }
            },

            /**
             * <p>
             * A definition handler that performs a redefinition for all types and ignores all methods that were not declared by the instrumented type.
             * </p>
             * <p>
             * Note that the default agent builder is configured to apply a self initialization where a static class initializer
             * is added to the redefined class. This can be disabled by for example using a {@link InitializationStrategy.Minimal} or
             * {@link InitializationStrategy.NoOp}. Also, consider the constraints implied by {@link ByteBuddy#redefine(TypeDescription, ClassFileLocator)}.
             * Using this strategy also configures Byte Buddy to create frozen instrumented types and discards any explicit configuration.
             * </p>
             * <p>
             * For prohibiting any changes on a class file, use {@link AgentBuilder#disableClassFormatChanges()}
             * </p>
             */
            REDEFINE_FROZEN {
                /** {@inheritDoc} */
                public DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                                      ByteBuddy byteBuddy,
                                                      ClassFileLocator classFileLocator,
                                                      MethodNameTransformer methodNameTransformer,
                                                      ClassLoader classLoader,
                                                      JavaModule module,
                                                      ProtectionDomain protectionDomain) {
                    return byteBuddy.with(InstrumentedType.Factory.Default.FROZEN)
                            .with(VisibilityBridgeStrategy.Default.NEVER)
                            .redefine(typeDescription, classFileLocator)
                            .ignoreAlso(LatentMatcher.ForSelfDeclaredMethod.NOT_DECLARED);
                }
            },

            /**
             * <p>
             * A definition handler that performs a decoration of declared methods only. Using this type strategy
             * implies the limitations that are described by {@link ByteBuddy#decorate(TypeDescription, ClassFileLocator)}.
             * This type strategy can be useful when only applying {@link AsmVisitorWrapper}s without attempting to change
             * the class file layout..
             * </p>
             * <p>
             * Note that the default agent builder is configured to apply a self initialization where a static class initializer
             * is added to the redefined class. This can be disabled by for example using a {@link InitializationStrategy.Minimal} or
             * {@link InitializationStrategy.NoOp}. Also, consider the constraints implied by {@link ByteBuddy#redefine(TypeDescription, ClassFileLocator)}.
             * Using this strategy also configures Byte Buddy to create frozen instrumented types and discards any explicit configuration.
             * </p>
             * <p>
             * For prohibiting any changes on a class file, use {@link AgentBuilder#disableClassFormatChanges()}
             * </p>
             */
            DECORATE {
                /** {@inheritDoc} */
                public DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                                      ByteBuddy byteBuddy,
                                                      ClassFileLocator classFileLocator,
                                                      MethodNameTransformer methodNameTransformer,
                                                      ClassLoader classLoader,
                                                      JavaModule module,
                                                      ProtectionDomain protectionDomain) {
                    return byteBuddy.decorate(typeDescription, classFileLocator);
                }
            }
        }

        /**
         * A type strategy that applies a build {@link EntryPoint}.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ForBuildEntryPoint implements TypeStrategy {

            /**
             * The entry point to apply.
             */
            private final EntryPoint entryPoint;

            /**
             * Creates a new type strategy for an entry point.
             *
             * @param entryPoint The entry point to apply.
             */
            public ForBuildEntryPoint(EntryPoint entryPoint) {
                this.entryPoint = entryPoint;
            }

            /**
             * {@inheritDoc}
             */
            public DynamicType.Builder<?> builder(TypeDescription typeDescription,
                                                  ByteBuddy byteBuddy,
                                                  ClassFileLocator classFileLocator,
                                                  MethodNameTransformer methodNameTransformer,
                                                  ClassLoader classLoader,
                                                  JavaModule module,
                                                  ProtectionDomain protectionDomain) {
                return entryPoint.transform(typeDescription, byteBuddy, classFileLocator, methodNameTransformer);
            }
        }
    }

    /**
     * A transformer allows to apply modifications to a {@link net.bytebuddy.dynamic.DynamicType}. Such a modification
     * is then applied to any instrumented type that was matched by the preceding matcher.
     */
    interface Transformer {

        /**
         * Allows for a transformation of a {@link net.bytebuddy.dynamic.DynamicType.Builder}.
         *
         * @param builder         The dynamic builder to transform.
         * @param typeDescription The description of the type currently being instrumented.
         * @param classLoader     The class loader of the instrumented class. Might be {@code null} to represent the bootstrap class loader.
         * @param module          The class's module or {@code null} if the current VM does not support modules.
         * @return A transformed version of the supplied {@code builder}.
         */
        DynamicType.Builder<?> transform(DynamicType.Builder<?> builder,
                                         TypeDescription typeDescription,
                                         ClassLoader classLoader,
                                         JavaModule module);

        /**
         * A transformer that applies a build {@link Plugin}. Note that a transformer is never completed as class loading
         * might happen dynamically such that plugins are not closed.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ForBuildPlugin implements Transformer {

            /**
             * The plugin to apply.
             */
            private final Plugin plugin;

            /**
             * Creates a new transformer for a build {@link Plugin}.
             *
             * @param plugin The plugin to apply.
             */
            public ForBuildPlugin(Plugin plugin) {
                this.plugin = plugin;
            }

            /**
             * {@inheritDoc}
             */
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder,
                                                    TypeDescription typeDescription,
                                                    ClassLoader classLoader,
                                                    JavaModule module) {
                return plugin.apply(builder, typeDescription, ClassFileLocator.ForClassLoader.of(classLoader));
            }
        }

        /**
         * A transformer for applying an {@link Advice} where this advice class might reference types of both the agent's and the user's
         * class loader. Using this transformer, it is possible to apply advice without including any library dependencies of this advice
         * class which are then rather looked up from the transformed class's class loader. For this to work, it is required to register
         * the advice class's class loader manually via the {@code include} methods and to reference the advice class by its fully-qualified
         * name. The advice class is then never loaded by rather described by a {@link TypePool}.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ForAdvice implements Transformer {

            /**
             * The advice to use.
             */
            private final Advice.WithCustomMapping advice;

            /**
             * The exception handler to register for the advice.
             */
            private final Advice.ExceptionHandler exceptionHandler;

            /**
             * The assigner to use for the advice.
             */
            private final Assigner assigner;

            /**
             * The class file locator to query for the advice class.
             */
            private final ClassFileLocator classFileLocator;

            /**
             * The pool strategy to use for looking up an advice.
             */
            private final PoolStrategy poolStrategy;

            /**
             * The location strategy to use for class loaders when resolving advice classes.
             */
            private final LocationStrategy locationStrategy;

            /**
             * The advice entries to apply.
             */
            private final List<Entry> entries;

            /**
             * Creates a new advice transformer with a default setup.
             */
            public ForAdvice() {
                this(Advice.withCustomMapping());
            }

            /**
             * Creates a new advice transformer which applies the given advice.
             *
             * @param advice The configured advice to use.
             */
            public ForAdvice(Advice.WithCustomMapping advice) {
                this(advice,
                        Advice.ExceptionHandler.Default.SUPPRESSING,
                        Assigner.DEFAULT,
                        ClassFileLocator.NoOp.INSTANCE,
                        PoolStrategy.Default.FAST,
                        LocationStrategy.ForClassLoader.STRONG,
                        Collections.<Entry>emptyList());
            }

            /**
             * Creates a new advice transformer.
             *
             * @param advice           The configured advice to use.
             * @param exceptionHandler The exception handler to use.
             * @param assigner         The assigner to use.
             * @param classFileLocator The class file locator to use.
             * @param poolStrategy     The pool strategy to use for looking up an advice.
             * @param locationStrategy The location strategy to use for class loaders when resolving advice classes.
             * @param entries          The advice entries to apply.
             */
            protected ForAdvice(Advice.WithCustomMapping advice,
                                Advice.ExceptionHandler exceptionHandler,
                                Assigner assigner,
                                ClassFileLocator classFileLocator,
                                PoolStrategy poolStrategy,
                                LocationStrategy locationStrategy,
                                List<Entry> entries) {
                this.advice = advice;
                this.exceptionHandler = exceptionHandler;
                this.assigner = assigner;
                this.classFileLocator = classFileLocator;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.entries = entries;
            }

            /**
             * {@inheritDoc}
             */
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder,
                                                    TypeDescription typeDescription,
                                                    ClassLoader classLoader,
                                                    JavaModule module) {
                ClassFileLocator classFileLocator = new ClassFileLocator.Compound(this.classFileLocator, locationStrategy.classFileLocator(classLoader, module));
                TypePool typePool = poolStrategy.typePool(classFileLocator, classLoader);
                AsmVisitorWrapper.ForDeclaredMethods asmVisitorWrapper = new AsmVisitorWrapper.ForDeclaredMethods();
                for (Entry entry : entries) {
                    asmVisitorWrapper = asmVisitorWrapper.invokable(entry.getMatcher().resolve(typeDescription), entry.resolve(advice, typePool, classFileLocator)
                            .withAssigner(assigner)
                            .withExceptionHandler(exceptionHandler));
                }
                return builder.visit(asmVisitorWrapper);
            }

            /**
             * Registers a pool strategy for creating a {@link TypePool} that should be used for creating the advice class.
             *
             * @param poolStrategy The pool strategy to use.
             * @return A new instance of this advice transformer that applies the supplied pool strategy.
             */
            public ForAdvice with(PoolStrategy poolStrategy) {
                return new ForAdvice(advice, exceptionHandler, assigner, classFileLocator, poolStrategy, locationStrategy, entries);
            }

            /**
             * Registers a location strategy for creating a {@link ClassFileLocator} from the class loader that is supplied during transformation
             * that should be used for looking up advice-relevant classes.
             *
             * @param locationStrategy The location strategy to use.
             * @return A new instance of this advice transformer that applies the supplied location strategy.
             */
            public ForAdvice with(LocationStrategy locationStrategy) {
                return new ForAdvice(advice, exceptionHandler, assigner, classFileLocator, poolStrategy, locationStrategy, entries);
            }

            /**
             * Registers an exception handler for suppressed exceptions to use by the registered advice.
             *
             * @param exceptionHandler The exception handler to use.
             * @return A new instance of this advice transformer that applies the supplied exception handler.
             * @see Advice#withExceptionHandler(StackManipulation)
             */
            public ForAdvice withExceptionHandler(Advice.ExceptionHandler exceptionHandler) {
                return new ForAdvice(advice, exceptionHandler, assigner, classFileLocator, poolStrategy, locationStrategy, entries);
            }

            /**
             * Registers an assigner to be used by the advice class.
             *
             * @param assigner The assigner to use.
             * @return A new instance of this advice transformer that applies the supplied assigner.
             * @see Advice#withAssigner(Assigner)
             */
            public ForAdvice with(Assigner assigner) {
                return new ForAdvice(advice, exceptionHandler, assigner, classFileLocator, poolStrategy, locationStrategy, entries);
            }

            /**
             * Includes the supplied class loaders as a source for looking up an advice class or its dependencies.
             * Note that the supplied class loaders are queried for types before the class loader of the instrumented class.
             *
             * @param classLoader The class loaders to include when looking up classes in their order. Duplicates are filtered.
             * @return A new instance of this advice transformer that considers the supplied class loaders as a lookup source.
             */
            public ForAdvice include(ClassLoader... classLoader) {
                Set<ClassFileLocator> classFileLocators = new LinkedHashSet<ClassFileLocator>();
                for (ClassLoader aClassLoader : classLoader) {
                    classFileLocators.add(ClassFileLocator.ForClassLoader.of(aClassLoader));
                }
                return include(new ArrayList<ClassFileLocator>(classFileLocators));
            }

            /**
             * Includes the supplied class file locators as a source for looking up an advice class or its dependencies.
             * Note that the supplied class loaders are queried for types before the class loader of the instrumented class.
             *
             * @param classFileLocator The class file locators to include when looking up classes in their order. Duplicates are filtered.
             * @return A new instance of this advice transformer that considers the supplied class file locators as a lookup source.
             */
            public ForAdvice include(ClassFileLocator... classFileLocator) {
                return include(Arrays.asList(classFileLocator));
            }

            /**
             * Includes the supplied class file locators as a source for looking up an advice class or its dependencies.
             * Note that the supplied class loaders are queried for types before the class loader of the instrumented class.
             *
             * @param classFileLocators The class file locators to include when looking up classes in their order. Duplicates are filtered.
             * @return A new instance of this advice transformer that considers the supplied class file locators as a lookup source.
             */
            public ForAdvice include(List<? extends ClassFileLocator> classFileLocators) {
                return new ForAdvice(advice,
                        exceptionHandler,
                        assigner,
                        new ClassFileLocator.Compound(CompoundList.of(classFileLocator, classFileLocators)),
                        poolStrategy,
                        locationStrategy,
                        entries);
            }

            /**
             * Applies the given advice class onto all methods that satisfy the supplied matcher.
             *
             * @param matcher The matcher to determine what methods the advice should be applied to.
             * @param name    The fully-qualified, binary name of the advice class.
             * @return A new instance of this advice transformer that applies the given advice to all matched methods of an instrumented type.
             */
            public ForAdvice advice(ElementMatcher<? super MethodDescription> matcher, String name) {
                return advice(new LatentMatcher.Resolved<MethodDescription>(matcher), name);
            }

            /**
             * Applies the given advice class onto all methods that satisfy the supplied matcher.
             *
             * @param matcher The matcher to determine what methods the advice should be applied to.
             * @param name    The fully-qualified, binary name of the advice class.
             * @return A new instance of this advice transformer that applies the given advice to all matched methods of an instrumented type.
             */
            public ForAdvice advice(LatentMatcher<? super MethodDescription> matcher, String name) {
                return new ForAdvice(advice,
                        exceptionHandler,
                        assigner,
                        classFileLocator,
                        poolStrategy,
                        locationStrategy,
                        CompoundList.of(entries, new Entry.ForUnifiedAdvice(matcher, name)));
            }

            /**
             * Applies the given advice class onto all methods that satisfy the supplied matcher.
             *
             * @param matcher The matcher to determine what methods the advice should be applied to.
             * @param enter   The fully-qualified, binary name of the enter advice class.
             * @param exit    The fully-qualified, binary name of the exit advice class.
             * @return A new instance of this advice transformer that applies the given advice to all matched methods of an instrumented type.
             */
            public ForAdvice advice(ElementMatcher<? super MethodDescription> matcher, String enter, String exit) {
                return advice(new LatentMatcher.Resolved<MethodDescription>(matcher), enter, exit);
            }

            /**
             * Applies the given advice class onto all methods that satisfy the supplied matcher.
             *
             * @param matcher The matcher to determine what methods the advice should be applied to.
             * @param enter   The fully-qualified, binary name of the enter advice class.
             * @param exit    The fully-qualified, binary name of the exit advice class.
             * @return A new instance of this advice transformer that applies the given advice to all matched methods of an instrumented type.
             */
            public ForAdvice advice(LatentMatcher<? super MethodDescription> matcher, String enter, String exit) {
                return new ForAdvice(advice,
                        exceptionHandler,
                        assigner,
                        classFileLocator,
                        poolStrategy,
                        locationStrategy,
                        CompoundList.of(entries, new Entry.ForSplitAdvice(matcher, enter, exit)));
            }

            /**
             * An entry for an advice to apply.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected abstract static class Entry {

                /**
                 * The matcher for advised methods.
                 */
                private final LatentMatcher<? super MethodDescription> matcher;

                /**
                 * Creates a new entry.
                 *
                 * @param matcher The matcher for advised methods.
                 */
                protected Entry(LatentMatcher<? super MethodDescription> matcher) {
                    this.matcher = matcher;
                }

                /**
                 * Returns the matcher for advised methods.
                 *
                 * @return The matcher for advised methods.
                 */
                protected LatentMatcher<? super MethodDescription> getMatcher() {
                    return matcher;
                }

                /**
                 * Resolves the advice for this entry.
                 *
                 * @param advice           The advice configuration.
                 * @param typePool         The type pool to use.
                 * @param classFileLocator The class file locator to use.
                 * @return The resolved advice.
                 */
                protected abstract Advice resolve(Advice.WithCustomMapping advice, TypePool typePool, ClassFileLocator classFileLocator);

                /**
                 * An entry for an advice class where both the (optional) entry and exit advice methods are declared by the same class.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForUnifiedAdvice extends Entry {

                    /**
                     * The name of the advice class.
                     */
                    protected final String name;

                    /**
                     * Creates a new entry for an advice class where both the (optional) entry and exit advice methods are declared by the same class.
                     *
                     * @param matcher The matcher for advised methods.
                     * @param name    The name of the advice class.
                     */
                    protected ForUnifiedAdvice(LatentMatcher<? super MethodDescription> matcher, String name) {
                        super(matcher);
                        this.name = name;
                    }

                    @Override
                    protected Advice resolve(Advice.WithCustomMapping advice, TypePool typePool, ClassFileLocator classFileLocator) {
                        return advice.to(typePool.describe(name).resolve(), classFileLocator);
                    }
                }

                /**
                 * An entry for an advice class where both entry and exit advice methods are declared by the different classes.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForSplitAdvice extends Entry {

                    /**
                     * The fully-qualified, binary name of the enter advice class.
                     */
                    private final String enter;

                    /**
                     * The fully-qualified, binary name of the exit advice class.
                     */
                    private final String exit;

                    /**
                     * Creates a new entry for an advice class with explicit entry and exit advice classes.
                     *
                     * @param matcher The matcher for advised methods.
                     * @param enter   The fully-qualified, binary name of the enter advice class.
                     * @param exit    The fully-qualified, binary name of the exit advice class.
                     */
                    protected ForSplitAdvice(LatentMatcher<? super MethodDescription> matcher, String enter, String exit) {
                        super(matcher);
                        this.enter = enter;
                        this.exit = exit;
                    }

                    @Override
                    protected Advice resolve(Advice.WithCustomMapping advice, TypePool typePool, ClassFileLocator classFileLocator) {
                        return advice.to(typePool.describe(enter).resolve(), typePool.describe(exit).resolve(), classFileLocator);
                    }
                }
            }
        }
    }

    /**
     * A type locator allows to specify how {@link TypeDescription}s are resolved by an {@link net.bytebuddy.agent.builder.AgentBuilder}.
     */
    interface PoolStrategy {

        /**
         * Creates a type pool for a given class file locator.
         *
         * @param classFileLocator The class file locator to use.
         * @param classLoader      The class loader for which the class file locator was created.
         * @return A type pool for the supplied class file locator.
         */
        TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader);

        /**
         * <p>
         * A default type locator that resolves types only if any property that is not the type's name is requested.
         * </p>
         * <p>
         * The returned type pool uses a {@link net.bytebuddy.pool.TypePool.CacheProvider.Simple} and the
         * {@link ClassFileLocator} that is provided by the builder's {@link LocationStrategy}.
         * </p>
         */
        enum Default implements PoolStrategy {

            /**
             * A type locator that parses the code segment of each method for extracting information about parameter
             * names even if they are not explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#EXTENDED
             */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),

            /**
             * A type locator that skips the code segment of each method and does therefore not extract information
             * about parameter names. Parameter names are still included if they are explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#FAST
             */
            FAST(TypePool.Default.ReaderMode.FAST);

            /**
             * The reader mode to apply by this type locator.
             */
            private final TypePool.Default.ReaderMode readerMode;

            /**
             * Creates a new type locator.
             *
             * @param readerMode The reader mode to apply by this type locator.
             */
            Default(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /**
             * {@inheritDoc}
             */
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, readerMode);
            }
        }

        /**
         * <p>
         * A type locator that resolves all type descriptions eagerly.
         * </p>
         * <p>
         * The returned type pool uses a {@link net.bytebuddy.pool.TypePool.CacheProvider.Simple} and the
         * {@link ClassFileLocator} that is provided by the builder's {@link LocationStrategy}.
         * </p>
         */
        enum Eager implements PoolStrategy {

            /**
             * A type locator that parses the code segment of each method for extracting information about parameter
             * names even if they are not explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#EXTENDED
             */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),

            /**
             * A type locator that skips the code segment of each method and does therefore not extract information
             * about parameter names. Parameter names are still included if they are explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#FAST
             */
            FAST(TypePool.Default.ReaderMode.FAST);

            /**
             * The reader mode to apply by this type locator.
             */
            private final TypePool.Default.ReaderMode readerMode;

            /**
             * Creates a new type locator.
             *
             * @param readerMode The reader mode to apply by this type locator.
             */
            Eager(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /**
             * {@inheritDoc}
             */
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, readerMode);
            }
        }

        /**
         * <p>
         * A type locator that attempts loading a type if it cannot be located by the underlying lazy type pool.
         * </p>
         * <p>
         * The returned type pool uses a {@link net.bytebuddy.pool.TypePool.CacheProvider.Simple} and the
         * {@link ClassFileLocator} that is provided by the builder's {@link LocationStrategy}. Any types
         * are loaded via the instrumented type's {@link ClassLoader}.
         * </p>
         */
        enum ClassLoading implements PoolStrategy {

            /**
             * A type locator that parses the code segment of each method for extracting information about parameter
             * names even if they are not explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#EXTENDED
             */
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),

            /**
             * A type locator that skips the code segment of each method and does therefore not extract information
             * about parameter names. Parameter names are still included if they are explicitly included in a class file.
             *
             * @see net.bytebuddy.pool.TypePool.Default.ReaderMode#FAST
             */
            FAST(TypePool.Default.ReaderMode.FAST);

            /**
             * The reader mode to apply by this type locator.
             */
            private final TypePool.Default.ReaderMode readerMode;

            /**
             * Creates a new type locator.
             *
             * @param readerMode The reader mode to apply by this type locator.
             */
            ClassLoading(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /**
             * {@inheritDoc}
             */
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return TypePool.ClassLoading.of(classLoader, new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, readerMode));
            }
        }

        /**
         * <p>
         * A type locator that uses type pools but allows for the configuration of a custom cache provider by class loader. Note that a
         * {@link TypePool} can grow in size and that a static reference is kept to this pool by Byte Buddy's registration of a
         * {@link ClassFileTransformer} what can cause a memory leak if the supplied caches are not cleared on a regular basis. Also note
         * that a cache provider can be accessed concurrently by multiple {@link ClassLoader}s.
         * </p>
         * <p>
         * All types that are returned by the locator's type pool are resolved lazily.
         * </p>
         */
        @HashCodeAndEqualsPlugin.Enhance
        abstract class WithTypePoolCache implements PoolStrategy {

            /**
             * The reader mode to use for parsing a class file.
             */
            protected final TypePool.Default.ReaderMode readerMode;

            /**
             * Creates a new type locator that creates {@link TypePool}s but provides a custom {@link net.bytebuddy.pool.TypePool.CacheProvider}.
             *
             * @param readerMode The reader mode to use for parsing a class file.
             */
            protected WithTypePoolCache(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /**
             * {@inheritDoc}
             */
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default.WithLazyResolution(locate(classLoader), classFileLocator, readerMode);
            }

            /**
             * Locates a cache provider for a given class loader.
             *
             * @param classLoader The class loader for which to locate a cache. This class loader might be {@code null} to represent the bootstrap loader.
             * @return The cache provider to use.
             */
            protected abstract TypePool.CacheProvider locate(ClassLoader classLoader);

            /**
             * An implementation of a type locator {@link WithTypePoolCache} (note documentation of the linked class) that is based on a
             * {@link ConcurrentMap}. It is the responsibility of the type locator's user to avoid the type locator from leaking memory.
             */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Simple extends WithTypePoolCache {

                /**
                 * The concurrent map that is used for storing a cache provider per class loader.
                 */
                private final ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> cacheProviders;

                /**
                 * Creates a new type locator that caches a cache provider per class loader in a concurrent map. The type
                 * locator uses a fast {@link net.bytebuddy.pool.TypePool.Default.ReaderMode}.
                 *
                 * @param cacheProviders The concurrent map that is used for storing a cache provider per class loader.
                 */
                public Simple(ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> cacheProviders) {
                    this(TypePool.Default.ReaderMode.FAST, cacheProviders);
                }

                /**
                 * Creates a new type locator that caches a cache provider per class loader in a concurrent map.
                 *
                 * @param readerMode     The reader mode to use for parsing a class file.
                 * @param cacheProviders The concurrent map that is used for storing a cache provider per class loader.
                 */
                public Simple(TypePool.Default.ReaderMode readerMode, ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> cacheProviders) {
                    super(readerMode);
                    this.cacheProviders = cacheProviders;
                }

                @Override
                protected TypePool.CacheProvider locate(ClassLoader classLoader) {
                    classLoader = classLoader == null ? getBootstrapMarkerLoader() : classLoader;
                    TypePool.CacheProvider cacheProvider = cacheProviders.get(classLoader);
                    while (cacheProvider == null) {
                        cacheProvider = TypePool.CacheProvider.Simple.withObjectType();
                        TypePool.CacheProvider previous = cacheProviders.putIfAbsent(classLoader, cacheProvider);
                        if (previous != null) {
                            cacheProvider = previous;
                        }
                    }
                    return cacheProvider;
                }

                /**
                 * <p>
                 * Returns the class loader to serve as a cache key if a cache provider for the bootstrap class loader is requested.
                 * This class loader is represented by {@code null} in the JVM which is an invalid value for many {@link ConcurrentMap}
                 * implementations.
                 * </p>
                 * <p>
                 * By default, {@link ClassLoader#getSystemClassLoader()} is used as such a key as any resource location for the
                 * bootstrap class loader is performed via the system class loader within Byte Buddy as {@code null} cannot be queried
                 * for resources via method calls such that this does not make a difference.
                 * </p>
                 *
                 * @return A class loader to represent the bootstrap class loader.
                 */
                protected ClassLoader getBootstrapMarkerLoader() {
                    return ClassLoader.getSystemClassLoader();
                }
            }
        }
    }

    /**
     * An initialization strategy which determines the handling of {@link net.bytebuddy.implementation.LoadedTypeInitializer}s
     * and the loading of auxiliary types. The agent builder does not reuse the {@link TypeResolutionStrategy} as Javaagents cannot access
     * a loaded class after a transformation such that different initialization strategies become meaningful.
     */
    interface InitializationStrategy {

        /**
         * Creates a new dispatcher for injecting this initialization strategy during a transformation process.
         *
         * @return The dispatcher to be used.
         */
        Dispatcher dispatcher();

        /**
         * A dispatcher for changing a class file to adapt a self-initialization strategy.
         */
        interface Dispatcher {

            /**
             * Transforms the instrumented type to implement an appropriate initialization strategy.
             *
             * @param builder The builder which should implement the initialization strategy.
             * @return The given {@code builder} with the initialization strategy applied.
             */
            DynamicType.Builder<?> apply(DynamicType.Builder<?> builder);

            /**
             * Registers a dynamic type for initialization and/or begins the initialization process.
             *
             * @param dynamicType       The dynamic type that is created.
             * @param classLoader       The class loader of the dynamic type which can be {@code null} to represent the bootstrap class loader.
             * @param protectionDomain  The instrumented type's protection domain or {@code null} if no protection domain is available.
             * @param injectionStrategy The injection strategy to use.
             */
            void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy);
        }

        /**
         * A non-initializing initialization strategy.
         */
        enum NoOp implements InitializationStrategy, Dispatcher {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public Dispatcher dispatcher() {
                return this;
            }

            /**
             * {@inheritDoc}
             */
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            /**
             * {@inheritDoc}
             */
            public void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                /* do nothing */
            }
        }

        /**
         * An initialization strategy that loads auxiliary types before loading the instrumented type. This strategy skips all types
         * that are a subtype of the instrumented type which would cause a premature loading of the instrumented type and abort
         * the instrumentation process.
         */
        enum Minimal implements InitializationStrategy, Dispatcher {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public Dispatcher dispatcher() {
                return this;
            }

            /**
             * {@inheritDoc}
             */
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            /**
             * {@inheritDoc}
             */
            public void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                Map<TypeDescription, byte[]> independentTypes = new LinkedHashMap<TypeDescription, byte[]>(auxiliaryTypes);
                for (TypeDescription auxiliaryType : auxiliaryTypes.keySet()) {
                    if (!auxiliaryType.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class)) {
                        independentTypes.remove(auxiliaryType);
                    }
                }
                if (!independentTypes.isEmpty()) {
                    ClassInjector classInjector = injectionStrategy.resolve(classLoader, protectionDomain);
                    Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                    for (Map.Entry<TypeDescription, Class<?>> entry : classInjector.inject(independentTypes).entrySet()) {
                        loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                    }
                }
            }
        }

        /**
         * An initialization strategy that adds a code block to an instrumented type's type initializer which
         * then calls a specific class that is responsible for the explicit initialization.
         */
        @HashCodeAndEqualsPlugin.Enhance
        abstract class SelfInjection implements InitializationStrategy {

            /**
             * The nexus accessor to use.
             */
            protected final NexusAccessor nexusAccessor;

            /**
             * Creates a new self-injection strategy.
             *
             * @param nexusAccessor The nexus accessor to use.
             */
            protected SelfInjection(NexusAccessor nexusAccessor) {
                this.nexusAccessor = nexusAccessor;
            }

            /**
             * {@inheritDoc}
             */
            @SuppressFBWarnings(value = "DMI_RANDOM_USED_ONLY_ONCE", justification = "Avoiding synchronization without security concerns")
            public InitializationStrategy.Dispatcher dispatcher() {
                return dispatcher(new Random().nextInt());
            }

            /**
             * Creates a new dispatcher.
             *
             * @param identification The identification code to use.
             * @return An appropriate dispatcher for an initialization strategy.
             */
            protected abstract InitializationStrategy.Dispatcher dispatcher(int identification);

            /**
             * A dispatcher for a self-initialization strategy.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected abstract static class Dispatcher implements InitializationStrategy.Dispatcher {

                /**
                 * The nexus accessor to use.
                 */
                protected final NexusAccessor nexusAccessor;

                /**
                 * A random identification for the applied self-initialization.
                 */
                protected final int identification;

                /**
                 * Creates a new dispatcher.
                 *
                 * @param nexusAccessor  The nexus accessor to use.
                 * @param identification A random identification for the applied self-initialization.
                 */
                protected Dispatcher(NexusAccessor nexusAccessor, int identification) {
                    this.nexusAccessor = nexusAccessor;
                    this.identification = identification;
                }

                /**
                 * {@inheritDoc}
                 */
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                    return builder.initializer(new NexusAccessor.InitializationAppender(identification));
                }

                /**
                 * A type initializer that injects all auxiliary types of the instrumented type.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class InjectingInitializer implements LoadedTypeInitializer {

                    /**
                     * The instrumented type.
                     */
                    private final TypeDescription instrumentedType;

                    /**
                     * The auxiliary types mapped to their class file representation.
                     */
                    private final Map<TypeDescription, byte[]> rawAuxiliaryTypes;

                    /**
                     * The instrumented types and auxiliary types mapped to their loaded type initializers.
                     * The instrumented types and auxiliary types mapped to their loaded type initializers.
                     */
                    private final Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers;

                    /**
                     * The class injector to use.
                     */
                    private final ClassInjector classInjector;

                    /**
                     * Creates a new injection initializer.
                     *
                     * @param instrumentedType       The instrumented type.
                     * @param rawAuxiliaryTypes      The auxiliary types mapped to their class file representation.
                     * @param loadedTypeInitializers The instrumented types and auxiliary types mapped to their loaded type initializers.
                     * @param classInjector          The class injector to use.
                     */
                    protected InjectingInitializer(TypeDescription instrumentedType,
                                                   Map<TypeDescription, byte[]> rawAuxiliaryTypes,
                                                   Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers,
                                                   ClassInjector classInjector) {
                        this.instrumentedType = instrumentedType;
                        this.rawAuxiliaryTypes = rawAuxiliaryTypes;
                        this.loadedTypeInitializers = loadedTypeInitializers;
                        this.classInjector = classInjector;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void onLoad(Class<?> type) {
                        for (Map.Entry<TypeDescription, Class<?>> auxiliary : classInjector.inject(rawAuxiliaryTypes).entrySet()) {
                            loadedTypeInitializers.get(auxiliary.getKey()).onLoad(auxiliary.getValue());
                        }
                        loadedTypeInitializers.get(instrumentedType).onLoad(type);
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public boolean isAlive() {
                        return true;
                    }
                }
            }

            /**
             * A form of self-injection where auxiliary types that are annotated by
             * {@link net.bytebuddy.implementation.auxiliary.AuxiliaryType.SignatureRelevant} of the instrumented type are loaded lazily and
             * any other auxiliary type is loaded eagerly.
             */
            public static class Split extends SelfInjection {

                /**
                 * Creates a new split self-injection strategy that uses a default nexus accessor.
                 */
                public Split() {
                    this(new NexusAccessor());
                }

                /**
                 * Creates a new split self-injection strategy that uses the supplied nexus accessor.
                 *
                 * @param nexusAccessor The nexus accessor to use.
                 */
                public Split(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override
                protected InitializationStrategy.Dispatcher dispatcher(int identification) {
                    return new Dispatcher(nexusAccessor, identification);
                }

                /**
                 * A dispatcher for the {@link net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split} strategy.
                 */
                protected static class Dispatcher extends SelfInjection.Dispatcher {

                    /**
                     * Creates a new split dispatcher.
                     *
                     * @param nexusAccessor  The nexus accessor to use.
                     * @param identification A random identification for the applied self-initialization.
                     */
                    protected Dispatcher(NexusAccessor nexusAccessor, int identification) {
                        super(nexusAccessor, identification);
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        LoadedTypeInitializer loadedTypeInitializer;
                        if (!auxiliaryTypes.isEmpty()) {
                            TypeDescription instrumentedType = dynamicType.getTypeDescription();
                            ClassInjector classInjector = injectionStrategy.resolve(classLoader, protectionDomain);
                            Map<TypeDescription, byte[]> independentTypes = new LinkedHashMap<TypeDescription, byte[]>(auxiliaryTypes);
                            Map<TypeDescription, byte[]> dependentTypes = new LinkedHashMap<TypeDescription, byte[]>(auxiliaryTypes);
                            for (TypeDescription auxiliaryType : auxiliaryTypes.keySet()) {
                                (auxiliaryType.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class)
                                        ? dependentTypes
                                        : independentTypes).remove(auxiliaryType);
                            }
                            Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                            if (!independentTypes.isEmpty()) {
                                for (Map.Entry<TypeDescription, Class<?>> entry : classInjector.inject(independentTypes).entrySet()) {
                                    loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                                }
                            }
                            Map<TypeDescription, LoadedTypeInitializer> lazyInitializers = new HashMap<TypeDescription, LoadedTypeInitializer>(loadedTypeInitializers);
                            loadedTypeInitializers.keySet().removeAll(independentTypes.keySet());
                            loadedTypeInitializer = lazyInitializers.size() > 1 // there exist auxiliary types that need lazy loading
                                    ? new Dispatcher.InjectingInitializer(instrumentedType, dependentTypes, lazyInitializers, classInjector)
                                    : lazyInitializers.get(instrumentedType);
                        } else {
                            loadedTypeInitializer = dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription());
                        }
                        nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, identification, loadedTypeInitializer);
                    }
                }
            }

            /**
             * A form of self-injection where any auxiliary type is loaded lazily.
             */
            public static class Lazy extends SelfInjection {

                /**
                 * Creates a new lazy self-injection strategy that uses a default nexus accessor.
                 */
                public Lazy() {
                    this(new NexusAccessor());
                }

                /**
                 * Creates a new lazy self-injection strategy that uses the supplied nexus accessor.
                 *
                 * @param nexusAccessor The nexus accessor to use.
                 */
                public Lazy(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override
                protected InitializationStrategy.Dispatcher dispatcher(int identification) {
                    return new Dispatcher(nexusAccessor, identification);
                }

                /**
                 * A dispatcher for the {@link net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Lazy} strategy.
                 */
                protected static class Dispatcher extends SelfInjection.Dispatcher {

                    /**
                     * Creates a new lazy dispatcher.
                     *
                     * @param nexusAccessor  The nexus accessor to use.
                     * @param identification A random identification for the applied self-initialization.
                     */
                    protected Dispatcher(NexusAccessor nexusAccessor, int identification) {
                        super(nexusAccessor, identification);
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        LoadedTypeInitializer loadedTypeInitializer = auxiliaryTypes.isEmpty()
                                ? dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription())
                                : new Dispatcher.InjectingInitializer(dynamicType.getTypeDescription(), auxiliaryTypes, dynamicType.getLoadedTypeInitializers(), injectionStrategy.resolve(classLoader, protectionDomain));
                        nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, identification, loadedTypeInitializer);
                    }
                }
            }

            /**
             * A form of self-injection where any auxiliary type is loaded eagerly.
             */
            public static class Eager extends SelfInjection {

                /**
                 * Creates a new eager self-injection strategy that uses a default nexus accessor.
                 */
                public Eager() {
                    this(new NexusAccessor());
                }

                /**
                 * Creates a new eager self-injection strategy that uses the supplied nexus accessor.
                 *
                 * @param nexusAccessor The nexus accessor to use.
                 */
                public Eager(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override
                protected InitializationStrategy.Dispatcher dispatcher(int identification) {
                    return new Dispatcher(nexusAccessor, identification);
                }

                /**
                 * A dispatcher for the {@link net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Eager} strategy.
                 */
                protected static class Dispatcher extends SelfInjection.Dispatcher {

                    /**
                     * Creates a new eager dispatcher.
                     *
                     * @param nexusAccessor  The nexus accessor to use.
                     * @param identification A random identification for the applied self-initialization.
                     */
                    protected Dispatcher(NexusAccessor nexusAccessor, int identification) {
                        super(nexusAccessor, identification);
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void register(DynamicType dynamicType, ClassLoader classLoader, ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                        if (!auxiliaryTypes.isEmpty()) {
                            for (Map.Entry<TypeDescription, Class<?>> entry : injectionStrategy.resolve(classLoader, protectionDomain).inject(auxiliaryTypes).entrySet()) {
                                loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                            }
                        }
                        LoadedTypeInitializer loadedTypeInitializer = loadedTypeInitializers.get(dynamicType.getTypeDescription());
                        nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, identification, loadedTypeInitializer);
                    }
                }
            }
        }
    }

    /**
     * A strategy for injecting auxiliary types into a class loader.
     */
    interface InjectionStrategy {

        /**
         * Resolves the class injector to use for a given class loader and protection domain.
         *
         * @param classLoader      The class loader to use.
         * @param protectionDomain The protection domain to use.
         * @return The class injector to use.
         */
        ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain);

        /**
         * An injection strategy that does not permit class injection.
         */
        enum Disabled implements InjectionStrategy {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain) {
                throw new IllegalStateException("Class injection is disabled");
            }
        }

        /**
         * An injection strategy that uses Java reflection. This strategy is not capable of injecting classes into the bootstrap class loader.
         */
        enum UsingReflection implements InjectionStrategy {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain) {
                if (classLoader == null) {
                    throw new IllegalStateException("Cannot inject auxiliary class into bootstrap loader using reflection");
                } else if (ClassInjector.UsingReflection.isAvailable()) {
                    return new ClassInjector.UsingReflection(classLoader, protectionDomain);
                } else {
                    throw new IllegalStateException("Reflection-based injection is not available on the current VM");
                }
            }
        }

        /**
         * An injection strategy that uses {@code sun.misc.Unsafe} to inject classes.
         */
        enum UsingUnsafe implements InjectionStrategy {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain) {
                if (ClassInjector.UsingUnsafe.isAvailable()) {
                    return new ClassInjector.UsingUnsafe(classLoader, protectionDomain);
                } else {
                    throw new IllegalStateException("Unsafe-based injection is not available on the current VM");
                }
            }

            /**
             * An injection strategy that uses a factory for creating an unsafe injector.
             */
            @HashCodeAndEqualsPlugin.Enhance
            public static class OfFactory implements InjectionStrategy {

                /**
                 * The factory to use for creating an unsafe injector.
                 */
                private final ClassInjector.UsingUnsafe.Factory factory;

                /**
                 * Creates an injection strategy based on a factory.
                 *
                 * @param factory The factory to use for creating an unsafe injector.
                 */
                public OfFactory(ClassInjector.UsingUnsafe.Factory factory) {
                    this.factory = factory;
                }

                /**
                 * {@inheritDoc}
                 */
                public ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain) {
                    return factory.make(classLoader, protectionDomain);
                }
            }
        }

        /**
         * An injection strategy that uses bootstrap injection using an {@link Instrumentation} instance.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class UsingInstrumentation implements InjectionStrategy {

            /**
             * The instrumentation instance to use.
             */
            private final Instrumentation instrumentation;

            /**
             * The folder to store jar files being used for bootstrap injection.
             */
            private final File folder;

            /**
             * Creates a new bootstrap injection strategy.
             *
             * @param instrumentation The instrumentation instance to use.
             * @param folder          The folder to store jar files being used for bootstrap injection.
             */
            public UsingInstrumentation(Instrumentation instrumentation, File folder) {
                this.instrumentation = instrumentation;
                this.folder = folder;
            }

            /**
             * {@inheritDoc}
             */
            public ClassInjector resolve(ClassLoader classLoader, ProtectionDomain protectionDomain) {
                return classLoader == null
                        ? ClassInjector.UsingInstrumentation.of(folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, instrumentation)
                        : UsingReflection.INSTANCE.resolve(classLoader, protectionDomain);
            }
        }
    }

    /**
     * A description strategy is responsible for resolving a {@link TypeDescription} when transforming or retransforming/-defining a type.
     */
    interface DescriptionStrategy {

        /**
         * Indicates if this description strategy makes use of loaded type information and yields a different type description if no loaded type is available.
         *
         * @return {@code true} if this description strategy prefers loaded type information when describing a type and only uses a type pool
         * if loaded type information is not available.
         */
        boolean isLoadedFirst();

        /**
         * Describes the given type.
         *
         * @param typeName        The binary name of the type to describe.
         * @param type            The type that is being redefined, if a redefinition is applied or {@code null} if no redefined type is available.
         * @param typePool        The type pool to use for locating a type if required.
         * @param classLoader     The type's class loader where {@code null} represents the bootstrap class loader.
         * @param circularityLock The currently used circularity lock.
         * @param module          The type's module or {@code null} if the current VM does not support modules.
         * @return An appropriate type description.
         */
        TypeDescription apply(String typeName, Class<?> type, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule module);

        /**
         * Default implementations of a {@link DescriptionStrategy}.
         */
        enum Default implements DescriptionStrategy {

            /**
             * A description type strategy represents a type as a {@link net.bytebuddy.description.type.TypeDescription.ForLoadedType} if a
             * retransformation or redefinition is applied on a type. Using a loaded type typically results in better performance as no
             * I/O is required for resolving type descriptions. However, any interaction with the type is carried out via the Java reflection
             * API. Using the reflection API triggers eager loading of any type that is part of a method or field signature. If any of these
             * types are missing from the class path, this eager loading will cause a {@link NoClassDefFoundError}. Some Java code declares
             * optional dependencies to other classes which are only realized if the optional dependency is present. Such code relies on the
             * Java reflection API not being used for types using optional dependencies.
             *
             * @see FallbackStrategy.Simple#ENABLED
             * @see FallbackStrategy.ByThrowableType#ofOptionalTypes()
             */
            HYBRID(true) {
                /** {@inheritDoc} */
                public TypeDescription apply(String typeName,
                                             Class<?> type,
                                             TypePool typePool,
                                             CircularityLock circularityLock,
                                             ClassLoader classLoader,
                                             JavaModule module) {
                    return type == null
                            ? typePool.describe(typeName).resolve()
                            : TypeDescription.ForLoadedType.of(type);
                }
            },

            /**
             * <p>
             * A description strategy that always describes Java types using a {@link TypePool}. This requires that any type - even if it is already
             * loaded and a {@link Class} instance is available - is processed as a non-loaded type description. Doing so can cause overhead as processing
             * loaded types is supported very efficiently by a JVM.
             * </p>
             * <p>
             * Avoiding the usage of loaded types can improve robustness as this approach does not rely on the Java reflection API which triggers eager
             * validation of this loaded type which can fail an application if optional types are used by any types field or method signatures. Also, it
             * is possible to guarantee debugging meta data to be available also for retransformed or redefined types if a {@link TypeStrategy} specifies
             * the extraction of such meta data.
             * </p>
             */
            POOL_ONLY(false) {
                /** {@inheritDoc} */
                public TypeDescription apply(String typeName,
                                             Class<?> type,
                                             TypePool typePool,
                                             CircularityLock circularityLock,
                                             ClassLoader classLoader,
                                             JavaModule module) {
                    return typePool.describe(typeName).resolve();
                }
            },

            /**
             * <p>
             * A description strategy that always describes Java types using a {@link TypePool} unless a type cannot be resolved by a pool and a loaded
             * {@link Class} instance  is available. Doing so can cause overhead as processing loaded types is supported very efficiently by a JVM.
             * </p>
             * <p>
             * Avoiding the usage of loaded types can improve robustness as this approach does not rely on the Java reflection API which triggers eager
             * validation of this loaded type which can fail an application if optional types are used by any types field or method signatures. Also, it
             * is possible to guarantee debugging meta data to be available also for retransformed or redefined types if a {@link TypeStrategy} specifies
             * the extraction of such meta data.
             * </p>
             */
            POOL_FIRST(false) {
                /** {@inheritDoc} */
                public TypeDescription apply(String typeName,
                                             Class<?> type,
                                             TypePool typePool,
                                             CircularityLock circularityLock,
                                             ClassLoader classLoader,
                                             JavaModule module) {
                    TypePool.Resolution resolution = typePool.describe(typeName);
                    return resolution.isResolved() || type == null
                            ? resolution.resolve()
                            : TypeDescription.ForLoadedType.of(type);
                }
            };

            /**
             * Indicates if loaded type information is preferred over using a type pool for describing a type.
             */
            private final boolean loadedFirst;

            /**
             * Indicates if loaded type information is preferred over using a type pool for describing a type.
             *
             * @param loadedFirst {@code true} if loaded type information is preferred over using a type pool for describing a type.
             */
            Default(boolean loadedFirst) {
                this.loadedFirst = loadedFirst;
            }

            /**
             * Creates a description strategy that uses this strategy but loads any super type. If a super type is not yet loaded,
             * this causes this super type to never be instrumented. Therefore, this option should only be used if all instrumented
             * types are guaranteed to be top-level types.
             *
             * @return This description strategy where all super types are loaded during the instrumentation.
             * @see SuperTypeLoading
             */
            public DescriptionStrategy withSuperTypeLoading() {
                return new SuperTypeLoading(this);
            }

            /**
             * {@inheritDoc}
             */
            public boolean isLoadedFirst() {
                return loadedFirst;
            }

            /**
             * Creates a description strategy that uses this strategy but loads any super type asynchronously. Super types are loaded via
             * another thread supplied by the executor service to enforce the instrumentation of any such super type. It is recommended
             * to allow the executor service to create new threads without bound as class loading blocks any thread until all super types
             * were instrumented.
             *
             * @param executorService The executor service to use.
             * @return This description strategy where all super types are loaded asynchronously during the instrumentation.
             * @see SuperTypeLoading.Asynchronous
             */
            public DescriptionStrategy withSuperTypeLoading(ExecutorService executorService) {
                return new SuperTypeLoading.Asynchronous(this, executorService);
            }
        }

        /**
         * <p>
         * A description strategy that enforces the loading of any super type of a type description but delegates the actual type description
         * to another description strategy.
         * </p>
         * <p>
         * <b>Warning</b>: When using this description strategy, a type is not instrumented if any of its subtypes is loaded first.
         * The instrumentation API does not submit such types to a class file transformer on most VM implementations.
         * </p>
         */
        @HashCodeAndEqualsPlugin.Enhance
        class SuperTypeLoading implements DescriptionStrategy {

            /**
             * The delegate description strategy.
             */
            private final DescriptionStrategy delegate;

            /**
             * Creates a new description strategy that enforces loading of a super type.
             *
             * @param delegate The delegate description strategy.
             */
            public SuperTypeLoading(DescriptionStrategy delegate) {
                this.delegate = delegate;
            }

            /**
             * {@inheritDoc}
             */
            public boolean isLoadedFirst() {
                return delegate.isLoadedFirst();
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription apply(String typeName,
                                         Class<?> type,
                                         TypePool typePool,
                                         CircularityLock circularityLock,
                                         ClassLoader classLoader,
                                         JavaModule module) {
                TypeDescription typeDescription = delegate.apply(typeName, type, typePool, circularityLock, classLoader, module);
                return typeDescription instanceof TypeDescription.ForLoadedType
                        ? typeDescription
                        : new TypeDescription.SuperTypeLoading(typeDescription, classLoader, new UnlockingClassLoadingDelegate(circularityLock));
            }

            /**
             * A class loading delegate that unlocks the circularity lock during class loading.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class UnlockingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {

                /**
                 * The circularity lock to unlock.
                 */
                private final CircularityLock circularityLock;

                /**
                 * Creates an unlocking class loading delegate.
                 *
                 * @param circularityLock The circularity lock to unlock.
                 */
                protected UnlockingClassLoadingDelegate(CircularityLock circularityLock) {
                    this.circularityLock = circularityLock;
                }

                /**
                 * {@inheritDoc}
                 */
                public Class<?> load(String name, ClassLoader classLoader) throws ClassNotFoundException {
                    circularityLock.release();
                    try {
                        return Class.forName(name, false, classLoader);
                    } finally {
                        circularityLock.acquire();
                    }
                }
            }

            /**
             * <p>
             * A description strategy that enforces the loading of any super type of a type description but delegates the actual type description
             * to another description strategy.
             * </p>
             * <p>
             * <b>Note</b>: This description strategy delegates class loading to another thread in order to enforce the instrumentation of any
             * unloaded super type. This requires the executor service to supply at least as many threads as the deepest type hierarchy within the
             * application minus one for the instrumented type as class loading blocks any thread until all of its super types are loaded. These
             * threads are typically short lived which predestines the use of a {@link Executors#newCachedThreadPool()} without any upper bound
             * for the maximum number of created threads.
             * </p>
             * <p>
             * <b>Important</b>: This strategy can dead-lock under two circumstances:
             * </p>
             * <ul>
             * <li>
             * <b>Classes declare circularities</b>: Under normal circumstances, such scenarios result in a {@link ClassCircularityError} but
             * can result in dead-locks when using this instrumentation strategy.
             * </li>
             * <li>
             * <b>Class loaders declare custom locks</b>: If a class loader locks another lock but itself during class loading, this lock cannot
             * be released by this strategy.
             * </li>
             * </ul>
             * <p>
             * For the above reasons, it is not recommended to use this strategy when the target class loader is unknown or if the target application
             * might contain corrupt class files.
             * </p>
             */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Asynchronous implements DescriptionStrategy {

                /**
                 * The delegate description strategy.
                 */
                private final DescriptionStrategy delegate;

                /**
                 * The executor service to use for loading super types.
                 */
                private final ExecutorService executorService;

                /**
                 * Creates a new description strategy that enforces super type loading from another thread.
                 *
                 * @param delegate        The delegate description strategy.
                 * @param executorService The executor service to use for loading super types.
                 */
                public Asynchronous(DescriptionStrategy delegate, ExecutorService executorService) {
                    this.delegate = delegate;
                    this.executorService = executorService;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isLoadedFirst() {
                    return delegate.isLoadedFirst();
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription apply(String typeName,
                                             Class<?> type,
                                             TypePool typePool,
                                             CircularityLock circularityLock,
                                             ClassLoader classLoader,
                                             JavaModule module) {
                    TypeDescription typeDescription = delegate.apply(typeName, type, typePool, circularityLock, classLoader, module);
                    return typeDescription instanceof TypeDescription.ForLoadedType
                            ? typeDescription
                            : new TypeDescription.SuperTypeLoading(typeDescription, classLoader, new ThreadSwitchingClassLoadingDelegate(executorService));
                }

                /**
                 * A class loading delegate that delegates loading of the super type to another thread.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class ThreadSwitchingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {

                    /**
                     * The executor service to delegate class loading to.
                     */
                    private final ExecutorService executorService;

                    /**
                     * Creates a new thread-switching class loading delegate.
                     *
                     * @param executorService The executor service to delegate class loading to.
                     */
                    protected ThreadSwitchingClassLoadingDelegate(ExecutorService executorService) {
                        this.executorService = executorService;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Class<?> load(String name, ClassLoader classLoader) {
                        boolean holdsLock = classLoader != null && Thread.holdsLock(classLoader);
                        AtomicBoolean signal = new AtomicBoolean(holdsLock);
                        Future<Class<?>> future = executorService.submit(holdsLock
                                ? new NotifyingClassLoadingAction(name, classLoader, signal)
                                : new SimpleClassLoadingAction(name, classLoader));
                        try {
                            while (holdsLock && signal.get()) {
                                classLoader.wait();
                            }
                            return future.get();
                        } catch (ExecutionException exception) {
                            throw new IllegalStateException("Could not load " + name + " asynchronously", exception.getCause());
                        } catch (Exception exception) {
                            throw new IllegalStateException("Could not load " + name + " asynchronously", exception);
                        }
                    }

                    /**
                     * A class loading action that simply loads a type.
                     */
                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class SimpleClassLoadingAction implements Callable<Class<?>> {

                        /**
                         * The loaded type's name.
                         */
                        private final String name;

                        /**
                         * The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                         */
                        private final ClassLoader classLoader;

                        /**
                         * Creates a simple class loading action.
                         *
                         * @param name        The loaded type's name.
                         * @param classLoader The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                         */
                        protected SimpleClassLoadingAction(String name, ClassLoader classLoader) {
                            this.name = name;
                            this.classLoader = classLoader;
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public Class<?> call() throws ClassNotFoundException {
                            return Class.forName(name, false, classLoader);
                        }
                    }

                    /**
                     * A class loading action that notifies the class loader's lock after the type was loaded.
                     */
                    protected static class NotifyingClassLoadingAction implements Callable<Class<?>> {

                        /**
                         * The loaded type's name.
                         */
                        private final String name;

                        /**
                         * The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                         */
                        private final ClassLoader classLoader;

                        /**
                         * The signal that indicates the completion of the class loading with {@code false}.
                         */
                        private final AtomicBoolean signal;

                        /**
                         * Creates a notifying class loading action.
                         *
                         * @param name        The loaded type's name.
                         * @param classLoader The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                         * @param signal      The signal that indicates the completion of the class loading with {@code false}.
                         */
                        protected NotifyingClassLoadingAction(String name, ClassLoader classLoader, AtomicBoolean signal) {
                            this.name = name;
                            this.classLoader = classLoader;
                            this.signal = signal;
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public Class<?> call() throws ClassNotFoundException {
                            synchronized (classLoader) {
                                try {
                                    return Class.forName(name, false, classLoader);
                                } finally {
                                    signal.set(false);
                                    classLoader.notifyAll();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * A strategy for creating a {@link ClassFileLocator} when instrumenting a type.
     */
    interface LocationStrategy {

        /**
         * Creates a class file locator for a given class loader and module combination.
         *
         * @param classLoader The class loader that is loading an instrumented type. Might be {@code null} to represent the bootstrap class loader.
         * @param module      The type's module or {@code null} if Java modules are not supported on the current VM.
         * @return The class file locator to use.
         */
        ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module);

        /**
         * A location strategy that never locates any byte code.
         */
        enum NoOp implements LocationStrategy {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module) {
                return ClassFileLocator.NoOp.INSTANCE;
            }
        }

        /**
         * A location strategy that locates class files by querying an instrumented type's {@link ClassLoader}.
         */
        enum ForClassLoader implements LocationStrategy {

            /**
             * A location strategy that keeps a strong reference to the class loader the created class file locator represents.
             */
            STRONG {
                /** {@inheritDoc} */
                public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module) {
                    return ClassFileLocator.ForClassLoader.of(classLoader);
                }
            },

            /**
             * A location strategy that keeps a weak reference to the class loader the created class file locator represents.
             * As a consequence, any returned class file locator stops working once the represented class loader is garbage collected.
             */
            WEAK {
                /** {@inheritDoc} */
                public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module) {
                    return ClassFileLocator.ForClassLoader.WeaklyReferenced.of(classLoader);
                }
            };

            /**
             * Adds additional location strategies as fallbacks to this location strategy.
             *
             * @param classFileLocator The class file locators to query if this location strategy cannot locate a class file.
             * @return A compound location strategy that first applies this location strategy and then queries the supplied class file locators.
             */
            public LocationStrategy withFallbackTo(ClassFileLocator... classFileLocator) {
                return withFallbackTo(Arrays.asList(classFileLocator));
            }

            /**
             * Adds additional location strategies as fallbacks to this location strategy.
             *
             * @param classFileLocators The class file locators to query if this location strategy cannot locate a class file.
             * @return A compound location strategy that first applies this location strategy and then queries the supplied class file locators.
             */
            public LocationStrategy withFallbackTo(Collection<? extends ClassFileLocator> classFileLocators) {
                List<LocationStrategy> locationStrategies = new ArrayList<LocationStrategy>(classFileLocators.size());
                for (ClassFileLocator classFileLocator : classFileLocators) {
                    locationStrategies.add(new Simple(classFileLocator));
                }
                return withFallbackTo(locationStrategies);
            }

            /**
             * Adds additional location strategies as fallbacks to this location strategy.
             *
             * @param locationStrategy The fallback location strategies to use.
             * @return A compound location strategy that first applies this location strategy and then the supplied fallback location strategies
             * in the supplied order.
             */
            public LocationStrategy withFallbackTo(LocationStrategy... locationStrategy) {
                return withFallbackTo(Arrays.asList(locationStrategy));
            }

            /**
             * Adds additional location strategies as fallbacks to this location strategy.
             *
             * @param locationStrategies The fallback location strategies to use.
             * @return A compound location strategy that first applies this location strategy and then the supplied fallback location strategies
             * in the supplied order.
             */
            public LocationStrategy withFallbackTo(List<? extends LocationStrategy> locationStrategies) {
                List<LocationStrategy> allLocationStrategies = new ArrayList<LocationStrategy>(locationStrategies.size() + 1);
                allLocationStrategies.add(this);
                allLocationStrategies.addAll(locationStrategies);
                return new Compound(allLocationStrategies);
            }
        }

        /**
         * A simple location strategy that queries a given class file locator.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Simple implements LocationStrategy {

            /**
             * The class file locator to query.
             */
            private final ClassFileLocator classFileLocator;

            /**
             * A simple location strategy that queries a given class file locator.
             *
             * @param classFileLocator The class file locator to query.
             */
            public Simple(ClassFileLocator classFileLocator) {
                this.classFileLocator = classFileLocator;
            }

            /**
             * {@inheritDoc}
             */
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module) {
                return classFileLocator;
            }
        }

        /**
         * A compound location strategy that applies a list of location strategies.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Compound implements LocationStrategy {

            /**
             * The location strategies in their application order.
             */
            private final List<LocationStrategy> locationStrategies;

            /**
             * Creates a new compound location strategy.
             *
             * @param locationStrategy The location strategies in their application order.
             */
            public Compound(LocationStrategy... locationStrategy) {
                this(Arrays.asList(locationStrategy));
            }

            /**
             * Creates a new compound location strategy.
             *
             * @param locationStrategies The location strategies in their application order.
             */
            public Compound(List<? extends LocationStrategy> locationStrategies) {
                this.locationStrategies = new ArrayList<LocationStrategy>();
                for (LocationStrategy locationStrategy : locationStrategies) {
                    if (locationStrategy instanceof Compound) {
                        this.locationStrategies.addAll(((Compound) locationStrategy).locationStrategies);
                    } else if (!(locationStrategy instanceof NoOp)) {
                        this.locationStrategies.add(locationStrategy);
                    }
                }
            }

            /**
             * {@inheritDoc}
             */
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule module) {
                List<ClassFileLocator> classFileLocators = new ArrayList<ClassFileLocator>(locationStrategies.size());
                for (LocationStrategy locationStrategy : locationStrategies) {
                    classFileLocators.add(locationStrategy.classFileLocator(classLoader, module));
                }
                return new ClassFileLocator.Compound(classFileLocators);
            }
        }
    }

    /**
     * A fallback strategy allows to reattempt a transformation or a consideration for redefinition/retransformation in case an exception
     * occurs. Doing so, it is possible to use a {@link TypePool} rather than using a loaded type description backed by a {@link Class}.
     * Loaded types can raise exceptions and errors if a {@link ClassLoader} cannot resolve all types that this class references. Using
     * a type pool, such errors can be avoided as type descriptions can be resolved lazily, avoiding such errors.
     */
    interface FallbackStrategy {

        /**
         * Returns {@code true} if the supplied type and throwable combination should result in a reattempt where the
         * loaded type is not used for querying information.
         *
         * @param type      The loaded type that was queried during the transformation attempt.
         * @param throwable The error or exception that was caused during the transformation.
         * @return {@code true} if the supplied type and throwable combination should
         */
        boolean isFallback(Class<?> type, Throwable throwable);

        /**
         * A simple fallback strategy that either always reattempts a transformation or never does so.
         */
        enum Simple implements FallbackStrategy {

            /**
             * An enabled fallback strategy that always attempts a new trial.
             */
            ENABLED(true),

            /**
             * A disabled fallback strategy that never attempts a new trial.
             */
            DISABLED(false);

            /**
             * {@code true} if this fallback strategy is enabled.
             */
            private final boolean enabled;

            /**
             * Creates a new default fallback strategy.
             *
             * @param enabled {@code true} if this fallback strategy is enabled.
             */
            Simple(boolean enabled) {
                this.enabled = enabled;
            }

            /**
             * {@inheritDoc}
             */
            public boolean isFallback(Class<?> type, Throwable throwable) {
                return enabled;
            }
        }

        /**
         * A fallback strategy that discriminates by the type of the {@link Throwable} that triggered a request.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class ByThrowableType implements FallbackStrategy {

            /**
             * A set of throwable types that should trigger a fallback attempt.
             */
            private final Set<? extends Class<? extends Throwable>> types;

            /**
             * Creates a new throwable type-discriminating fallback strategy.
             *
             * @param type The throwable types that should trigger a fallback.
             */
            @SuppressWarnings("unchecked") // In absence of @SafeVarargs
            public ByThrowableType(Class<? extends Throwable>... type) {
                this(new HashSet<Class<? extends Throwable>>(Arrays.asList(type)));
            }

            /**
             * Creates a new throwable type-discriminating fallback strategy.
             *
             * @param types The throwable types that should trigger a fallback.
             */
            public ByThrowableType(Set<? extends Class<? extends Throwable>> types) {
                this.types = types;
            }

            /**
             * Creates a fallback strategy that attempts a fallback if an error indicating a type error is the reason for requesting a reattempt.
             *
             * @return A fallback strategy that triggers a reattempt if a {@link LinkageError} or a {@link TypeNotPresentException} is raised.
             */
            @SuppressWarnings("unchecked") // In absence of @SafeVarargs
            public static FallbackStrategy ofOptionalTypes() {
                return new ByThrowableType(LinkageError.class, TypeNotPresentException.class);
            }

            /**
             * {@inheritDoc}
             */
            public boolean isFallback(Class<?> type, Throwable throwable) {
                for (Class<? extends Throwable> aType : types) {
                    if (aType.isInstance(throwable)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    /**
     * A listener that is notified during the installation and the resetting of a class file transformer.
     */
    interface InstallationListener {

        /**
         * Indicates that an exception is handled.
         */
        Throwable SUPPRESS_ERROR = null;

        /**
         * Invoked prior to the installation of a class file transformer.
         *
         * @param instrumentation      The instrumentation on which the class file transformer is installed.
         * @param classFileTransformer The class file transformer that is being installed.
         */
        void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer);

        /**
         * Invoked upon the successful installation of a class file transformer. This method is only invoked if no error occurred during the
         * installation or if such an error was handled by {@link InstallationListener#onError(Instrumentation, ResettableClassFileTransformer, Throwable)}.
         *
         * @param instrumentation      The instrumentation on which the class file transformer is installed.
         * @param classFileTransformer The class file transformer that is being installed.
         */
        void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer);

        /**
         * Invoked if an installation causes an error. The listener has an opportunity to handle the error. This method is invoked prior to
         * {@link InstallationListener#onInstall(Instrumentation, ResettableClassFileTransformer)}.
         *
         * @param instrumentation      The instrumentation on which the class file transformer is installed.
         * @param classFileTransformer The class file transformer that is being installed.
         * @param throwable            The throwable that causes the error.
         * @return The error to propagate or {@code null} if the error is handled. Any subsequent listeners are not called if the exception is handled.
         */
        Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable);

        /**
         * Invoked if an installation is reset.
         *
         * @param instrumentation      The instrumentation on which the class file transformer is installed.
         * @param classFileTransformer The class file transformer that is being installed.
         */
        void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer);

        /**
         * A non-operational listener that does not do anything.
         */
        enum NoOp implements InstallationListener {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable) {
                return throwable;
            }

            /**
             * {@inheritDoc}
             */
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }
        }

        /**
         * A listener that suppresses any installation error.
         */
        enum ErrorSuppressing implements InstallationListener {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable) {
                return SUPPRESS_ERROR;
            }

            /**
             * {@inheritDoc}
             */
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }
        }

        /**
         * An adapter implementation for an installation listener that serves as a convenience.
         */
        abstract class Adapter implements InstallationListener {

            /**
             * {@inheritDoc}
             */
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            /**
             * {@inheritDoc}
             */
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable) {
                return throwable;
            }

            /**
             * {@inheritDoc}
             */
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                /* do nothing */
            }
        }

        /**
         * This installation listener prints the status of any installation to a {@link PrintStream}.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class StreamWriting implements InstallationListener {

            /**
             * The prefix prepended to any message written.
             */
            protected static final String PREFIX = "[Byte Buddy]";

            /**
             * The print stream to write to.
             */
            private final PrintStream printStream;

            /**
             * Creates a new stream writing installation listener.
             *
             * @param printStream The print stream to write to.
             */
            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            /**
             * Creates a stream writing installation listener that prints to {@link System#out}.
             *
             * @return An installation listener that prints to {@link System#out}.
             */
            public static InstallationListener toSystemOut() {
                return new StreamWriting(System.out);
            }

            /**
             * Creates a stream writing installation listener that prints to {@link System#err}.
             *
             * @return An installation listener that prints to {@link System#err}.
             */
            public static InstallationListener toSystemError() {
                return new StreamWriting(System.err);
            }

            /**
             * {@inheritDoc}
             */
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                printStream.printf(PREFIX + " BEFORE_INSTALL %s on %s%n", classFileTransformer, instrumentation);
            }

            /**
             * {@inheritDoc}
             */
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                printStream.printf(PREFIX + " INSTALL %s on %s%n", classFileTransformer, instrumentation);
            }

            /**
             * {@inheritDoc}
             */
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable) {
                synchronized (printStream) {
                    printStream.printf(PREFIX + " ERROR %s on %s%n", classFileTransformer, instrumentation);
                    throwable.printStackTrace(printStream);
                }
                return throwable;
            }

            /**
             * {@inheritDoc}
             */
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                printStream.printf(PREFIX + " RESET %s on %s%n", classFileTransformer, instrumentation);
            }
        }

        /**
         * A compound installation listener.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Compound implements InstallationListener {

            /**
             * The installation listeners to notify.
             */
            private final List<InstallationListener> installationListeners;

            /**
             * Creates a new compound listener.
             *
             * @param installationListener The installation listeners to notify.
             */
            public Compound(InstallationListener... installationListener) {
                this(Arrays.asList(installationListener));
            }

            /**
             * Creates a new compound listener.
             *
             * @param installationListeners The installation listeners to notify.
             */
            public Compound(List<? extends InstallationListener> installationListeners) {
                this.installationListeners = new ArrayList<InstallationListener>();
                for (InstallationListener installationListener : installationListeners) {
                    if (installationListener instanceof Compound) {
                        this.installationListeners.addAll(((Compound) installationListener).installationListeners);
                    } else if (!(installationListener instanceof NoOp)) {
                        this.installationListeners.add(installationListener);
                    }
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                for (InstallationListener installationListener : installationListeners) {
                    installationListener.onBeforeInstall(instrumentation, classFileTransformer);
                }
            }

            /**
             * {@inheritDoc}
             */
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                for (InstallationListener installationListener : installationListeners) {
                    installationListener.onInstall(instrumentation, classFileTransformer);
                }
            }

            /**
             * {@inheritDoc}
             */
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer, Throwable throwable) {
                for (InstallationListener installationListener : installationListeners) {
                    if (throwable == SUPPRESS_ERROR) {
                        return SUPPRESS_ERROR;
                    }
                    throwable = installationListener.onError(instrumentation, classFileTransformer, throwable);
                }
                return throwable;
            }

            /**
             * {@inheritDoc}
             */
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                for (InstallationListener installationListener : installationListeners) {
                    installationListener.onReset(instrumentation, classFileTransformer);
                }
            }
        }
    }

    /**
     * This strategy determines how the provided class file buffer is used.
     */
    interface ClassFileBufferStrategy {

        /**
         * Resolves a class file locator for the class file buffer that is provided to the class file transformer.
         *
         * @param name                 The instrumented type's binary name.
         * @param binaryRepresentation The instrumented type's binary representation.
         * @param classLoader          The instrumented type's class loader or {@code null} if the type is loaded by the bootstrap class loader.
         * @param module               The instrumented type's module or {@code null} if the current VM does not support modules.
         * @param protectionDomain     The instrumented type's protection domain.
         * @return An appropriate class file locator.
         */
        ClassFileLocator resolve(String name, byte[] binaryRepresentation, ClassLoader classLoader, JavaModule module, ProtectionDomain protectionDomain);

        /**
         * An implementation of default class file buffer strategy.
         */
        enum Default implements ClassFileBufferStrategy {

            /**
             * A class file buffer strategy that retains the original class file buffer.
             */
            RETAINING {
                /** {@inheritDoc} */
                public ClassFileLocator resolve(String name,
                                                byte[] binaryRepresentation,
                                                ClassLoader classLoader,
                                                JavaModule module,
                                                ProtectionDomain protectionDomain) {
                    return ClassFileLocator.Simple.of(name, binaryRepresentation);
                }
            },

            /**
             * <p>
             * A class file buffer strategy that discards the original class file buffer.
             * </p>
             * <p>
             * <b>Warning</b>: This strategy discards any changes that were applied by previous Java agents.
             * </p>
             */
            DISCARDING {
                /** {@inheritDoc} */
                public ClassFileLocator resolve(String name,
                                                byte[] binaryRepresentation,
                                                ClassLoader classLoader,
                                                JavaModule module,
                                                ProtectionDomain protectionDomain) {
                    return ClassFileLocator.NoOp.INSTANCE;
                }
            }
        }

    }

    /**
     * A decorator that allows to change the class file transformer that is registered.
     */
    interface TransformerDecorator {

        /**
         * Decorates the applied class file transformer.
         *
         * @param classFileTransformer The original transformer created by the agent builder.
         * @return The class file transformer that is actually being registered.
         */
        ResettableClassFileTransformer decorate(ResettableClassFileTransformer classFileTransformer);

        /**
         * A transformer decorator that retains the original transformer.
         */
        enum NoOp implements TransformerDecorator {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer decorate(ResettableClassFileTransformer classFileTransformer) {
                return classFileTransformer;
            }
        }

        /**
         * A compound transformer decorator.
         */
        @HashCodeAndEqualsPlugin.Enhance
        class Compound implements TransformerDecorator {

            /**
             * The listeners to invoke.
             */
            private final List<TransformerDecorator> transformerDecorators;

            /**
             * Creates a new compound transformer decorator.
             *
             * @param transformerDecorator The transformer decorators to add.
             */
            public Compound(TransformerDecorator... transformerDecorator) {
                this(Arrays.asList(transformerDecorator));
            }

            /**
             * Creates a new compound listener.
             *
             * @param transformerDecorators The transformerDecorators to invoke.
             */
            public Compound(List<? extends TransformerDecorator> transformerDecorators) {
                this.transformerDecorators = new ArrayList<TransformerDecorator>();
                for (TransformerDecorator transformerDecorator : transformerDecorators) {
                    if (transformerDecorator instanceof Compound) {
                        this.transformerDecorators.addAll(((Compound) transformerDecorator).transformerDecorators);
                    } else if (!(transformerDecorator instanceof NoOp)) {
                        this.transformerDecorators.add(transformerDecorator);
                    }
                }
            }

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer decorate(ResettableClassFileTransformer classFileTransformer) {
                for (TransformerDecorator transformerDecorator : transformerDecorators) {
                    classFileTransformer = transformerDecorator.decorate(classFileTransformer);
                }
                return classFileTransformer;
            }
        }
    }

    /**
     * <p>
     * A redefinition strategy regulates how already loaded classes are modified by a built agent.
     * </p>
     * <p>
     * <b>Important</b>: Most JVMs do not support changes of a class's structure after a class was already
     * loaded. Therefore, it is typically required that this class file transformer was built while enabling
     * {@link AgentBuilder#disableClassFormatChanges()}.
     * </p>
     */
    enum RedefinitionStrategy {

        /**
         * Disables redefinition such that already loaded classes are not affected by the agent.
         */
        DISABLED(false, false) {
            @Override
            public void apply(Instrumentation instrumentation,
                              AgentBuilder.Listener listener,
                              CircularityLock circularityLock,
                              PoolStrategy poolStrategy,
                              LocationStrategy locationStrategy,
                              DiscoveryStrategy discoveryStrategy,
                              BatchAllocator redefinitionBatchAllocator,
                              Listener redefinitionListener,
                              LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                              DescriptionStrategy descriptionStrategy,
                              FallbackStrategy fallbackStrategy,
                              RawMatcher matcher) {
                /* do nothing */
            }

            @Override
            protected void check(Instrumentation instrumentation) {
                throw new IllegalStateException("Cannot apply redefinition on disabled strategy");
            }

            @Override
            protected Collector make() {
                throw new IllegalStateException("A disabled redefinition strategy cannot create a collector");
            }
        },

        /**
         * <p>
         * Applies a <b>redefinition</b> to all classes that are already loaded and that would have been transformed if
         * the built agent was registered before they were loaded. The created {@link ClassFileTransformer} is <b>not</b>
         * registered for applying retransformations.
         * </p>
         * <p>
         * Using this strategy, a redefinition is applied as a single transformation request. This means that a single illegal
         * redefinition of a class causes the entire redefinition attempt to fail.
         * </p>
         * <p>
         * <b>Note</b>: When applying a redefinition, it is normally required to use a {@link TypeStrategy} that applies
         * a redefinition instead of rebasing classes such as {@link TypeStrategy.Default#REDEFINE}. Also, consider
         * the constrains given by this type strategy.
         * </p>
         */
        REDEFINITION(true, false) {
            @Override
            protected void check(Instrumentation instrumentation) {
                if (!instrumentation.isRedefineClassesSupported()) {
                    throw new IllegalStateException("Cannot apply redefinition on " + instrumentation);
                }
            }

            @Override
            protected Collector make() {
                return new Collector.ForRedefinition();
            }
        },

        /**
         * <p>
         * Applies a <b>retransformation</b> to all classes that are already loaded and that would have been transformed if
         * the built agent was registered before they were loaded. The created {@link ClassFileTransformer} is registered
         * for applying retransformations.
         * </p>
         * <p>
         * Using this strategy, a retransformation is applied as a single transformation request. This means that a single illegal
         * retransformation of a class causes the entire retransformation attempt to fail.
         * </p>
         * <p>
         * <b>Note</b>: When applying a retransformation, it is normally required to use a {@link TypeStrategy} that applies
         * a redefinition instead of rebasing classes such as {@link TypeStrategy.Default#REDEFINE}. Also, consider
         * the constrains given by this type strategy.
         * </p>
         */
        RETRANSFORMATION(true, true) {
            @Override
            protected void check(Instrumentation instrumentation) {
                if (!DISPATCHER.isRetransformClassesSupported(instrumentation)) {
                    throw new IllegalStateException("Cannot apply retransformation on " + instrumentation);
                }
            }

            @Override
            protected Collector make() {
                return new Collector.ForRetransformation();
            }
        };

        /**
         * A dispatcher to use for interacting with the instrumentation API.
         */
        protected static final Dispatcher DISPATCHER = AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);

        /**
         * Indicates that this redefinition strategy is enabled.
         */
        private final boolean enabled;

        /**
         * {@code true} if this strategy applies retransformation.
         */
        private final boolean retransforming;

        /**
         * Creates a new redefinition strategy.
         *
         * @param enabled        {@code true} if this strategy is enabled.
         * @param retransforming {@code true} if this strategy applies retransformation.
         */
        RedefinitionStrategy(boolean enabled, boolean retransforming) {
            this.enabled = enabled;
            this.retransforming = retransforming;
        }

        /**
         * Indicates if this strategy requires a class file transformer to be registered with a hint to apply the
         * transformer for retransformation.
         *
         * @return {@code true} if a class file transformer must be registered with a hint for retransformation.
         */
        protected boolean isRetransforming() {
            return retransforming;
        }

        /**
         * Checks if this strategy can be applied to the supplied instrumentation instance.
         *
         * @param instrumentation The instrumentation instance to validate.
         */
        protected abstract void check(Instrumentation instrumentation);

        /**
         * Indicates that this redefinition strategy applies a modification of already loaded classes.
         *
         * @return {@code true} if this redefinition strategy applies a modification of already loaded classes.
         */
        protected boolean isEnabled() {
            return enabled;
        }

        /**
         * Creates a collector instance that is responsible for collecting loaded classes for potential retransformation.
         *
         * @return A new collector for collecting already loaded classes for transformation.
         */
        protected abstract Collector make();

        /**
         * Applies this redefinition strategy by submitting all loaded types to redefinition. If this redefinition strategy is disabled,
         * this method is non-operational.
         *
         * @param instrumentation               The instrumentation instance to use.
         * @param listener                      The listener to notify on transformations.
         * @param circularityLock               The circularity lock to use.
         * @param poolStrategy                  The type locator to use.
         * @param locationStrategy              The location strategy to use.
         * @param redefinitionDiscoveryStrategy The discovery strategy for loaded types to be redefined.
         * @param redefinitionBatchAllocator    The batch allocator for the redefinition strategy to apply.
         * @param redefinitionListener          The redefinition listener for the redefinition strategy to apply.
         * @param lambdaInstrumentationStrategy A strategy to determine of the {@code LambdaMetafactory} should be instrumented to allow for the
         *                                      instrumentation of classes that represent lambda expressions.
         * @param descriptionStrategy           The description strategy for resolving type descriptions for types.
         * @param fallbackStrategy              The fallback strategy to apply.
         * @param matcher                       The matcher to identify what types to redefine.
         */
        protected void apply(Instrumentation instrumentation,
                             AgentBuilder.Listener listener,
                             CircularityLock circularityLock,
                             PoolStrategy poolStrategy,
                             LocationStrategy locationStrategy,
                             DiscoveryStrategy redefinitionDiscoveryStrategy,
                             BatchAllocator redefinitionBatchAllocator,
                             Listener redefinitionListener,
                             LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                             DescriptionStrategy descriptionStrategy,
                             FallbackStrategy fallbackStrategy,
                             RawMatcher matcher) {
            check(instrumentation);
            int batch = RedefinitionStrategy.BatchAllocator.FIRST_BATCH;
            for (Iterable<Class<?>> types : redefinitionDiscoveryStrategy.resolve(instrumentation)) {
                RedefinitionStrategy.Collector collector = make();
                for (Class<?> type : types) {
                    if (type == null || type.isArray() || !lambdaInstrumentationStrategy.isInstrumented(type)) {
                        continue;
                    }
                    JavaModule module = JavaModule.ofType(type);
                    try {
                        TypePool typePool = poolStrategy.typePool(locationStrategy.classFileLocator(type.getClassLoader(), module), type.getClassLoader());
                        try {
                            collector.consider(matcher,
                                    listener,
                                    descriptionStrategy.apply(TypeDescription.ForLoadedType.getName(type), type, typePool, circularityLock, type.getClassLoader(), module),
                                    type,
                                    type,
                                    module,
                                    !DISPATCHER.isModifiableClass(instrumentation, type));
                        } catch (Throwable throwable) {
                            if (descriptionStrategy.isLoadedFirst() && fallbackStrategy.isFallback(type, throwable)) {
                                collector.consider(matcher,
                                        listener,
                                        typePool.describe(TypeDescription.ForLoadedType.getName(type)).resolve(),
                                        type,
                                        module);
                            } else {
                                throw throwable;
                            }
                        }
                    } catch (Throwable throwable) {
                        try {
                            try {
                                listener.onDiscovery(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED);
                            } finally {
                                try {
                                    listener.onError(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED, throwable);
                                } finally {
                                    listener.onComplete(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED);
                                }
                            }
                        } catch (Throwable ignored) {
                            // Ignore exceptions that are thrown by listeners to mimic the behavior of a transformation.
                        }
                    }
                }
                batch = collector.apply(instrumentation, circularityLock, locationStrategy, listener, redefinitionBatchAllocator, redefinitionListener, batch);
            }
        }

        /**
         * A batch allocator which is responsible for applying a redefinition in a batches. A class redefinition or
         * retransformation can be a time-consuming operation rendering a JVM non-responsive. In combination with a
         * a {@link RedefinitionStrategy.Listener}, it is also possible to apply pauses between batches to distribute
         * the load of a retransformation over time.
         */
        public interface BatchAllocator {

            /**
             * The index of the first batch.
             */
            int FIRST_BATCH = 0;

            /**
             * Splits a list of types to be retransformed into separate batches.
             *
             * @param types A list of types which should be retransformed.
             * @return An iterable of retransformations within a batch.
             */
            Iterable<? extends List<Class<?>>> batch(List<Class<?>> types);

            /**
             * A batch allocator that includes all types in a single batch.
             */
            enum ForTotal implements BatchAllocator {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> types) {
                    return types.isEmpty()
                            ? Collections.<List<Class<?>>>emptySet()
                            : Collections.singleton(types);
                }
            }

            /**
             * A batch allocator that creates chunks with a fixed size as batch jobs.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class ForFixedSize implements BatchAllocator {

                /**
                 * The size of each chunk.
                 */
                private final int size;

                /**
                 * Creates a new batch allocator that creates fixed-sized chunks.
                 *
                 * @param size The size of each chunk.
                 */
                protected ForFixedSize(int size) {
                    this.size = size;
                }

                /**
                 * Creates a new batch allocator that creates chunks of a fixed size.
                 *
                 * @param size The size of each chunk or {@code 0} if the batch should be included in a single chunk.
                 * @return An appropriate batch allocator.
                 */
                public static BatchAllocator ofSize(int size) {
                    if (size > 0) {
                        return new ForFixedSize(size);
                    } else if (size == 0) {
                        return ForTotal.INSTANCE;
                    } else {
                        throw new IllegalArgumentException("Cannot define a batch with a negative size: " + size);
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> types) {
                    List<List<Class<?>>> batches = new ArrayList<List<Class<?>>>();
                    for (int index = 0; index < types.size(); index += size) {
                        batches.add(new ArrayList<Class<?>>(types.subList(index, Math.min(types.size(), index + size))));
                    }
                    return batches;
                }
            }

            /**
             * A batch allocator that groups all batches by discriminating types using a type matcher.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class ForMatchedGrouping implements BatchAllocator {

                /**
                 * The type matchers to apply.
                 */
                private final Collection<? extends ElementMatcher<? super TypeDescription>> matchers;

                /**
                 * Creates a new batch allocator that groups all batches by discriminating types using a type matcher. All batches
                 * are applied in their application order with any unmatched type being included in the last batch.
                 *
                 * @param matcher The type matchers to apply in their application order.
                 */
                @SuppressWarnings("unchecked") // In absence of @SafeVarargs
                public ForMatchedGrouping(ElementMatcher<? super TypeDescription>... matcher) {
                    this(new LinkedHashSet<ElementMatcher<? super TypeDescription>>(Arrays.asList(matcher)));
                }

                /**
                 * Creates a new batch allocator that groups all batches by discriminating types using a type matcher. All batches
                 * are applied in their application order with any unmatched type being included in the last batch.
                 *
                 * @param matchers The type matchers to apply in their application order.
                 */
                public ForMatchedGrouping(Collection<? extends ElementMatcher<? super TypeDescription>> matchers) {
                    this.matchers = matchers;
                }

                /**
                 * Assures that any group is at least of a given size. If a group is smaller than a given size, it is merged with its types
                 * are merged with its subsequent group(s) as long as such groups exist.
                 *
                 * @param threshold The minimum threshold for any batch.
                 * @return An appropriate batch allocator.
                 */
                public BatchAllocator withMinimum(int threshold) {
                    return Slicing.withMinimum(threshold, this);
                }

                /**
                 * Assures that any group is at least of a given size. If a group is bigger than a given size, it is split into two several
                 * batches.
                 *
                 * @param threshold The maximum threshold for any batch.
                 * @return An appropriate batch allocator.
                 */
                public BatchAllocator withMaximum(int threshold) {
                    return Slicing.withMaximum(threshold, this);
                }

                /**
                 * Assures that any group is within a size range described by the supplied minimum and maximum. Groups are split and merged
                 * according to the supplied thresholds. The last group contains might be smaller than the supplied minimum.
                 *
                 * @param minimum The minimum threshold for any batch.
                 * @param maximum The maximum threshold for any batch.
                 * @return An appropriate batch allocator.
                 */
                public BatchAllocator withinRange(int minimum, int maximum) {
                    return Slicing.withinRange(minimum, maximum, this);
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> types) {
                    Map<ElementMatcher<? super TypeDescription>, List<Class<?>>> matched = new LinkedHashMap<ElementMatcher<? super TypeDescription>, List<Class<?>>>();
                    List<Class<?>> unmatched = new ArrayList<Class<?>>();
                    for (ElementMatcher<? super TypeDescription> matcher : matchers) {
                        matched.put(matcher, new ArrayList<Class<?>>());
                    }
                    typeLoop:
                    for (Class<?> type : types) {
                        for (ElementMatcher<? super TypeDescription> matcher : matchers) {
                            if (matcher.matches(TypeDescription.ForLoadedType.of(type))) {
                                matched.get(matcher).add(type);
                                continue typeLoop;
                            }
                        }
                        unmatched.add(type);
                    }
                    List<List<Class<?>>> batches = new ArrayList<List<Class<?>>>(matchers.size() + 1);
                    for (List<Class<?>> batch : matched.values()) {
                        if (!batch.isEmpty()) {
                            batches.add(batch);
                        }
                    }
                    if (!unmatched.isEmpty()) {
                        batches.add(unmatched);
                    }
                    return batches;
                }
            }

            /**
             * A slicing batch allocator that assures that any batch is within a certain size range.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Slicing implements BatchAllocator {

                /**
                 * The minimum size of each slice.
                 */
                private final int minimum;

                /**
                 * The maximum size of each slice.
                 */
                private final int maximum;

                /**
                 * The delegate batch allocator.
                 */
                private final BatchAllocator batchAllocator;

                /**
                 * Creates a new slicing batch allocator.
                 *
                 * @param minimum        The minimum size of each slice.
                 * @param maximum        The maximum size of each slice.
                 * @param batchAllocator The delegate batch allocator.
                 */
                protected Slicing(int minimum, int maximum, BatchAllocator batchAllocator) {
                    this.minimum = minimum;
                    this.maximum = maximum;
                    this.batchAllocator = batchAllocator;
                }

                /**
                 * Creates a new slicing batch allocator.
                 *
                 * @param minimum        The minimum size of each slice.
                 * @param batchAllocator The delegate batch allocator.
                 * @return An appropriate slicing batch allocator.
                 */
                public static BatchAllocator withMinimum(int minimum, BatchAllocator batchAllocator) {
                    return withinRange(minimum, Integer.MAX_VALUE, batchAllocator);
                }

                /**
                 * Creates a new slicing batch allocator.
                 *
                 * @param maximum        The maximum size of each slice.
                 * @param batchAllocator The delegate batch allocator.
                 * @return An appropriate slicing batch allocator.
                 */
                public static BatchAllocator withMaximum(int maximum, BatchAllocator batchAllocator) {
                    return withinRange(1, maximum, batchAllocator);
                }

                /**
                 * Creates a new slicing batch allocator.
                 *
                 * @param minimum        The minimum size of each slice.
                 * @param maximum        The maximum size of each slice.
                 * @param batchAllocator The delegate batch allocator.
                 * @return An appropriate slicing batch allocator.
                 */
                public static BatchAllocator withinRange(int minimum, int maximum, BatchAllocator batchAllocator) {
                    if (minimum <= 0) {
                        throw new IllegalArgumentException("Minimum must be a positive number: " + minimum);
                    } else if (minimum > maximum) {
                        throw new IllegalArgumentException("Minimum must not be bigger than maximum: " + minimum + " >" + maximum);
                    }
                    return new Slicing(minimum, maximum, batchAllocator);
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> types) {
                    return new SlicingIterable(minimum, maximum, batchAllocator.batch(types));
                }

                /**
                 * An iterable that slices batches into parts of a minimum and maximum size.
                 */
                protected static class SlicingIterable implements Iterable<List<Class<?>>> {

                    /**
                     * The minimum size of any slice.
                     */
                    private final int minimum;

                    /**
                     * The maximum size of any slice.
                     */
                    private final int maximum;

                    /**
                     * The delegate iterable.
                     */
                    private final Iterable<? extends List<Class<?>>> iterable;

                    /**
                     * Creates a new slicing iterable.
                     *
                     * @param minimum  The minimum size of any slice.
                     * @param maximum  The maximum size of any slice.
                     * @param iterable The delegate iterable.
                     */
                    protected SlicingIterable(int minimum, int maximum, Iterable<? extends List<Class<?>>> iterable) {
                        this.minimum = minimum;
                        this.maximum = maximum;
                        this.iterable = iterable;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Iterator<List<Class<?>>> iterator() {
                        return new SlicingIterator(minimum, maximum, iterable.iterator());
                    }

                    /**
                     * An iterator that slices batches into parts of a minimum and maximum size.
                     */
                    protected static class SlicingIterator implements Iterator<List<Class<?>>> {

                        /**
                         * The minimum size of any slice.
                         */
                        private final int minimum;

                        /**
                         * The maximum size of any slice.
                         */
                        private final int maximum;

                        /**
                         * The delegate iterator.
                         */
                        private final Iterator<? extends List<Class<?>>> iterator;

                        /**
                         * A buffer containing all types that surpassed the maximum.
                         */
                        private List<Class<?>> buffer;

                        /**
                         * Creates a new slicing iterator.
                         *
                         * @param minimum  The minimum size of any slice.
                         * @param maximum  The maximum size of any slice.
                         * @param iterator The delegate iterator.
                         */
                        protected SlicingIterator(int minimum, int maximum, Iterator<? extends List<Class<?>>> iterator) {
                            this.minimum = minimum;
                            this.maximum = maximum;
                            this.iterator = iterator;
                            buffer = new ArrayList<Class<?>>();
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public boolean hasNext() {
                            return !buffer.isEmpty() || iterator.hasNext();
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public List<Class<?>> next() {
                            if (buffer.isEmpty()) {
                                buffer = iterator.next();
                            }
                            while (buffer.size() < minimum && iterator.hasNext()) {
                                buffer.addAll(iterator.next());
                            }
                            if (buffer.size() > maximum) {
                                try {
                                    return buffer.subList(0, maximum);
                                } finally {
                                    buffer = new ArrayList<Class<?>>(buffer.subList(maximum, buffer.size()));
                                }
                            } else {
                                try {
                                    return buffer;
                                } finally {
                                    buffer = new ArrayList<Class<?>>();
                                }
                            }
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }
                }
            }

            /**
             * A partitioning batch allocator that splits types for redefinition into a fixed amount of parts.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Partitioning implements BatchAllocator {

                /**
                 * The amount of batches to generate.
                 */
                private final int parts;

                /**
                 * Creates a new batch allocator that splits types for redefinition into a fixed amount of parts.
                 *
                 * @param parts The amount of parts to create.
                 */
                protected Partitioning(int parts) {
                    this.parts = parts;
                }

                /**
                 * Creates a part-splitting batch allocator.
                 *
                 * @param parts The amount of parts to create.
                 * @return A batch allocator that splits the redefined types into a fixed amount of batches.
                 */
                public static BatchAllocator of(int parts) {
                    if (parts < 1) {
                        throw new IllegalArgumentException("A batch size must be positive: " + parts);
                    }
                    return new Partitioning(parts);
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> types) {
                    if (types.isEmpty()) {
                        return Collections.emptyList();
                    } else {
                        List<List<Class<?>>> batches = new ArrayList<List<Class<?>>>();
                        int size = types.size() / parts, reminder = types.size() % parts;
                        for (int index = reminder; index < types.size(); index += size) {
                            batches.add(new ArrayList<Class<?>>(types.subList(index, index + size)));
                        }
                        if (batches.isEmpty()) {
                            return Collections.singletonList(types);
                        } else {
                            batches.get(0).addAll(0, types.subList(0, reminder));
                            return batches;
                        }
                    }
                }
            }
        }

        /**
         * A listener to be applied during a redefinition.
         */
        public interface Listener {

            /**
             * Invoked before applying a batch.
             *
             * @param index A running index of the batch starting at {@code 0}.
             * @param batch The types included in this batch.
             * @param types All types included in the redefinition.
             */
            void onBatch(int index, List<Class<?>> batch, List<Class<?>> types);

            /**
             * Invoked upon an error during a batch. This method is not invoked if the failure handler handled this error.
             *
             * @param index     A running index of the batch starting at {@code 0}.
             * @param batch     The types included in this batch.
             * @param throwable The throwable that caused this invocation.
             * @param types     All types included in the redefinition.
             * @return A set of classes which should be attempted to be redefined. Typically, this should be a subset of the classes
             * contained in {@code batch} but not all classes.
             */
            Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types);

            /**
             * Invoked upon completion of all batches.
             *
             * @param amount   The total amount of batches that were executed.
             * @param types    All types included in the redefinition.
             * @param failures A mapping of batch types to their unhandled failures.
             */
            void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures);

            /**
             * A non-operational listener.
             */
            enum NoOp implements Listener {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    /* do nothing */
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    return Collections.emptyList();
                }

                /**
                 * {@inheritDoc}
                 */
                public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                    /* do nothing */
                }
            }

            /**
             * A listener that invokes {@link Thread#yield()} prior to every batch but the first batch.
             */
            enum Yielding implements Listener {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    if (index > 0) {
                        Thread.yield();
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    return Collections.emptyList();
                }

                /**
                 * {@inheritDoc}
                 */
                public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                    /* do nothing */
                }
            }

            /**
             * A listener that halts a retransformation process upon an exception.
             */
            enum ErrorEscalating implements Listener {

                /**
                 * A listener that fails the retransformation upon the first failed retransformation of a batch.
                 */
                FAIL_FAST {
                    /** {@inheritDoc} */
                    public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                        throw new IllegalStateException("Could not transform any of " + batch, throwable);
                    }

                    /** {@inheritDoc} */
                    public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                        /* do nothing */
                    }
                },

                /**
                 * A listener that fails the retransformation after all batches were executed if any error occurred.
                 */
                FAIL_LAST {
                    /** {@inheritDoc} */
                    public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                        return Collections.emptyList();
                    }

                    /** {@inheritDoc} */
                    public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                        if (!failures.isEmpty()) {
                            throw new IllegalStateException("Could not transform any of " + failures);
                        }
                    }
                };

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    /* do nothing */
                }
            }

            /**
             * A listener adapter that offers non-operational implementations of all listener methods.
             */
            @HashCodeAndEqualsPlugin.Enhance
            abstract class Adapter implements Listener {

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    /* do nothing */
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    return Collections.emptyList();
                }

                /**
                 * {@inheritDoc}
                 */
                public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                    /* do nothing */
                }
            }

            /**
             * <p>
             * A batch reallocator allows to split up a failed retransformation into additional batches which are reenqueed to the
             * current retransformation process. To do so, any batch with at least to classes is rerouted through a {@link BatchAllocator}
             * which is responsible for regrouping the classes that failed to be retransformed into new batches.
             * </p>
             * <p>
             * <b>Important</b>: To avoid endless looping over classes that cannot be successfully retransformed, the supplied batch
             * allocator must not resubmit batches that previously failed as an identical outcome is likely.
             * </p>
             */
            @HashCodeAndEqualsPlugin.Enhance
            class BatchReallocator extends Adapter {

                /**
                 * The batch allocator to use for reallocating failed batches.
                 */
                private final BatchAllocator batchAllocator;

                /**
                 * Creates a new batch reallocator.
                 *
                 * @param batchAllocator The batch allocator to use for reallocating failed batches.
                 */
                public BatchReallocator(BatchAllocator batchAllocator) {
                    this.batchAllocator = batchAllocator;
                }

                /**
                 * Creates a batch allocator that splits any batch into two parts and resubmits these parts as two batches.
                 *
                 * @return A batch reallocating batch listener that splits failed batches into two parts for resubmission.
                 */
                public static Listener splitting() {
                    return new BatchReallocator(new BatchAllocator.Partitioning(2));
                }

                @Override
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    return batch.size() < 2
                            ? Collections.<List<Class<?>>>emptyList()
                            : batchAllocator.batch(batch);
                }
            }

            /**
             * A listener that invokes {@link Thread#sleep(long)} prior to every batch but the first batch.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Pausing extends Adapter {

                /**
                 * The time to sleep in milliseconds between every two batches.
                 */
                private final long value;

                /**
                 * Creates a new pausing listener.
                 *
                 * @param value The time to sleep in milliseconds between every two batches.
                 */
                protected Pausing(long value) {
                    this.value = value;
                }

                /**
                 * Creates a listener that pauses for the specified amount of time. If the specified value is {@code 0}, a
                 * non-operational listener is returned.
                 *
                 * @param value    The amount of time to pause between redefinition batches.
                 * @param timeUnit The time unit of {@code value}.
                 * @return An appropriate listener.
                 */
                public static Listener of(long value, TimeUnit timeUnit) {
                    if (value > 0L) {
                        return new Pausing(timeUnit.toMillis(value));
                    } else if (value == 0L) {
                        return NoOp.INSTANCE;
                    } else {
                        throw new IllegalArgumentException("Cannot sleep for a non-positive amount of time: " + value);
                    }
                }

                @Override
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    if (index > 0) {
                        try {
                            Thread.sleep(value);
                        } catch (InterruptedException exception) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException(exception);
                        }
                    }
                }
            }

            /**
             * A listener that writes events to a {@link PrintStream}.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class StreamWriting implements Listener {

                /**
                 * The print stream to write any events to.
                 */
                private final PrintStream printStream;

                /**
                 * Creates a new stream writing listener.
                 *
                 * @param printStream The print stream to write any events to.
                 */
                public StreamWriting(PrintStream printStream) {
                    this.printStream = printStream;
                }

                /**
                 * Writes the stream result to {@link System#out}.
                 *
                 * @return An appropriate listener.
                 */
                public static Listener toSystemOut() {
                    return new StreamWriting(System.out);
                }

                /**
                 * Writes the stream result to {@link System#err}.
                 *
                 * @return An appropriate listener.
                 */
                public static Listener toSystemError() {
                    return new StreamWriting(System.err);
                }

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    printStream.printf(AgentBuilder.Listener.StreamWriting.PREFIX + " REDEFINE BATCH #%d [%d of %d type(s)]%n", index, batch.size(), types.size());
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    synchronized (printStream) {
                        printStream.printf(AgentBuilder.Listener.StreamWriting.PREFIX + " REDEFINE ERROR #%d [%d of %d type(s)]%n", index, batch.size(), types.size());
                        throwable.printStackTrace(printStream);
                    }
                    return Collections.emptyList();
                }

                /**
                 * {@inheritDoc}
                 */
                public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                    printStream.printf(AgentBuilder.Listener.StreamWriting.PREFIX + " REDEFINE COMPLETE %d batch(es) containing %d types [%d failed batch(es)]%n", amount, types.size(), failures.size());
                }
            }

            /**
             * A compound listener that delegates events to several listeners.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Compound implements Listener {

                /**
                 * The listeners to invoke.
                 */
                private final List<Listener> listeners;

                /**
                 * Creates a new compound listener.
                 *
                 * @param listener The listeners to invoke.
                 */
                public Compound(Listener... listener) {
                    this(Arrays.asList(listener));
                }

                /**
                 * Creates a new compound listener.
                 *
                 * @param listeners The listeners to invoke.
                 */
                public Compound(List<? extends Listener> listeners) {
                    this.listeners = new ArrayList<Listener>();
                    for (Listener listener : listeners) {
                        if (listener instanceof Compound) {
                            this.listeners.addAll(((Compound) listener).listeners);
                        } else if (!(listener instanceof NoOp)) {
                            this.listeners.add(listener);
                        }
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void onBatch(int index, List<Class<?>> batch, List<Class<?>> types) {
                    for (Listener listener : listeners) {
                        listener.onBatch(index, batch, types);
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<? extends List<Class<?>>> onError(int index, List<Class<?>> batch, Throwable throwable, List<Class<?>> types) {
                    List<Iterable<? extends List<Class<?>>>> reattempts = new ArrayList<Iterable<? extends List<Class<?>>>>();
                    for (Listener listener : listeners) {
                        reattempts.add(listener.onError(index, batch, throwable, types));
                    }
                    return new CompoundIterable(reattempts);
                }

                /**
                 * {@inheritDoc}
                 */
                public void onComplete(int amount, List<Class<?>> types, Map<List<Class<?>>, Throwable> failures) {
                    for (Listener listener : listeners) {
                        listener.onComplete(amount, types, failures);
                    }
                }

                /**
                 * A compound iterable.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class CompoundIterable implements Iterable<List<Class<?>>> {

                    /**
                     * The iterables to consider.
                     */
                    private final List<Iterable<? extends List<Class<?>>>> iterables;

                    /**
                     * Creates a compound iterable.
                     *
                     * @param iterables The iterables to consider.
                     */
                    protected CompoundIterable(List<Iterable<? extends List<Class<?>>>> iterables) {
                        this.iterables = iterables;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Iterator<List<Class<?>>> iterator() {
                        return new CompoundIterator(new ArrayList<Iterable<? extends List<Class<?>>>>(iterables));
                    }

                    /**
                     * A compound iterator that combines several iterables.
                     */
                    protected static class CompoundIterator implements Iterator<List<Class<?>>> {

                        /**
                         * The current iterator or {@code null} if no such iterator is defined.
                         */
                        private Iterator<? extends List<Class<?>>> current;

                        /**
                         * A backlog of iterables to still consider.
                         */
                        private final List<Iterable<? extends List<Class<?>>>> backlog;

                        /**
                         * Creates a compound iterator.
                         *
                         * @param iterables The iterables to consider.
                         */
                        protected CompoundIterator(List<Iterable<? extends List<Class<?>>>> iterables) {
                            backlog = iterables;
                            forward();
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public boolean hasNext() {
                            return current != null && current.hasNext();
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public List<Class<?>> next() {
                            try {
                                if (current != null) {
                                    return current.next();
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } finally {
                                forward();
                            }
                        }

                        /**
                         * Forwards the iterator to the next relevant iterable.
                         */
                        private void forward() {
                            while ((current == null || !current.hasNext()) && !backlog.isEmpty()) {
                                current = backlog.remove(0).iterator();
                            }
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }
                }
            }
        }

        /**
         * A strategy for discovering types to redefine.
         */
        public interface DiscoveryStrategy {

            /**
             * Resolves an iterable of types to retransform. Types might be loaded during a previous retransformation which might require
             * multiple passes for a retransformation.
             *
             * @param instrumentation The instrumentation instance used for the redefinition.
             * @return An iterable of types to consider for retransformation.
             */
            Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation);

            /**
             * A discovery strategy that considers all loaded types supplied by {@link Instrumentation#getAllLoadedClasses()}.
             */
            enum SinglePass implements DiscoveryStrategy {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.<Iterable<Class<?>>>singleton(Arrays.<Class<?>>asList(instrumentation.getAllLoadedClasses()));
                }
            }

            /**
             * A discovery strategy that considers all loaded types supplied by {@link Instrumentation#getAllLoadedClasses()}. For each reiteration,
             * this strategy checks if additional types were loaded after the previously supplied types. Doing so, types that were loaded during
             * instrumentations can be retransformed as such types are not passed to any class file transformer.
             */
            enum Reiterating implements DiscoveryStrategy {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return new ReiteratingIterable(instrumentation);
                }

                /**
                 * An iterable that returns any loaded types and checks if any additional types were loaded during the last instrumentation.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class ReiteratingIterable implements Iterable<Iterable<Class<?>>> {

                    /**
                     * The instrumentation instance to use.
                     */
                    private final Instrumentation instrumentation;

                    /**
                     * Creates a new reiterating iterable.
                     *
                     * @param instrumentation The instrumentation instance to use.
                     */
                    protected ReiteratingIterable(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Iterator<Iterable<Class<?>>> iterator() {
                        return new ReiteratingIterator(instrumentation);
                    }
                }

                /**
                 * A reiterating iterator that considers types that were loaded during an instrumentation.
                 */
                protected static class ReiteratingIterator implements Iterator<Iterable<Class<?>>> {

                    /**
                     * The instrumentation instance to use.
                     */
                    private final Instrumentation instrumentation;

                    /**
                     * A set containing all previously discovered types.
                     */
                    private final Set<Class<?>> processed;

                    /**
                     * The current list of types or {@code null} if the current list of types is not prepared.
                     */
                    private List<Class<?>> types;

                    /**
                     * Creates a new reiterating iterator.
                     *
                     * @param instrumentation The instrumentation instance to use.
                     */
                    protected ReiteratingIterator(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                        processed = new HashSet<Class<?>>();
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public boolean hasNext() {
                        if (types == null) {
                            types = new ArrayList<Class<?>>();
                            for (Class<?> type : instrumentation.getAllLoadedClasses()) {
                                if (type != null && processed.add(type)) {
                                    types.add(type);
                                }
                            }
                        }
                        return !types.isEmpty();
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Iterable<Class<?>> next() {
                        if (hasNext()) {
                            try {
                                return types;
                            } finally {
                                types = null;
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }
                }
            }

            /**
             * An explicit discovery strategy that only attempts the redefinition of specific types.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Explicit implements DiscoveryStrategy {

                /**
                 * The types to redefine.
                 */
                private final Set<Class<?>> types;

                /**
                 * Creates a new explicit discovery strategy.
                 *
                 * @param type The types to redefine.
                 */
                public Explicit(Class<?>... type) {
                    this(new LinkedHashSet<Class<?>>(Arrays.asList(type)));
                }

                /**
                 * Creates a new explicit discovery strategy.
                 *
                 * @param types The types to redefine.
                 */
                public Explicit(Set<Class<?>> types) {
                    this.types = types;
                }

                /**
                 * {@inheritDoc}
                 */
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.<Iterable<Class<?>>>singleton(types);
                }
            }
        }

        /**
         * A resubmission scheduler is responsible for scheduling a job that is resubmitting unloaded types that failed during retransformation.
         */
        public interface ResubmissionScheduler {

            /**
             * Checks if this scheduler is currently available.
             *
             * @return {@code true} if this scheduler is alive.
             */
            boolean isAlive();

            /**
             * Schedules a resubmission job for regular application.
             *
             * @param job The job to schedule.
             * @return A cancelable that is canceled upon resetting the corresponding class file transformer.
             */
            Cancelable schedule(Runnable job);

            /**
             * A cancelable allows to discontinue a resubmission job.
             */
            interface Cancelable {

                /**
                 * Cancels this resubmission job.
                 */
                void cancel();

                /**
                 * A non-operational cancelable.
                 */
                enum NoOp implements Cancelable {

                    /**
                     * The singleton instance.
                     */
                    INSTANCE;

                    /**
                     * {@inheritDoc}
                     */
                    public void cancel() {
                        /* do nothing */
                    }
                }

                /**
                 * A cancelable for a {@link Future}.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                class ForFuture implements Cancelable {

                    /**
                     * The future to cancel upon cancellation of this instance.
                     */
                    private final Future<?> future;

                    /**
                     * Creates a cancelable for a future.
                     *
                     * @param future The future to cancel upon cancellation of this instance.
                     */
                    public ForFuture(Future<?> future) {
                        this.future = future;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void cancel() {
                        future.cancel(true);
                    }
                }
            }

            /**
             * A resubmission scheduler that does not apply any scheduling.
             */
            enum NoOp implements ResubmissionScheduler {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public boolean isAlive() {
                    return false;
                }

                /**
                 * {@inheritDoc}
                 */
                public Cancelable schedule(Runnable job) {
                    return Cancelable.NoOp.INSTANCE;
                }
            }

            /**
             * A resubmission scheduler that schedules jobs at a fixed rate.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class AtFixedRate implements ResubmissionScheduler {

                /**
                 * The executor service to schedule to.
                 */
                private final ScheduledExecutorService scheduledExecutorService;

                /**
                 * The time interval between schedulings.
                 */
                private final long time;

                /**
                 * The time's time unit.
                 */
                private final TimeUnit timeUnit;

                /**
                 * Creates a new resubmission scheduler which schedules executions at a fixed rate.
                 *
                 * @param scheduledExecutorService The executor service to schedule to.
                 * @param time                     The time interval between schedulings.
                 * @param timeUnit                 The time's time unit.
                 */
                public AtFixedRate(ScheduledExecutorService scheduledExecutorService, long time, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = time;
                    this.timeUnit = timeUnit;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isAlive() {
                    return !scheduledExecutorService.isShutdown();
                }

                /**
                 * {@inheritDoc}
                 */
                public Cancelable schedule(Runnable job) {
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleAtFixedRate(job, time, time, timeUnit));
                }
            }

            /**
             * A resubmission scheduler that schedules jobs with a fixed delay.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class WithFixedDelay implements ResubmissionScheduler {

                /**
                 * The executor service to schedule to.
                 */
                private final ScheduledExecutorService scheduledExecutorService;

                /**
                 * The time interval to pause between completed jobs.
                 */
                private final long time;

                /**
                 * The time's time unit.
                 */
                private final TimeUnit timeUnit;

                /**
                 * Creates a new resubmission scheduler with a fixed delay between job executions.
                 *
                 * @param scheduledExecutorService The executor service to schedule to.
                 * @param time                     The time interval to pause between completed jobs.
                 * @param timeUnit                 The time's time unit.
                 */
                public WithFixedDelay(ScheduledExecutorService scheduledExecutorService, long time, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = time;
                    this.timeUnit = timeUnit;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isAlive() {
                    return !scheduledExecutorService.isShutdown();
                }

                /**
                 * {@inheritDoc}
                 */
                public Cancelable schedule(Runnable job) {
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleWithFixedDelay(job, time, time, timeUnit));
                }
            }
        }

        /**
         * A resubmission strategy is responsible for enabling resubmission of types that failed to resubmit.
         */
        protected interface ResubmissionStrategy {

            /**
             * Invoked upon installation of an agent builder.
             *
             * @param instrumentation            The instrumentation instance to use.
             * @param locationStrategy           The location strategy to use.
             * @param listener                   The listener to use.
             * @param installationListener       The installation listener to use.
             * @param circularityLock            The circularity lock to use.
             * @param matcher                    The matcher to apply for analyzing if a type is to be resubmitted.
             * @param redefinitionStrategy       The redefinition strategy to use.
             * @param redefinitionBatchAllocator The batch allocator to use.
             * @param redefinitionBatchListener  The batch listener to notify.
             * @return A potentially modified listener to apply.
             */
            Installation apply(Instrumentation instrumentation,
                               LocationStrategy locationStrategy,
                               AgentBuilder.Listener listener,
                               InstallationListener installationListener,
                               CircularityLock circularityLock,
                               RawMatcher matcher,
                               RedefinitionStrategy redefinitionStrategy,
                               RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator,
                               RedefinitionStrategy.Listener redefinitionBatchListener);

            /**
             * A disabled resubmission strategy.
             */
            enum Disabled implements ResubmissionStrategy {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Installation apply(Instrumentation instrumentation,
                                          LocationStrategy locationStrategy,
                                          AgentBuilder.Listener listener,
                                          InstallationListener installationListener,
                                          CircularityLock circularityLock,
                                          RawMatcher matcher,
                                          RedefinitionStrategy redefinitionStrategy,
                                          BatchAllocator redefinitionBatchAllocator,
                                          Listener redefinitionBatchListener) {
                    return new Installation(listener, installationListener);
                }
            }

            /**
             * An enabled resubmission strategy.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Enabled implements ResubmissionStrategy {

                /**
                 * A scheduler that is responsible for resubmission of types.
                 */
                private final ResubmissionScheduler resubmissionScheduler;

                /**
                 * The matcher for filtering error causes.
                 */
                private final ElementMatcher<? super Throwable> matcher;

                /**
                 * Creates a new enabled resubmission strategy.
                 *
                 * @param resubmissionScheduler A scheduler that is responsible for resubmission of types.
                 * @param matcher               The matcher for filtering error causes.
                 */
                protected Enabled(ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> matcher) {
                    this.resubmissionScheduler = resubmissionScheduler;
                    this.matcher = matcher;
                }

                /**
                 * {@inheritDoc}
                 */
                public Installation apply(Instrumentation instrumentation,
                                          LocationStrategy locationStrategy,
                                          AgentBuilder.Listener listener,
                                          InstallationListener installationListener,
                                          CircularityLock circularityLock,
                                          RawMatcher matcher,
                                          RedefinitionStrategy redefinitionStrategy,
                                          RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator,
                                          RedefinitionStrategy.Listener redefinitionBatchListener) {
                    if (redefinitionStrategy.isEnabled() && resubmissionScheduler.isAlive()) {
                        ConcurrentMap<StorageKey, Set<String>> types = new ConcurrentHashMap<StorageKey, Set<String>>();
                        return new Installation(new AgentBuilder.Listener.Compound(new ResubmissionListener(this.matcher, types), listener),
                                new InstallationListener.Compound(new ResubmissionInstallationListener(resubmissionScheduler,
                                        instrumentation,
                                        locationStrategy,
                                        listener,
                                        circularityLock,
                                        matcher,
                                        redefinitionStrategy,
                                        redefinitionBatchAllocator,
                                        redefinitionBatchListener,
                                        types), installationListener));
                    } else {
                        return new Installation(listener, installationListener);
                    }
                }

                /**
                 * A listener that registers types for resubmission that failed during transformations.
                 */
                protected static class ResubmissionListener extends AgentBuilder.Listener.Adapter {

                    /**
                     * The matcher for filtering error causes.
                     */
                    private final ElementMatcher<? super Throwable> matcher;

                    /**
                     * A map of class loaders to their types to resubmit.
                     */
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    /**
                     * @param matcher The matcher for filtering error causes.
                     * @param types   A map of class loaders to their types to resubmit.
                     */
                    protected ResubmissionListener(ElementMatcher<? super Throwable> matcher, ConcurrentMap<StorageKey, Set<String>> types) {
                        this.matcher = matcher;
                        this.types = types;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    @SuppressFBWarnings(value = "GC_UNRELATED_TYPES", justification = "Use of unrelated key is intended for avoiding unnecessary weak reference")
                    public void onError(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded, Throwable throwable) {
                        if (!loaded && matcher.matches(throwable)) {
                            Set<String> types = this.types.get(new LookupKey(classLoader));
                            if (types == null) {
                                types = new ConcurrentHashSet<String>();
                                Set<String> previous = this.types.putIfAbsent(new StorageKey(classLoader), types);
                                if (previous != null) {
                                    types = previous;
                                }
                            }
                            types.add(typeName);
                        }
                    }

                    /**
                     * A set projection for a {@link ConcurrentHashMap}.
                     *
                     * @param <T> The element type of the set projection.
                     */
                    protected static class ConcurrentHashSet<T> extends AbstractSet<T> {

                        /**
                         * The delegate map.
                         */
                        private final ConcurrentMap<T, Boolean> delegate;

                        /**
                         * Creates a concurrent hash set.
                         */
                        protected ConcurrentHashSet() {
                            delegate = new ConcurrentHashMap<T, Boolean>();
                        }

                        @Override
                        public boolean add(T value) {
                            return delegate.put(value, Boolean.TRUE) == null;
                        }

                        @Override
                        public boolean remove(Object value) {
                            return delegate.remove(value) != null;
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public Iterator<T> iterator() {
                            return delegate.keySet().iterator();
                        }

                        /**
                         * {@inheritDoc}
                         */
                        public int size() {
                            return delegate.size();
                        }
                    }
                }

                /**
                 * A job that resubmits any matched type that previously failed during transformation.
                 */
                protected static class ResubmissionInstallationListener extends AgentBuilder.InstallationListener.Adapter implements Runnable {

                    /**
                     * The resubmission scheduler to use.
                     */
                    private final ResubmissionScheduler resubmissionScheduler;

                    /**
                     * The instrumentation instance to use.
                     */
                    private final Instrumentation instrumentation;

                    /**
                     * The location strategy to use.
                     */
                    private final LocationStrategy locationStrategy;

                    /**
                     * The listener to use.
                     */
                    private final AgentBuilder.Listener listener;

                    /**
                     * The circularity lock to use.
                     */
                    private final CircularityLock circularityLock;

                    /**
                     * The matcher to apply for analyzing if a type is to be resubmitted.
                     */
                    private final RawMatcher matcher;

                    /**
                     * The redefinition strategy to use.
                     */
                    private final RedefinitionStrategy redefinitionStrategy;

                    /**
                     * The batch allocator to use.
                     */
                    private final BatchAllocator redefinitionBatchAllocator;

                    /**
                     * The batch listener to notify.
                     */
                    private final Listener redefinitionBatchListener;

                    /**
                     * A map of class loaders to their types to resubmit.
                     */
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    /**
                     * This scheduler's cancelable or {@code null} if no cancelable was registered.
                     */
                    private volatile ResubmissionScheduler.Cancelable cancelable;

                    /**
                     * Creates a new resubmission job.
                     *
                     * @param resubmissionScheduler      The resubmission scheduler to use.
                     * @param instrumentation            The instrumentation instance to use.
                     * @param locationStrategy           The location strategy to use.
                     * @param listener                   The listener to use.
                     * @param circularityLock            The circularity lock to use.
                     * @param matcher                    The matcher to apply for analyzing if a type is to be resubmitted.
                     * @param redefinitionStrategy       The redefinition strategy to use.
                     * @param redefinitionBatchAllocator The batch allocator to use.
                     * @param redefinitionBatchListener  The batch listener to notify.
                     * @param types                      A map of class loaders to their types to resubmit.
                     */
                    protected ResubmissionInstallationListener(ResubmissionScheduler resubmissionScheduler,
                                                               Instrumentation instrumentation,
                                                               LocationStrategy locationStrategy,
                                                               AgentBuilder.Listener listener,
                                                               CircularityLock circularityLock,
                                                               RawMatcher matcher,
                                                               RedefinitionStrategy redefinitionStrategy,
                                                               BatchAllocator redefinitionBatchAllocator,
                                                               Listener redefinitionBatchListener,
                                                               ConcurrentMap<StorageKey, Set<String>> types) {
                        this.resubmissionScheduler = resubmissionScheduler;
                        this.instrumentation = instrumentation;
                        this.locationStrategy = locationStrategy;
                        this.listener = listener;
                        this.circularityLock = circularityLock;
                        this.matcher = matcher;
                        this.redefinitionStrategy = redefinitionStrategy;
                        this.redefinitionBatchAllocator = redefinitionBatchAllocator;
                        this.redefinitionBatchListener = redefinitionBatchListener;
                        this.types = types;
                    }


                    @Override
                    public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                        cancelable = resubmissionScheduler.schedule(this);
                    }

                    @Override
                    public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                        ResubmissionScheduler.Cancelable cancelable = this.cancelable;
                        if (cancelable != null) {
                            cancelable.cancel();
                        }
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public void run() {
                        boolean release = circularityLock.acquire();
                        try {
                            Iterator<Map.Entry<StorageKey, Set<String>>> entries = types.entrySet().iterator();
                            List<Class<?>> types = new ArrayList<Class<?>>();
                            while (entries.hasNext()) {
                                if (Thread.interrupted()) {
                                    return;
                                }
                                Map.Entry<StorageKey, Set<String>> entry = entries.next();
                                ClassLoader classLoader = entry.getKey().get();
                                if (classLoader != null || entry.getKey().isBootstrapLoader()) {
                                    Iterator<String> iterator = entry.getValue().iterator();
                                    while (iterator.hasNext()) {
                                        if (Thread.interrupted()) {
                                            return;
                                        }
                                        try {
                                            Class<?> type = Class.forName(iterator.next(), false, classLoader);
                                            try {
                                                if (DISPATCHER.isModifiableClass(instrumentation, type) && matcher.matches(TypeDescription.ForLoadedType.of(type),
                                                        type.getClassLoader(),
                                                        JavaModule.ofType(type),
                                                        type,
                                                        type.getProtectionDomain())) {
                                                    types.add(type);
                                                }
                                            } catch (Throwable throwable) {
                                                try {
                                                    listener.onDiscovery(TypeDescription.ForLoadedType.getName(type),
                                                            type.getClassLoader(),
                                                            JavaModule.ofType(type),
                                                            AgentBuilder.Listener.LOADED);
                                                } finally {
                                                    try {
                                                        listener.onError(TypeDescription.ForLoadedType.getName(type),
                                                                type.getClassLoader(),
                                                                JavaModule.ofType(type),
                                                                AgentBuilder.Listener.LOADED,
                                                                throwable);
                                                    } finally {
                                                        listener.onComplete(TypeDescription.ForLoadedType.getName(type),
                                                                type.getClassLoader(),
                                                                JavaModule.ofType(type),
                                                                AgentBuilder.Listener.LOADED);
                                                    }
                                                }
                                            }
                                        } catch (Throwable ignored) {
                                            /* do nothing */
                                        } finally {
                                            iterator.remove();
                                        }
                                    }
                                } else {
                                    entries.remove();
                                }
                            }
                            if (!types.isEmpty()) {
                                RedefinitionStrategy.Collector collector = redefinitionStrategy.make();
                                collector.include(types);
                                collector.apply(instrumentation,
                                        circularityLock,
                                        locationStrategy,
                                        listener,
                                        redefinitionBatchAllocator,
                                        redefinitionBatchListener,
                                        BatchAllocator.FIRST_BATCH);
                            }
                        } finally {
                            if (release) {
                                circularityLock.release();
                            }
                        }
                    }
                }

                /**
                 * A key for a class loader that can only be used for looking up a preexisting value but avoids reference management.
                 */
                protected static class LookupKey {

                    /**
                     * The represented class loader.
                     */
                    private final ClassLoader classLoader;

                    /**
                     * The represented class loader's hash code or {@code 0} if this entry represents the bootstrap class loader.
                     */
                    private final int hashCode;

                    /**
                     * Creates a new lookup key.
                     *
                     * @param classLoader The represented class loader.
                     */
                    protected LookupKey(ClassLoader classLoader) {
                        this.classLoader = classLoader;
                        hashCode = System.identityHashCode(classLoader);
                    }

                    @Override
                    public int hashCode() {
                        return hashCode;
                    }

                    @Override
                    @SuppressFBWarnings(value = "EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS", justification = "Cross-comparison is intended")
                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        } else if (other instanceof LookupKey) {
                            return classLoader == ((LookupKey) other).classLoader;
                        } else if (other instanceof StorageKey) {
                            StorageKey storageKey = (StorageKey) other;
                            return hashCode == storageKey.hashCode && classLoader == storageKey.get();
                        } else {
                            return false;
                        }
                    }
                }

                /**
                 * A key for a class loader that only weakly references the class loader.
                 */
                protected static class StorageKey extends WeakReference<ClassLoader> {

                    /**
                     * The represented class loader's hash code or {@code 0} if this entry represents the bootstrap class loader.
                     */
                    private final int hashCode;

                    /**
                     * Creates a new storage key.
                     *
                     * @param classLoader The represented class loader or {@code null} for the bootstrap class loader.
                     */
                    protected StorageKey(ClassLoader classLoader) {
                        super(classLoader);
                        hashCode = System.identityHashCode(classLoader);
                    }

                    /**
                     * Checks if this reference represents the bootstrap class loader.
                     *
                     * @return {@code true} if this entry represents the bootstrap class loader.
                     */
                    protected boolean isBootstrapLoader() {
                        return hashCode == 0;
                    }

                    @Override
                    public int hashCode() {
                        return hashCode;
                    }

                    @Override
                    @SuppressFBWarnings(value = "EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS", justification = "Cross-comparison is intended")
                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        } else if (other instanceof LookupKey) {
                            LookupKey lookupKey = (LookupKey) other;
                            return hashCode == lookupKey.hashCode && get() == lookupKey.classLoader;
                        } else if (other instanceof StorageKey) {
                            StorageKey storageKey = (StorageKey) other;
                            return hashCode == storageKey.hashCode && get() == storageKey.get();
                        } else {
                            return false;
                        }
                    }
                }
            }

            /**
             * Represents an installation of a resubmission strategy.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class Installation {

                /**
                 * The listener to apply.
                 */
                private final AgentBuilder.Listener listener;

                /**
                 * The installation listener to apply.
                 */
                private final InstallationListener installationListener;

                /**
                 * Creates a new installation.
                 *
                 * @param listener             The listener to apply.
                 * @param installationListener The installation listener to apply.
                 */
                protected Installation(AgentBuilder.Listener listener, InstallationListener installationListener) {
                    this.listener = listener;
                    this.installationListener = installationListener;
                }

                /**
                 * Returns the listener to apply.
                 *
                 * @return The listener to apply.
                 */
                protected AgentBuilder.Listener getListener() {
                    return listener;
                }

                /**
                 * Returns the installation listener to apply.
                 *
                 * @return The installation listener to apply.
                 */
                protected InstallationListener getInstallationListener() {
                    return installationListener;
                }
            }
        }

        /**
         * A dispatcher for interacting with the instrumentation API.
         */
        protected interface Dispatcher {

            /**
             * Checks if the supplied type is modifiable.
             *
             * @param instrumentation The instrumentation instance available.
             * @param type            The type to check for modifiability.
             * @return {@code true} if the supplied type is modifiable.
             */
            boolean isModifiableClass(Instrumentation instrumentation, Class<?> type);

            /**
             * Checks if retransformation is supported for the supplied instrumentation instance.
             *
             * @param instrumentation The instrumentation instance available.
             * @return {@code true} if the supplied instance supports retransformation.
             */
            boolean isRetransformClassesSupported(Instrumentation instrumentation);

            /**
             * Retransforms the supplied classes.
             *
             * @param instrumentation The instrumentation instance to use for retransformation.
             * @param type            The types to retransform.
             * @throws UnmodifiableClassException If the supplied classes cannot be retransformed.
             */
            void retransformClasses(Instrumentation instrumentation, Class<?>[] type) throws UnmodifiableClassException;

            /**
             * An action for creating a dispatcher.
             */
            enum CreationAction implements PrivilegedAction<Dispatcher> {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Dispatcher run() {
                    try {
                        return new ForJava6CapableVm(Instrumentation.class.getMethod("isModifiableClass", Class.class),
                                Instrumentation.class.getMethod("isRetransformClassesSupported"),
                                Instrumentation.class.getMethod("retransformClasses", Class[].class));
                    } catch (NoSuchMethodException ignored) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            /**
             * A dispatcher for a legacy VM.
             */
            enum ForLegacyVm implements Dispatcher {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public boolean isModifiableClass(Instrumentation instrumentation, Class<?> type) {
                    return !type.isArray() && !type.isPrimitive();
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isRetransformClassesSupported(Instrumentation instrumentation) {
                    return false;
                }

                /**
                 * {@inheritDoc}
                 */
                public void retransformClasses(Instrumentation instrumentation, Class<?>[] type) {
                    throw new UnsupportedOperationException("The current VM does not support retransformation");
                }
            }

            /**
             * A dispatcher for a Java 6 capable VM.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class ForJava6CapableVm implements Dispatcher {

                /**
                 * The {@code Instrumentation#isModifiableClass} method.
                 */
                private final Method isModifiableClass;

                /**
                 * The {@code Instrumentation#isRetransformClassesSupported} method.
                 */
                private final Method isRetransformClassesSupported;

                /**
                 * The {@code Instrumentation#retransformClasses} method.
                 */
                private final Method retransformClasses;

                /**
                 * Creates a new Java 6 capable dispatcher.
                 *
                 * @param isModifiableClass             The {@code Instrumentation#isModifiableClass} method.
                 * @param isRetransformClassesSupported The {@code Instrumentation#isRetransformClassesSupported} method.
                 * @param retransformClasses            The {@code Instrumentation#retransformClasses} method.
                 */
                protected ForJava6CapableVm(Method isModifiableClass, Method isRetransformClassesSupported, Method retransformClasses) {
                    this.isModifiableClass = isModifiableClass;
                    this.isRetransformClassesSupported = isRetransformClassesSupported;
                    this.retransformClasses = retransformClasses;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isModifiableClass(Instrumentation instrumentation, Class<?> type) {
                    try {
                        return (Boolean) isModifiableClass.invoke(instrumentation, type);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#isModifiableClass", exception);
                    } catch (InvocationTargetException exception) {
                        throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#isModifiableClass", exception.getCause());
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isRetransformClassesSupported(Instrumentation instrumentation) {
                    try {
                        return (Boolean) isRetransformClassesSupported.invoke(instrumentation);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#isRetransformClassesSupported", exception);
                    } catch (InvocationTargetException exception) {
                        throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#isRetransformClassesSupported", exception.getCause());
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void retransformClasses(Instrumentation instrumentation, Class<?>[] type) throws UnmodifiableClassException {
                    try {
                        retransformClasses.invoke(instrumentation, (Object) type);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#retransformClasses", exception);
                    } catch (InvocationTargetException exception) {
                        Throwable cause = exception.getCause();
                        if (cause instanceof UnmodifiableClassException) {
                            throw (UnmodifiableClassException) cause;
                        } else {
                            throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#retransformClasses", cause);
                        }
                    }
                }
            }
        }

        /**
         * A collector is responsible for collecting classes that are to be considered for modification.
         */
        protected abstract static class Collector {

            /**
             * A representation for a non-available loaded type.
             */
            private static final Class<?> NO_LOADED_TYPE = null;

            /**
             * All types that were collected for redefinition.
             */
            protected final List<Class<?>> types;

            /**
             * Creates a new collector.
             */
            protected Collector() {
                types = new ArrayList<Class<?>>();
            }

            /**
             * Does consider the retransformation or redefinition of a loaded type without a loaded type representation.
             *
             * @param matcher         The type matcher to apply.
             * @param listener        The listener to apply during the consideration.
             * @param typeDescription The type description of the type being considered.
             * @param type            The loaded type being considered.
             * @param module          The type's Java module or {@code null} if the current VM does not support modules.
             */
            protected void consider(RawMatcher matcher,
                                    AgentBuilder.Listener listener,
                                    TypeDescription typeDescription,
                                    Class<?> type,
                                    JavaModule module) {
                consider(matcher, listener, typeDescription, type, NO_LOADED_TYPE, module, false);
            }

            /**
             * Does consider the retransformation or redefinition of a loaded type.
             *
             * @param matcher             A type matcher to apply.
             * @param listener            The listener to apply during the consideration.
             * @param typeDescription     The type description of the type being considered.
             * @param type                The loaded type being considered.
             * @param classBeingRedefined The loaded type being considered or {@code null} if it should be considered non-available.
             * @param module              The type's Java module or {@code null} if the current VM does not support modules.
             * @param unmodifiable        {@code true} if the current type should be considered unmodifiable.
             */
            protected void consider(RawMatcher matcher,
                                    AgentBuilder.Listener listener,
                                    TypeDescription typeDescription,
                                    Class<?> type,
                                    Class<?> classBeingRedefined,
                                    JavaModule module,
                                    boolean unmodifiable) {
                if (unmodifiable || !matcher.matches(typeDescription, type.getClassLoader(), module, classBeingRedefined, type.getProtectionDomain())) {
                    try {
                        try {
                            listener.onDiscovery(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, classBeingRedefined != null);
                            listener.onIgnored(typeDescription, type.getClassLoader(), module, classBeingRedefined != null);
                        } catch (Throwable throwable) {
                            listener.onError(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, classBeingRedefined != null, throwable);
                        } finally {
                            listener.onComplete(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, classBeingRedefined != null);
                        }
                    } catch (Throwable ignored) {
                        // Ignore exceptions that are thrown by listeners to mimic the behavior of a transformation.
                    }
                } else {
                    types.add(type);
                }
            }

            /**
             * Includes all the supplied types in this collector.
             *
             * @param types The types to include.
             */
            protected void include(List<Class<?>> types) {
                this.types.addAll(types);
            }

            /**
             * Applies all types that this collector collected.
             *
             * @param instrumentation            The instrumentation instance to apply changes to.
             * @param circularityLock            The circularity lock to use.
             * @param locationStrategy           The location strategy to use.
             * @param listener                   The listener to use.
             * @param redefinitionBatchAllocator The redefinition batch allocator to use.
             * @param redefinitionListener       The redefinition listener to use.
             * @param batch                      The next batch's index.
             * @return The next batch's index after this application.
             */
            protected int apply(Instrumentation instrumentation,
                                CircularityLock circularityLock,
                                LocationStrategy locationStrategy,
                                AgentBuilder.Listener listener,
                                BatchAllocator redefinitionBatchAllocator,
                                Listener redefinitionListener,
                                int batch) {
                Map<List<Class<?>>, Throwable> failures = new HashMap<List<Class<?>>, Throwable>();
                PrependableIterator prepanedableIterator = new PrependableIterator(redefinitionBatchAllocator.batch(this.types));
                while (prepanedableIterator.hasNext()) {
                    List<Class<?>> types = prepanedableIterator.next();
                    redefinitionListener.onBatch(batch, types, this.types);
                    try {
                        doApply(instrumentation, circularityLock, types, locationStrategy, listener);
                    } catch (Throwable throwable) {
                        prepanedableIterator.prepend(redefinitionListener.onError(batch, types, throwable, this.types));
                        failures.put(types, throwable);
                    }
                    batch += 1;
                }
                redefinitionListener.onComplete(batch, types, failures);
                return batch;
            }

            /**
             * Applies this collector.
             *
             * @param instrumentation  The instrumentation instance to apply the transformation for.
             * @param circularityLock  The circularity lock to use.
             * @param types            The types of the current patch to transform.
             * @param locationStrategy The location strategy to use.
             * @param listener         the listener to notify.
             * @throws UnmodifiableClassException If a class is not modifiable.
             * @throws ClassNotFoundException     If a class could not be found.
             */
            protected abstract void doApply(Instrumentation instrumentation,
                                            CircularityLock circularityLock,
                                            List<Class<?>> types,
                                            LocationStrategy locationStrategy,
                                            AgentBuilder.Listener listener) throws UnmodifiableClassException, ClassNotFoundException;

            /**
             * An iterator that allows prepending of iterables to be applied previous to another iterator.
             */
            protected static class PrependableIterator implements Iterator<List<Class<?>>> {

                /**
                 * The current iterator.
                 */
                private Iterator<? extends List<Class<?>>> current;

                /**
                 * The backlog of iterators to apply.
                 */
                private final LinkedList<Iterator<? extends List<Class<?>>>> backlog;

                /**
                 * Creates a new prependable iterator.
                 *
                 * @param origin The original iterable to begin with.
                 */
                protected PrependableIterator(Iterable<? extends List<Class<?>>> origin) {
                    current = origin.iterator();
                    backlog = new LinkedList<Iterator<? extends List<Class<?>>>>();
                }

                /**
                 * Prepends an iterable to the backlog.
                 *
                 * @param iterable The iterable to prepend.
                 */
                public void prepend(Iterable<? extends List<Class<?>>> iterable) {
                    Iterator<? extends List<Class<?>>> iterator = iterable.iterator();
                    if (iterator.hasNext()) {
                        if (current.hasNext()) {
                            backlog.addLast(current);
                        }
                        current = iterator;
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean hasNext() {
                    return current.hasNext();
                }

                /**
                 * {@inheritDoc}
                 */
                public List<Class<?>> next() {
                    try {
                        return current.next();
                    } finally {
                        while (!current.hasNext() && !backlog.isEmpty()) {
                            current = backlog.removeLast();
                        }
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void remove() {
                    throw new UnsupportedOperationException("remove");
                }
            }

            /**
             * A collector that applies a <b>redefinition</b> of already loaded classes.
             */
            protected static class ForRedefinition extends Collector {

                @Override
                protected void doApply(Instrumentation instrumentation,
                                       CircularityLock circularityLock,
                                       List<Class<?>> types,
                                       LocationStrategy locationStrategy,
                                       AgentBuilder.Listener listener) throws UnmodifiableClassException, ClassNotFoundException {
                    List<ClassDefinition> classDefinitions = new ArrayList<ClassDefinition>(types.size());
                    for (Class<?> type : types) {
                        try {
                            try {
                                classDefinitions.add(new ClassDefinition(type, locationStrategy.classFileLocator(type.getClassLoader(), JavaModule.ofType(type))
                                        .locate(TypeDescription.ForLoadedType.getName(type))
                                        .resolve()));
                            } catch (Throwable throwable) {
                                JavaModule module = JavaModule.ofType(type);
                                try {
                                    listener.onDiscovery(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED);
                                } finally {
                                    try {
                                        listener.onError(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED, throwable);
                                    } finally {
                                        listener.onComplete(TypeDescription.ForLoadedType.getName(type), type.getClassLoader(), module, AgentBuilder.Listener.LOADED);
                                    }
                                }
                            }
                        } catch (Throwable ignored) {
                            // Ignore exceptions that are thrown by listeners to mimic the behavior of a transformation.
                        }
                    }
                    if (!classDefinitions.isEmpty()) {
                        circularityLock.release();
                        try {
                            instrumentation.redefineClasses(classDefinitions.toArray(new ClassDefinition[0]));
                        } finally {
                            circularityLock.acquire();
                        }
                    }
                }
            }

            /**
             * A collector that applies a <b>retransformation</b> of already loaded classes.
             */
            protected static class ForRetransformation extends Collector {

                @Override
                protected void doApply(Instrumentation instrumentation,
                                       CircularityLock circularityLock,
                                       List<Class<?>> types,
                                       LocationStrategy locationStrategy,
                                       AgentBuilder.Listener listener) throws UnmodifiableClassException {
                    if (!types.isEmpty()) {
                        circularityLock.release();
                        try {
                            DISPATCHER.retransformClasses(instrumentation, types.toArray(new Class<?>[0]));
                        } finally {
                            circularityLock.acquire();
                        }
                    }
                }
            }
        }
    }

    /**
     * Implements the instrumentation of the {@code LambdaMetafactory} if this feature is enabled.
     */
    enum LambdaInstrumentationStrategy {

        /**
         * A strategy that enables instrumentation of the {@code LambdaMetafactory} if such a factory exists on the current VM.
         * Classes representing lambda expressions that are created by Byte Buddy are fully compatible to those created by
         * the JVM and can be serialized or deserialized to one another. The classes do however show a few differences:
         * <ul>
         * <li>Byte Buddy's classes are public with a public executing transformer. Doing so, it is not necessary to instantiate a
         * non-capturing lambda expression by reflection. This is done because Byte Buddy is not necessarily capable
         * of using reflection due to an active security manager.</li>
         * <li>Byte Buddy's classes are not marked as synthetic as an agent builder does not instrument synthetic classes
         * by default.</li>
         * </ul>
         */
        ENABLED {
            @Override
            protected void apply(ByteBuddy byteBuddy,
                                 Instrumentation instrumentation,
                                 ClassFileTransformer classFileTransformer) {
                if (LambdaFactory.register(classFileTransformer, new LambdaInstanceFactory(byteBuddy))) {
                    Class<?> lambdaMetaFactory;
                    try {
                        lambdaMetaFactory = Class.forName("java.lang.invoke.LambdaMetafactory");
                    } catch (ClassNotFoundException ignored) {
                        return;
                    }
                    byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE)
                            .redefine(lambdaMetaFactory)
                            .visit(new AsmVisitorWrapper.ForDeclaredMethods()
                                    .method(named("metafactory"), MetaFactoryRedirection.INSTANCE)
                                    .method(named("altMetafactory"), AlternativeMetaFactoryRedirection.INSTANCE))
                            .make()
                            .load(lambdaMetaFactory.getClassLoader(), ClassReloadingStrategy.of(instrumentation));
                }
            }

            @Override
            protected boolean isInstrumented(Class<?> type) {
                return true;
            }
        },

        /**
         * A strategy that does not instrument the {@code LambdaMetafactory}.
         */
        DISABLED {
            @Override
            protected void apply(ByteBuddy byteBuddy,
                                 Instrumentation instrumentation,
                                 ClassFileTransformer classFileTransformer) {
                /* do nothing */
            }

            @Override
            protected boolean isInstrumented(Class<?> type) {
                return type == null || !type.getName().contains("/");
            }
        };

        /**
         * The name of the current VM's {@code Unsafe} class that is visible to the bootstrap loader.
         */
        private static final String UNSAFE_CLASS = ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V6).isAtLeast(ClassFileVersion.JAVA_V9)
                ? "jdk/internal/misc/Unsafe"
                : "sun/misc/Unsafe";

        /**
         * Indicates that an original implementation can be ignored when redefining a method.
         */
        protected static final MethodVisitor IGNORE_ORIGINAL = null;

        /**
         * Releases the supplied class file transformer when it was built with {@link AgentBuilder#with(LambdaInstrumentationStrategy)} enabled.
         * Subsequently, the class file transformer is no longer applied when a class that represents a lambda expression is created.
         *
         * @param classFileTransformer The class file transformer to release.
         * @param instrumentation      The instrumentation instance that is used to potentially rollback the instrumentation of the {@code LambdaMetafactory}.
         */
        public static void release(ClassFileTransformer classFileTransformer, Instrumentation instrumentation) {
            if (LambdaFactory.release(classFileTransformer)) {
                try {
                    ClassReloadingStrategy.of(instrumentation).reset(Class.forName("java.lang.invoke.LambdaMetafactory"));
                } catch (Exception exception) {
                    throw new IllegalStateException("Could not release lambda transformer", exception);
                }
            }
        }

        /**
         * Returns an enabled lambda instrumentation strategy for {@code true}.
         *
         * @param enabled If lambda instrumentation should be enabled.
         * @return {@code true} if the returned strategy should be enabled.
         */
        public static LambdaInstrumentationStrategy of(boolean enabled) {
            return enabled
                    ? ENABLED
                    : DISABLED;
        }

        /**
         * Applies a transformation to lambda instances if applicable.
         *
         * @param byteBuddy            The Byte Buddy instance to use.
         * @param instrumentation      The instrumentation instance for applying a redefinition.
         * @param classFileTransformer The class file transformer to apply.
         */
        protected abstract void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer);

        /**
         * Indicates if this strategy enables instrumentation of the {@code LambdaMetafactory}.
         *
         * @return {@code true} if this strategy is enabled.
         */
        public boolean isEnabled() {
            return this == ENABLED;
        }

        /**
         * Validates if the supplied class is instrumented. For lambda types (which are loaded by anonymous class loader), this method
         * should return false if lambda instrumentation is disabled.
         *
         * @param type The redefined type or {@code null} if no such type exists.
         * @return {@code true} if the supplied type should be instrumented according to this strategy.
         */
        protected abstract boolean isInstrumented(Class<?> type);

        /**
         * A factory that creates instances that represent lambda expressions.
         */
        @HashCodeAndEqualsPlugin.Enhance
        protected static class LambdaInstanceFactory {

            /**
             * The name of a factory for a lambda expression.
             */
            private static final String LAMBDA_FACTORY = "get$Lambda";

            /**
             * A prefix for a field that represents a property of a lambda expression.
             */
            private static final String FIELD_PREFIX = "arg$";

            /**
             * The infix to use for naming classes that represent lambda expression. The additional prefix
             * is necessary because the subsequent counter is not sufficient to keep names unique compared
             * to the original factory.
             */
            private static final String LAMBDA_TYPE_INFIX = "$$Lambda$ByteBuddy$";

            /**
             * A type-safe constant to express that a class is not already loaded when applying a class file transformer.
             */
            private static final Class<?> NOT_PREVIOUSLY_DEFINED = null;

            /**
             * A counter for naming lambda expressions randomly.
             */
            private static final AtomicInteger LAMBDA_NAME_COUNTER = new AtomicInteger();

            /**
             * The Byte Buddy instance to use for creating lambda objects.
             */
            private final ByteBuddy byteBuddy;

            /**
             * Creates a new lambda instance factory.
             *
             * @param byteBuddy The Byte Buddy instance to use for creating lambda objects.
             */
            protected LambdaInstanceFactory(ByteBuddy byteBuddy) {
                this.byteBuddy = byteBuddy;
            }

            /**
             * Applies this lambda meta factory.
             *
             * @param targetTypeLookup            A lookup context representing the creating class of this lambda expression.
             * @param lambdaMethodName            The name of the lambda expression's represented method.
             * @param factoryMethodType           The type of the lambda expression's represented method.
             * @param lambdaMethodType            The type of the lambda expression's factory method.
             * @param targetMethodHandle          A handle representing the target of the lambda expression's method.
             * @param specializedLambdaMethodType A specialization of the type of the lambda expression's represented method.
             * @param serializable                {@code true} if the lambda expression should be serializable.
             * @param markerInterfaces            A list of interfaces for the lambda expression to represent.
             * @param additionalBridges           A list of additional bridge methods to be implemented by the lambda expression.
             * @param classFileTransformers       A collection of class file transformers to apply when creating the class.
             * @return A binary representation of the transformed class file.
             */
            public byte[] make(Object targetTypeLookup,
                               String lambdaMethodName,
                               Object factoryMethodType,
                               Object lambdaMethodType,
                               Object targetMethodHandle,
                               Object specializedLambdaMethodType,
                               boolean serializable,
                               List<Class<?>> markerInterfaces,
                               List<?> additionalBridges,
                               Collection<? extends ClassFileTransformer> classFileTransformers) {
                JavaConstant.MethodType factoryMethod = JavaConstant.MethodType.ofLoaded(factoryMethodType);
                JavaConstant.MethodType lambdaMethod = JavaConstant.MethodType.ofLoaded(lambdaMethodType);
                JavaConstant.MethodHandle targetMethod = JavaConstant.MethodHandle.ofLoaded(targetMethodHandle, targetTypeLookup);
                JavaConstant.MethodType specializedLambdaMethod = JavaConstant.MethodType.ofLoaded(specializedLambdaMethodType);
                Class<?> targetType = JavaConstant.MethodHandle.lookupType(targetTypeLookup);
                String lambdaClassName = targetType.getName() + LAMBDA_TYPE_INFIX + LAMBDA_NAME_COUNTER.incrementAndGet();
                DynamicType.Builder<?> builder = byteBuddy
                        .subclass(factoryMethod.getReturnType(), ConstructorStrategy.Default.NO_CONSTRUCTORS)
                        .modifiers(TypeManifestation.FINAL, Visibility.PUBLIC)
                        .implement(markerInterfaces)
                        .name(lambdaClassName)
                        .defineConstructor(Visibility.PUBLIC)
                        .withParameters(factoryMethod.getParameterTypes())
                        .intercept(ConstructorImplementation.INSTANCE)
                        .method(named(lambdaMethodName)
                                .and(takesArguments(lambdaMethod.getParameterTypes()))
                                .and(returns(lambdaMethod.getReturnType())))
                        .intercept(new LambdaMethodImplementation(targetMethod, specializedLambdaMethod));
                int index = 0;
                for (TypeDescription capturedType : factoryMethod.getParameterTypes()) {
                    builder = builder.defineField(FIELD_PREFIX + ++index, capturedType, Visibility.PRIVATE, FieldManifestation.FINAL);
                }
                if (!factoryMethod.getParameterTypes().isEmpty()) {
                    builder = builder.defineMethod(LAMBDA_FACTORY, factoryMethod.getReturnType(), Visibility.PRIVATE, Ownership.STATIC)
                            .withParameters(factoryMethod.getParameterTypes())
                            .intercept(FactoryImplementation.INSTANCE);
                }
                if (serializable) {
                    if (!markerInterfaces.contains(Serializable.class)) {
                        builder = builder.implement(Serializable.class);
                    }
                    builder = builder.defineMethod("writeReplace", Object.class, Visibility.PRIVATE)
                            .intercept(new SerializationImplementation(TypeDescription.ForLoadedType.of(targetType),
                                    factoryMethod.getReturnType(),
                                    lambdaMethodName,
                                    lambdaMethod,
                                    targetMethod,
                                    JavaConstant.MethodType.ofLoaded(specializedLambdaMethodType)));
                } else if (factoryMethod.getReturnType().isAssignableTo(Serializable.class)) {
                    builder = builder.defineMethod("readObject", void.class, Visibility.PRIVATE)
                            .withParameters(ObjectInputStream.class)
                            .throwing(NotSerializableException.class)
                            .intercept(ExceptionMethod.throwing(NotSerializableException.class, "Non-serializable lambda"))
                            .defineMethod("writeObject", void.class, Visibility.PRIVATE)
                            .withParameters(ObjectOutputStream.class)
                            .throwing(NotSerializableException.class)
                            .intercept(ExceptionMethod.throwing(NotSerializableException.class, "Non-serializable lambda"));
                }
                for (Object additionalBridgeType : additionalBridges) {
                    JavaConstant.MethodType additionalBridge = JavaConstant.MethodType.ofLoaded(additionalBridgeType);
                    builder = builder.defineMethod(lambdaMethodName, additionalBridge.getReturnType(), MethodManifestation.BRIDGE, Visibility.PUBLIC)
                            .withParameters(additionalBridge.getParameterTypes())
                            .intercept(new BridgeMethodImplementation(lambdaMethodName, lambdaMethod));
                }
                byte[] classFile = builder.make().getBytes();
                for (ClassFileTransformer classFileTransformer : classFileTransformers) {
                    try {
                        byte[] transformedClassFile = classFileTransformer.transform(targetType.getClassLoader(),
                                lambdaClassName.replace('.', '/'),
                                NOT_PREVIOUSLY_DEFINED,
                                targetType.getProtectionDomain(),
                                classFile);
                        classFile = transformedClassFile == null
                                ? classFile
                                : transformedClassFile;
                    } catch (Throwable ignored) {
                        /* do nothing */
                    }
                }
                return classFile;
            }

            /**
             * Implements a lambda class's executing transformer.
             */
            @SuppressFBWarnings(value = "SE_BAD_FIELD", justification = "An enumeration does not serialize fields")
            protected enum ConstructorImplementation implements Implementation {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * A reference to the {@link Object} class's default executing transformer.
                 */
                private final MethodDescription.InDefinedShape objectConstructor;

                /**
                 * Creates a new executing transformer implementation.
                 */
                ConstructorImplementation() {
                    objectConstructor = TypeDescription.OBJECT.getDeclaredMethods().filter(isConstructor()).getOnly();
                }

                /**
                 * {@inheritDoc}
                 */
                public ByteCodeAppender appender(Target implementationTarget) {
                    return new Appender(implementationTarget.getInstrumentedType().getDeclaredFields());
                }

                /**
                 * {@inheritDoc}
                 */
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                /**
                 * An appender to implement the executing transformer.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {

                    /**
                     * The fields that are declared by the instrumented type.
                     */
                    private final List<FieldDescription.InDefinedShape> declaredFields;

                    /**
                     * Creates a new appender.
                     *
                     * @param declaredFields The fields that are declared by the instrumented type.
                     */
                    protected Appender(List<FieldDescription.InDefinedShape> declaredFields) {
                        this.declaredFields = declaredFields;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Size apply(MethodVisitor methodVisitor, Context implementationContext, MethodDescription instrumentedMethod) {
                        List<StackManipulation> fieldAssignments = new ArrayList<StackManipulation>(declaredFields.size() * 3);
                        for (ParameterDescription parameterDescription : instrumentedMethod.getParameters()) {
                            fieldAssignments.add(MethodVariableAccess.loadThis());
                            fieldAssignments.add(MethodVariableAccess.load(parameterDescription));
                            fieldAssignments.add(FieldAccess.forField(declaredFields.get(parameterDescription.getIndex())).write());
                        }
                        return new Size(new StackManipulation.Compound(
                                MethodVariableAccess.loadThis(),
                                MethodInvocation.invoke(INSTANCE.objectConstructor),
                                new StackManipulation.Compound(fieldAssignments),
                                MethodReturn.VOID
                        ).apply(methodVisitor, implementationContext).getMaximalSize(), instrumentedMethod.getStackSize());
                    }
                }
            }

            /**
             * An implementation of a instance factory for a lambda expression's class.
             */
            protected enum FactoryImplementation implements Implementation {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public ByteCodeAppender appender(Target implementationTarget) {
                    return new Appender(implementationTarget.getInstrumentedType());
                }

                /**
                 * {@inheritDoc}
                 */
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                /**
                 * An appender for a lambda expression factory.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {

                    /**
                     * The instrumented type.
                     */
                    private final TypeDescription instrumentedType;

                    /**
                     * Creates a new appender.
                     *
                     * @param instrumentedType The instrumented type.
                     */
                    protected Appender(TypeDescription instrumentedType) {
                        this.instrumentedType = instrumentedType;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Size apply(MethodVisitor methodVisitor, Context implementationContext, MethodDescription instrumentedMethod) {
                        return new Size(new StackManipulation.Compound(
                                TypeCreation.of(instrumentedType),
                                Duplication.SINGLE,
                                MethodVariableAccess.allArgumentsOf(instrumentedMethod),
                                MethodInvocation.invoke(instrumentedType.getDeclaredMethods().filter(isConstructor()).getOnly()),
                                MethodReturn.REFERENCE
                        ).apply(methodVisitor, implementationContext).getMaximalSize(), instrumentedMethod.getStackSize());
                    }
                }
            }

            /**
             * Implements a lambda expression's functional method.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class LambdaMethodImplementation implements Implementation {

                /**
                 * The handle of the target method of the lambda expression.
                 */
                private final JavaConstant.MethodHandle targetMethod;

                /**
                 * The specialized type of the lambda method.
                 */
                private final JavaConstant.MethodType specializedLambdaMethod;

                /**
                 * Creates a implementation of a lambda expression's functional method.
                 *
                 * @param targetMethod            The target method of the lambda expression.
                 * @param specializedLambdaMethod The specialized type of the lambda method.
                 */
                protected LambdaMethodImplementation(JavaConstant.MethodHandle targetMethod, JavaConstant.MethodType specializedLambdaMethod) {
                    this.targetMethod = targetMethod;
                    this.specializedLambdaMethod = specializedLambdaMethod;
                }

                /**
                 * {@inheritDoc}
                 */
                public ByteCodeAppender appender(Target implementationTarget) {
                    return new Appender(targetMethod.getOwnerType()
                            .getDeclaredMethods()
                            .filter(hasMethodName(targetMethod.getName())
                                    .and(returns(targetMethod.getReturnType()))
                                    .and(takesArguments(targetMethod.getParameterTypes())))
                            .getOnly(),
                            specializedLambdaMethod,
                            implementationTarget.getInstrumentedType().getDeclaredFields());
                }

                /**
                 * {@inheritDoc}
                 */
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                /**
                 * An appender for a lambda expression's functional method.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {

                    /**
                     * The target method of the lambda expression.
                     */
                    private final MethodDescription targetMethod;

                    /**
                     * The specialized type of the lambda method.
                     */
                    private final JavaConstant.MethodType specializedLambdaMethod;

                    /**
                     * The instrumented type's declared fields.
                     */
                    private final List<FieldDescription.InDefinedShape> declaredFields;

                    /**
                     * Creates an appender of a lambda expression's functional method.
                     *
                     * @param targetMethod            The target method of the lambda expression.
                     * @param specializedLambdaMethod The specialized type of the lambda method.
                     * @param declaredFields          The instrumented type's declared fields.
                     */
                    protected Appender(MethodDescription targetMethod,
                                       JavaConstant.MethodType specializedLambdaMethod,
                                       List<FieldDescription.InDefinedShape> declaredFields) {
                        this.targetMethod = targetMethod;
                        this.specializedLambdaMethod = specializedLambdaMethod;
                        this.declaredFields = declaredFields;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Size apply(MethodVisitor methodVisitor, Context implementationContext, MethodDescription instrumentedMethod) {
                        StackManipulation preparation = targetMethod.isConstructor()
                                ? new StackManipulation.Compound(TypeCreation.of(targetMethod.getDeclaringType().asErasure()), Duplication.SINGLE)
                                : StackManipulation.Trivial.INSTANCE;
                        List<StackManipulation> fieldAccess = new ArrayList<StackManipulation>(declaredFields.size() * 2 + 1);
                        for (FieldDescription.InDefinedShape fieldDescription : declaredFields) {
                            fieldAccess.add(MethodVariableAccess.loadThis());
                            fieldAccess.add(FieldAccess.forField(fieldDescription).read());
                        }
                        List<StackManipulation> parameterAccess = new ArrayList<StackManipulation>(instrumentedMethod.getParameters().size() * 2);
                        for (ParameterDescription parameterDescription : instrumentedMethod.getParameters()) {
                            parameterAccess.add(MethodVariableAccess.load(parameterDescription));
                            parameterAccess.add(Assigner.DEFAULT.assign(parameterDescription.getType(),
                                    specializedLambdaMethod.getParameterTypes().get(parameterDescription.getIndex()).asGenericType(),
                                    Assigner.Typing.DYNAMIC));
                        }
                        return new Size(new StackManipulation.Compound(
                                preparation,
                                new StackManipulation.Compound(fieldAccess),
                                new StackManipulation.Compound(parameterAccess),
                                MethodInvocation.invoke(targetMethod),
                                Assigner.DEFAULT.assign(targetMethod.isConstructor()
                                                ? targetMethod.getDeclaringType().asGenericType()
                                                : targetMethod.getReturnType(),
                                        specializedLambdaMethod.getReturnType().asGenericType(),
                                        Assigner.Typing.DYNAMIC),
                                MethodReturn.of(specializedLambdaMethod.getReturnType())
                        ).apply(methodVisitor, implementationContext).getMaximalSize(), instrumentedMethod.getStackSize());
                    }
                }
            }

            /**
             * Implements the {@code writeReplace} method for serializable lambda expressions.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class SerializationImplementation implements Implementation {

                /**
                 * The lambda expression's declaring type.
                 */
                private final TypeDescription targetType;

                /**
                 * The lambda expression's functional type.
                 */
                private final TypeDescription lambdaType;

                /**
                 * The lambda expression's functional method name.
                 */
                private final String lambdaMethodName;

                /**
                 * The method type of the lambda expression's functional method.
                 */
                private final JavaConstant.MethodType lambdaMethod;

                /**
                 * A handle that references the lambda expressions invocation target.
                 */
                private final JavaConstant.MethodHandle targetMethod;

                /**
                 * The specialized method type of the lambda expression's functional method.
                 */
                private final JavaConstant.MethodType specializedMethod;

                /**
                 * Creates a new implementation for a serializable's lambda expression's {@code writeReplace} method.
                 *
                 * @param targetType        The lambda expression's declaring type.
                 * @param lambdaType        The lambda expression's functional type.
                 * @param lambdaMethodName  The lambda expression's functional method name.
                 * @param lambdaMethod      The method type of the lambda expression's functional method.
                 * @param targetMethod      A handle that references the lambda expressions invocation target.
                 * @param specializedMethod The specialized method type of the lambda expression's functional method.
                 */
                protected SerializationImplementation(TypeDescription targetType,
                                                      TypeDescription lambdaType,
                                                      String lambdaMethodName,
                                                      JavaConstant.MethodType lambdaMethod,
                                                      JavaConstant.MethodHandle targetMethod,
                                                      JavaConstant.MethodType specializedMethod) {
                    this.targetType = targetType;
                    this.lambdaType = lambdaType;
                    this.lambdaMethodName = lambdaMethodName;
                    this.lambdaMethod = lambdaMethod;
                    this.targetMethod = targetMethod;
                    this.specializedMethod = specializedMethod;
                }

                /**
                 * {@inheritDoc}
                 */
                public ByteCodeAppender appender(Target implementationTarget) {
                    TypeDescription serializedLambda;
                    try {
                        serializedLambda = TypeDescription.ForLoadedType.of(Class.forName("java.lang.invoke.SerializedLambda"));
                    } catch (ClassNotFoundException exception) {
                        throw new IllegalStateException("Cannot find class for lambda serialization", exception);
                    }
                    List<StackManipulation> lambdaArguments = new ArrayList<StackManipulation>(implementationTarget.getInstrumentedType().getDeclaredFields().size());
                    for (FieldDescription.InDefinedShape fieldDescription : implementationTarget.getInstrumentedType().getDeclaredFields()) {
                        lambdaArguments.add(new StackManipulation.Compound(MethodVariableAccess.loadThis(),
                                FieldAccess.forField(fieldDescription).read(),
                                Assigner.DEFAULT.assign(fieldDescription.getType(), TypeDescription.Generic.OBJECT, Assigner.Typing.STATIC)));
                    }
                    return new ByteCodeAppender.Simple(new StackManipulation.Compound(
                            TypeCreation.of(serializedLambda),
                            Duplication.SINGLE,
                            ClassConstant.of(targetType),
                            new TextConstant(lambdaType.getInternalName()),
                            new TextConstant(lambdaMethodName),
                            new TextConstant(lambdaMethod.getDescriptor()),
                            IntegerConstant.forValue(targetMethod.getHandleType().getIdentifier()),
                            new TextConstant(targetMethod.getOwnerType().getInternalName()),
                            new TextConstant(targetMethod.getName()),
                            new TextConstant(targetMethod.getDescriptor()),
                            new TextConstant(specializedMethod.getDescriptor()),
                            ArrayFactory.forType(TypeDescription.Generic.OBJECT).withValues(lambdaArguments),
                            MethodInvocation.invoke(serializedLambda.getDeclaredMethods().filter(isConstructor()).getOnly()),
                            MethodReturn.REFERENCE
                    ));
                }

                /**
                 * {@inheritDoc}
                 */
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            /**
             * Implements an explicit bridge method for a lambda expression.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class BridgeMethodImplementation implements Implementation {

                /**
                 * The name of the lambda expression's functional method.
                 */
                private final String lambdaMethodName;

                /**
                 * The actual type of the lambda expression's functional method.
                 */
                private final JavaConstant.MethodType lambdaMethod;

                /**
                 * Creates a new bridge method implementation for a lambda expression.
                 *
                 * @param lambdaMethodName The name of the lambda expression's functional method.
                 * @param lambdaMethod     The actual type of the lambda expression's functional method.
                 */
                protected BridgeMethodImplementation(String lambdaMethodName, JavaConstant.MethodType lambdaMethod) {
                    this.lambdaMethodName = lambdaMethodName;
                    this.lambdaMethod = lambdaMethod;
                }

                /**
                 * {@inheritDoc}
                 */
                public ByteCodeAppender appender(Target implementationTarget) {
                    return new Appender(implementationTarget.invokeSuper(new MethodDescription.SignatureToken(lambdaMethodName,
                            lambdaMethod.getReturnType(),
                            lambdaMethod.getParameterTypes())));
                }

                /**
                 * {@inheritDoc}
                 */
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                /**
                 * An appender for implementing a bridge method for a lambda expression.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {

                    /**
                     * The invocation of the bridge's target method.
                     */
                    private final SpecialMethodInvocation bridgeTargetInvocation;

                    /**
                     * Creates a new appender for invoking a lambda expression's bridge method target.
                     *
                     * @param bridgeTargetInvocation The invocation of the bridge's target method.
                     */
                    protected Appender(SpecialMethodInvocation bridgeTargetInvocation) {
                        this.bridgeTargetInvocation = bridgeTargetInvocation;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Size apply(MethodVisitor methodVisitor, Context implementationContext, MethodDescription instrumentedMethod) {
                        return new Compound(new Simple(
                                MethodVariableAccess.allArgumentsOf(instrumentedMethod)
                                        .asBridgeOf(bridgeTargetInvocation.getMethodDescription())
                                        .prependThisReference(),
                                bridgeTargetInvocation,
                                bridgeTargetInvocation.getMethodDescription().getReturnType().asErasure().isAssignableTo(instrumentedMethod.getReturnType().asErasure())
                                        ? StackManipulation.Trivial.INSTANCE
                                        : TypeCasting.to(instrumentedMethod.getReceiverType()),
                                MethodReturn.of(instrumentedMethod.getReturnType())

                        )).apply(methodVisitor, implementationContext, instrumentedMethod);
                    }
                }
            }
        }

        /**
         * Implements the regular lambda meta factory. The implementation represents the following code:
         * <blockquote><pre>
         * public static CallSite metafactory(MethodHandles.Lookup caller,
         *     String invokedName,
         *     MethodType invokedType,
         *     MethodType samMethodType,
         *     MethodHandle implMethod,
         *     MethodType instantiatedMethodType) throws Exception {
         *   Unsafe unsafe = Unsafe.getUnsafe();
         *   {@code Class<?>} lambdaClass = unsafe.defineAnonymousClass(caller.lookupClass(),
         *       (byte[]) ClassLoader.getSystemClassLoader().loadClass("net.bytebuddy.agent.builder.LambdaFactory").getDeclaredMethod("make",
         *           Object.class,
         *           String.class,
         *           Object.class,
         *           Object.class,
         *           Object.class,
         *           Object.class,
         *           boolean.class,
         *           List.class,
         *           List.class).invoke(null,
         *               caller,
         *               invokedName,
         *               invokedType,
         *               samMethodType,
         *               implMethod,
         *               instantiatedMethodType,
         *               false,
         *               Collections.emptyList(),
         *               Collections.emptyList()),
         *       null);
         *   unsafe.ensureClassInitialized(lambdaClass);
         *   return invokedType.parameterCount() == 0
         *     ? new ConstantCallSite(MethodHandles.constant(invokedType.returnType(), lambdaClass.getDeclaredConstructors()[0].newInstance()))
         *     : new ConstantCallSite(MethodHandles.Lookup.IMPL_LOOKUP.findStatic(lambdaClass, "get$Lambda", invokedType));
         * </pre></blockquote>
         */
        protected enum MetaFactoryRedirection implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public MethodVisitor wrap(TypeDescription instrumentedType,
                                      MethodDescription instrumentedMethod,
                                      MethodVisitor methodVisitor,
                                      Implementation.Context implementationContext,
                                      TypePool typePool,
                                      int writerFlags,
                                      int readerFlags) {
                methodVisitor.visitCode();
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, UNSAFE_CLASS, "getUnsafe", "()L" + UNSAFE_CLASS + ";", false);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 6);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 6);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
                methodVisitor.visitLdcInsn("net.bytebuddy.agent.builder.LambdaFactory");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                methodVisitor.visitLdcInsn("make");
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 9);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_5);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 6);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
                methodVisitor.visitInsn(Opcodes.ACONST_NULL);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 9);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 4);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_5);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 5);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 6);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "[B");
                methodVisitor.visitInsn(Opcodes.ACONST_NULL);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, UNSAFE_CLASS, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 7);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 6);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, UNSAFE_CLASS, "ensureClassInitialized", "(Ljava/lang/Class;)V", false);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "parameterCount", "()I", false);
                Label conditionalDefault = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFNE, conditionalDefault);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", false);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/invoke/MethodHandles", "constant", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", false);
                Label conditionalAlternative = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, conditionalAlternative);
                methodVisitor.visitLabel(conditionalDefault);
                methodVisitor.visitFrame(Opcodes.F_APPEND, 2, new Object[]{UNSAFE_CLASS, "java/lang/Class"}, 0, null);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 7);
                methodVisitor.visitLdcInsn("get$Lambda");
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", false);
                methodVisitor.visitLabel(conditionalAlternative);
                methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[]{"java/lang/invoke/CallSite"});
                methodVisitor.visitInsn(Opcodes.ARETURN);
                methodVisitor.visitMaxs(8, 8);
                methodVisitor.visitEnd();
                return IGNORE_ORIGINAL;
            }
        }

        /**
         * Implements the alternative lambda meta factory. The implementation represents the following code:
         * <blockquote><pre>
         * public static CallSite altMetafactory(MethodHandles.Lookup caller,
         *     String invokedName,
         *     MethodType invokedType,
         *     Object... args) throws Exception {
         *   int flags = (Integer) args[3];
         *   int argIndex = 4;
         *   {@code Class<?>[]} markerInterface;
         *   if ((flags {@code &} FLAG_MARKERS) != 0) {
         *     int markerCount = (Integer) args[argIndex++];
         *     markerInterface = new {@code Class<?>}[markerCount];
         *     System.arraycopy(args, argIndex, markerInterface, 0, markerCount);
         *     argIndex += markerCount;
         *   } else {
         *     markerInterface = new {@code Class<?>}[0];
         *   }
         *   MethodType[] additionalBridge;
         *   if ((flags {@code &} FLAG_BRIDGES) != 0) {
         *     int bridgeCount = (Integer) args[argIndex++];
         *     additionalBridge = new MethodType[bridgeCount];
         *     System.arraycopy(args, argIndex, additionalBridge, 0, bridgeCount);
         *     // argIndex += bridgeCount;
         *   } else {
         *     additionalBridge = new MethodType[0];
         *   }
         *   Unsafe unsafe = Unsafe.getUnsafe();
         *   {@code Class<?>} lambdaClass = unsafe.defineAnonymousClass(caller.lookupClass(),
         *       (byte[]) ClassLoader.getSystemClassLoader().loadClass("net.bytebuddy.agent.builder.LambdaFactory").getDeclaredMethod("make",
         *           Object.class,
         *           String.class,
         *           Object.class,
         *           Object.class,
         *           Object.class,
         *           Object.class,
         *           boolean.class,
         *           List.class,
         *           List.class).invoke(null,
         *               caller,
         *               invokedName,
         *               invokedType,
         *               args[0],
         *               args[1],
         *               args[2],
         *               (flags {@code &} FLAG_SERIALIZABLE) != 0,
         *               Arrays.asList(markerInterface),
         *               Arrays.asList(additionalBridge)),
         *       null);
         *   unsafe.ensureClassInitialized(lambdaClass);
         *   return invokedType.parameterCount() == 0
         *     ? new ConstantCallSite(MethodHandles.constant(invokedType.returnType(), lambdaClass.getDeclaredConstructors()[0].newInstance()))
         *     : new ConstantCallSite(MethodHandles.Lookup.IMPL_LOOKUP.findStatic(lambdaClass, "get$Lambda", invokedType));
         * }
         * </pre></blockquote>
         */
        protected enum AlternativeMetaFactoryRedirection implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {

            /**
             * The singleton instance.
             */
            INSTANCE;

            /**
             * {@inheritDoc}
             */
            public MethodVisitor wrap(TypeDescription instrumentedType,
                                      MethodDescription instrumentedMethod,
                                      MethodVisitor methodVisitor,
                                      Implementation.Context implementationContext,
                                      TypePool typePool,
                                      int writerFlags,
                                      int readerFlags) {
                methodVisitor.visitCode();
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 4);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 5);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 4);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitInsn(Opcodes.IAND);
                Label markerInterfaceLoop = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFEQ, markerInterfaceLoop);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 5);
                methodVisitor.visitIincInsn(5, 1);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 7);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 7);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 6);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 5);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 6);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 5);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 7);
                methodVisitor.visitInsn(Opcodes.IADD);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 5);
                Label markerInterfaceExit = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, markerInterfaceExit);
                methodVisitor.visitLabel(markerInterfaceLoop);
                methodVisitor.visitFrame(Opcodes.F_APPEND, 2, new Object[]{Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 6);
                methodVisitor.visitLabel(markerInterfaceExit);
                methodVisitor.visitFrame(Opcodes.F_APPEND, 1, new Object[]{"[Ljava/lang/Class;"}, 0, null);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 4);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitInsn(Opcodes.IAND);
                Label additionalBridgesLoop = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFEQ, additionalBridgesLoop);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 5);
                methodVisitor.visitIincInsn(5, 1);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, 8);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 8);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/invoke/MethodType");
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 7);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 5);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 7);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 8);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                Label additionalBridgesExit = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, additionalBridgesExit);
                methodVisitor.visitLabel(additionalBridgesLoop);
                methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/invoke/MethodType");
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 7);
                methodVisitor.visitLabel(additionalBridgesExit);
                methodVisitor.visitFrame(Opcodes.F_APPEND, 1, new Object[]{"[Ljava/lang/invoke/MethodType;"}, 0, null);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, UNSAFE_CLASS, "getUnsafe", "()L" + UNSAFE_CLASS + ";", false);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 8);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 8);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
                methodVisitor.visitLdcInsn("net.bytebuddy.agent.builder.LambdaFactory");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                methodVisitor.visitLdcInsn("make");
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 9);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_5);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 6);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
                methodVisitor.visitInsn(Opcodes.ACONST_NULL);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 9);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitInsn(Opcodes.ICONST_5);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 3);
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 6);
                methodVisitor.visitVarInsn(Opcodes.ILOAD, 4);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                methodVisitor.visitInsn(Opcodes.IAND);
                Label callSiteConditional = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFEQ, callSiteConditional);
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                Label callSiteAlternative = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, callSiteAlternative);
                methodVisitor.visitLabel(callSiteConditional);
                methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/Class;", "[Ljava/lang/invoke/MethodType;", UNSAFE_CLASS}, 7, new Object[]{UNSAFE_CLASS, "java/lang/Class", "java/lang/reflect/Method", Opcodes.NULL, "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitLabel(callSiteAlternative);
                methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/Class;", "[Ljava/lang/invoke/MethodType;", UNSAFE_CLASS}, 8, new Object[]{UNSAFE_CLASS, "java/lang/Class", "java/lang/reflect/Method", Opcodes.NULL, "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER});
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 7);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 6);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 8);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                methodVisitor.visitInsn(Opcodes.AASTORE);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "[B");
                methodVisitor.visitInsn(Opcodes.ACONST_NULL);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, UNSAFE_CLASS, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, 9);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 8);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 9);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, UNSAFE_CLASS, "ensureClassInitialized", "(Ljava/lang/Class;)V", false);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "parameterCount", "()I", false);
                Label callSiteJump = new Label();
                methodVisitor.visitJumpInsn(Opcodes.IFNE, callSiteJump);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 9);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", false);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitInsn(Opcodes.AALOAD);
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/invoke/MethodHandles", "constant", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", false);
                Label callSiteExit = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, callSiteExit);
                methodVisitor.visitLabel(callSiteJump);
                methodVisitor.visitFrame(Opcodes.F_APPEND, 1, new Object[]{"java/lang/Class"}, 0, null);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 9);
                methodVisitor.visitLdcInsn("get$Lambda");
                methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", "<init>", "(Ljava/lang/invoke/MethodHandle;)V", false);
                methodVisitor.visitLabel(callSiteExit);
                methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[]{"java/lang/invoke/CallSite"});
                methodVisitor.visitInsn(Opcodes.ARETURN);
                methodVisitor.visitMaxs(9, 10);
                methodVisitor.visitEnd();
                return IGNORE_ORIGINAL;
            }
        }
    }

    /**
     * <p>
     * The default implementation of an {@link net.bytebuddy.agent.builder.AgentBuilder}.
     * </p>
     * <p>
     * By default, Byte Buddy ignores any types loaded by the bootstrap class loader and
     * any synthetic type. Self-injection and rebasing is enabled. In order to avoid class format changes, set
     * {@link AgentBuilder#disableClassFormatChanges()}. All types are parsed without their debugging information
     * ({@link PoolStrategy.Default#FAST}).
     * </p>
     */
    @HashCodeAndEqualsPlugin.Enhance
    class Default implements AgentBuilder {

        /**
         * The name of the Byte Buddy {@code net.bytebuddy.agent.Installer} class.
         */
        private static final String INSTALLER_TYPE = "net.bytebuddy.agent.Installer";

        /**
         * The name of the {@code net.bytebuddy.agent.Installer} getter for reading an installed {@link Instrumentation}.
         */
        private static final String INSTRUMENTATION_GETTER = "getInstrumentation";

        /**
         * Indicator for access to a static member via reflection to make the code more readable.
         */
        private static final Object STATIC_MEMBER = null;

        /**
         * The value that is to be returned from a {@link java.lang.instrument.ClassFileTransformer} to indicate
         * that no class file transformation is to be applied.
         */
        private static final byte[] NO_TRANSFORMATION = null;

        /**
         * Indicates that a loaded type should be considered as non-available.
         */
        private static final Class<?> NO_LOADED_TYPE = null;

        /**
         * A dipatcher to use for interacting with the instrumentation API.
         */
        private static final Dispatcher DISPATCHER = AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);

        /**
         * The default circularity lock that assures that no agent created by any agent builder within this
         * class loader causes a class loading circularity.
         */
        private static final CircularityLock DEFAULT_LOCK = new CircularityLock.Default();

        /**
         * The {@link net.bytebuddy.ByteBuddy} instance to be used.
         */
        protected final ByteBuddy byteBuddy;

        /**
         * The listener to notify on transformations.
         */
        protected final Listener listener;

        /**
         * The circularity lock to use.
         */
        protected final CircularityLock circularityLock;

        /**
         * The type locator to use.
         */
        protected final PoolStrategy poolStrategy;

        /**
         * The definition handler to use.
         */
        protected final TypeStrategy typeStrategy;

        /**
         * The location strategy to use.
         */
        protected final LocationStrategy locationStrategy;

        /**
         * The native method strategy to use.
         */
        protected final NativeMethodStrategy nativeMethodStrategy;

        /**
         * A decorator to wrap the created class file transformer.
         */
        protected final TransformerDecorator transformerDecorator;

        /**
         * The initialization strategy to use for creating classes.
         */
        protected final InitializationStrategy initializationStrategy;

        /**
         * The redefinition strategy to apply.
         */
        protected final RedefinitionStrategy redefinitionStrategy;

        /**
         * The discovery strategy for loaded types to be redefined.
         */
        protected final RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy;

        /**
         * The batch allocator for the redefinition strategy to apply.
         */
        protected final RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator;

        /**
         * The redefinition listener for the redefinition strategy to apply.
         */
        protected final RedefinitionStrategy.Listener redefinitionListener;

        /**
         * The resubmission strategy to apply.
         */
        protected final RedefinitionStrategy.ResubmissionStrategy redefinitionResubmissionStrategy;

        /**
         * The injection strategy for injecting classes into a class loader.
         */
        protected final InjectionStrategy injectionStrategy;

        /**
         * A strategy to determine of the {@code LambdaMetafactory} should be instrumented to allow for the instrumentation
         * of classes that represent lambda expressions.
         */
        protected final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;

        /**
         * The description strategy for resolving type descriptions for types.
         */
        protected final DescriptionStrategy descriptionStrategy;

        /**
         * The fallback strategy to apply.
         */
        protected final FallbackStrategy fallbackStrategy;

        /**
         * The class file buffer strategy to use.
         */
        protected final ClassFileBufferStrategy classFileBufferStrategy;

        /**
         * The installation listener to notify.
         */
        protected final InstallationListener installationListener;

        /**
         * Identifies types that should not be instrumented.
         */
        protected final RawMatcher ignoreMatcher;

        /**
         * The transformation object for handling type transformations.
         */
        protected final List<Transformation> transformations;

        /**
         * Creates a new default agent builder that uses a default {@link net.bytebuddy.ByteBuddy} instance for creating classes.
         */
        public Default() {
            this(new ByteBuddy());
        }

        /**
         * Creates a new agent builder with default settings. By default, Byte Buddy ignores any types loaded by the bootstrap class loader, any
         * type within a {@code net.bytebuddy} package and any synthetic type. Self-injection and rebasing is enabled. In order to avoid class format
         * changes, set {@link AgentBuilder#disableClassFormatChanges()}. All types are parsed without their debugging information
         * ({@link PoolStrategy.Default#FAST}).
         *
         * @param byteBuddy The Byte Buddy instance to be used.
         */
        public Default(ByteBuddy byteBuddy) {
            this(byteBuddy,
                    Listener.NoOp.INSTANCE,
                    DEFAULT_LOCK,
                    PoolStrategy.Default.FAST,
                    TypeStrategy.Default.REBASE,
                    LocationStrategy.ForClassLoader.STRONG,
                    NativeMethodStrategy.Disabled.INSTANCE,
                    TransformerDecorator.NoOp.INSTANCE,
                    new InitializationStrategy.SelfInjection.Split(),
                    RedefinitionStrategy.DISABLED,
                    RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE,
                    RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE,
                    RedefinitionStrategy.Listener.NoOp.INSTANCE,
                    RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE,
                    InjectionStrategy.UsingReflection.INSTANCE,
                    LambdaInstrumentationStrategy.DISABLED,
                    DescriptionStrategy.Default.HYBRID,
                    FallbackStrategy.ByThrowableType.ofOptionalTypes(),
                    ClassFileBufferStrategy.Default.RETAINING,
                    InstallationListener.NoOp.INSTANCE,
                    new RawMatcher.Disjunction(
                            new RawMatcher.ForElementMatchers(any(), isBootstrapClassLoader().or(isExtensionClassLoader())),
                            new RawMatcher.ForElementMatchers(nameStartsWith("net.bytebuddy.").or(nameStartsWith("sun.reflect.")).<TypeDescription>or(isSynthetic()))),
                    Collections.<Transformation>emptyList());
        }

        /**
         * Creates a new default agent builder.
         *
         * @param byteBuddy                        The Byte Buddy instance to be used.
         * @param listener                         The listener to notify on transformations.
         * @param circularityLock                  The circularity lock to use.
         * @param poolStrategy                     The type locator to use.
         * @param typeStrategy                     The definition handler to use.
         * @param locationStrategy                 The location strategy to use.
         * @param nativeMethodStrategy             The native method strategy to apply.
         * @param transformerDecorator             A decorator to wrap the created class file transformer.
         * @param initializationStrategy           The initialization strategy to use for transformed types.
         * @param redefinitionStrategy             The redefinition strategy to apply.
         * @param redefinitionDiscoveryStrategy    The discovery strategy for loaded types to be redefined.
         * @param redefinitionBatchAllocator       The batch allocator for the redefinition strategy to apply.
         * @param redefinitionListener             The redefinition listener for the redefinition strategy to apply.
         * @param redefinitionResubmissionStrategy The resubmission strategy to apply.
         * @param injectionStrategy                The injection strategy for injecting classes into a class loader.
         * @param lambdaInstrumentationStrategy    A strategy to determine of the {@code LambdaMetafactory} should be instrumented to allow for the
         *                                         instrumentation of classes that represent lambda expressions.
         * @param descriptionStrategy              The description strategy for resolving type descriptions for types.
         * @param fallbackStrategy                 The fallback strategy to apply.
         * @param classFileBufferStrategy          The class file buffer strategy to use.
         * @param installationListener             The installation listener to notify.
         * @param ignoreMatcher                    Identifies types that should not be instrumented.
         * @param transformations                  The transformations to apply for any non-ignored type.
         */
        protected Default(ByteBuddy byteBuddy,
                          Listener listener,
                          CircularityLock circularityLock,
                          PoolStrategy poolStrategy,
                          TypeStrategy typeStrategy,
                          LocationStrategy locationStrategy,
                          NativeMethodStrategy nativeMethodStrategy,
                          TransformerDecorator transformerDecorator,
                          InitializationStrategy initializationStrategy,
                          RedefinitionStrategy redefinitionStrategy,
                          RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy,
                          RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator,
                          RedefinitionStrategy.Listener redefinitionListener,
                          RedefinitionStrategy.ResubmissionStrategy redefinitionResubmissionStrategy,
                          InjectionStrategy injectionStrategy,
                          LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                          DescriptionStrategy descriptionStrategy,
                          FallbackStrategy fallbackStrategy,
                          ClassFileBufferStrategy classFileBufferStrategy,
                          InstallationListener installationListener,
                          RawMatcher ignoreMatcher,
                          List<Transformation> transformations) {
            this.byteBuddy = byteBuddy;
            this.listener = listener;
            this.circularityLock = circularityLock;
            this.poolStrategy = poolStrategy;
            this.typeStrategy = typeStrategy;
            this.locationStrategy = locationStrategy;
            this.nativeMethodStrategy = nativeMethodStrategy;
            this.transformerDecorator = transformerDecorator;
            this.initializationStrategy = initializationStrategy;
            this.redefinitionStrategy = redefinitionStrategy;
            this.redefinitionDiscoveryStrategy = redefinitionDiscoveryStrategy;
            this.redefinitionBatchAllocator = redefinitionBatchAllocator;
            this.redefinitionListener = redefinitionListener;
            this.redefinitionResubmissionStrategy = redefinitionResubmissionStrategy;
            this.injectionStrategy = injectionStrategy;
            this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
            this.descriptionStrategy = descriptionStrategy;
            this.fallbackStrategy = fallbackStrategy;
            this.classFileBufferStrategy = classFileBufferStrategy;
            this.installationListener = installationListener;
            this.ignoreMatcher = ignoreMatcher;
            this.transformations = transformations;
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins. As {@link EntryPoint}, {@link EntryPoint.Default#REBASE} is implied.
         *
         * @param plugin The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(Plugin... plugin) {
            return of(Arrays.asList(plugin));
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins. As {@link EntryPoint}, {@link EntryPoint.Default#REBASE} is implied.
         *
         * @param plugins The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(List<? extends Plugin> plugins) {
            return of(EntryPoint.Default.REBASE, plugins);
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins.
         *
         * @param entryPoint The build entry point to use.
         * @param plugin     The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(EntryPoint entryPoint, Plugin... plugin) {
            return of(entryPoint, Arrays.asList(plugin));
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins.
         *
         * @param entryPoint The build entry point to use.
         * @param plugins    The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(EntryPoint entryPoint, List<? extends Plugin> plugins) {
            return of(entryPoint, ClassFileVersion.ofThisVm(), plugins);
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins. As {@link EntryPoint}, {@link EntryPoint.Default#REBASE} is implied.
         *
         * @param classFileVersion The class file version to use.
         * @param plugin           The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(ClassFileVersion classFileVersion, Plugin... plugin) {
            return of(classFileVersion, Arrays.asList(plugin));
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins. As {@link EntryPoint}, {@link EntryPoint.Default#REBASE} is implied.
         *
         * @param classFileVersion The class file version to use.
         * @param plugins          The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(ClassFileVersion classFileVersion, List<? extends Plugin> plugins) {
            return of(EntryPoint.Default.REBASE, classFileVersion, plugins);
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins.
         *
         * @param entryPoint       The build entry point to use.
         * @param classFileVersion The class file version to use.
         * @param plugin           The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(EntryPoint entryPoint, ClassFileVersion classFileVersion, Plugin... plugin) {
            return of(entryPoint, classFileVersion, Arrays.asList(plugin));
        }

        /**
         * Creates an {@link AgentBuilder} that realizes the provided build plugins.
         *
         * @param entryPoint       The build entry point to use.
         * @param classFileVersion The class file version to use.
         * @param plugins          The build plugins to apply as a Java agent.
         * @return An appropriate agent builder.
         */
        public static AgentBuilder of(EntryPoint entryPoint, ClassFileVersion classFileVersion, List<? extends Plugin> plugins) {
            AgentBuilder agentBuilder = new AgentBuilder.Default(entryPoint.byteBuddy(classFileVersion)).with(new TypeStrategy.ForBuildEntryPoint(entryPoint));
            for (Plugin plugin : plugins) {
                agentBuilder = agentBuilder.type(plugin).transform(new Transformer.ForBuildPlugin(plugin));
            }
            return agentBuilder;
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(ByteBuddy byteBuddy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(Listener listener) {
            return new Default(byteBuddy,
                    new Listener.Compound(this.listener, listener),
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(CircularityLock circularityLock) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(TypeStrategy typeStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(PoolStrategy poolStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(LocationStrategy locationStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder enableNativeMethodPrefix(String prefix) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    NativeMethodStrategy.ForPrefix.of(prefix),
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder disableNativeMethodPrefix() {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    NativeMethodStrategy.Disabled.INSTANCE,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(TransformerDecorator transformerDecorator) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    new TransformerDecorator.Compound(this.transformerDecorator, transformerDecorator),
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
            return new Redefining(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE,
                    RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE,
                    RedefinitionStrategy.Listener.NoOp.INSTANCE,
                    RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(InitializationStrategy initializationStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(FallbackStrategy fallbackStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(InstallationListener installationListener) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    new InstallationListener.Compound(this.installationListener, installationListener),
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder with(InjectionStrategy injectionStrategy) {
            return new Default(byteBuddy,
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    transformerDecorator,
                    initializationStrategy,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder disableClassFormatChanges() {
            return new Default(byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE),
                    listener,
                    circularityLock,
                    poolStrategy,
                    typeStrategy == TypeStrategy.Default.DECORATE
                            ? TypeStrategy.Default.DECORATE
                            : TypeStrategy.Default.REDEFINE_FROZEN,
                    locationStrategy,
                    NativeMethodStrategy.Disabled.INSTANCE,
                    transformerDecorator,
                    InitializationStrategy.NoOp.INSTANCE,
                    redefinitionStrategy,
                    redefinitionDiscoveryStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener,
                    redefinitionResubmissionStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations);
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... type) {
            return JavaModule.isSupported()
                    ? with(Listener.ModuleReadEdgeCompleting.of(instrumentation, false, type))
                    : this;
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... module) {
            return assureReadEdgeTo(instrumentation, Arrays.asList(module));
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, false, new HashSet<JavaModule>(modules)));
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... type) {
            return JavaModule.isSupported()
                    ? with(Listener.ModuleReadEdgeCompleting.of(instrumentation, true, type))
                    : this;
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... module) {
            return assureReadEdgeFromAndTo(instrumentation, Arrays.asList(module));
        }

        /**
         * {@inheritDoc}
         */
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, true, new HashSet<JavaModule>(modules)));
        }

        /**
         * {@inheritDoc}
         */
        public Identified.Narrowable type(RawMatcher matcher) {
            return new Transforming(matcher, Collections.<Transformer>emptyList(), false);
        }

        /**
         * {@inheritDoc}
         */
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher) {
            return type(typeMatcher, any());
        }

        /**
         * {@inheritDoc}
         */
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher) {
            return type(typeMatcher, classLoaderMatcher, any());
        }

        /**
         * {@inheritDoc}
         */
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher,
                                          ElementMatcher<? super ClassLoader> classLoaderMatcher,
                                          ElementMatcher<? super JavaModule> moduleMatcher) {
            return type(new RawMatcher.ForElementMatchers(typeMatcher, classLoaderMatcher, not(supportsModules()).or(moduleMatcher)));
        }

        /**
         * {@inheritDoc}
         */
        public Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher) {
            return ignore(typeMatcher, any());
        }

        /**
         * {@inheritDoc}
         */
        public Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher) {
            return ignore(typeMatcher, classLoaderMatcher, any());
        }

        /**
         * {@inheritDoc}
         */
        public Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher,
                              ElementMatcher<? super ClassLoader> classLoaderMatcher,
                              ElementMatcher<? super JavaModule> moduleMatcher) {
            return ignore(new RawMatcher.ForElementMatchers(typeMatcher, classLoaderMatcher, not(supportsModules()).or(moduleMatcher)));
        }

        /**
         * {@inheritDoc}
         */
        public Ignored ignore(RawMatcher rawMatcher) {
            return new Ignoring(rawMatcher);
        }

        /**
         * {@inheritDoc}
         */
        public ResettableClassFileTransformer makeRaw() {
            return makeRaw(listener, InstallationListener.NoOp.INSTANCE);
        }

        /**
         * Creates a new class file transformer with a given listener.
         *
         * @param listener             The listener to supply.
         * @param installationListener The installation listener to notify.
         * @return The resettable class file transformer to use.
         */
        private ResettableClassFileTransformer makeRaw(Listener listener, InstallationListener installationListener) {
            return ExecutingTransformer.FACTORY.make(byteBuddy,
                    listener,
                    poolStrategy,
                    typeStrategy,
                    locationStrategy,
                    nativeMethodStrategy,
                    initializationStrategy,
                    injectionStrategy,
                    lambdaInstrumentationStrategy,
                    descriptionStrategy,
                    fallbackStrategy,
                    classFileBufferStrategy,
                    installationListener,
                    ignoreMatcher,
                    transformations,
                    circularityLock);
        }

        /**
         * {@inheritDoc}
         */
        public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
            if (!circularityLock.acquire()) {
                throw new IllegalStateException("Could not acquire the circularity lock upon installation.");
            }
            try {
                return doInstall(instrumentation, new Transformation.SimpleMatcher(ignoreMatcher, transformations));
            } finally {
                circularityLock.release();
            }
        }

        /**
         * {@inheritDoc}
         */
        public ResettableClassFileTransformer installOnByteBuddyAgent() {
            try {
                return installOn((Instrumentation) ClassLoader.getSystemClassLoader()
                        .loadClass(INSTALLER_TYPE)
                        .getMethod(INSTRUMENTATION_GETTER)
                        .invoke(STATIC_MEMBER));
            } catch (RuntimeException exception) {
                throw exception;
            } catch (Exception exception) {
                throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", exception);
            }
        }

        /**
         * {@inheritDoc}
         */
        public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
            if (!circularityLock.acquire()) {
                throw new IllegalStateException("Could not acquire the circularity lock upon installation.");
            }
            try {
                if (!classFileTransformer.reset(instrumentation, RedefinitionStrategy.DISABLED)) {
                    throw new IllegalArgumentException("Cannot patch unregistered class file transformer: " + classFileTransformer);
                }
                return doInstall(instrumentation, new Transformation.DifferentialMatcher(ignoreMatcher, transformations, classFileTransformer));
            } finally {
                circularityLock.release();
            }
        }

        /**
         * {@inheritDoc}
         */
        public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer classFileTransformer) {
            try {
                return patchOn((Instrumentation) ClassLoader.getSystemClassLoader()
                        .loadClass(INSTALLER_TYPE)
                        .getMethod(INSTRUMENTATION_GETTER)
                        .invoke(STATIC_MEMBER), classFileTransformer);
            } catch (RuntimeException exception) {
                throw exception;
            } catch (Exception exception) {
                throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", exception);
            }
        }

        /**
         * Installs the class file transformer.
         *
         * @param instrumentation The instrumentation to install the matcher on.
         * @param matcher         The matcher to identify redefined types.
         * @return The created class file transformer.
         */
        private ResettableClassFileTransformer doInstall(Instrumentation instrumentation, RawMatcher matcher) {
            RedefinitionStrategy.ResubmissionStrategy.Installation installation = redefinitionResubmissionStrategy.apply(instrumentation,
                    locationStrategy,
                    listener,
                    installationListener,
                    circularityLock,
                    new Transformation.SimpleMatcher(ignoreMatcher, transformations),
                    redefinitionStrategy,
                    redefinitionBatchAllocator,
                    redefinitionListener);
            ResettableClassFileTransformer classFileTransformer = transformerDecorator.decorate(makeRaw(installation.getListener(),
                    installation.getInstallationListener()));
            installation.getInstallationListener().onBeforeInstall(instrumentation, classFileTransformer);
            try {
                DISPATCHER.addTransformer(instrumentation, classFileTransformer, redefinitionStrategy.isRetransforming());
                nativeMethodStrategy.apply(instrumentation, classFileTransformer);
                lambdaInstrumentationStrategy.apply(byteBuddy, instrumentation, classFileTransformer);
                redefinitionStrategy.apply(instrumentation,
                        installation.getListener(),
                        circularityLock,
                        poolStrategy,
                        locationStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        matcher);
            } catch (Throwable throwable) {
                throwable = installation.getInstallationListener().onError(instrumentation, classFileTransformer, throwable);
                if (throwable != null) {
                    instrumentation.removeTransformer(classFileTransformer);
                    throw new IllegalStateException("Could not install class file transformer", throwable);
                }
            }
            installation.getInstallationListener().onInstall(instrumentation, classFileTransformer);
            return classFileTransformer;
        }

        /**
         * A dispatcher for interacting with the instrumentation API.
         */
        protected interface Dispatcher {

            /**
             * Returns {@code true} if the supplied instrumentation instance supports setting native method prefixes.
             *
             * @param instrumentation The instrumentation instance to use.
             * @return {@code true} if the supplied instrumentation instance supports native method prefixes.
             */
            boolean isNativeMethodPrefixSupported(Instrumentation instrumentation);

            /**
             * Sets a native method prefix for the supplied class file transformer.
             *
             * @param instrumentation      The instrumentation instance to use.
             * @param classFileTransformer The class file transformer for which the prefix is set.
             * @param prefix               The prefix to set.
             */
            void setNativeMethodPrefix(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, String prefix);

            /**
             * Adds a class file transformer to an instrumentation instance.
             *
             * @param instrumentation      The instrumentation instance to use for registration.
             * @param classFileTransformer The class file transformer to register.
             * @param canRetransform       {@code true} if the class file transformer is capable of retransformation.
             */
            void addTransformer(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, boolean canRetransform);

            /**
             * An action for creating a dispatcher.
             */
            enum CreationAction implements PrivilegedAction<Dispatcher> {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public Dispatcher run() {
                    try {
                        return new Dispatcher.ForJava6CapableVm(Instrumentation.class.getMethod("isNativeMethodPrefixSupported"),
                                Instrumentation.class.getMethod("setNativeMethodPrefix", ClassFileTransformer.class, String.class),
                                Instrumentation.class.getMethod("addTransformer", ClassFileTransformer.class, boolean.class));
                    } catch (NoSuchMethodException ignored) {
                        return Dispatcher.ForLegacyVm.INSTANCE;
                    }
                }
            }

            /**
             * A dispatcher for a legacy VM.
             */
            enum ForLegacyVm implements Dispatcher {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public boolean isNativeMethodPrefixSupported(Instrumentation instrumentation) {
                    return false;
                }

                /**
                 * {@inheritDoc}
                 */
                public void setNativeMethodPrefix(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, String prefix) {
                    throw new UnsupportedOperationException("The current VM does not support native method prefixes");
                }

                /**
                 * {@inheritDoc}
                 */
                public void addTransformer(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, boolean canRetransform) {
                    if (canRetransform) {
                        throw new UnsupportedOperationException("The current VM does not support retransformation");
                    }
                    instrumentation.addTransformer(classFileTransformer);
                }
            }

            /**
             * A dispatcher for a Java 6 capable VM.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class ForJava6CapableVm implements Dispatcher {

                /**
                 * The {@code Instrumentation#isNativeMethodPrefixSupported} method.
                 */
                private final Method isNativeMethodPrefixSupported;

                /**
                 * The {@code Instrumentation#setNativeMethodPrefix} method.
                 */
                private final Method setNativeMethodPrefix;

                /**
                 * The {@code Instrumentation#addTransformer} method.
                 */
                private final Method addTransformer;

                /**
                 * Creates a new Java 6 capable dispatcher.
                 *
                 * @param isNativeMethodPrefixSupported The {@code Instrumentation#isNativeMethodPrefixSupported} method.
                 * @param setNativeMethodPrefix         The {@code Instrumentation#setNativeMethodPrefix} method.
                 * @param addTransformer                The {@code Instrumentation#addTransformer} method.
                 */
                protected ForJava6CapableVm(Method isNativeMethodPrefixSupported, Method setNativeMethodPrefix, Method addTransformer) {
                    this.isNativeMethodPrefixSupported = isNativeMethodPrefixSupported;
                    this.setNativeMethodPrefix = setNativeMethodPrefix;
                    this.addTransformer = addTransformer;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean isNativeMethodPrefixSupported(Instrumentation instrumentation) {
                    try {
                        return (Boolean) isNativeMethodPrefixSupported.invoke(instrumentation);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#isNativeMethodPrefixSupported", exception);
                    } catch (InvocationTargetException exception) {
                        throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#isNativeMethodPrefixSupported", exception.getCause());
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void setNativeMethodPrefix(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, String prefix) {
                    try {
                        setNativeMethodPrefix.invoke(instrumentation, classFileTransformer, prefix);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#setNativeMethodPrefix", exception);
                    } catch (InvocationTargetException exception) {
                        throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#setNativeMethodPrefix", exception.getCause());
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void addTransformer(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, boolean canRetransform) {
                    try {
                        addTransformer.invoke(instrumentation, classFileTransformer, canRetransform);
                    } catch (IllegalAccessException exception) {
                        throw new IllegalStateException("Cannot access java.lang.instrument.Instrumentation#addTransformer", exception);
                    } catch (InvocationTargetException exception) {
                        throw new IllegalStateException("Error invoking java.lang.instrument.Instrumentation#addTransformer", exception.getCause());
                    }
                }
            }
        }

        /**
         * A strategy for determining if a native method name prefix should be used when rebasing methods.
         */
        protected interface NativeMethodStrategy {

            /**
             * Resolves the method name transformer for this strategy.
             *
             * @return A method name transformer for this strategy.
             */
            MethodNameTransformer resolve();

            /**
             * Applies this native method strategy.
             *
             * @param instrumentation      The instrumentation to apply this strategy upon.
             * @param classFileTransformer The class file transformer being registered.
             */
            void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer);

            /**
             * A native method strategy that suffixes method names with a random suffix and disables native method rebasement.
             */
            enum Disabled implements NativeMethodStrategy {

                /**
                 * The singleton instance.
                 */
                INSTANCE;

                /**
                 * {@inheritDoc}
                 */
                public MethodNameTransformer resolve() {
                    return MethodNameTransformer.Suffixing.withRandomSuffix();
                }

                /**
                 * {@inheritDoc}
                 */
                public void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                    /* do nothing */
                }
            }

            /**
             * A native method strategy that prefixes method names with a fixed value for supporting rebasing of native methods.
             */
            @HashCodeAndEqualsPlugin.Enhance
            class ForPrefix implements NativeMethodStrategy {

                /**
                 * The method name prefix.
                 */
                private final String prefix;

                /**
                 * Creates a new name prefixing native method strategy.
                 *
                 * @param prefix The method name prefix.
                 */
                protected ForPrefix(String prefix) {
                    this.prefix = prefix;
                }

                /**
                 * Creates a new native method strategy for prefixing method names.
                 *
                 * @param prefix The method name prefix.
                 * @return An appropriate native method strategy.
                 */
                protected static NativeMethodStrategy of(String prefix) {
                    if (prefix.length() == 0) {
                        throw new IllegalArgumentException("A method name prefix must not be the empty string");
                    }
                    return new ForPrefix(prefix);
                }

                /**
                 * {@inheritDoc}
                 */
                public MethodNameTransformer resolve() {
                    return new MethodNameTransformer.Prefixing(prefix);
                }

                /**
                 * {@inheritDoc}
                 */
                public void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                    if (!DISPATCHER.isNativeMethodPrefixSupported(instrumentation)) {
                        throw new IllegalArgumentException("A prefix for native methods is not supported: " + instrumentation);
                    }
                    DISPATCHER.setNativeMethodPrefix(instrumentation, classFileTransformer, prefix);
                }
            }
        }

        /**
         * A transformation to apply.
         */
        @HashCodeAndEqualsPlugin.Enhance
        protected static class Transformation {

            /**
             * Indicates that a type should not be ignored.
             */
            private static final byte[] NONE = null;

            /**
             * The matcher to identify types for transformation.
             */
            private final RawMatcher matcher;

            /**
             * A list of transformers to apply.
             */
            private final List<Transformer> transformers;

            /**
             * {@code true} if this transformation is terminal.
             */
            private final boolean terminal;

            /**
             * Creates a new transformation.
             *
             * @param matcher      The matcher to identify types eligable for transformation.
             * @param transformers A list of transformers to apply.
             * @param terminal     Indicates that this transformation is terminal.
             */
            protected Transformation(RawMatcher matcher, List<Transformer> transformers, boolean terminal) {
                this.matcher = matcher;
                this.transformers = transformers;
                this.terminal = terminal;
            }

            /**
             * Returns the matcher to identify types for transformation.
             *
             * @return The matcher to identify types for transformation.
             */
            protected RawMatcher getMatcher() {
                return matcher;
            }

            /**
             * Returns a list of transformers to apply.
             *
             * @return A list of transformers to apply.
             */
            protected List<Transformer> getTransformers() {
                return transformers;
            }

            /**
             * Returns {@code true} if this transformation is terminal.
             *
             * @return {@code true} if this transformation is terminal.
             */
            protected boolean isTerminal() {
                return terminal;
            }

            /**
             * A matcher that matches any type that is touched by a transformer without being ignored.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class SimpleMatcher implements RawMatcher {

                /**
                 * Identifies types that should not be instrumented.
                 */
                private final RawMatcher ignoreMatcher;

                /**
                 * The transformations to apply on non-ignored types.
                 */
                private final List<Transformation> transformations;

                /**
                 * Creates a new simple matcher.
                 *
                 * @param ignoreMatcher   Identifies types that should not be instrumented.
                 * @param transformations The transformations to apply on non-ignored types.
                 */
                protected SimpleMatcher(RawMatcher ignoreMatcher, List<Transformation> transformations) {
                    this.ignoreMatcher = ignoreMatcher;
                    this.transformations = transformations;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean matches(TypeDescription typeDescription,
                                       ClassLoader classLoader,
                                       JavaModule module,
                                       Class<?> classBeingRedefined,
                                       ProtectionDomain protectionDomain) {
                    if (ignoreMatcher.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                        return false;
                    }
                    for (Transformation transformation : transformations) {
                        if (transformation.getMatcher().matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                            return true;
                        }
                    }
                    return false;
                }
            }

            /**
             * A matcher that considers the differential of two transformers' transformations.
             */
            @HashCodeAndEqualsPlugin.Enhance
            protected static class DifferentialMatcher implements RawMatcher {

                /**
                 * Identifies types that should not be instrumented.
                 */
                private final RawMatcher ignoreMatcher;

                /**
                 * The transformations to apply on non-ignored types.
                 */
                private final List<Transformation> transformations;

                /**
                 * The class file transformer representing the differential.
                 */
                private final ResettableClassFileTransformer classFileTransformer;

                /**
                 * Creates a new differential matcher.
                 *
                 * @param ignoreMatcher        Identifies types that should not be instrumented.
                 * @param transformations      The transformations to apply on non-ignored types.
                 * @param classFileTransformer The class file transformer representing the differential.
                 */
                protected DifferentialMatcher(RawMatcher ignoreMatcher,
                                              List<Transformation> transformations,
                                              ResettableClassFileTransformer classFileTransformer) {
                    this.ignoreMatcher = ignoreMatcher;
                    this.transformations = transformations;
                    this.classFileTransformer = classFileTransformer;
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean matches(TypeDescription typeDescription,
                                       ClassLoader classLoader,
                                       JavaModule module,
                                       Class<?> classBeingRedefined,
                                       ProtectionDomain protectionDomain) {
                    Iterator<Transformer> iterator = classFileTransformer.iterator(typeDescription, classLoader, module, classBeingRedefined, protectionDomain);
                    if (ignoreMatcher.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                        return iterator.hasNext();
                    }
                    for (Transformation transformation : transformations) {
                        if (transformation.getMatcher().matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                            for (Transformer transformer : transformation.getTransformers()) {
                                if (!iterator.hasNext() || !iterator.next().equals(transformer)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return iterator.hasNext();
                }
            }

            /**
             * An iterator over a list of transformations that match a raw matcher specification.
             */
            protected static class TransformerIterator implements Iterator<Transformer> {

                /**
                 * A description of the matched type.
                 */
                private final TypeDescription typeDescription;

                /**
                 * The type's class loader.
                 */
                private final ClassLoader classLoader;

                /**
                 * The type's module.
                 */
                private final JavaModule module;

                /**
                 * The class being redefined or {@code null} if the type was not previously loaded.
                 */
                private final Class<?> classBeingRedefined;

                /**
                 * The type's protection domain.
                 */
                private final ProtectionDomain protectionDomain;

                /**
                 * An iterator over the remaining transformations that were not yet considered.
                 */
                private final Iterator<Transformation> transformations;

                /**
                 * An iterator over the currently matched transformers.
                 */
                private Iterator<Transformer> transformers;

                /**
                 * Creates a new iterator.
                 *
                 * @param typeDescription     A description of the matched type.
                 * @param classLoader         The type's class loader.
                 * @param module              The type's module.
                 * @param classBeingRedefined The class being redefined or {@code null} if the type was not previously loaded.
                 * @param protectionDomain    The type's protection domain.
                 * @param transformations     The matched transformations.
                 */
                protected TransformerIterator(TypeDescription typeDescription,
                                              ClassLoader classLoader,
                                              JavaModule module,
                                              Class<?> classBeingRedefined,
                                              ProtectionDomain protectionDomain,
                                              List<Transformation> transformations) {
                    this.typeDescription = typeDescription;
                    this.classLoader = classLoader;
                    this.module = module;
                    this.classBeingRedefined = classBeingRedefined;
                    this.protectionDomain = protectionDomain;
                    this.transformations = transformations.iterator();
                    transformers = Collections.<Transformer>emptySet().iterator();
                    while (!transformers.hasNext() && this.transformations.hasNext()) {
                        Transformation transformation = this.transformations.next();
                        if (transformation.getMatcher().matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                            transformers = transformation.getTransformers().iterator();
                        }
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public boolean hasNext() {
                    return transformers.hasNext();
                }

                /**
                 * {@inheritDoc}
                 */
                public Transformer next() {
                    try {
                        return transformers.next();
                    } finally {
                        while (!transformers.hasNext() && transformations.hasNext()) {
                            Transformation transformation = transformations.next();
                            if (transformation.getMatcher().matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                                transformers = transformation.getTransformers().iterator();
                            }
                        }
                    }
                }

                /**
                 * {@inheritDoc}
                 */
                public void remove() {
                    throw new UnsupportedOperationException("remove");
                }
            }
        }

        /**
         * A {@link java.lang.instrument.ClassFileTransformer} that implements the enclosing agent builder's
         * configuration.
         */
        protected static class ExecutingTransformer extends ResettableClassFileTransformer.AbstractBase {

            /**
             * A factory for creating a {@link ClassFileTransformer} that supports the features of the current VM.
             */
            protected static final Factory FACTORY = AccessController.doPrivileged(Factory.CreationAction.INSTANCE);

            /**
             * The Byte Buddy instance to be used.
             */
            private final ByteBuddy byteBuddy;

            /**
             * The type locator to use.
             */
            private final PoolStrategy poolStrategy;

            /**
             * The definition handler to use.
             */
            private final TypeStrategy typeStrategy;

            /**
             * The listener to notify on transformations.
             */
            private final Listener listener;

            /**
             * The native method strategy to apply.
             */
            private final NativeMethodStrategy nativeMethodStrategy;

            /**
             * The initialization strategy to use for transformed types.
             */
            private final InitializationStrategy initializationStrategy;

            /**
             * The injection strategy to use.
             */
            private final InjectionStrategy injectionStrategy;

            /**
             * The lambda instrumentation strategy to use.
             */
            private final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;

            /**
             * The description strategy for resolving type descriptions for types.
             */
            private final DescriptionStrategy descriptionStrategy;

            /**
             * The location strategy to use.
             */
            private final LocationStrategy locationStrategy;

            /**
             * The fallback strategy to use.
             */
            private final FallbackStrategy fallbackStrategy;

            /**
             * The class file buffer strategy to use.
             */
            private final ClassFileBufferStrategy classFileBufferStrategy;

            /**
             * The installation listener to notify.
             */
            private final InstallationListener installationListener;

            /**
             * Identifies types that should not be instrumented.
             */
            private final RawMatcher ignoreMatcher;

            /**
             * The transformations to apply on non-ignored types.
             */
            private final List<Transformation> transformations;

            /**
             * A lock that prevents circular class transformations.
             */
            private final CircularityLock circularityLock;

            /**
             * The access control context to use for loading classes.
             */
            private final AccessControlContext accessControlContext;

            /**
             * Creates a new class file transformer.
             *
             * @param byteBuddy                     The Byte Buddy instance to be used.
             * @param listener                      The listener to notify on transformations.
             * @param poolStrategy                  The type locator to use.
             * @param typeStrategy                  The definition handler to use.
             * @param locationStrategy              The location strategy to use.
             * @param nativeMethodStrategy          The native method strategy to apply.
             * @param initializationStrategy        The initialization strategy to use for transformed types.
             * @param injectionStrategy             The injection strategy to use.
             * @param lambdaInstrumentationStrategy The lambda instrumentation strategy to use.
             * @param descriptionStrategy           The description strategy for resolving type descriptions for types.
             * @param fallbackStrategy              The fallback strategy to use.
             * @param installationListener          The installation listener to notify.
             * @param classFileBufferStrategy       The class file buffer strategy to use.
             * @param ignoreMatcher                 Identifies types that should not be instrumented.
             * @param transformations               The transformations to apply on non-ignored types.
             * @param circularityLock               The circularity lock to use.
             */
            public ExecutingTransformer(ByteBuddy byteBuddy,
                                        Listener listener,
                                        PoolStrategy poolStrategy,
                                        TypeStrategy typeStrategy,
                                        LocationStrategy locationStrategy,
                                        NativeMethodStrategy nativeMethodStrategy,
                                        InitializationStrategy initializationStrategy,
                                        InjectionStrategy injectionStrategy,
                                        LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                                        DescriptionStrategy descriptionStrategy,
                                        FallbackStrategy fallbackStrategy,
                                        ClassFileBufferStrategy classFileBufferStrategy,
                                        InstallationListener installationListener,
                                        RawMatcher ignoreMatcher,
                                        List<Transformation> transformations,
                                        CircularityLock circularityLock) {
                this.byteBuddy = byteBuddy;
                this.typeStrategy = typeStrategy;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.listener = listener;
                this.nativeMethodStrategy = nativeMethodStrategy;
                this.initializationStrategy = initializationStrategy;
                this.injectionStrategy = injectionStrategy;
                this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
                this.descriptionStrategy = descriptionStrategy;
                this.fallbackStrategy = fallbackStrategy;
                this.classFileBufferStrategy = classFileBufferStrategy;
                this.installationListener = installationListener;
                this.ignoreMatcher = ignoreMatcher;
                this.transformations = transformations;
                this.circularityLock = circularityLock;
                accessControlContext = AccessController.getContext();
            }

            /**
             * {@inheritDoc}
             */
            public byte[] transform(ClassLoader classLoader,
                                    String internalTypeName,
                                    Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain,
                                    byte[] binaryRepresentation) {
                if (circularityLock.acquire()) {
                    try {
                        return AccessController.doPrivileged(new LegacyVmDispatcher(classLoader,
                                internalTypeName,
                                classBeingRedefined,
                                protectionDomain,
                                binaryRepresentation), accessControlContext);
                    } finally {
                        circularityLock.release();
                    }
                } else {
                    return NO_TRANSFORMATION;
                }
            }

            /**
             * Applies a transformation for a class that was captured by this {@link ClassFileTransformer}. Invoking this method
             * allows to process module information which is available since Java 9.
             *
             * @param rawModule            The instrumented class's Java {@code java.lang.Module}.
             * @param classLoader          The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
             * @param internalTypeName     The internal name of the instrumented class.
             * @param classBeingRedefined  The loaded {@link Class} being redefined or {@code null} if no such class exists.
             * @param protectionDomain     The instrumented type's protection domain.
             * @param binaryRepresentation The class file of the instrumented class in its current state.
             * @return The transformed class file or an empty byte array if this transformer does not apply an instrumentation.
             */
            protected byte[] transform(Object rawModule,
                                       ClassLoader classLoader,
                                       String internalTypeName,
                                       Class<?> classBeingRedefined,
                                       ProtectionDomain protectionDomain,
                                       byte[] binaryRepresentation) {
                if (circularityLock.acquire()) {
                    try {
                        return AccessController.doPrivileged(new Java9CapableVmDispatcher(rawModule,
                                classLoader,
                                internalTypeName,
                                classBeingRedefined,
                                protectionDomain,
                                binaryRepresentation), accessControlContext);
                    } finally {
                        circularityLock.release();
                    }
                } else {
                    return NO_TRANSFORMATION;
                }
            }

            /**
             * Applies a transformation for a class that was captured by this {@link ClassFileTransformer}.
             *
             * @param module               The instrumented class's Java module in its wrapped form or {@code null} if the current VM does not support modules.
             * @param classLoader          The instrumented class's class loader.
             * @param internalTypeName     The internal name of the instrumented class.
             * @param classBeingRedefined  The loaded {@link Class} being redefined or {@code null} if no such class exists.
             * @param protectionDomain     The instrumented type's protection domain.
             * @param binaryRepresentation The class file of the instrumented class in its current state.
             * @return The transformed class file or an empty byte array if this transformer does not apply an instrumentation.
             */
            private byte[] transform(JavaModule module,
                                     ClassLoader classLoader,
                                     String internalTypeName,
                                     Class<?> classBeingRedefined,
                                     ProtectionDomain protectionDomain,
                                     byte[] binaryRepresentation) {
                if (internalTypeName == null || !lambdaInstrumentationStrategy.isInstrumented(classBeingRedefined)) {
                    return NO_TRANSFORMATION;
                }
                String typeName = internalTypeName.replace('/', '.');
                try {
                    listener.onDiscovery(typeName, classLoader, module, classBeingRedefined != null);
                    ClassFileLocator classFileLocator = new ClassFileLocator.Compound(classFileBufferStrategy.resolve(typeName,
                            binaryRepresentation,
                            classLoader,
                            module,
                            protectionDomain), locationStrategy.classFileLocator(classLoader, module));
                    TypePool typePool = poolStrategy.typePool(classFileLocator, classLoader);
                    try {
                        return doTransform(module, classLoader, typeName, classBeingRedefined, classBeingRedefined != null, protectionDomain, typePool, classFileLocator);
                    } catch (Throwable throwable) {
                        if (classBeingRedefined != null && descriptionStrategy.isLoadedFirst() && fallbackStrategy.isFallback(classBeingRedefined, throwable)) {
                            return doTransform(module, classLoader, typeName, NO_LOADED_TYPE, Listener.LOADED, protectionDomain, typePool, classFileLocator);
                        } else {
                            throw throwable;
                        }
                    }
                } catch (Throwable throwable) {
                    listener.onError(typeName, classLoader, module, classBeingRedefined != null, throwable);
                    return NO_TRANSFORMATION;
                } finally {
                    listener.onComplete(typeName, classLoader, module, classBeingRedefined != null);
                }
            }

            /**
             * Applies a transformation for a class that was captured by this {@link ClassFileTransformer}.
             *
             * @param module              The instrumented class's Java module in its wrapped form or {@code null} if the current VM does not support modules.
             * @param classLoader         The instrumented class's class loader.
             * @param typeName            The binary name of the instrumented class.
             * @param classBeingRedefined The loaded {@link Class} being redefined or {@code null} if no such class exists.
             * @param loaded              {@code true} if the instrumented type is loaded.
             * @param protectionDomain    The instrumented type's protection domain.
             * @param typePool            The type pool to use.
             * @param classFileLocator    The class file locator to use.
             * @return The transformed class file or an empty byte array if this transformer does not apply an instrumentation.
             */
            private byte[] doTransform(JavaModule module,
                                       ClassLoader classLoader,
                                       String typeName,
                                       Class<?> classBeingRedefined,
                                       boolean loaded,
                                       ProtectionDomain protectionDomain,
                                       TypePool typePool,
                                       ClassFileLocator classFileLocator) {
                TypeDescription typeDescription = descriptionStrategy.apply(typeName, classBeingRedefined, typePool, circularityLock, classLoader, module);
                List<Transformer> transformers = new ArrayList<Transformer>();
                if (!ignoreMatcher.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                    for (Transformation transformation : transformations) {
                        if (transformation.getMatcher().matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)) {
                            transformers.addAll(transformation.getTransformers());
                            if (transformation.isTerminal()) {
                                break;
                            }
                        }
                    }
                }
                if (transformers.isEmpty()) {
                    listener.onIgnored(typeDescription, classLoader, module, loaded);
                    return Transformation.NONE;
                }
                DynamicType.Builder<?> builder = typeStrategy.builder(typeDescription,
                        byteBuddy,
                        classFileLocator,
                        nativeMethodStrategy.resolve(),
                        classLoader,
                        module,
                        protectionDomain);
                InitializationStrategy.Dispatcher dispatcher = initializationStrategy.dispatcher();
                for (Transformer transformer : transformers) {
                    builder = transformer.transform(builder, typeDescription, classLoader, module);
                }
                DynamicType.Unloaded<?> dynamicType = dispatcher.apply(builder).make(TypeResolutionStrategy.Disabled.INSTANCE, typePool);
                dispatcher.register(dynamicType, classLoader, protectionDomain, injectionStrategy);
                listener.onTransformation(typeDescription, classLoader, module, loaded, dynamicType);
                return dynamicType.getBytes();
            }

            /**
             * {@inheritDoc}
             */
            public Iterator<Transformer> iterator(TypeDescription typeDescription,
                                                  ClassLoader classLoader,
                                                  JavaModule module,
                                                  Class<?> classBeingRedefined,
                                                  ProtectionDomain protectionDomain) {
                return ignoreMatcher.matches(typeDescription, classLoader, module, classBeingRedefined, protectionDomain)
                        ? Collections.<Transformer>emptySet().iterator()
                        : new Transformation.TransformerIterator(typeDescription, classLoader, module, classBeingRedefined, protectionDomain, transformations);
            }

            /**
             * {@inheritDoc}
             */
            public synchronized boolean reset(Instrumentation instrumentation,
                                              ResettableClassFileTransformer classFileTransformer,
                                              RedefinitionStrategy redefinitionStrategy,
                                              RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy,
                                              RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator,
                                              RedefinitionStrategy.Listener redefinitionListener) {
                if (instrumentation.removeTransformer(classFileTransformer)) {
                    redefinitionStrategy.apply(instrumentation,
                            Listener.NoOp.INSTANCE,
                            CircularityLock.Inactive.INSTANCE,
                            poolStrategy,
                            locationStrategy,
                            redefinitionDiscoveryStrategy,
                            redefinitionBatchAllocator,
                            redefinitionListener,
                            lambdaInstrumentationStrategy,
                            descriptionStrategy,
                            fallbackStrategy,
                            new Transformation.SimpleMatcher(ignoreMatcher, transformations));
                    installationListener.onReset(instrumentation, classFileTransformer);
                    return true;
                } else {
                    return false;
                }
            }

            /* does not implement hashCode and equals in order to align with identity treatment of the JVM */

            /**
             * A factory for creating a {@link ClassFileTransformer} for the current VM.
             */
            protected interface Factory {

                /**
                 * Creates a new class file transformer for the current VM.
                 *
                 * @param byteBuddy                     The Byte Buddy instance to be used.
                 * @param listener                      The listener to notify on transformations.
                 * @param poolStrategy                  The type locator to use.
                 * @param typeStrategy                  The definition handler to use.
                 * @param locationStrategy              The location strategy to use.
                 * @param nativeMethodStrategy          The native method strategy to apply.
                 * @param initializationStrategy        The initialization strategy to use for transformed types.
                 * @param injectionStrategy             The injection strategy to use.
                 * @param lambdaInstrumentationStrategy The lambda instrumentation strategy to use.
                 * @param descriptionStrategy           The description strategy for resolving type descriptions for types.
                 * @param fallbackStrategy              The fallback strategy to use.
                 * @param classFileBufferStrategy       The class file buffer strategy to use.
                 * @param installationListener          The installation listener to notify.
                 * @param ignoreMatcher                 Identifies types that should not be instrumented.
                 * @param transformations               The transformations to apply on non-ignored types.
                 * @param circularityLock               The circularity lock to use.
                 * @return A class file transformer for the current VM that supports the API of the current VM.
                 */
                ResettableClassFileTransformer make(ByteBuddy byteBuddy,
                                                    Listener listener,
                                                    PoolStrategy poolStrategy,
                                                    TypeStrategy typeStrategy,
                                                    LocationStrategy locationStrategy,
                                                    NativeMethodStrategy nativeMethodStrategy,
                                                    InitializationStrategy initializationStrategy,
                                                    InjectionStrategy injectionStrategy,
                                                    LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                                                    DescriptionStrategy descriptionStrategy,
                                                    FallbackStrategy fallbackStrategy,
                                                    ClassFileBufferStrategy classFileBufferStrategy,
                                                    InstallationListener installationListener,
                                                    RawMatcher ignoreMatcher,
                                                    List<Transformation> transformations,
                                                    CircularityLock circularityLock);

                /**
                 * An action to create an implementation of {@link ExecutingTransformer} that support Java 9 modules.
                 */
                enum CreationAction implements PrivilegedAction<Factory> {

                    /**
                     * The singleton instance.
                     */
                    INSTANCE;

                    /**
                     * {@inheritDoc}
                     */
                    @SuppressFBWarnings(value = "REC_CATCH_EXCEPTION", justification = "Exception should not be rethrown but trigger a fallback")
                    public Factory run() {
                        try {
                            return new Factory.ForJava9CapableVm(new ByteBuddy()
                                    .with(TypeValidation.DISABLED)
                                    .subclass(ExecutingTransformer.class)
                                    .name(ExecutingTransformer.class.getName() + "$ByteBuddy$ModuleSupport")
                                    .method(named("transform").and(takesArgument(0, JavaType.MODULE.load())))
                                    .intercept(MethodCall.invoke(ExecutingTransformer.class.getDeclaredMethod("transform",
                                            Object.class,
                                            ClassLoader.class,
                                            String.class,
                                            Class.class,
                                            ProtectionDomain.class,
                                            byte[].class)).onSuper().withAllArguments())
                                    .make()
                                    .load(ExecutingTransformer.class.getClassLoader(),
                                            ClassLoadingStrategy.Default.WRAPPER_PERSISTENT.with(ExecutingTransformer.class.getProtectionDomain()))
                                    .getLoaded()
                                    .getDeclaredConstructor(ByteBuddy.class,
                                            Listener.class,
                                            PoolStrategy.class,
                                            TypeStrategy.class,
                                            LocationStrategy.class,
                                            NativeMethodStrategy.class,
                                            InitializationStrategy.class,
                                            InjectionStrategy.class,
                                            LambdaInstrumentationStrategy.class,
                                            DescriptionStrategy.class,
                                            FallbackStrategy.class,
                                            ClassFileBufferStrategy.class,
                                            InstallationListener.class,
                                            RawMatcher.class,
                                            List.class,
                                            CircularityLock.class));
                        } catch (Exception ignored) {
                            return Factory.ForLegacyVm.INSTANCE;
                        }
                    }
                }

                /**
                 * A factory for a class file transformer on a JVM that supports the {@code java.lang.Module} API to override
                 * the newly added method of the {@link ClassFileTransformer} to capture an instrumented class's module.
                 */
                @HashCodeAndEqualsPlugin.Enhance
                class ForJava9CapableVm implements Factory {

                    /**
                     * A constructor for creating a {@link ClassFileTransformer} that overrides the newly added method for extracting
                     * the {@code java.lang.Module} of an instrumented class.
                     */
                    private final Constructor<? extends ResettableClassFileTransformer> executingTransformer;

                    /**
                     * Creates a class file transformer factory for a Java 9 capable VM.
                     *
                     * @param executingTransformer A constructor for creating a {@link ClassFileTransformer} that overrides the newly added
                     *                             method for extracting the {@code java.lang.Module} of an instrumented class.
                     */
                    protected ForJava9CapableVm(Constructor<? extends ResettableClassFileTransformer> executingTransformer) {
                        this.executingTransformer = executingTransformer;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy,
                                                               Listener listener,
                                                               PoolStrategy poolStrategy,
                                                               TypeStrategy typeStrategy,
                                                               LocationStrategy locationStrategy,
                                                               NativeMethodStrategy nativeMethodStrategy,
                                                               InitializationStrategy initializationStrategy,
                                                               InjectionStrategy injectionStrategy,
                                                               LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                                                               DescriptionStrategy descriptionStrategy,
                                                               FallbackStrategy fallbackStrategy,
                                                               ClassFileBufferStrategy classFileBufferStrategy,
                                                               InstallationListener installationListener,
                                                               RawMatcher ignoreMatcher,
                                                               List<Transformation> transformations,
                                                               CircularityLock circularityLock) {
                        try {
                            return executingTransformer.newInstance(byteBuddy,
                                    listener,
                                    poolStrategy,
                                    typeStrategy,
                                    locationStrategy,
                                    nativeMethodStrategy,
                                    initializationStrategy,
                                    injectionStrategy,
                                    lambdaInstrumentationStrategy,
                                    descriptionStrategy,
                                    fallbackStrategy,
                                    classFileBufferStrategy,
                                    installationListener,
                                    ignoreMatcher,
                                    transformations,
                                    circularityLock);
                        } catch (IllegalAccessException exception) {
                            throw new IllegalStateException("Cannot access " + executingTransformer, exception);
                        } catch (InstantiationException exception) {
                            throw new IllegalStateException("Cannot instantiate " + executingTransformer.getDeclaringClass(), exception);
                        } catch (InvocationTargetException exception) {
                            throw new IllegalStateException("Cannot invoke " + executingTransformer, exception.getCause());
                        }
                    }
                }

                /**
                 * A factory for a {@link ClassFileTransformer} on a VM that does not support the {@code java.lang.Module} API.
                 */
                enum ForLegacyVm implements Factory {

                    /**
                     * The singleton instance.
                     */
                    INSTANCE;

                    /**
                     * {@inheritDoc}
                     */
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy,
                                                               Listener listener,
                                                               PoolStrategy poolStrategy,
                                                               TypeStrategy typeStrategy,
                                                               LocationStrategy locationStrategy,
                                                               NativeMethodStrategy nativeMethodStrategy,
                                                               InitializationStrategy initializationStrategy,
                                                               InjectionStrategy injectionStrategy,
                                                               LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                                                               DescriptionStrategy descriptionStrategy,
                                                               FallbackStrategy fallbackStrategy,
                                                               ClassFileBufferStrategy classFileBufferStrategy,
                                                               InstallationListener installationListener,
                                                               RawMatcher ignoreMatcher,
                                                               List<Transformation> transformations,
                                                               CircularityLock circularityLock) {
                        return new ExecutingTransformer(byteBuddy,
                                listener,
                                poolStrategy,
                                typeStrategy,
                                locationStrategy,
                                nativeMethodStrategy,
                                initializationStrategy,
                                injectionStrategy,
                                lambdaInstrumentationStrategy,
                                descriptionStrategy,
                                fallbackStrategy,
                                classFileBufferStrategy,
                                installationListener,
                                ignoreMatcher,
                                transformations,
                                circularityLock);
                    }
                }
            }

            /**
             * A privileged action for transforming a class on a JVM prior to Java 9.
             */
            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class LegacyVmDispatcher implements PrivilegedAction<byte[]> {

                /**
                 * The type's class loader or {@code null} if the bootstrap class loader is represented.
                 */
                private final ClassLoader classLoader;

                /**
                 * The type's internal name or {@code null} if no such name exists.
                 */
                private final String internalTypeName;

                /**
                 * The class being redefined or {@code null} if no such class exists.
                 */
                private final Class<?> classBeingRedefined;

                /**
                 * The type's protection domain.
                 */
                private final ProtectionDomain protectionDomain;

                /**
                 * The type's binary representation.
                 */
                private final byte[] binaryRepresentation;

                /**
                 * Creates a new type transformation dispatcher.
                 *
                 * @param classLoader          The type's class loader or {@code null} if the bootstrap class loader is represented.
                 * @param internalTypeName     The type's internal name or {@code null} if no such name exists.
                 * @param classBeingRedefined  The class being redefined or {@code null} if no such class exists.
                 * @param protectionDomain     The type's protection domain.
                 * @param binaryRepresentation The type's binary representation.
                 */
                protected LegacyVmDispatcher(ClassLoader classLoader,
                                             String internalTypeName,
                                             Class<?> classBeingRedefined,
                                             ProtectionDomain protectionDomain,
                                             byte[] binaryRepresentation) {
                    this.classLoader = classLoader;
                    this.internalTypeName = internalTypeName;
                    this.classBeingRedefined = classBeingRedefined;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = binaryRepresentation;
                }

                /**
                 * {@inheritDoc}
                 */
                public byte[] run() {
                    return transform(JavaModule.UNSUPPORTED,
                            classLoader,
                            internalTypeName,
                            classBeingRedefined,
                            protectionDomain,
                            binaryRepresentation);
                }
            }

            /**
             * A privileged action for transforming a class on a JVM that supports modules.
             */
            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class Java9CapableVmDispatcher implements PrivilegedAction<byte[]> {

                /**
                 * The type's {@code java.lang.Module}.
                 */
                private final Object rawModule;

                /**
                 * The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                 */
                private final ClassLoader classLoader;

                /**
                 * The type's internal name or {@code null} if no such name exists.
                 */
                private final String internalTypeName;

                /**
                 * The class being redefined or {@code null} if no such class exists.
                 */
                private final Class<?> classBeingRedefined;

                /**
                 * The type's protection domain.
                 */
                private final ProtectionDomain protectionDomain;

                /**
                 * The type's binary representation.
                 */
                private final byte[] binaryRepresentation;


                /**
                 * Creates a new legacy dispatcher.
                 *
                 * @param rawModule            The type's {@code java.lang.Module}.
                 * @param classLoader          The type's class loader or {@code null} if the type is loaded by the bootstrap loader.
                 * @param internalTypeName     The type's internal name or {@code null} if no such name exists.
                 * @param classBeingRedefined  The class being redefined or {@code null} if no such class exists.
                 * @param protectionDomain     The type's protection domain.
                 * @param binaryRepresentation The type's binary representation.
                 */
                protected Java9CapableVmDispatcher(Object rawModule,
                                                   ClassLoader classLoader,
                                                   String internalTypeName,
                                                   Class<?> classBeingRedefined,
                                                   ProtectionDomain protectionDomain,
                                                   byte[] binaryRepresentation) {
                    this.rawModule = rawModule;
                    this.classLoader = classLoader;
                    this.internalTypeName = internalTypeName;
                    this.classBeingRedefined = classBeingRedefined;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = binaryRepresentation;
                }

                /**
                 * {@inheritDoc}
                 */
                public byte[] run() {
                    return transform(JavaModule.of(rawModule),
                            classLoader,
                            internalTypeName,
                            classBeingRedefined,
                            protectionDomain,
                            binaryRepresentation);
                }
            }
        }

        /**
         * An abstract implementation of an agent builder that delegates all invocation to another instance.
         *
         * @param <T> The type that is produced by chaining a matcher.
         */
        protected abstract class Delegator<T extends Matchable<T>> extends Matchable.AbstractBase<T> implements AgentBuilder {

            /**
             * Materializes the currently described {@link net.bytebuddy.agent.builder.AgentBuilder}.
             *
             * @return An agent builder that represents the currently described entry of this instance.
             */
            protected abstract AgentBuilder materialize();

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(ByteBuddy byteBuddy) {
                return materialize().with(byteBuddy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(Listener listener) {
                return materialize().with(listener);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(CircularityLock circularityLock) {
                return materialize().with(circularityLock);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(TypeStrategy typeStrategy) {
                return materialize().with(typeStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(PoolStrategy poolStrategy) {
                return materialize().with(poolStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(LocationStrategy locationStrategy) {
                return materialize().with(locationStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(InitializationStrategy initializationStrategy) {
                return materialize().with(initializationStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
                return materialize().with(redefinitionStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
                return materialize().with(lambdaInstrumentationStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
                return materialize().with(descriptionStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(FallbackStrategy fallbackStrategy) {
                return materialize().with(fallbackStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
                return materialize().with(classFileBufferStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(InstallationListener installationListener) {
                return materialize().with(installationListener);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(InjectionStrategy injectionStrategy) {
                return materialize().with(injectionStrategy);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder with(TransformerDecorator transformerDecorator) {
                return materialize().with(transformerDecorator);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder enableNativeMethodPrefix(String prefix) {
                return materialize().enableNativeMethodPrefix(prefix);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder disableNativeMethodPrefix() {
                return materialize().disableNativeMethodPrefix();
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder disableClassFormatChanges() {
                return materialize().disableClassFormatChanges();
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... type) {
                return materialize().assureReadEdgeTo(instrumentation, type);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... module) {
                return materialize().assureReadEdgeTo(instrumentation, module);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules) {
                return materialize().assureReadEdgeTo(instrumentation, modules);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... type) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, type);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... module) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, module);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> modules) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, modules);
            }

            /**
             * {@inheritDoc}
             */
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher) {
                return materialize().type(typeMatcher);
            }

            /**
             * {@inheritDoc}
             */
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher, ElementMatcher<? super ClassLoader> classLoaderMatcher) {
                return materialize().type(typeMatcher, classLoaderMatcher);
            }

            /**
             * {@inheritDoc}
             */
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> typeMatcher,
                                              ElementMatcher<? super ClassLoader> classLoaderMatcher,
                                              ElementMatcher<? super JavaModule> moduleMatcher) {
                return materialize().type(typeMatcher, classLoaderMatcher, moduleMatcher);
            }


            /**
             * {@inheritDoc}
             */
            public Identified.Narrowable type(RawMatcher matcher) {
                return materialize().type(matcher);
            }

            /**
             * {@inheritDoc}
             */
            public Ignored ignore(ElementMatcher<? super TypeDescription> ignoredTypes) {
                return materialize().ignore(ignoredTypes);
            }

            /**
             * {@inheritDoc}
             */
            public Ignored ignore(ElementMatcher<? super TypeDescription> ignoredTypes, ElementMatcher<? super ClassLoader> ignoredClassLoaders) {
                return materialize().ignore(ignoredTypes, ignoredClassLoaders);
            }

            /**
             * {@inheritDoc}
             */
            public Ignored ignore(ElementMatcher<? super TypeDescription> typeMatcher,
                                  ElementMatcher<? super ClassLoader> classLoaderMatcher,
                                  ElementMatcher<? super JavaModule> moduleMatcher) {
                return materialize().ignore(typeMatcher, classLoaderMatcher, moduleMatcher);
            }

            /**
             * {@inheritDoc}
             */
            public Ignored ignore(RawMatcher rawMatcher) {
                return materialize().ignore(rawMatcher);
            }

            /**
             * {@inheritDoc}
             */
            public ClassFileTransformer makeRaw() {
                return materialize().makeRaw();
            }

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
                return materialize().installOn(instrumentation);
            }

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer installOnByteBuddyAgent() {
                return materialize().installOnByteBuddyAgent();
            }

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer classFileTransformer) {
                return materialize().patchOn(instrumentation, classFileTransformer);
            }

            /**
             * {@inheritDoc}
             */
            public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer classFileTransformer) {
                return materialize().patchOnByteBuddyAgent(classFileTransformer);
            }
        }

        /**
         * A delegator transformer for further precising what types to ignore.
         */
        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Ignoring extends Delegator<Ignored> implements Ignored {

            /**
             * A matcher for identifying types that should not be instrumented.
             */
            private final RawMatcher rawMatcher;

            /**
             * Creates a new agent builder for further specifying what types to ignore.
             *
             * @param rawMatcher A matcher for identifying types that should not be instrumented.
             */
            protected Ignoring(RawMatcher rawMatcher) {
                this.rawMatcher = rawMatcher;
            }

            @Override
            protected AgentBuilder materialize() {
                return new Default(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        rawMatcher,
                        transformations);
            }

            /**
             * {@inheritDoc}
             */
            public Ignored and(RawMatcher rawMatcher) {
                return new Ignoring(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher));
            }

            /**
             * {@inheritDoc}
             */
            public Ignored or(RawMatcher rawMatcher) {
                return new Ignoring(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher));
            }
        }

        /**
         * An implementation of a default agent builder that allows for refinement of the redefinition strategy.
         */
        protected static class Redefining extends Default implements RedefinitionListenable.WithoutBatchStrategy {

            /**
             * Creates a new default agent builder that allows for refinement of the redefinition strategy.
             *
             * @param byteBuddy                        The Byte Buddy instance to be used.
             * @param listener                         The listener to notify on transformations.
             * @param circularityLock                  The circularity lock to use.
             * @param poolStrategy                     The type locator to use.
             * @param typeStrategy                     The definition handler to use.
             * @param locationStrategy                 The location strategy to use.
             * @param nativeMethodStrategy             The native method strategy to apply.
             * @param transformerDecorator             A decorator to wrap the created class file transformer.
             * @param initializationStrategy           The initialization strategy to use for transformed types.
             * @param redefinitionStrategy             The redefinition strategy to apply.
             * @param redefinitionDiscoveryStrategy    The discovery strategy for loaded types to be redefined.
             * @param redefinitionBatchAllocator       The batch allocator for the redefinition strategy to apply.
             * @param redefinitionListener             The redefinition listener for the redefinition strategy to apply.
             * @param redefinitionResubmissionStrategy The resubmission strategy to apply.
             * @param injectionStrategy                The injection strategy to use.
             * @param lambdaInstrumentationStrategy    A strategy to determine of the {@code LambdaMetafactory} should be instrumented to allow for the
             *                                         instrumentation of classes that represent lambda expressions.
             * @param descriptionStrategy              The description strategy for resolving type descriptions for types.
             * @param fallbackStrategy                 The fallback strategy to apply.
             * @param classFileBufferStrategy          The class file buffer strategy to use.
             * @param installationListener             The installation listener to notify.
             * @param ignoreMatcher                    Identifies types that should not be instrumented.
             * @param transformations                  The transformations to apply on non-ignored types.
             */
            protected Redefining(ByteBuddy byteBuddy,
                                 Listener listener,
                                 CircularityLock circularityLock,
                                 PoolStrategy poolStrategy,
                                 TypeStrategy typeStrategy,
                                 LocationStrategy locationStrategy,
                                 NativeMethodStrategy nativeMethodStrategy,
                                 TransformerDecorator transformerDecorator,
                                 InitializationStrategy initializationStrategy,
                                 RedefinitionStrategy redefinitionStrategy,
                                 RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy,
                                 RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator,
                                 RedefinitionStrategy.Listener redefinitionListener,
                                 RedefinitionStrategy.ResubmissionStrategy redefinitionResubmissionStrategy,
                                 InjectionStrategy injectionStrategy,
                                 LambdaInstrumentationStrategy lambdaInstrumentationStrategy,
                                 DescriptionStrategy descriptionStrategy,
                                 FallbackStrategy fallbackStrategy,
                                 ClassFileBufferStrategy classFileBufferStrategy,
                                 InstallationListener installationListener,
                                 RawMatcher ignoreMatcher,
                                 List<Transformation> transformations) {
                super(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        transformations);
            }

            /**
             * {@inheritDoc}
             */
            public WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator) {
                if (!redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition batch allocator when redefinition is disabled");
                }
                return new Redefining(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        transformations);
            }

            /**
             * {@inheritDoc}
             */
            public RedefinitionListenable redefineOnly(Class<?>... type) {
                return with(new RedefinitionStrategy.DiscoveryStrategy.Explicit(type));
            }

            /**
             * {@inheritDoc}
             */
            public RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy) {
                if (!redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition discovery strategy when redefinition is disabled");
                }
                return new Redefining(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        transformations);
            }

            /**
             * {@inheritDoc}
             */
            public RedefinitionListenable with(RedefinitionStrategy.Listener redefinitionListener) {
                if (!redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition listener when redefinition is disabled");
                }
                return new Redefining(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        new RedefinitionStrategy.Listener.Compound(this.redefinitionListener, redefinitionListener),
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        transformations);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler) {
                return withResubmission(resubmissionScheduler, any());
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> matcher) {
                if (!redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot enable redefinition resubmission when redefinition is disabled");
                }
                return new Redefining(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        new RedefinitionStrategy.ResubmissionStrategy.Enabled(resubmissionScheduler, matcher),
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        transformations);
            }
        }

        /**
         * A helper class that describes a {@link net.bytebuddy.agent.builder.AgentBuilder.Default} after supplying
         * a {@link net.bytebuddy.agent.builder.AgentBuilder.RawMatcher} such that one or several
         * {@link net.bytebuddy.agent.builder.AgentBuilder.Transformer}s can be supplied.
         */
        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Transforming extends Delegator<Identified.Narrowable> implements Identified.Extendable, Identified.Narrowable {

            /**
             * The supplied raw matcher.
             */
            private final RawMatcher rawMatcher;

            /**
             * The supplied transformer.
             */
            private final List<Transformer> transformers;

            /**
             * {@code true} if this transformer is a terminal transformation.
             */
            private final boolean terminal;

            /**
             * Creates a new matched default agent builder.
             *
             * @param rawMatcher   The supplied raw matcher.
             * @param transformers The transformers to apply.
             * @param terminal     {@code true} if this transformer is a terminal transformation.
             */
            protected Transforming(RawMatcher rawMatcher, List<Transformer> transformers, boolean terminal) {
                this.rawMatcher = rawMatcher;
                this.transformers = transformers;
                this.terminal = terminal;
            }

            @Override
            protected AgentBuilder materialize() {
                return new Default(byteBuddy,
                        listener,
                        circularityLock,
                        poolStrategy,
                        typeStrategy,
                        locationStrategy,
                        nativeMethodStrategy,
                        transformerDecorator,
                        initializationStrategy,
                        redefinitionStrategy,
                        redefinitionDiscoveryStrategy,
                        redefinitionBatchAllocator,
                        redefinitionListener,
                        redefinitionResubmissionStrategy,
                        injectionStrategy,
                        lambdaInstrumentationStrategy,
                        descriptionStrategy,
                        fallbackStrategy,
                        classFileBufferStrategy,
                        installationListener,
                        ignoreMatcher,
                        CompoundList.of(transformations, new Transformation(rawMatcher, transformers, terminal)));
            }

            /**
             * {@inheritDoc}
             */
            public Identified.Extendable transform(Transformer transformer) {
                return new Transforming(rawMatcher, CompoundList.of(this.transformers, transformer), terminal);
            }

            /**
             * {@inheritDoc}
             */
            public AgentBuilder asTerminalTransformation() {
                return new Transforming(rawMatcher, transformers, true);
            }

            /**
             * {@inheritDoc}
             */
            public Narrowable and(RawMatcher rawMatcher) {
                return new Transforming(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher), transformers, terminal);
            }

            /**
             * {@inheritDoc}
             */
            public Narrowable or(RawMatcher rawMatcher) {
                return new Transforming(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher), transformers, terminal);
            }
        }
    }
}
