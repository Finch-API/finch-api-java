package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable
import org.finch.api.services.blocking.hris.PayStatementService

class HrisPayStatementRetrieveManyPage
private constructor(
    private val payStatementsService: PayStatementService,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<PayStatementResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPayStatementRetrieveManyPage &&
            this.payStatementsService == other.payStatementsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            payStatementsService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisPayStatementRetrieveManyPage{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisPayStatementRetrieveManyParams> {
        return Optional.empty()
    }

    fun getNextPage(): Optional<HrisPayStatementRetrieveManyPage> {
        return getNextPageParams().map { payStatementsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payStatementsService: PayStatementService,
            params: HrisPayStatementRetrieveManyParams,
            response: Response
        ) =
            HrisPayStatementRetrieveManyPage(
                payStatementsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val responses: JsonField<List<PayStatementResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun responses(): List<PayStatementResponse> = responses.getRequired("responses")

        @JsonProperty("responses")
        fun _responses(): Optional<JsonField<List<PayStatementResponse>>> =
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
            "HrisPayStatementRetrieveManyPage.Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<PayStatementResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<PayStatementResponse>) =
                responses(JsonField.of(responses))

            @JsonProperty("responses")
            fun responses(responses: JsonField<List<PayStatementResponse>>) = apply {
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
        private val firstPage: HrisPayStatementRetrieveManyPage,
    ) : Iterable<PayStatementResponse> {

        override fun iterator(): Iterator<PayStatementResponse> = iterator {
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

        fun stream(): Stream<PayStatementResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
