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

import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.MethodVisitor;

import java.lang.reflect.Field;

/**
 * Represents a {@link Field} constant for a given type.
 */
public class FieldConstant implements StackManipulation {

    /**
     * The field to be represent as a {@link Field}.
     */
    private final FieldDescription.InDefinedShape fieldDescription;

    /**
     * Creates a new field constant.
     *
     * @param fieldDescription The field to be represent as a {@link Field}.
     */
    public FieldConstant(FieldDescription.InDefinedShape fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    /**
     * Returns a cached version of this field constant.
     *
     * @return A cached version of this field constant.
     */
    public StackManipulation cached() {
        return new Cached(this);
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
        try {
            return new Compound(
                    ClassConstant.of(fieldDescription.getDeclaringType()),
                    new TextConstant(fieldDescription.getInternalName()),
                    MethodInvocation.invoke(new MethodDescription.ForLoadedMethod(Class.class.getMethod("getDeclaredField", String.class)))
            ).apply(methodVisitor, implementationContext);
        } catch (NoSuchMethodException exception) {
            throw new IllegalStateException("Cannot locate Class::getDeclaredField", exception);
        }
    }

    @Override
    public int hashCode() {
        return fieldDescription.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null || getClass() != other.getClass()) {
            return false;
        }
        FieldConstant fieldConstant = (FieldConstant) other;
        return fieldDescription.equals(fieldConstant.fieldDescription);
    }

    /**
     * A cached version of a {@link FieldConstant}.
     */
    protected static class Cached implements StackManipulation {

        /**
         * The field constant stack manipulation.
         */
        private final StackManipulation fieldConstant;

        /**
         * Creates a new cached version of a field constant.
         *
         * @param fieldConstant The field constant stack manipulation.
         */
        public Cached(StackManipulation fieldConstant) {
            this.fieldConstant = fieldConstant;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isValid() {
            return fieldConstant.isValid();
        }

        /**
         * {@inheritDoc}
         */
        public Size apply(MethodVisitor methodVisitor, Implementation.Context implementationContext) {
            return FieldAccess.forField(implementationContext.cache(fieldConstant, TypeDescription.ForLoadedType.of(Field.class)))
                    .read()
                    .apply(methodVisitor, implementationContext);
        }

        @Override
        public int hashCode() {
            return fieldConstant.hashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            } else if (other == null || getClass() != other.getClass()) {
                return false;
            }
            Cached cached = (Cached) other;
            return fieldConstant.equals(cached.fieldConstant);
        }
    }
}
