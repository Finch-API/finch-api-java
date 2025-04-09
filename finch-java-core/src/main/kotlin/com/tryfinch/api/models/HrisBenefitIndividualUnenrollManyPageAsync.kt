// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull
import kotlin.jvm.optionals.toList

/** Unenroll individuals from a deduction or contribution */
class HrisBenefitIndividualUnenrollManyPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualUnenrollManyParams,
    private val items: List<IndividualUnenrollManyResponse>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IndividualUnenrollManyResponse> = items

    /** Delegates to [List<IndividualUnenrollManyResponse>], but gracefully handles missing data. */
    fun items(): List<IndividualUnenrollManyResponse> =
        items.flatMap { it.toList() }.getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyPageAsync && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyPageAsync{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitIndividualUnenrollManyParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisBenefitIndividualUnenrollManyPageAsync>> {
        return getNextPageParams()
            .map { individualsService.unenrollMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualUnenrollManyParams,
            items: List<IndividualUnenrollManyResponse>,
        ) = HrisBenefitIndividualUnenrollManyPageAsync(individualsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualUnenrollManyPageAsync) {

        fun forEach(
            action: Predicate<IndividualUnenrollManyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisBenefitIndividualUnenrollManyPageAsync>>.forEach(
                action: (IndividualUnenrollManyResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IndividualUnenrollManyResponse>> {
            val values = mutableListOf<IndividualUnenrollManyResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
