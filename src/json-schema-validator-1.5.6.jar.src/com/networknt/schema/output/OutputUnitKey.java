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
package com.networknt.schema.output;

import java.util.Objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.networknt.schema.JsonNodePath;
import com.networknt.schema.SchemaLocation;
import com.networknt.schema.serialization.JsonMapperFactory;

/**
 * Output Unit Key.
 */
public class OutputUnitKey {
    @JsonSerialize(using = ToStringSerializer.class)
    final JsonNodePath evaluationPath;
    @JsonSerialize(using = ToStringSerializer.class)
    final SchemaLocation schemaLocation;
    @JsonSerialize(using = ToStringSerializer.class)
    final JsonNodePath instanceLocation;

    public OutputUnitKey(JsonNodePath evaluationPath, SchemaLocation schemaLocation, JsonNodePath instanceLocation) {
        super();
        this.evaluationPath = evaluationPath;
        this.schemaLocation = schemaLocation;
        this.instanceLocation = instanceLocation;
    }

    public JsonNodePath getEvaluationPath() {
        return evaluationPath;
    }

    public SchemaLocation getSchemaLocation() {
        return schemaLocation;
    }

    public JsonNodePath getInstanceLocation() {
        return instanceLocation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationPath, instanceLocation, schemaLocation);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OutputUnitKey other = (OutputUnitKey) obj;
        return Objects.equals(evaluationPath, other.evaluationPath)
                && Objects.equals(instanceLocation, other.instanceLocation)
                && Objects.equals(schemaLocation, other.schemaLocation);
    }

    @Override
    public String toString() {
        try {
            return JsonMapperFactory.getInstance().writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "OutputUnitKey [evaluationPath=" + evaluationPath + ", schemaLocation=" + schemaLocation
                    + ", instanceLocation=" + instanceLocation + "]";
        }
    }
    
    
}