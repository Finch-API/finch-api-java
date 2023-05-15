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
import com.tryfinch.api.services.blocking.ats.JobService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class AtsJobListPage
private constructor(
    private val jobsService: JobService,
    private val params: AtsJobListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun jobs(): List<Job> = response().jobs()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsJobListPage &&
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
        "AtsJobListPage{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (jobs().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + jobs().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<AtsJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AtsJobListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + jobs().count())
                .build()
        )
    }

    fun getNextPage(): Optional<AtsJobListPage> {
        return getNextPageParams().map { jobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(jobsService: JobService, params: AtsJobListParams, response: Response) =
            AtsJobListPage(
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

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonProperty("jobs")
        fun _jobs(): Optional<JsonField<List<Job>>> = Optional.ofNullable(jobs)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
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
            "AtsJobListPage.Response{paging=$paging, jobs=$jobs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var jobs: JsonField<List<Job>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
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
        private val firstPage: AtsJobListPage,
    ) : Iterable<Job> {

        override fun iterator(): Iterator<Job> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.jobs().size) {
                    yield(page.jobs()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<Job> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
