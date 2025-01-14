@file:JvmName("Check")

package com.tryfinch.api.core

@JvmSynthetic
internal fun <T : Any> checkRequired(name: String, value: T?): T =
    checkNotNull(value) { "`$name` is required but was not set" }