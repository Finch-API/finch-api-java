// File generated from our OpenAPI spec by Stainless.

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
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class JobAutomatedListPageAsync
private constructor(
    private val automatedService: AutomatedServiceAsync,
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

        return /* spotless:off */ other is JobAutomatedListPageAsync && automatedService == other.automatedService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(automatedService, params, response) /* spotless:on */

    override fun toString() =
        "JobAutomatedListPageAsync{automatedService=$automatedService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<JobAutomatedListPageAsync>> {
        return getNextPageParams()
            .map { automatedService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            automatedService: AutomatedServiceAsync,
            params: JobAutomatedListParams,
            response: Response
        ) =
            JobAutomatedListPageAsync(
                automatedService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<AutomatedAsyncJob>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<AutomatedAsyncJob> = data.getNullable("data") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<AutomatedAsyncJob>>> = Optional.ofNullable(data)

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                paging().validate()
                validated = true
            }
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

            @JsonProperty("data")
            fun data(data: JsonField<List<AutomatedAsyncJob>>) = apply { this.data = data }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
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
        private val firstPage: JobAutomatedListPageAsync,
    ) {

        fun forEach(
            action: Predicate<AutomatedAsyncJob>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<JobAutomatedListPageAsync>>.forEach(
                action: (AutomatedAsyncJob) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<AutomatedAsyncJob>> {
            val values = mutableListOf<AutomatedAsyncJob>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
