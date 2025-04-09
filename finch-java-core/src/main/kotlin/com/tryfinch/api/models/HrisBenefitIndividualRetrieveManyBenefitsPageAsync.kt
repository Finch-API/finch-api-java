// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get enrollment information for the given individuals. */
class HrisBenefitIndividualRetrieveManyBenefitsPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IndividualBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPageAsync && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPageAsync{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitIndividualRetrieveManyBenefitsParams> =
        Optional.empty()

    fun getNextPage():
        CompletableFuture<Optional<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> {
        return getNextPageParams()
            .map { individualsService.retrieveManyBenefits(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            items: List<IndividualBenefit>,
        ) = HrisBenefitIndividualRetrieveManyBenefitsPageAsync(individualsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualRetrieveManyBenefitsPageAsync) {

        fun forEach(
            action: Predicate<IndividualBenefit>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>>
                .forEach(
                action: (IndividualBenefit) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IndividualBenefit>> {
            val values = mutableListOf<IndividualBenefit>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
