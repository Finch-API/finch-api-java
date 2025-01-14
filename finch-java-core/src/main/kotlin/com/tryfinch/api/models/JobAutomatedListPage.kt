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
import com.tryfinch.api.services.blocking.jobs.AutomatedService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class JobAutomatedListPage
private constructor(
    private val automatedService: AutomatedService,
    private val params: JobAutomatedListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<AutomatedAsyncJob> = response().data()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobAutomatedListPage && automatedService == other.automatedService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(automatedService, params, response) /* spotless:on */

    override fun toString() =
        "JobAutomatedListPage{automatedService=$automatedService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): Optional<JobAutomatedListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            JobAutomatedListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + data().count())
                .build()
        )
    }

    fun getNextPage(): Optional<JobAutomatedListPage> {
        return getNextPageParams().map { automatedService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            automatedService: AutomatedService,
            params: JobAutomatedListParams,
            response: Response
        ) =
            JobAutomatedListPage(
                automatedService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<AutomatedAsyncJob>> = JsonMissing.of(),
        @JsonProperty("paging") private val paging: JsonField<Paging> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<AutomatedAsyncJob> = data.getNullable("data") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<AutomatedAsyncJob>>> = Optional.ofNullable(data)

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

            data().map { it.validate() }
            paging().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, paging, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<AutomatedAsyncJob>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<AutomatedAsyncJob>) = data(JsonField.of(data))

            fun data(data: JsonField<List<AutomatedAsyncJob>>) = apply { this.data = data }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    paging,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: JobAutomatedListPage,
    ) : Iterable<AutomatedAsyncJob> {

        override fun iterator(): Iterator<AutomatedAsyncJob> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<AutomatedAsyncJob> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
