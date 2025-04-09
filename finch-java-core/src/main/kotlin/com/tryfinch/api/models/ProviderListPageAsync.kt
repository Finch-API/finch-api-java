// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Return details on all available payroll and HR systems. */
class ProviderListPageAsync
private constructor(
    private val providersService: ProviderServiceAsync,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Provider> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListPageAsync && providersService == other.providersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(providersService, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPageAsync{providersService=$providersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<ProviderListParams> = Optional.empty()

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
            items: List<Provider>,
        ) = ProviderListPageAsync(providersService, params, items)
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
}
