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
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class HrisIndividualRetrieveManyPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<IndividualResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyPageAsync && this.individualsService == other.individualsService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */
    }

    override fun toString() =
        "HrisIndividualRetrieveManyPageAsync{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisIndividualRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<HrisIndividualRetrieveManyPageAsync>> {
        return getNextPageParams()
            .map { individualsService.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisIndividualRetrieveManyParams,
            response: Response
        ) =
            HrisIndividualRetrieveManyPageAsync(
                individualsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val responses: JsonField<List<IndividualResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun responses(): List<IndividualResponse> = responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): Optional<JsonField<List<IndividualResponse>>> =
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

            return /* spotless:off */ other is Response && this.responses == other.responses && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(responses, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "HrisIndividualRetrieveManyPageAsync.Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<IndividualResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<IndividualResponse>) = responses(JsonField.of(responses))

            @JsonProperty("responses")
            fun responses(responses: JsonField<List<IndividualResponse>>) = apply {
                this.responses = responses
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(responses, additionalProperties.toImmutable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisIndividualRetrieveManyPageAsync,
    ) {

        fun forEach(
            action: Predicate<IndividualResponse>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisIndividualRetrieveManyPageAsync>>.forEach(
                action: (IndividualResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IndividualResponse>> {
            val values = mutableListOf<IndividualResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
