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
import com.tryfinch.api.services.async.ats.JobServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AtJobListPageAsync
private constructor(
    private val jobsService: JobServiceAsync,
    private val params: AtJobListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun jobs(): List<Job> = response().jobs()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtJobListPageAsync &&
            this.jobsService == other.jobsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            jobsService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtJobListPageAsync{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (jobs().isEmpty()) {
            return false
        }

        return (paging().offset() ?: 0) + jobs().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): AtJobListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AtJobListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + jobs().count())
            .build()
    }

    suspend fun getNextPage(): AtJobListPageAsync? {
        return getNextPageParams()?.let { jobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(jobsService: JobServiceAsync, params: AtJobListParams, response: Response) =
            AtJobListPageAsync(
                jobsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val jobs: JsonField<List<Job>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun jobs(): List<Job> = jobs.getRequired("jobs")

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonProperty("jobs") fun _jobs(): JsonField<List<Job>>? = jobs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                jobs().forEach { it.validate() }
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
                this.jobs == other.jobs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                jobs,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtJobListPageAsync.Response{paging=$paging, jobs=$jobs, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var jobs: JsonField<List<Job>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.jobs = page.jobs
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun jobs(jobs: List<Job>) = jobs(JsonField.of(jobs))

            @JsonProperty("jobs") fun jobs(jobs: JsonField<List<Job>>) = apply { this.jobs = jobs }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    jobs,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtJobListPageAsync,
    ) : Flow<Job> {

        override suspend fun collect(collector: FlowCollector<Job>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.jobs().size) {
                    collector.emit(page.jobs()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
