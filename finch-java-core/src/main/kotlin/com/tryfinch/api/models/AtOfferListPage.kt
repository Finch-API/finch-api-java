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
import com.tryfinch.api.services.blocking.ats.OfferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class AtOfferListPage
private constructor(
    private val offersService: OfferService,
    private val params: AtOfferListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun offers(): List<Offer> = response().offers()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtOfferListPage &&
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
        "AtOfferListPage{offersService=$offersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (offers().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + offers().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<AtOfferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AtOfferListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + offers().count())
                .build()
        )
    }

    fun getNextPage(): Optional<AtOfferListPage> {
        return getNextPageParams().map { offersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(offersService: OfferService, params: AtOfferListParams, response: Response) =
            AtOfferListPage(
                offersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val offers: JsonField<List<Offer>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun offers(): List<Offer> = offers.getRequired("offers")

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonProperty("offers")
        fun _offers(): Optional<JsonField<List<Offer>>> = Optional.ofNullable(offers)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                offers().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.paging == other.paging &&
                this.offers == other.offers &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                offers,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtOfferListPage.Response{paging=$paging, offers=$offers, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var offers: JsonField<List<Offer>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.offers = page.offers
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun offers(offers: List<Offer>) = offers(JsonField.of(offers))

            @JsonProperty("offers")
            fun offers(offers: JsonField<List<Offer>>) = apply { this.offers = offers }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    offers,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtOfferListPage,
    ) : Iterable<Offer> {

        override fun iterator(): Iterator<Offer> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.offers().size) {
                    yield(page.offers()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<Offer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
