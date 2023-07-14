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
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class HrisDirectoryListIndividualsPageAsync
private constructor(
    private val directoryService: DirectoryServiceAsync,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun individuals(): List<IndividualInDirectory> = response().individuals()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisDirectoryListIndividualsPageAsync &&
            this.directoryService == other.directoryService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            directoryService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisDirectoryListIndividualsPageAsync{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + individuals().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<HrisDirectoryListIndividualsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            HrisDirectoryListIndividualsParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + individuals().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<HrisDirectoryListIndividualsPageAsync>> {
        return getNextPageParams()
            .map { directoryService.listIndividuals(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            directoryService: DirectoryServiceAsync,
            params: HrisDirectoryListIndividualsParams,
            response: Response
        ) =
            HrisDirectoryListIndividualsPageAsync(
                directoryService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val individuals: JsonField<List<IndividualInDirectory>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        fun validate(): Response = apply {
            if (!validated) {
                individuals().map { it.validate() }
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
                this.individuals == other.individuals &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                individuals,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "HrisDirectoryListIndividualsPageAsync.Response{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"

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

            @JsonProperty("individuals")
            fun individuals(individuals: JsonField<List<IndividualInDirectory>>) = apply {
                this.individuals = individuals
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    individuals,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisDirectoryListIndividualsPageAsync,
    ) {

        fun forEach(
            action: Predicate<IndividualInDirectory>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisDirectoryListIndividualsPageAsync>>.forEach(
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
