// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.PaymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Read payroll and contractor related payments by the company. */
class HrisPaymentListPage
private constructor(
    private val paymentsService: PaymentService,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Payment> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPaymentListPage && paymentsService == other.paymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisPaymentListPage{paymentsService=$paymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisPaymentListParams> = Optional.empty()

    fun getNextPage(): Optional<HrisPaymentListPage> {
        return getNextPageParams().map { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentsService: PaymentService,
            params: HrisPaymentListParams,
            items: List<Payment>,
        ) = HrisPaymentListPage(paymentsService, params, items)
    }

    class AutoPager(private val firstPage: HrisPaymentListPage) : Iterable<Payment> {

        override fun iterator(): Iterator<Payment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Payment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
