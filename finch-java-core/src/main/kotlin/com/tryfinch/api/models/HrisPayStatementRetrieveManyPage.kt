// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.blocking.hris.PayStatementService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/**
 * Read detailed pay statements for each individual.
 *
 * Deduction and contribution types are supported by the payroll systems that supports Benefits.
 */
class HrisPayStatementRetrieveManyPage
private constructor(
    private val payStatementsService: PayStatementService,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<PayStatementResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPage && payStatementsService == other.payStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPage{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisPayStatementRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): Optional<HrisPayStatementRetrieveManyPage> {
        return getNextPageParams().map { payStatementsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payStatementsService: PayStatementService,
            params: HrisPayStatementRetrieveManyParams,
            response: Response,
        ) = HrisPayStatementRetrieveManyPage(payStatementsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("responses")
        private val responses: JsonField<List<PayStatementResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun responses(): List<PayStatementResponse> = responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): Optional<JsonField<List<PayStatementResponse>>> =
            Optional.ofNullable(responses)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            responses().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && responses == other.responses && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(responses, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<PayStatementResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<PayStatementResponse>) =
                responses(JsonField.of(responses))

            fun responses(responses: JsonField<List<PayStatementResponse>>) = apply {
                this.responses = responses
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(responses, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: HrisPayStatementRetrieveManyPage) :
        Iterable<PayStatementResponse> {

        override fun iterator(): Iterator<PayStatementResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<PayStatementResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
