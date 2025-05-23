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
package com.networknt.schema.i18n;

/**
 * The default {@link MessageSource} singleton.
 */
public class DefaultMessageSource {
    /**
     * The bundle base name.
     */
    public static final String BUNDLE_BASE_NAME = "jsv-messages";

    /**
     * The holder.
     */
    public static class Holder {
        private static final MessageSource INSTANCE = new ResourceBundleMessageSource(BUNDLE_BASE_NAME);
    }

    /**
     * Gets the default {@link MessageSource} using the jsv-messages bundle.
     * 
     * @return the message source of the resource bundle
     */
    public static MessageSource getInstance() {
        return Holder.INSTANCE;
    }
}
