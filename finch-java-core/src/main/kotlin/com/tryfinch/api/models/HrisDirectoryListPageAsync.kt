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
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Read company directory and organization structure */
class HrisDirectoryListPageAsync
private constructor(
    private val directoryService: DirectoryServiceAsync,
    private val params: HrisDirectoryListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun individuals(): List<IndividualInDirectory> = response().individuals()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPageAsync && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPageAsync{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !individuals().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisDirectoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            HrisDirectoryListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + individuals().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<HrisDirectoryListPageAsync>> {
        return getNextPageParams()
            .map { directoryService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            directoryService: DirectoryServiceAsync,
            params: HrisDirectoryListParams,
            response: Response
        ) =
            HrisDirectoryListPageAsync(
                directoryService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("individuals")
        private val individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of(),
        @JsonProperty("paging") private val paging: JsonField<Paging> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun individuals(): List<IndividualInDirectory> =
            individuals.getNullable("individuals") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("individuals")
        fun _individuals(): Optional<JsonField<List<IndividualInDirectory>>> =
            Optional.ofNullable(individuals)

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            individuals().map { it.validate() }
            paging().validate()
            validated = true
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

            fun build() =
                Response(
                    individuals,
                    paging,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisDirectoryListPageAsync,
    ) {

        fun forEach(
            action: Predicate<IndividualInDirectory>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisDirectoryListPageAsync>>.forEach(
                action: (IndividualInDirectory) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.individuals().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<IndividualInDirectory>> {
            val values = mutableListOf<IndividualInDirectory>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
