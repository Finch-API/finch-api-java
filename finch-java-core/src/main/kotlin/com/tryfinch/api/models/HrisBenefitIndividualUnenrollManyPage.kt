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
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Unenroll individuals from a deduction or contribution */
class HrisBenefitIndividualUnenrollManyPage
private constructor(
    private val individualsService: IndividualService,
    private val params: HrisBenefitIndividualUnenrollManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<UnenrolledIndividual> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyPage && individualsService == other.individualsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyPage{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisBenefitIndividualUnenrollManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): Optional<HrisBenefitIndividualUnenrollManyPage> {
        return getNextPageParams().map { individualsService.unenrollMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            individualsService: IndividualService,
            params: HrisBenefitIndividualUnenrollManyParams,
            response: Response,
        ) = HrisBenefitIndividualUnenrollManyPage(individualsService, params, response)
    }

    class Response(
        private val items: JsonField<List<UnenrolledIndividual>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items") items: JsonField<List<UnenrolledIndividual>> = JsonMissing.of()
        ) : this(items, mutableMapOf())

        fun items(): List<UnenrolledIndividual> = items.getNullable("items") ?: listOf()

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<UnenrolledIndividual>>> = Optional.ofNullable(items)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [HrisBenefitIndividualUnenrollManyPage].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<UnenrolledIndividual>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<UnenrolledIndividual>) = items(JsonField.of(items))

            fun items(items: JsonField<List<UnenrolledIndividual>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(items, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualUnenrollManyPage) :
        Iterable<UnenrolledIndividual> {

        override fun iterator(): Iterator<UnenrolledIndividual> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<UnenrolledIndividual> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
