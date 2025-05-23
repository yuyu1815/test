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
package net.bytebuddy.description.type;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.build.CachedReturnPlugin;
import net.bytebuddy.description.ByteCodeElement;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.annotation.AnnotationList;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.FilterableList;
import net.bytebuddy.jar.asm.Type;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementations represent a list of type descriptions.
 */
public interface TypeList extends FilterableList<TypeDescription, TypeList> {

    /**
     * Represents that a type list does not contain any values for ASM interoperability which is represented by {@code null}.
     */
    @SuppressFBWarnings(value = {"MS_MUTABLE_ARRAY", "MS_OOI_PKGPROTECT"}, justification = "Value is null")
    String[] NO_INTERFACES = null;

    /**
     * Returns a list of internal names of all types represented by this list.
     *
     * @return An array of all internal names or {@code null} if the list is empty.
     */
    String[] toInternalNames();

    /**
     * Returns the sum of the size of all types contained in this list.
     *
     * @return The sum of the size of all types contained in this list.
     */
    int getStackSize();

    /**
     * An abstract base implementation of a type list.
     */
    abstract class AbstractBase extends FilterableList.AbstractBase<TypeDescription, TypeList> implements TypeList {

        @Override
        protected TypeList wrap(List<TypeDescription> values) {
            return new Explicit(values);
        }

        /**
         * {@inheritDoc}
         */
        public int getStackSize() {
            return StackSize.of(this);
        }

        /**
         * {@inheritDoc}
         */
        public String[] toInternalNames() {
            String[] internalNames = new String[size()];
            int i = 0;
            for (TypeDescription typeDescription : this) {
                internalNames[i++] = typeDescription.getInternalName();
            }
            return internalNames.length == 0
                    ? NO_INTERFACES
                    : internalNames;
        }
    }

    /**
     * Implementation of a type list for an array of loaded types.
     */
    class ForLoadedTypes extends AbstractBase {

        /**
         * The loaded types this type list represents.
         */
        private final List<? extends Class<?>> types;

        /**
         * Creates a new type list for an array of loaded types.
         *
         * @param type The types to be represented by this list.
         */
        public ForLoadedTypes(Class<?>... type) {
            this(Arrays.asList(type));
        }

        /**
         * Creates a new type list for an array of loaded types.
         *
         * @param types The types to be represented by this list.
         */
        public ForLoadedTypes(List<? extends Class<?>> types) {
            this.types = types;
        }

        /**
         * {@inheritDoc}
         */
        public TypeDescription get(int index) {
            return TypeDescription.ForLoadedType.of(types.get(index));
        }

        /**
         * {@inheritDoc}
         */
        public int size() {
            return types.size();
        }

        /**
         * {@inheritDoc}
         */
        public String[] toInternalNames() {
            String[] internalNames = new String[types.size()];
            int i = 0;
            for (Class<?> type : types) {
                internalNames[i++] = Type.getInternalName(type);
            }
            return internalNames.length == 0
                    ? NO_INTERFACES
                    : internalNames;
        }
    }

    /**
     * A wrapper implementation of an explicit list of types.
     */
    class Explicit extends AbstractBase {

        /**
         * The list of type descriptions this list represents.
         */
        private final List<? extends TypeDescription> typeDescriptions;

        /**
         * Creates an immutable wrapper.
         *
         * @param typeDescription The list of types to be represented by this wrapper.
         */
        public Explicit(TypeDescription... typeDescription) {
            this(Arrays.asList(typeDescription));
        }

        /**
         * Creates an immutable wrapper.
         *
         * @param typeDescriptions The list of types to be represented by this wrapper.
         */
        public Explicit(List<? extends TypeDescription> typeDescriptions) {
            this.typeDescriptions = typeDescriptions;
        }

        /**
         * {@inheritDoc}
         */
        public TypeDescription get(int index) {
            return typeDescriptions.get(index);
        }

        /**
         * {@inheritDoc}
         */
        public int size() {
            return typeDescriptions.size();
        }
    }

