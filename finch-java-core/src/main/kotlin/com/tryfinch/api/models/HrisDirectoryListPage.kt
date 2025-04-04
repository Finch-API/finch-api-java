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
import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Read company directory and organization structure */
class HrisDirectoryListPage
private constructor(
    private val directoryService: DirectoryService,
    private val params: HrisDirectoryListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun individuals(): List<IndividualInDirectory> = response().individuals()

    fun paging(): Optional<Paging> = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPage && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPage{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        return paging().flatMap { it.offset() }.orElse(0) + individuals().count() <
            paging().flatMap { it.count() }.orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<HrisDirectoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            HrisDirectoryListParams.builder()
                .from(params)
                .offset(paging().flatMap { it.offset() }.orElse(0) + individuals().count())
                .build()
        )
    }

    fun getNextPage(): Optional<HrisDirectoryListPage> {
        return getNextPageParams().map { directoryService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            directoryService: DirectoryService,
            params: HrisDirectoryListParams,
            response: Response,
        ) = HrisDirectoryListPage(directoryService, params, response)
    }

    class Response(
        private val individuals: JsonField<List<IndividualInDirectory>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("individuals")
            individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of(),
            @JsonProperty("paging") paging: JsonField<Paging> = JsonMissing.of(),
        ) : this(individuals, paging, mutableMapOf())

        fun individuals(): List<IndividualInDirectory> =
            individuals.getOptional("individuals").getOrNull() ?: listOf()

        fun paging(): Optional<Paging> = paging.getOptional("paging")

        @JsonProperty("individuals")
        fun _individuals(): Optional<JsonField<List<IndividualInDirectory>>> =
            Optional.ofNullable(individuals)

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

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

            individuals().map { it.validate() }
            paging().ifPresent { it.validate() }
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

            return /* spotless:off */ other is Response && individuals == other.individuals && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(individuals, paging, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [HrisDirectoryListPage].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.individuals = page.individuals
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun individuals(individuals: List<IndividualInDirectory>) =
                individuals(JsonField.of(individuals))

            fun individuals(individuals: JsonField<List<IndividualInDirectory>>) = apply {
                this.individuals = individuals
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(individuals, paging, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: HrisDirectoryListPage) :
        Iterable<IndividualInDirectory> {

        override fun iterator(): Iterator<IndividualInDirectory> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    yield(page.individuals()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<IndividualInDirectory> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
