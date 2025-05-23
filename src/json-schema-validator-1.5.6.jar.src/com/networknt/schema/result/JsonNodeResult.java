/*
 * Copyright (c) 2023 the original author or authors.
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
package com.networknt.schema.result;

import java.util.Objects;

import com.networknt.schema.JsonNodePath;
import com.networknt.schema.SchemaLocation;

/**
 * Sub schema results.
 */
public class JsonNodeResult {
    private final JsonNodePath instanceLocation;
    private final SchemaLocation schemaLocation;
    private final JsonNodePath evaluationPath;
    private final boolean valid;

    public JsonNodeResult(JsonNodePath instanceLocation, SchemaLocation schemaLocation, JsonNodePath evaluationPath,
            boolean valid) {
        super();
        this.instanceLocation = instanceLocation;
        this.schemaLocation = schemaLocation;
        this.evaluationPath = evaluationPath;
        this.valid = valid;
    }

    public JsonNodePath getInstanceLocation() {
        return instanceLocation;
    }

    public SchemaLocation getSchemaLocation() {
        return schemaLocation;
    }

    public JsonNodePath getEvaluationPath() {
        return evaluationPath;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return "JsonNodeResult [instanceLocation=" + instanceLocation + ", schemaLocation=" + schemaLocation
                + ", evaluationPath=" + evaluationPath + ", valid=" + valid + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationPath, instanceLocation, schemaLocation, valid);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JsonNodeResult other = (JsonNodeResult) obj;
        return Objects.equals(evaluationPath, other.evaluationPath)
                && Objects.equals(instanceLocation, other.instanceLocation)
                && Objects.equals(schemaLocation, other.schemaLocation) && valid == other.valid;
    }

}