    /**
     * An implementation of an empty type list.
     */
    class Empty extends FilterableList.Empty<TypeDescription, TypeList> implements TypeList {

        /**
         * {@inheritDoc}
         */
        @SuppressFBWarnings(value = "EI_EXPOSE_REP", justification = "Value is null")
        public String[] toInternalNames() {
            return NO_INTERFACES;
        }

        /**
         * {@inheritDoc}
         */
        public int getStackSize() {
            return 0;
        }
    }

    /**
     * A list containing descriptions of generic types.
     */
    interface Generic extends FilterableList<TypeDescription.Generic, Generic> {

        /**
         * Returns a list of the generic types' erasures.
         *
         * @return A list of the generic types' erasures.
         */
        TypeList asErasures();

        /**
         * Returns a list of the generic types' raw types.
         *
         * @return A list of the generic types' raw types.
         */
        Generic asRawTypes();

        /**
         * Transforms a list of attached type variables into their tokenized form. Calling this method throws an {@link IllegalStateException}
         * if any type in this list does not represent a type variable ({@link net.bytebuddy.description.type.TypeDefinition.Sort#VARIABLE}).
         *
         * @param visitor The visitor to use for detaching the type variable's bounds.
         * @return A list of tokens representing the type variables contained in this list.
         */
        ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> visitor);

