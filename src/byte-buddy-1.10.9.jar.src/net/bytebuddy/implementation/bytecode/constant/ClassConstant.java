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
package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.Type;

/**
 * Represents a constant representing any loaded Java {@link java.lang.Class}.
 */
public enum ClassConstant implements StackManipulation {

    /**
     * The {@code void} type.
     */
    VOID(Void.class),

    /**
     * The {@code boolean} type.
     */
    BOOLEAN(Boolean.class),

    /**
     * The {@code byte} type.
     */
    BYTE(Byte.class),

    /**
     * The {@code short} type.
     */
    SHORT(Short.class),

    /**
     * The {@code char} type.
     */
    CHARACTER(Character.class),

    /**
     * The {@code int} type.
     */
    INTEGER(Integer.class),

    /**
     * The {@code long} type.
     */
    LONG(Long.class),

    /**
     * The {@code float} type.
     */
    FLOAT(Float.class),

    /**
     * The {@code double} type.
     */
    DOUBLE(Double.class);

    /**
     * The size of a {@link java.lang.Class} on the operand stack.
     */
    private static final Size SIZE = StackSize.SINGLE.toIncreasingSize();

    /**
     * The field name that stores a reference to the primitive type representation.
     */
    private static final String PRIMITIVE_TYPE_FIELD = "TYPE";

    /**
     * The descriptor of the {@link java.lang.Class} type.
     */
    private static final String CLASS_TYPE_INTERNAL_NAME = "Ljava/lang/Class;";

    /**
     * The internal name of the type owning the field.
     */
    private final String fieldOwnerInternalName;

    /**
     * Creates a new class constant for a primitive type.
     *
     * @param type The primitive type to represent.
     */
    ClassConstant(Class<?> type) {
        fieldOwnerInternalName = Type.getInternalName(type);
    }

    /**
     * Returns a stack manipulation that loads a {@link java.lang.Class} type onto the operand stack which
     * represents the given type.
     *
     * @param typeDescription The type to load onto the operand stack.
     * @return The corresponding stack manipulation.
     */
    public static StackManipulation of(TypeDescription typeDescription) {
        if (!typeDescription.isPrimitive()) {
            return new ForReferenceType(typeDescription);
        } else if (typeDescription.represents(boolean.class)) {
            return BOOLEAN;
        } else if (typeDescription.represents(byte.class)) {
            return BYTE;
        } else if (typeDescription.represents(short.class)) {
            return SHORT;
        } else if (typeDescription.represents(char.class)) {
            return CHARACTER;
        } else if (typeDescription.represents(int.class)) {
            return INTEGER;
        } else if (typeDescription.represents(long.class)) {
            return LONG;
        } else if (typeDescription.represents(float.class)) {
            return FLOAT;
        } else if (typeDescription.represents(double.class)) {
            return DOUBLE;
        } else {
            return VOID;
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isValid() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, fieldOwnerInternalName, PRIMITIVE_TYPE_FIELD, CLASS_TYPE_INTERNAL_NAME);
        return SIZE;
    }

    /**
     * A class constant for a non-primitive {@link java.lang.Class}.
     */
    @HashCodeAndEqualsPlugin.Enhance
    protected static class ForReferenceType implements StackManipulation {

        /**
         * The type which should be loaded onto the operand stack as a class value.
         */
        private final TypeDescription typeDescription;

        /**
         * Creates a stack manipulation that represents loading a class constant onto the stack.
         *
         * @param typeDescription A description of the class to load onto the stack.
         */
        protected ForReferenceType(TypeDescription typeDescription) {
            this.typeDescription = typeDescription;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isValid() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext) {
            if (implementationContext.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V5) && typeDescription.isVisibleTo(implementationContext.getInstrumentedType())) {
                methodVisitor.visitLdcInsn(Type.getType(typeDescription.getDescriptor()));
            } else {
                methodVisitor.visitLdcInsn(typeDescription.getName());
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            }
            return SIZE;
        }
    }
}
