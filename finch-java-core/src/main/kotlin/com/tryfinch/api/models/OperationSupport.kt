// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

/**
 * - `supported`: This operation is supported by both the provider and Finch
 * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
 *   provider
 * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch cannot
 *   support
 * - `client_access_only`: This behavior is supported by the provider, but only available to the
 *   client and not to Finch
 */
class OperationSupport
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SUPPORTED = of("supported")

        @JvmField val NOT_SUPPORTED_BY_FINCH = of("not_supported_by_finch")

        @JvmField val NOT_SUPPORTED_BY_PROVIDER = of("not_supported_by_provider")

        @JvmField val CLIENT_ACCESS_ONLY = of("client_access_only")

        @JvmStatic fun of(value: String) = OperationSupport(JsonField.of(value))
    }

    enum class Known {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
    }

    enum class Value {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            SUPPORTED -> Value.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Value.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Value.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Value.CLIENT_ACCESS_ONLY
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            SUPPORTED -> Known.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Known.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Known.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Known.CLIENT_ACCESS_ONLY
            else -> throw FinchInvalidDataException("Unknown OperationSupport: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationSupport && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
