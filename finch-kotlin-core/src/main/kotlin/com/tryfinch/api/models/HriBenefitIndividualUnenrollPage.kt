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
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.Objects

class HriBenefitIndividualUnenrollPage
private constructor(
    private val individualsService: IndividualService,
    private val params: HriBenefitIndividualUnenrollParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<UnenrolledIndividual> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HriBenefitIndividualUnenrollPage &&
            this.individualsService == other.individualsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            individualsService,
            params,
            response,
        )
    }

    override fun toString() =
        "HriBenefitIndividualUnenrollPage{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return items().isEmpty()
    }

    fun getNextPageParams(): HriBenefitIndividualUnenrollParams? {
        return null
    }

    fun getNextPage(): HriBenefitIndividualUnenrollPage? {
        return getNextPageParams()?.let { individualsService.unenroll(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualService,
            params: HriBenefitIndividualUnenrollParams,
            response: Response
        ) =
            HriBenefitIndividualUnenrollPage(
                individualsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<UnenrolledIndividual>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<UnenrolledIndividual> = items.getRequired("items")

        @JsonProperty("items") fun _items(): JsonField<List<UnenrolledIndividual>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                items().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "HriBenefitIndividualUnenrollPage.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<UnenrolledIndividual>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<UnenrolledIndividual>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<UnenrolledIndividual>>) = apply { this.items = items }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HriBenefitIndividualUnenrollPage,
    ) : Sequence<UnenrolledIndividual> {

        override fun iterator(): Iterator<UnenrolledIndividual> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
