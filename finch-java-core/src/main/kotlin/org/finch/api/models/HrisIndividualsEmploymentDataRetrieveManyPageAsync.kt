package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable
import org.finch.api.services.async.hris.individuals.EmploymentDataServiceAsync

class HrisIndividualsEmploymentDataRetrieveManyPageAsync
private constructor(
    private val employmentDataService: EmploymentDataServiceAsync,
    private val params: HrisIndividualsEmploymentDataRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<EmploymentDataResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisIndividualsEmploymentDataRetrieveManyPageAsync &&
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
        "HrisIndividualsEmploymentDataRetrieveManyPageAsync{employmentDataService=$employmentDataService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisIndividualsEmploymentDataRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage():
        CompletableFuture<Optional<HrisIndividualsEmploymentDataRetrieveManyPageAsync>> {
        return getNextPageParams()
            .map { employmentDataService.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            employmentDataService: EmploymentDataServiceAsync,
            params: HrisIndividualsEmploymentDataRetrieveManyParams,
            response: Response
        ) =
            HrisIndividualsEmploymentDataRetrieveManyPageAsync(
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
            "HrisIndividualsEmploymentDataRetrieveManyPageAsync.Response{responses=$responses, additionalProperties=$additionalProperties}"

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
        private val firstPage: HrisIndividualsEmploymentDataRetrieveManyPageAsync,
    ) {

        fun forEach(
            action: Predicate<EmploymentDataResponse>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisIndividualsEmploymentDataRetrieveManyPageAsync>>
                .forEach(
                action: (EmploymentDataResponse) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.responses().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<EmploymentDataResponse>> {
            val values = mutableListOf<EmploymentDataResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
