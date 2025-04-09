// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get deductions metadata */
class HrisBenefitListSupportedBenefitsPageAsync
private constructor(
    private val benefitsService: BenefitServiceAsync,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: Optional<List<BenefitListSupportedBenefitsResponse>>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): Optional<List<BenefitListSupportedBenefitsResponse>> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPageAsync && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPageAsync{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitListSupportedBenefitsParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisBenefitListSupportedBenefitsPageAsync>> {
        return getNextPageParams()
            .map { benefitsService.listSupportedBenefits(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            benefitsService: BenefitServiceAsync,
            params: HrisBenefitListSupportedBenefitsParams,
            items: Optional<List<BenefitListSupportedBenefitsResponse>>,
        ) = HrisBenefitListSupportedBenefitsPageAsync(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListSupportedBenefitsPageAsync) {

        fun forEach(
            action: Predicate<BenefitListSupportedBenefitsResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisBenefitListSupportedBenefitsPageAsync>>.forEach(
                action: (BenefitListSupportedBenefitsResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<BenefitListSupportedBenefitsResponse>> {
            val values = mutableListOf<BenefitListSupportedBenefitsResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
