/**
 * Copyright 2016 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A name/value property within a Swagger extension
 *
 * @see Extension
 * @since 1.5.0
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExtensionProperty {

    /**
     * The name of the property.
     *
     * @return the name of the property
     */
    String name();

    /**
     * The value of the property.
     *
     * @return the value of the property
     */
    String value();

    /**
     * If set to true, field `value` will be parsed and serialized as JSON/YAML
     *
     * @return the value of `parseValue` annotation field
     */
    boolean parseValue() default false;
}

