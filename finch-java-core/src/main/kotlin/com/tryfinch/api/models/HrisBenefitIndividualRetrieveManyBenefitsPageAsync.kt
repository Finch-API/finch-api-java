// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [IndividualServiceAsync.retrieveManyBenefits] */
class HrisBenefitIndividualRetrieveManyBenefitsPageAsync
private constructor(
    private val service: IndividualServiceAsync,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitIndividualRetrieveManyBenefitsParams> =
        Optional.empty()

    fun getNextPage():
        CompletableFuture<Optional<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> =
        getNextPageParams()
            .map { service.retrieveManyBenefits(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitIndividualRetrieveManyBenefitsParams = params

    /** The response that this page was parsed from. */
    fun items(): List<IndividualBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitIndividualRetrieveManyBenefitsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitIndividualRetrieveManyBenefitsPageAsync]. */
    class Builder internal constructor() {

        private var service: IndividualServiceAsync? = null
        private var params: HrisBenefitIndividualRetrieveManyBenefitsParams? = null
        private var items: List<IndividualBenefit>? = null

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualRetrieveManyBenefitsPageAsync:
                HrisBenefitIndividualRetrieveManyBenefitsPageAsync
        ) = apply {
            service = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.service
            params = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.params
            items = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.items
        }

        fun service(service: IndividualServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitIndividualRetrieveManyBenefitsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun items(items: List<IndividualBenefit>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitIndividualRetrieveManyBenefitsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisBenefitIndividualRetrieveManyBenefitsPageAsync =
            HrisBenefitIndividualRetrieveManyBenefitsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPageAsync{service=$service, params=$params, items=$items}"
}
