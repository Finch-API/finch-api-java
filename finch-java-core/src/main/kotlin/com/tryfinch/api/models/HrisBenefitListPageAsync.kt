// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List all company-wide deductions and contributions. */
class HrisBenefitListPageAsync
private constructor(
    private val benefitsService: BenefitServiceAsync,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPageAsync && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPageAsync{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisBenefitListPageAsync>> {
        return getNextPageParams()
            .map { benefitsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            benefitsService: BenefitServiceAsync,
            params: HrisBenefitListParams,
            items: List<CompanyBenefit>,
        ) = HrisBenefitListPageAsync(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListPageAsync) {

        fun forEach(
            action: Predicate<CompanyBenefit>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisBenefitListPageAsync>>.forEach(
                action: (CompanyBenefit) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CompanyBenefit>> {
            val values = mutableListOf<CompanyBenefit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
