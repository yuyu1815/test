/*
 * Copyright (c) 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.networknt.schema;

/**
 * Factory for {@link JsonMetaSchema}.
 */
@FunctionalInterface
public interface JsonMetaSchemaFactory {
    /**
     * Gets the meta-schema given the IRI.
     * 
     * @param iri the meta-schema IRI
     * @param schemaFactory the schema factory
     * @param config the config
     * @return the meta-schema
     */
    JsonMetaSchema getMetaSchema(String iri, JsonSchemaFactory schemaFactory, SchemaValidatorsConfig config);
}
