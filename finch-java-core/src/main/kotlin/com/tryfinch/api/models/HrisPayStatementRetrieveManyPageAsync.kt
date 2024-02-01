// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class HrisPayStatementRetrieveManyPageAsync
private constructor(
    private val payStatementsService: PayStatementServiceAsync,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<PayStatementResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPayStatementRetrieveManyPageAsync &&
            this.payStatementsService == other.payStatementsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            payStatementsService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisPayStatementRetrieveManyPageAsync{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisPayStatementRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<HrisPayStatementRetrieveManyPageAsync>> {
        return getNextPageParams()
            .map { payStatementsService.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payStatementsService: PayStatementServiceAsync,
            params: HrisPayStatementRetrieveManyParams,
            response: Response
        ) =
            HrisPayStatementRetrieveManyPageAsync(
                payStatementsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val responses: JsonField<List<PayStatementResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun responses(): List<PayStatementResponse> = responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): Optional<JsonField<List<PayStatementResponse>>> =
            Optional.ofNullable(responses)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                responses().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.responses == other.responses &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(responses, additionalProperties)
        }

        override fun toString() =
            "HrisPayStatementRetrieveManyPageAsync.Response{responses=$responses, additionalProperties=$additionalProperties}"

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

            @JsonProperty("responses")
            fun responses(responses: JsonField<List<PayStatementResponse>>) = apply {
                this.responses = responses
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(responses, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisPayStatementRetrieveManyPageAsync,
    ) {

        fun forEach(
            action: Predicate<PayStatementResponse>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisPayStatementRetrieveManyPageAsync>>.forEach(
                action: (PayStatementResponse) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.responses().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<PayStatementResponse>> {
            val values = mutableListOf<PayStatementResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
