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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class ProviderListPageAsync
private constructor(
    private val providersService: ProviderServiceAsync,
    private val params: ProviderListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<Provider> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProviderListPageAsync &&
            this.providersService == other.providersService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            providersService,
            params,
            response,
        )
    }

    override fun toString() =
        "ProviderListPageAsync{providersService=$providersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return items().isEmpty()
    }

    fun getNextPageParams(): Optional<ProviderListParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<ProviderListPageAsync>> {
        return getNextPageParams()
            .map { providersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            providersService: ProviderServiceAsync,
            params: ProviderListParams,
            response: Response
        ) =
            ProviderListPageAsync(
                providersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<Provider>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<Provider> = items.getNullable("items") ?: listOf()

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<Provider>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "ProviderListPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Provider>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<Provider>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<Provider>>) = apply { this.items = items }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: ProviderListPageAsync,
    ) {

        fun forEach(action: Predicate<Provider>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProviderListPageAsync>>.forEach(
                action: (Provider) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Provider>> {
            val values = mutableListOf<Provider>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
