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
package net.bytebuddy.dynamic.scaffold;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.jar.asm.ClassReader;
import net.bytebuddy.jar.asm.ClassWriter;

/**
 * A class writer strategy is responsible for the creation of a {@link ClassWriter} when creating a type.
 */
public interface ClassWriterStrategy {

    /**
     * Resolves a class writer.
     *
     * @param flags    The flags to set.
     * @param typePool A type pool for locating types.
     * @return The class writer to use.
     */
    ClassWriter resolve(int flags, TypePool typePool);

    /**
     * Resolves a class writer.
     *
     * @param flags       The flags to set.
     * @param typePool    A type pool for locating types.
     * @param classReader The class reader from which the original class is read.
     * @return The class writer to use.
     */
    ClassWriter resolve(int flags, TypePool typePool, ClassReader classReader);

    /**
     * Default implementations of class writer strategies.
     */
    enum Default implements ClassWriterStrategy {

        /**
         * A class writer strategy that retains the original class's constant pool if applicable.
         */
        CONSTANT_POOL_RETAINING {
            /** {@inheritDoc} */
            public ClassWriter resolve(int flags, TypePool typePool, ClassReader classReader) {
                return new FrameComputingClassWriter(classReader, flags, typePool);
            }
        },

        /**
         * A class writer strategy that discards the original class's constant pool if applicable.
         */
        CONSTANT_POOL_DISCARDING {
            /** {@inheritDoc} */
            public ClassWriter resolve(int flags, TypePool typePool, ClassReader classReader) {
                return resolve(flags, typePool);
            }
        };

        /**
         * {@inheritDoc}
         */
        public ClassWriter resolve(int flags, TypePool typePool) {
            return new FrameComputingClassWriter(flags, typePool);
        }
    }

    /**
     * A class writer that piggy-backs on Byte Buddy's {@link TypePool} to avoid class loading or look-up errors when redefining a class.
     * This is not available when creating a new class where automatic frame computation is however not normally a requirement.
     */
    class FrameComputingClassWriter extends ClassWriter {

        /**
         * The type pool to use for computing stack map frames, if required.
         */
        private final TypePool typePool;

        /**
         * Creates a new frame computing class writer.
         *
         * @param flags    The flags to be handed to the writer.
         * @param typePool The type pool to use for computing stack map frames, if required.
         */
        public FrameComputingClassWriter(int flags, TypePool typePool) {
            super(flags);
            this.typePool = typePool;
        }

        /**
         * Creates a new frame computing class writer.
         *
         * @param classReader The class reader from which the original class is read.
         * @param flags       The flags to be handed to the writer.
         * @param typePool    The type pool to use for computing stack map frames, if required.
         */
        public FrameComputingClassWriter(ClassReader classReader, int flags, TypePool typePool) {
            super(classReader, flags);
            this.typePool = typePool;
        }

        /**
         * {@inheritDoc}
         */
        protected String getCommonSuperClass(String leftTypeName, String rightTypeName) {
            TypeDescription leftType = typePool.describe(leftTypeName.replace('/', '.')).resolve();
            TypeDescription rightType = typePool.describe(rightTypeName.replace('/', '.')).resolve();
            if (leftType.isAssignableFrom(rightType)) {
                return leftType.getInternalName();
            } else if (leftType.isAssignableTo(rightType)) {
                return rightType.getInternalName();
            } else if (leftType.isInterface() || rightType.isInterface()) {
                return TypeDescription.OBJECT.getInternalName();
            } else {
                do {
                    leftType = leftType.getSuperClass().asErasure();
                } while (!leftType.isAssignableFrom(rightType));
                return leftType.getInternalName();
            }
        }
    }
}
