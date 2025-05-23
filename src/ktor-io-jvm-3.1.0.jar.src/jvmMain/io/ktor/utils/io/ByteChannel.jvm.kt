/*
 * Copyright 2014-2024 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.utils.io

private const val DEVELOPMENT_MODE_KEY: String = "io.ktor.development"

internal actual val DEVELOPMENT_MODE: Boolean
    get() = System.getProperty(DEVELOPMENT_MODE_KEY)?.toBoolean() == true
