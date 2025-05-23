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
package net.bytebuddy.dynamic.scaffold.inline;

import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.jar.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * An implementation target for redefining a given type while preserving the original methods within the
 * instrumented type.
 * <p>&nbsp;</p>
 * Super method calls are merely emulated by this {@link Implementation.Target} in order
 * to preserve Java's super call semantics a user would expect when invoking a {@code super}-prefixed method. This
 * means that original methods are either moved to renamed {@code private} methods which are never dispatched
 * virtually or they are invoked directly via the {@code INVOKESPECIAL} invocation to explicitly forbid a virtual
 * dispatch.
 */
@HashCodeAndEqualsPlugin.Enhance
public class RebaseImplementationTarget extends Implementation.Target.AbstractBase {

    /**
     * A mapping of the instrumented type's declared methods by each method's token.
     */
    private final Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> rebaseableMethods;

    /**
     * Creates a rebase implementation target.
     *
     * @param instrumentedType        The instrumented type.
     * @param methodGraph             A method graph of the instrumented type.
     * @param defaultMethodInvocation The default method invocation mode to apply.
     * @param rebaseableMethods       A mapping of the instrumented type's declared methods by each method's token.
     */
    protected RebaseImplementationTarget(TypeDescription instrumentedType,
                                         MethodGraph.Linked methodGraph,
                                         DefaultMethodInvocation defaultMethodInvocation,
                                         Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> rebaseableMethods) {
        super(instrumentedType, methodGraph, defaultMethodInvocation);
        this.rebaseableMethods = rebaseableMethods;
    }

    /**
     * Creates a new rebase implementation target.
     *
     * @param instrumentedType     The instrumented type.
     * @param methodGraph          A method graph of the instrumented type.
     * @param classFileVersion     The type's class file version.
     * @param methodRebaseResolver A method rebase resolver to be used when calling a rebased method.
     * @return An implementation target for the given input.
     */
    protected static Implementation.Target of(TypeDescription instrumentedType,
                                              MethodGraph.Linked methodGraph,
                                              ClassFileVersion classFileVersion,
                                              MethodRebaseResolver methodRebaseResolver) {
        return new RebaseImplementationTarget(instrumentedType, methodGraph, DefaultMethodInvocation.of(classFileVersion), methodRebaseResolver.asTokenMap());
    }

    /**
     * {@inheritDoc}
     */
    public Implementation.SpecialMethodInvocation invokeSuper(MethodDescription.SignatureToken token) {
        MethodRebaseResolver.Resolution resolution = rebaseableMethods.get(token);
        return resolution == null
                ? invokeSuper(methodGraph.getSuperClassGraph().locate(token))
                : invokeSuper(resolution);
    }

    /**
     * Creates a special method invocation for the given node.
     *
     * @param node The node for which a special method invocation is to be created.
     * @return A special method invocation for the provided node.
     */
    private Implementation.SpecialMethodInvocation invokeSuper(MethodGraph.Node node) {
        return node.getSort().isResolved()
                ? Implementation.SpecialMethodInvocation.Simple.of(node.getRepresentative(), instrumentedType.getSuperClass().asErasure())
                : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
    }

    /**
     * Creates a special method invocation for the given rebase resolution.
     *
     * @param resolution The resolution for which a special method invocation is to be created.
     * @return A special method invocation for the provided resolution.
     */
    private Implementation.SpecialMethodInvocation invokeSuper(MethodRebaseResolver.Resolution resolution) {
        return resolution.isRebased()
                ? RebasedMethodInvocation.of(resolution.getResolvedMethod(), instrumentedType, resolution.getPrependedParameters())
                : Implementation.SpecialMethodInvocation.Simple.of(resolution.getResolvedMethod(), instrumentedType);
    }

    /**
     * {@inheritDoc}
     */
    public TypeDescription getOriginType() {
        return instrumentedType;
    }

    /**
     * A {@link Implementation.SpecialMethodInvocation} which invokes a rebased method
     * as given by a {@link MethodRebaseResolver}.
     */
    protected static class RebasedMethodInvocation extends Implementation.SpecialMethodInvocation.AbstractBase {

