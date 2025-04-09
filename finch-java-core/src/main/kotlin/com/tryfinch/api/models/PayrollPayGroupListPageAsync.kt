// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
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
    private val items: List<PayGroupListResponse>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PayGroupListResponse> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPageAsync && payGroupsService == other.payGroupsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payGroupsService, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPageAsync{payGroupsService=$payGroupsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<PayrollPayGroupListParams> = Optional.empty()

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
            items: List<PayGroupListResponse>,
        ) = PayrollPayGroupListPageAsync(payGroupsService, params, items)
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
