// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all company-wide deductions and contributions. */
class HrisBenefitListPage
private constructor(
    private val benefitsService: BenefitService,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPage && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPage{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitListParams> = Optional.empty()

    fun getNextPage(): Optional<HrisBenefitListPage> {
        return getNextPageParams().map { benefitsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            benefitsService: BenefitService,
            params: HrisBenefitListParams,
            items: List<CompanyBenefit>,
        ) = HrisBenefitListPage(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListPage) : Iterable<CompanyBenefit> {

        override fun iterator(): Iterator<CompanyBenefit> = iterator {
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

        fun stream(): Stream<CompanyBenefit> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
