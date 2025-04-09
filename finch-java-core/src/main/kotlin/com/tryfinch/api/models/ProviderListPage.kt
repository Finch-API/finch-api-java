// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.ProviderService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Return details on all available payroll and HR systems. */
class ProviderListPage
private constructor(
    private val providersService: ProviderService,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Provider> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListPage && providersService == other.providersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(providersService, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPage{providersService=$providersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<ProviderListParams> = Optional.empty()

    fun getNextPage(): Optional<ProviderListPage> {
        return getNextPageParams().map { providersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            providersService: ProviderService,
            params: ProviderListParams,
            items: List<Provider>,
        ) = ProviderListPage(providersService, params, items)
    }

    class AutoPager(private val firstPage: ProviderListPage) : Iterable<Provider> {

        override fun iterator(): Iterator<Provider> = iterator {
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

        fun stream(): Stream<Provider> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
