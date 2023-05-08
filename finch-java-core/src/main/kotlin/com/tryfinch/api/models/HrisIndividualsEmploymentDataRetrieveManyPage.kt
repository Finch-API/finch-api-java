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
import com.tryfinch.api.services.blocking.hris.individuals.EmploymentDataService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class HrisIndividualsEmploymentDataRetrieveManyPage
private constructor(
    private val employmentDataService: EmploymentDataService,
    private val params: HrisIndividualsEmploymentDataRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<EmploymentDataResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisIndividualsEmploymentDataRetrieveManyPage &&
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
        "HrisIndividualsEmploymentDataRetrieveManyPage{employmentDataService=$employmentDataService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisIndividualsEmploymentDataRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): Optional<HrisIndividualsEmploymentDataRetrieveManyPage> {
        return getNextPageParams().map { employmentDataService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            employmentDataService: EmploymentDataService,
            params: HrisIndividualsEmploymentDataRetrieveManyParams,
            response: Response
        ) =
            HrisIndividualsEmploymentDataRetrieveManyPage(
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
        fun _responses(): Optional<JsonField<List<EmploymentDataResponse>>> =
            Optional.ofNullable(responses)

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
            "HrisIndividualsEmploymentDataRetrieveManyPage.Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<EmploymentDataResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
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
        private val firstPage: HrisIndividualsEmploymentDataRetrieveManyPage,
    ) : Iterable<EmploymentDataResponse> {

        override fun iterator(): Iterator<EmploymentDataResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<EmploymentDataResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
