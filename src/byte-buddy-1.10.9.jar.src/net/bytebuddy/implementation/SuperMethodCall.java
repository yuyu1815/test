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
package net.bytebuddy.implementation;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;

/**
 * This implementation will create a new method which simply calls its super method. If no such method is defined,
 * an exception will be thrown. Constructors are considered to have a super method if the direct super class defines
 * a constructor with an identical signature. Default methods are invoked as such if they are non-ambiguous. Static
 * methods can have a (pseudo) super method if a type that defines such a method is rebased. Rebased types can also
 * shadow constructors or methods of an actual super class. Besides implementing constructors, this implementation
 * is useful when a method of a super type is not supposed to be altered but should be equipped with additional
 * annotations. Furthermore, this implementation allows to hard code a super method call to be performed after
 * performing another {@link Implementation}.
 */
public enum SuperMethodCall implements Implementation.Composable {

    /**
     * The singleton instance.
     */
    INSTANCE;

    /**
     * {@inheritDoc}
     */
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    /**
     * {@inheritDoc}
     */
    public ByteCodeAppender appender(Target implementationTarget) {
        return new Appender(implementationTarget, Appender.TerminationHandler.RETURNING);
    }

    /**
     * {@inheritDoc}
     */
    public Implementation andThen(Implementation implementation) {
        return new Compound(WithoutReturn.INSTANCE, implementation);
    }

    /**
     * {@inheritDoc}
     */
    public Composable andThen(Composable implementation) {
        return new Compound.Composable(WithoutReturn.INSTANCE, implementation);
    }

    /**
     * A super method invocation where the return value is dropped instead of returning from the method.
     */
    protected enum WithoutReturn implements Implementation {

        /**
         * The singleton instance.
         */
        INSTANCE;

        /**
         * {@inheritDoc}
         */
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        /**
         * {@inheritDoc}
         */
        public ByteCodeAppender appender(Target implementationTarget) {
            return new Appender(implementationTarget, Appender.TerminationHandler.DROPPING);
        }
    }

    /**
     * An appender for implementing a {@link net.bytebuddy.implementation.SuperMethodCall}.
     */
    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {

        /**
         * The target of the current implementation.
         */
        private final Target implementationTarget;

        /**
         * The termination handler to apply after invoking the super method.
         */
        private final TerminationHandler terminationHandler;

        /**
         * Creates a new appender.
         *
         * @param implementationTarget The implementation target of the current type creation.
         * @param terminationHandler   The termination handler to apply after invoking the super method.
         */
        protected Appender(Target implementationTarget, TerminationHandler terminationHandler) {
            this.implementationTarget = implementationTarget;
            this.terminationHandler = terminationHandler;
        }

        /**
         * {@inheritDoc}
         */
        public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext, MethodDescription instrumentedMethod) {
            StackManipulation superMethodCall = implementationTarget
                    .invokeDominant(instrumentedMethod.asSignatureToken())
                    .withCheckedCompatibilityTo(instrumentedMethod.asTypeToken());
            if (!superMethodCall.isValid()) {
                throw new IllegalStateException("Cannot call super (or default) method for " + instrumentedMethod);
            }
            StackManipulation.Size size = new StackManipulation.Compound(
                    MethodVariableAccess.allArgumentsOf(instrumentedMethod).prependThisReference(),
                    superMethodCall,
                    terminationHandler.of(instrumentedMethod)
            ).apply(methodVisitor, implementationContext);
            return new Size(size.getMaximalSize(), instrumentedMethod.getStackSize());
        }

        /**
         * A handler that determines how to handle the method return value.
         */
        protected enum TerminationHandler {

            /**
             * A termination handler that returns the value of the super method invocation.
             */
            RETURNING {
                @Override
                protected StackManipulation of(MethodDescription methodDescription) {
                    return MethodReturn.of(methodDescription.getReturnType());
                }
            },

            /**
             * A termination handler that simply pops the value of the super method invocation off the stack.
             */
            DROPPING {
                @Override
                protected StackManipulation of(MethodDescription methodDescription) {
                    return Removal.of(methodDescription.getReturnType());
                }
            };

            /**
             * Creates a stack manipulation that represents this handler's behavior.
             *
             * @param methodDescription The method for which this handler is supposed to create a stack
             *                          manipulation for.
             * @return The stack manipulation that implements this handler.
             */
            protected abstract StackManipulation of(MethodDescription methodDescription);
        }
    }
}
