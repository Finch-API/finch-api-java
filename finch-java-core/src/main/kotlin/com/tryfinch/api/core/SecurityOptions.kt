// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.core

import java.util.Objects

/** A class for configuring which security schemes are enabled for a request. */
class SecurityOptions
private constructor(
    /** Whether the bearerAuth security scheme is enabled. */
    @get:JvmName("bearerAuth") val bearerAuth: Boolean,
    /** Whether the basicAuth security scheme is enabled. */
    @get:JvmName("basicAuth") val basicAuth: Boolean,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SecurityOptions]. */
        @JvmStatic fun builder() = Builder()

        /** Returns a [Security] instance with all security schemes enabled. */
        @JvmStatic fun all(): SecurityOptions = builder().bearerAuth(true).basicAuth(true).build()

        /** Returns a [Security] instance with no security schemes enabled. */
        @JvmStatic fun none(): SecurityOptions = builder().build()
    }

    /** A builder for [SecurityOptions]. */
    class Builder internal constructor() {

        private var bearerAuth: Boolean = false
        private var basicAuth: Boolean = false

        @JvmSynthetic
        internal fun from(securityOptions: SecurityOptions) = apply {
            bearerAuth = securityOptions.bearerAuth
            basicAuth = securityOptions.basicAuth
        }

        /** Whether the bearerAuth security scheme is enabled. */
        fun bearerAuth(bearerAuth: Boolean) = apply { this.bearerAuth = bearerAuth }

        /** Whether the basicAuth security scheme is enabled. */
        fun basicAuth(basicAuth: Boolean) = apply { this.basicAuth = basicAuth }

        /**
         * Returns an immutable instance of [SecurityOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecurityOptions = SecurityOptions(bearerAuth, basicAuth)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecurityOptions &&
            bearerAuth == other.bearerAuth &&
            basicAuth == other.basicAuth
    }

    override fun hashCode(): Int = Objects.hash(bearerAuth, basicAuth)

    override fun toString() = "SecurityOptions{bearerAuth=$bearerAuth, basicAuth=$basicAuth}"
}
