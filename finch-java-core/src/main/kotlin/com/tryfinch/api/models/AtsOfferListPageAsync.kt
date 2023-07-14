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
import com.tryfinch.api.services.async.ats.OfferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class AtsOfferListPageAsync
private constructor(
    private val offersService: OfferServiceAsync,
    private val params: AtsOfferListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun offers(): List<Offer> = response().offers()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsOfferListPageAsync &&
            this.offersService == other.offersService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            offersService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtsOfferListPageAsync{offersService=$offersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (offers().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + offers().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<AtsOfferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AtsOfferListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + offers().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AtsOfferListPageAsync>> {
        return getNextPageParams()
            .map { offersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(offersService: OfferServiceAsync, params: AtsOfferListParams, response: Response) =
            AtsOfferListPageAsync(
                offersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val offers: JsonField<List<Offer>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun offers(): List<Offer> = offers.getNullable("offers") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("offers")
        fun _offers(): Optional<JsonField<List<Offer>>> = Optional.ofNullable(offers)

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                offers().map { it.validate() }
                paging().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.offers == other.offers &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                offers,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsOfferListPageAsync.Response{offers=$offers, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var offers: JsonField<List<Offer>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.offers = page.offers
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun offers(offers: List<Offer>) = offers(JsonField.of(offers))

            @JsonProperty("offers")
            fun offers(offers: JsonField<List<Offer>>) = apply { this.offers = offers }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    offers,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsOfferListPageAsync,
    ) {

        fun forEach(action: Predicate<Offer>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AtsOfferListPageAsync>>.forEach(
                action: (Offer) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.offers().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Offer>> {
            val values = mutableListOf<Offer>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
