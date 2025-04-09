// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.payroll.PayGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Read company pay groups and frequencies */
class PayrollPayGroupListPage
private constructor(
    private val payGroupsService: PayGroupService,
    private val params: PayrollPayGroupListParams,
    private val items: List<PayGroupListResponse>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PayGroupListResponse> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPage && payGroupsService == other.payGroupsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payGroupsService, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPage{payGroupsService=$payGroupsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<PayrollPayGroupListParams> = Optional.empty()

    fun getNextPage(): Optional<PayrollPayGroupListPage> {
        return getNextPageParams().map { payGroupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payGroupsService: PayGroupService,
            params: PayrollPayGroupListParams,
            items: List<PayGroupListResponse>,
        ) = PayrollPayGroupListPage(payGroupsService, params, items)
    }

    class AutoPager(private val firstPage: PayrollPayGroupListPage) :
        Iterable<PayGroupListResponse> {

        override fun iterator(): Iterator<PayGroupListResponse> = iterator {
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

        fun stream(): Stream<PayGroupListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
