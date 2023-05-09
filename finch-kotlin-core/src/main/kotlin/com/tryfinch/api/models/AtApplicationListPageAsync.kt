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
import com.tryfinch.api.services.async.ats.ApplicationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AtApplicationListPageAsync
private constructor(
    private val applicationsService: ApplicationServiceAsync,
    private val params: AtApplicationListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun applications(): List<Application> = response().applications()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtApplicationListPageAsync &&
            this.applicationsService == other.applicationsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            applicationsService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtApplicationListPageAsync{applicationsService=$applicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (applications().isEmpty()) {
            return false
        }

        return (paging().offset()
            ?: 0) + applications().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): AtApplicationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AtApplicationListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + applications().count())
            .build()
    }

    suspend fun getNextPage(): AtApplicationListPageAsync? {
        return getNextPageParams()?.let { applicationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            applicationsService: ApplicationServiceAsync,
            params: AtApplicationListParams,
            response: Response
        ) =
            AtApplicationListPageAsync(
                applicationsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val applications: JsonField<List<Application>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun applications(): List<Application> = applications.getRequired("applications")

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonProperty("applications")
        fun _applications(): JsonField<List<Application>>? = applications

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                applications().forEach { it.validate() }
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
                this.applications == other.applications &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                applications,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtApplicationListPageAsync.Response{paging=$paging, applications=$applications, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var applications: JsonField<List<Application>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.applications = page.applications
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun applications(applications: List<Application>) =
                applications(JsonField.of(applications))

            @JsonProperty("applications")
            fun applications(applications: JsonField<List<Application>>) = apply {
                this.applications = applications
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    applications,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtApplicationListPageAsync,
    ) : Flow<Application> {

        override suspend fun collect(collector: FlowCollector<Application>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.applications().size) {
                    collector.emit(page.applications()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