        /**
         * The method to invoke via a special method invocation.
         */
        private final MethodDescription methodDescription;

        /**
         * The instrumented type on which the method should be invoked on.
         */
        private final TypeDescription instrumentedType;

        /**
         * The stack manipulation to execute in order to invoke the rebased method.
         */
        private final StackManipulation stackManipulation;

        /**
         * Any additional arguments that are to be provided to the rebased method.
         */
        private final TypeList prependedParameters;

        /**
         * Creates a new rebased method invocation.
         *
         * @param methodDescription   The method to invoke via a special method invocation.
         * @param instrumentedType    The instrumented type on which the method should be invoked on.
         * @param stackManipulation   The stack manipulation to execute in order to invoke the rebased method.
         * @param prependedParameters Any additional arguments that are to be provided to the rebased method.
         */
        protected RebasedMethodInvocation(MethodDescription methodDescription,
                                          TypeDescription instrumentedType,
                                          StackManipulation stackManipulation,
                                          TypeList prependedParameters) {
            this.methodDescription = methodDescription;
            this.instrumentedType = instrumentedType;
            this.stackManipulation = stackManipulation;
            this.prependedParameters = prependedParameters;
        }

        /**
         * Creates a special method invocation for the given method.
         *
         * @param resolvedMethod      The rebased method to be invoked.
         * @param instrumentedType    The instrumented type on which the method is to be invoked if it is non-static.
         * @param prependedParameters Any additional arguments that are to be provided to the rebased method.
         * @return A special method invocation of the rebased method.
         */
        protected static Implementation.SpecialMethodInvocation of(MethodDescription resolvedMethod, TypeDescription instrumentedType, TypeList prependedParameters) {
            StackManipulation stackManipulation = resolvedMethod.isStatic()
                    ? MethodInvocation.invoke(resolvedMethod)
                    : MethodInvocation.invoke(resolvedMethod).special(instrumentedType);
            if (stackManipulation.isValid()) {
                List<StackManipulation> stackManipulations = new ArrayList<StackManipulation>(prependedParameters.size() + 1);
                for (TypeDescription prependedParameter : prependedParameters) {
                    stackManipulations.add(DefaultValue.of(prependedParameter));
                }
                stackManipulations.add(stackManipulation);
                return new RebasedMethodInvocation(resolvedMethod, instrumentedType, new Compound(stackManipulations), prependedParameters);
            } else {
                return Illegal.INSTANCE;
            }
        }

        /**
         * {@inheritDoc}
         */
        public MethodDescription getMethodDescription() {
            return methodDescription;
        }

        /**
         * {@inheritDoc}
         */
        public TypeDescription getTypeDescription() {
            return instrumentedType;
        }

        /**
         * {@inheritDoc}
         */
        public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext) {
            return stackManipulation.apply(methodVisitor, implementationContext);
        }

        /**
         * {@inheritDoc}
         */
        public Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(MethodDescription.TypeToken token) {
            if (methodDescription.asTypeToken().equals(new MethodDescription.TypeToken(token.getReturnType(),
                    CompoundList.of(token.getParameterTypes(), prependedParameters)))) {
                return this;
            } else {
                return Illegal.INSTANCE;
            }
        }
    }

    /**
     * A factory for creating a {@link RebaseImplementationTarget}.
     */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Factory implements Implementation.Target.Factory {

        /**
         * The method rebase resolver to use.
         */
        private final MethodRebaseResolver methodRebaseResolver;

        /**
         * Creates a new factory for a rebase implementation target.
         *
         * @param methodRebaseResolver The method rebase resolver to use.
         */
        public Factory(MethodRebaseResolver methodRebaseResolver) {
            this.methodRebaseResolver = methodRebaseResolver;
        }

        /**
         * {@inheritDoc}
         */
        public Implementation.Target make(TypeDescription instrumentedType, MethodGraph.Linked methodGraph, ClassFileVersion classFileVersion) {
            return RebaseImplementationTarget.of(instrumentedType, methodGraph, classFileVersion, methodRebaseResolver);
        }
    }
}
