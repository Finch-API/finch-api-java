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
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Read company pay groups and frequencies */
class PayrollPayGroupListPageAsync
private constructor(
    private val payGroupsService: PayGroupServiceAsync,
    private val params: PayrollPayGroupListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<PayGroupListResponse> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPageAsync && payGroupsService == other.payGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPageAsync{payGroupsService=$payGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<PayrollPayGroupListParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<PayrollPayGroupListPageAsync>> {
        return getNextPageParams()
            .map { payGroupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payGroupsService: PayGroupServiceAsync,
            params: PayrollPayGroupListParams,
            response: Response,
        ) = PayrollPayGroupListPageAsync(payGroupsService, params, response)
    }

    class Response(
        private val items: JsonField<List<PayGroupListResponse>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items") items: JsonField<List<PayGroupListResponse>> = JsonMissing.of()
        ) : this(items, mutableMapOf())

        fun items(): List<PayGroupListResponse> = items.getNullable("items") ?: listOf()

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<PayGroupListResponse>>> = Optional.ofNullable(items)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PayrollPayGroupListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<PayGroupListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<PayGroupListResponse>) = items(JsonField.of(items))

            fun items(items: JsonField<List<PayGroupListResponse>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(items, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: PayrollPayGroupListPageAsync) {

        fun forEach(
            action: Predicate<PayGroupListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PayrollPayGroupListPageAsync>>.forEach(
                action: (PayGroupListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<PayGroupListResponse>> {
            val values = mutableListOf<PayGroupListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
