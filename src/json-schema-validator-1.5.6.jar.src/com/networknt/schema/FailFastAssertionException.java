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

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/**
 * Thrown when an assertion happens and the evaluation can fail fast.
 * <p>
 * This doesn't extend off JsonSchemaException as it is used for flow control
 * and is intended to be caught in a specific place.
 * <p>
 * This will be caught in the JsonSchema validate method to be passed to the
 * output formatter.
 */
public class FailFastAssertionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final ValidationMessage validationMessage;

    /**
     * Constructor.
     *
     * @param validationMessage the validation message
     */
    public FailFastAssertionException(ValidationMessage validationMessage) {
        this.validationMessage = Objects.requireNonNull(validationMessage);
    }

    /**
     * Gets the validation message.
     * 
     * @return the validation message
     */
    public ValidationMessage getValidationMessage() {
        return this.validationMessage;
    }

    /**
     * Gets the validation message.
     * 
     * @return the validation message
     */
    public Set<ValidationMessage> getValidationMessages() {
        return Collections.singleton(this.validationMessage);
    }

    @Override
    public String getMessage() {
        return this.validationMessage != null ? this.validationMessage.getMessage() : super.getMessage();
    }

    @Override
    public Throwable fillInStackTrace() {
        /*
         * This is overridden for performance as filling in the stack trace is expensive
         * and this is used for flow control.
         */
        return this;
    }
}
