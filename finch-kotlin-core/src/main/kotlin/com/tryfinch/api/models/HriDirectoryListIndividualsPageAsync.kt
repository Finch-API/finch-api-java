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
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class HriDirectoryListIndividualsPageAsync
private constructor(
    private val directoryService: DirectoryServiceAsync,
    private val params: HriDirectoryListIndividualsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun individuals(): List<IndividualInDirectory> = response().individuals()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HriDirectoryListIndividualsPageAsync &&
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
        "HriDirectoryListIndividualsPageAsync{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        return (paging().offset()
            ?: 0) + individuals().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): HriDirectoryListIndividualsParams? {
        if (!hasNextPage()) {
            return null
        }

        return HriDirectoryListIndividualsParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + individuals().count())
            .build()
    }

    suspend fun getNextPage(): HriDirectoryListIndividualsPageAsync? {
        return getNextPageParams()?.let { directoryService.listIndividuals(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            directoryService: DirectoryServiceAsync,
            params: HriDirectoryListIndividualsParams,
            response: Response
        ) =
            HriDirectoryListIndividualsPageAsync(
                directoryService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val individuals: JsonField<List<IndividualInDirectory>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun individuals(): List<IndividualInDirectory> = individuals.getRequired("individuals")

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonProperty("individuals")
        fun _individuals(): JsonField<List<IndividualInDirectory>>? = individuals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                individuals().forEach { it.validate() }
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
                this.individuals == other.individuals &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                individuals,
                additionalProperties,
            )
        }

        override fun toString() =
            "HriDirectoryListIndividualsPageAsync.Response{paging=$paging, individuals=$individuals, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.individuals = page.individuals
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun individuals(individuals: List<IndividualInDirectory>) =
                individuals(JsonField.of(individuals))

            @JsonProperty("individuals")
            fun individuals(individuals: JsonField<List<IndividualInDirectory>>) = apply {
                this.individuals = individuals
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    individuals,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HriDirectoryListIndividualsPageAsync,
    ) : Flow<IndividualInDirectory> {

        override suspend fun collect(collector: FlowCollector<IndividualInDirectory>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    collector.emit(page.individuals()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
