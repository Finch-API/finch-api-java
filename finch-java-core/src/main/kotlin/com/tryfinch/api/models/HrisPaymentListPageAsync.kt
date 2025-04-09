// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Read payroll and contractor related payments by the company. */
class HrisPaymentListPageAsync
private constructor(
    private val paymentsService: PaymentServiceAsync,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Payment> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPaymentListPageAsync && paymentsService == other.paymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisPaymentListPageAsync{paymentsService=$paymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisPaymentListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisPaymentListPageAsync>> {
        return getNextPageParams()
            .map { paymentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentsService: PaymentServiceAsync,
            params: HrisPaymentListParams,
            items: List<Payment>,
        ) = HrisPaymentListPageAsync(paymentsService, params, items)
    }

    class AutoPager(private val firstPage: HrisPaymentListPageAsync) {

        fun forEach(action: Predicate<Payment>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisPaymentListPageAsync>>.forEach(
                action: (Payment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Payment>> {
            val values = mutableListOf<Payment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