        /**
         * Transforms the generic types by applying the supplied visitor to each of them.
         *
         * @param visitor The visitor to apply to each type.
         * @return A list of the types returned by the supplied visitor.
         */
        Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor);

        /**
         * Returns the sum of the size of all types contained in this list.
         *
         * @return The sum of the size of all types contained in this list.
         */
        int getStackSize();

        /**
         * An abstract base implementation of a generic type list.
         */
        abstract class AbstractBase extends FilterableList.AbstractBase<TypeDescription.Generic, Generic> implements Generic {

            @Override
            protected Generic wrap(List<TypeDescription.Generic> values) {
                return new Explicit(values);
            }

            /**
             * {@inheritDoc}
             */
            public Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                List<TypeDescription.Generic> visited = new ArrayList<TypeDescription.Generic>(size());
                for (TypeDescription.Generic typeDescription : this) {
                    visited.add(typeDescription.accept(visitor));
                }
                return new Explicit(visited);
            }

            /**
             * {@inheritDoc}
             */
            public ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> matcher) {
                List<TypeVariableToken> tokens = new ArrayList<TypeVariableToken>(size());
                for (TypeDescription.Generic typeVariable : this) {
                    tokens.add(TypeVariableToken.of(typeVariable, matcher));
                }
                return new ByteCodeElement.Token.TokenList<TypeVariableToken>(tokens);
            }

            /**
             * {@inheritDoc}
             */
            public int getStackSize() {
                int stackSize = 0;
                for (TypeDescription.Generic typeDescription : this) {
                    stackSize += typeDescription.getStackSize().getSize();
                }
                return stackSize;
            }

            /**
             * {@inheritDoc}
             */
            public TypeList asErasures() {
                List<TypeDescription> typeDescriptions = new ArrayList<TypeDescription>(size());
                for (TypeDescription.Generic typeDescription : this) {
                    typeDescriptions.add(typeDescription.asErasure());
                }
                return new TypeList.Explicit(typeDescriptions);
            }

            /**
             * {@inheritDoc}
             */
            public Generic asRawTypes() {
                List<TypeDescription.Generic> typeDescriptions = new ArrayList<TypeDescription.Generic>(size());
                for (TypeDescription.Generic typeDescription : this) {
                    typeDescriptions.add(typeDescription.asRawType());
                }
                return new Explicit(typeDescriptions);
            }
        }

        /**
         * An explicit list of generic types.
         */
        class Explicit extends AbstractBase {

            /**
             * The generic types represented by this list.
             */
            private final List<? extends TypeDefinition> typeDefinitions;

            /**
             * Creates a new explicit list of generic types.
             *
             * @param typeDefinition The generic types represented by this list.
             */
            public Explicit(TypeDefinition... typeDefinition) {
                this(Arrays.asList(typeDefinition));
            }

            /**
             * Creates a new explicit list of generic types.
             *
             * @param typeDefinitions The generic types represented by this list.
             */
            public Explicit(List<? extends TypeDefinition> typeDefinitions) {
                this.typeDefinitions = typeDefinitions;
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return typeDefinitions.get(index).asGenericType();
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return typeDefinitions.size();
            }
        }

        /**
         * A list of loaded generic types.
         */
        class ForLoadedTypes extends AbstractBase {

            /**
             * The loaded types this list represents.
             */
            private final List<? extends java.lang.reflect.Type> types;

            /**
             * Creates a list of loaded generic types.
             *
             * @param type The loaded types this list represents.
             */
            public ForLoadedTypes(java.lang.reflect.Type... type) {
                this(Arrays.asList(type));
            }

            /**
             * Creates a list of loaded generic types.
             *
             * @param types The loaded types this list represents.
             */
            public ForLoadedTypes(List<? extends java.lang.reflect.Type> types) {
                this.types = types;
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return TypeDefinition.Sort.describe(types.get(index));
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return types.size();
            }

            /**
             * A type list that represents loaded type variables.
             */
            public static class OfTypeVariables extends Generic.AbstractBase {

                /**
                 * The type variables this list represents.
                 */
                private final List<TypeVariable<?>> typeVariables;

                /**
                 * Creates a new type list for loaded type variables.
                 *
                 * @param typeVariable The type variables this list represents.
                 */
                protected OfTypeVariables(TypeVariable<?>... typeVariable) {
                    this(Arrays.asList(typeVariable));
                }

                /**
                 * Creates a new type list for loaded type variables.
                 *
                 * @param typeVariables The type variables this list represents.
                 */
                protected OfTypeVariables(List<TypeVariable<?>> typeVariables) {
                    this.typeVariables = typeVariables;
                }

                /**
                 * Creates a list of the type variables of the supplied generic declaration.
                 *
                 * @param genericDeclaration The generic declaration to represent.
                 * @return A generic type list for the returned generic declaration.
                 */
                public static Generic of(GenericDeclaration genericDeclaration) {
                    return new OfTypeVariables(genericDeclaration.getTypeParameters());
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription.Generic get(int index) {
                    TypeVariable<?> typeVariable = typeVariables.get(index);
                    return TypeDefinition.Sort.describe(typeVariable, TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveTypeVariable(typeVariable));
                }

                /**
                 * {@inheritDoc}
                 */
                public int size() {
                    return typeVariables.size();
                }
            }
        }

        /**
         * A list of detached types that are attached on reception.
         */
        class ForDetachedTypes extends AbstractBase {

            /**
             * The detached types this list represents.
             */
            private final List<? extends TypeDescription.Generic> detachedTypes;

            /**
             * The visitor to use for attaching the detached types.
             */
            private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

            /**
             * Creates a list of detached types that are attached on reception.
             *
             * @param detachedTypes The detached types this list represents.
             * @param visitor       The visitor to use for attaching the detached types.
             */
            public ForDetachedTypes(List<? extends TypeDescription.Generic> detachedTypes,
                                    TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                this.detachedTypes = detachedTypes;
                this.visitor = visitor;
            }

            /**
             * Creates a list of type variables that are attached to the provided type.
             *
             * @param typeDescription       The type to which the type variables are to be attached to.
             * @param detachedTypeVariables A mapping of type variable symbols to their detached type variable bounds.
             * @return A type list representing the symbolic type variables in their attached state to the given type description.
             */
            public static Generic attachVariables(TypeDescription typeDescription, List<? extends TypeVariableToken> detachedTypeVariables) {
                return new OfTypeVariables(typeDescription, detachedTypeVariables, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(typeDescription));
            }

            /**
             * Creates a list of types that are attached to the provided field.
             *
             * @param fieldDescription The field to which the detached variables are attached to.
             * @param detachedTypes    The detached types.
             * @return A type list representing the detached types being attached to the provided field description.
             */
            public static Generic attach(FieldDescription fieldDescription, List<? extends TypeDescription.Generic> detachedTypes) {
                return new ForDetachedTypes(detachedTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(fieldDescription));
            }

            /**
             * Creates a list of types that are attached to the provided method.
             *
             * @param methodDescription The method to which the detached variables are attached to.
             * @param detachedTypes     The detached types.
             * @return A type list representing the detached types being attached to the provided method description.
             */
            public static Generic attach(MethodDescription methodDescription, List<? extends TypeDescription.Generic> detachedTypes) {
                return new ForDetachedTypes(detachedTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(methodDescription));
            }

            /**
             * Creates a list of type variables that are attached to the provided method.
             *
             * @param methodDescription     The method to which the type variables are to be attached to.
             * @param detachedTypeVariables A mapping of type variable symbols to their detached type variable bounds.
             * @return A type list representing the symbolic type variables in their attached state to the given method description.
             */
            public static Generic attachVariables(MethodDescription methodDescription, List<? extends TypeVariableToken> detachedTypeVariables) {
                return new OfTypeVariables(methodDescription, detachedTypeVariables, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(methodDescription));
            }

            /**
             * Creates a list of types that are attached to the provided parameter.
             *
             * @param parameterDescription The parameter to which the detached variables are attached to.
             * @param detachedTypes        The detached types.
             * @return A type list representing the detached types being attached to the provided parameter description.
             */
            public static Generic attach(ParameterDescription parameterDescription, List<? extends TypeDescription.Generic> detachedTypes) {
                return new ForDetachedTypes(detachedTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(parameterDescription));
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return detachedTypes.get(index).accept(visitor);
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return detachedTypes.size();
            }

            /**
             * A list of detached types that are attached on reception but not when computing an erasure.
             */
            public static class WithResolvedErasure extends Generic.AbstractBase {

                /**
                 * The detached types this list represents.
                 */
                private final List<? extends TypeDescription.Generic> detachedTypes;

                /**
                 * The visitor to use for attaching the detached types.
                 */
                private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                /**
                 * Creates a list of generic type descriptions that are resolved lazily, i.e. type variables are not resolved
                 * when computing an erasure.
                 *
                 * @param detachedTypes The detached types this list represents.
                 * @param visitor       The visitor to use for attaching the detached types.
                 */
                public WithResolvedErasure(List<? extends TypeDescription.Generic> detachedTypes,
                                           TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                    this.detachedTypes = detachedTypes;
                    this.visitor = visitor;
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription.Generic get(int index) {
                    return new TypeDescription.Generic.LazyProjection.WithResolvedErasure(detachedTypes.get(index), visitor);
                }

                /**
                 * {@inheritDoc}
                 */
                public int size() {
                    return detachedTypes.size();
                }
            }

            /**
             * A list of attached type variables represented by a list of type variable tokens.
             */
            public static class OfTypeVariables extends Generic.AbstractBase {

                /**
                 * The type variable's source.
                 */
                private final TypeVariableSource typeVariableSource;

                /**
                 * A token representing the type variable in its detached state.
                 */
                private final List<? extends TypeVariableToken> detachedTypeVariables;

                /**
                 * A visitor for attaching the type variable's bounds.
                 */
                private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                /**
                 * Creates a new list of attached type variables representing a list of type variable tokens.
                 *
                 * @param typeVariableSource    The type variable's source.
                 * @param detachedTypeVariables A token representing the type variable in its detached state.
                 * @param visitor               A visitor for attaching the type variable's bounds.
                 */
                public OfTypeVariables(TypeVariableSource typeVariableSource,
                                       List<? extends TypeVariableToken> detachedTypeVariables,
                                       TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                    this.typeVariableSource = typeVariableSource;
                    this.detachedTypeVariables = detachedTypeVariables;
                    this.visitor = visitor;
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription.Generic get(int index) {
                    return new AttachedTypeVariable(typeVariableSource, detachedTypeVariables.get(index), visitor);
                }

                /**
                 * {@inheritDoc}
                 */
                public int size() {
                    return detachedTypeVariables.size();
                }

                /**
                 * A wrapper for representing a type variable in its attached state.
                 */
                protected static class AttachedTypeVariable extends TypeDescription.Generic.OfTypeVariable {

                    /**
                     * The type variable's source.
                     */
                    private final TypeVariableSource typeVariableSource;

                    /**
                     * A token representing the type variable in its detached state.
                     */
                    private final TypeVariableToken typeVariableToken;

                    /**
                     * A visitor for attaching the type variable's bounds.
                     */
                    private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                    /**
                     * Creates a new attached type variable.
                     *
                     * @param typeVariableSource The type variable's source.
                     * @param typeVariableToken  A token representing the type variable in its detached state.
                     * @param visitor            A visitor for attaching the type variable's bounds.
                     */
                    protected AttachedTypeVariable(TypeVariableSource typeVariableSource,
                                                   TypeVariableToken typeVariableToken,
                                                   TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                        this.typeVariableSource = typeVariableSource;
                        this.typeVariableToken = typeVariableToken;
                        this.visitor = visitor;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public Generic getUpperBounds() {
                        return typeVariableToken.getBounds().accept(visitor);
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public TypeVariableSource getTypeVariableSource() {
                        return typeVariableSource;
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public String getSymbol() {
                        return typeVariableToken.getSymbol();
                    }

                    /**
                     * {@inheritDoc}
                     */
                    public AnnotationList getDeclaredAnnotations() {
                        return typeVariableToken.getAnnotations();
                    }
                }
            }
        }

        /**
         * A lazy projection of a type's generic interface types.
         */
        class OfLoadedInterfaceTypes extends AbstractBase {

            /**
             * The type of which the interface types are represented by this list.
             */
            private final Class<?> type;

            /**
             * Creates a lazy projection of interface types.
             *
             * @param type The type of which the interface types are represented by this list.
             */
            public OfLoadedInterfaceTypes(Class<?> type) {
                this.type = type;
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return new OfLoadedInterfaceTypes.TypeProjection(type, index, type.getInterfaces());
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return type.getInterfaces().length;
            }

            /**
             * {@inheritDoc}
             */
            public TypeList asErasures() {
                return new TypeList.ForLoadedTypes(type.getInterfaces());
            }

            /**
             * A type projection of an interface type.
             */
            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement {

                /**
                 * The type of which an interface type is represented.
                 */
                private final Class<?> type;

                /**
                 * The index of the generic interface type that is represented.
                 */
                private final int index;

                /**
                 * The erasures of the represented type's interface types.
                 */
                private final Class<?>[] erasure;

                /**
                 * Creates a new lazy type projection of a generic interface type.
                 *
                 * @param type    The type of which an interface type is represented.
                 * @param index   The index of the generic interface type that is represented.
                 * @param erasure The erasures of the represented type's interface types.
                 */
                private TypeProjection(Class<?> type, int index, Class<?>[] erasure) {
                    this.type = type;
                    this.index = index;
                    this.erasure = erasure;
                }

                @Override
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    java.lang.reflect.Type[] type = this.type.getGenericInterfaces();
                    return erasure.length == type.length
                            ? Sort.describe(type[index], getAnnotationReader())
                            : asRawType();
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(erasure[index]);
                }

                @Override
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveInterfaceType(type, index);
                }
            }
        }

        /**
         * A lazy projection of a constructor's exception types.
         */
        class OfConstructorExceptionTypes extends AbstractBase {

            /**
             * The constructor of which the exception types are represented.
             */
            private final Constructor<?> constructor;

            /**
             * Creates a new lazy projection of a constructor's exception types.
             *
             * @param constructor The constructor of which the exception types are represented.
             */
            public OfConstructorExceptionTypes(Constructor<?> constructor) {
                this.constructor = constructor;
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return new OfConstructorExceptionTypes.TypeProjection(constructor, index, constructor.getExceptionTypes());
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return constructor.getExceptionTypes().length;
            }

            /**
             * {@inheritDoc}
             */
            public TypeList asErasures() {
                return new TypeList.ForLoadedTypes(constructor.getExceptionTypes());
            }

            /**
             * A projection of a specific exception type.
             */
            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {

                /**
                 * The constructor of which the exception types are represented.
                 */
                private final Constructor<?> constructor;

                /**
                 * The index of the exception type.
                 */
                private final int index;

                /**
                 * The erasures of the represented constructor's exception types.
                 */
                private final Class<?>[] erasure;

                /**
                 * Creates a lazy type projection of a constructor's exception type.
                 *
                 * @param constructor The constructor of which the exception types are represented.
                 * @param index       The index of the exception type.
                 * @param erasure     The erasures of the represented constructor's exception types.
                 */
                private TypeProjection(Constructor<?> constructor, int index, Class<?>[] erasure) {
                    this.constructor = constructor;
                    this.index = index;
                    this.erasure = erasure;
                }

                @Override
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    java.lang.reflect.Type[] type = constructor.getGenericExceptionTypes();
                    return erasure.length == type.length
                            ? Sort.describe(type[index], getAnnotationReader())
                            : asRawType();
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(erasure[index]);
                }

                @Override
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveExceptionType(constructor, index);
                }
            }
        }

        /**
         * A lazy projection of a method's exception types.
         */
        class OfMethodExceptionTypes extends AbstractBase {

            /**
             * The method of which the exception types are represented.
             */
            private final Method method;

            /**
             * Creates a new lazy projection of a constructor's exception types.
             *
             * @param method The method of which the exception types are represented.
             */
            public OfMethodExceptionTypes(Method method) {
                this.method = method;
            }

            /**
             * {@inheritDoc}
             */
            public TypeDescription.Generic get(int index) {
                return new OfMethodExceptionTypes.TypeProjection(method, index, method.getExceptionTypes());
            }

            /**
             * {@inheritDoc}
             */
            public int size() {
                return method.getExceptionTypes().length;
            }

            /**
             * {@inheritDoc}
             */
            public TypeList asErasures() {
                return new TypeList.ForLoadedTypes(method.getExceptionTypes());
            }

            /**
             * A projection of a specific exception type.
             */
            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {

                /**
                 * The method of which the exception types are represented.
                 */
                private final Method method;

                /**
                 * The index of the exception type.
                 */
                private final int index;

                /**
                 * The erasures of the represented type's interface type.
                 */
                private final Class<?>[] erasure;

                /**
                 * Creates a lazy type projection of a constructor's exception type.
                 *
                 * @param method  The method of which the exception types are represented.
                 * @param index   The index of the exception type.
                 * @param erasure The erasures of the represented type's interface type.
                 */
                public TypeProjection(Method method, int index, Class<?>[] erasure) {
                    this.method = method;
                    this.index = index;
                    this.erasure = erasure;
                }

                @Override
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    java.lang.reflect.Type[] type = method.getGenericExceptionTypes();
                    return erasure.length == type.length
                            ? Sort.describe(type[index], getAnnotationReader())
                            : asRawType();
                }

                /**
                 * {@inheritDoc}
                 */
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(erasure[index]);
                }

                @Override
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveExceptionType(method, index);
                }
            }
        }

        /**
         * An empty list of generic types.
         */
        class Empty extends FilterableList.Empty<TypeDescription.Generic, Generic> implements Generic {

            /**
             * {@inheritDoc}
             */
            public TypeList asErasures() {
                return new TypeList.Empty();
            }

            /**
             * {@inheritDoc}
             */
            public Generic asRawTypes() {
                return this;
            }

            /**
             * {@inheritDoc}
             */
            public Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                return new Generic.Empty();
            }

            /**
             * {@inheritDoc}
             */
            public ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> matcher) {
                return new ByteCodeElement.Token.TokenList<TypeVariableToken>();
            }

            /**
             * {@inheritDoc}
             */
            public int getStackSize() {
                return 0;
            }
        }
    }
}
