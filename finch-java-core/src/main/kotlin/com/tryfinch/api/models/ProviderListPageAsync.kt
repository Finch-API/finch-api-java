// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [ProviderServiceAsync.list] */
class ProviderListPageAsync
private constructor(
    private val service: ProviderServiceAsync,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<ProviderListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<ProviderListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProviderListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Provider> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProviderListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProviderServiceAsync? = null
        private var params: ProviderListParams? = null
        private var items: List<Provider>? = null

        @JvmSynthetic
        internal fun from(providerListPageAsync: ProviderListPageAsync) = apply {
            service = providerListPageAsync.service
            params = providerListPageAsync.params
            items = providerListPageAsync.items
        }

        fun service(service: ProviderServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Provider>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ProviderListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderListPageAsync =
            ProviderListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: ProviderListPageAsync) {

        fun forEach(action: Predicate<Provider>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProviderListPageAsync>>.forEach(
                action: (Provider) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Provider>> {
            val values = mutableListOf<Provider>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPageAsync{service=$service, params=$params, items=$items}"
}
