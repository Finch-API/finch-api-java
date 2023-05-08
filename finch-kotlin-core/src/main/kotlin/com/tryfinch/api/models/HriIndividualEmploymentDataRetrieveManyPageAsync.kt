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
import com.tryfinch.api.services.async.hris.individuals.EmploymentDataServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class HriIndividualEmploymentDataRetrieveManyPageAsync
private constructor(
    private val employmentDataService: EmploymentDataServiceAsync,
    private val params: HriIndividualEmploymentDataRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<EmploymentDataResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HriIndividualEmploymentDataRetrieveManyPageAsync &&
            this.employmentDataService == other.employmentDataService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            employmentDataService,
            params,
            response,
        )
    }

    override fun toString() =
        "HriIndividualEmploymentDataRetrieveManyPageAsync{employmentDataService=$employmentDataService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return responses().isEmpty()
    }

    fun getNextPageParams(): HriIndividualEmploymentDataRetrieveManyParams? {
        return null
    }

    suspend fun getNextPage(): HriIndividualEmploymentDataRetrieveManyPageAsync? {
        return getNextPageParams()?.let { employmentDataService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            employmentDataService: EmploymentDataServiceAsync,
            params: HriIndividualEmploymentDataRetrieveManyParams,
            response: Response
        ) =
            HriIndividualEmploymentDataRetrieveManyPageAsync(
                employmentDataService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val responses: JsonField<List<EmploymentDataResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun responses(): List<EmploymentDataResponse> = responses.getRequired("responses")

        @JsonProperty("responses")
        fun _responses(): JsonField<List<EmploymentDataResponse>>? = responses

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                responses().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.responses == other.responses &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(responses, additionalProperties)
        }

        override fun toString() =
            "HriIndividualEmploymentDataRetrieveManyPageAsync.Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<EmploymentDataResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<EmploymentDataResponse>) =
                responses(JsonField.of(responses))

            @JsonProperty("responses")
            fun responses(responses: JsonField<List<EmploymentDataResponse>>) = apply {
                this.responses = responses
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(responses, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HriIndividualEmploymentDataRetrieveManyPageAsync,
    ) : Flow<EmploymentDataResponse> {

        override suspend fun collect(collector: FlowCollector<EmploymentDataResponse>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    collector.emit(page.responses()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
