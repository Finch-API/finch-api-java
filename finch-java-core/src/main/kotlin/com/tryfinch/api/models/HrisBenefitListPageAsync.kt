// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [BenefitServiceAsync.list] */
class HrisBenefitListPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisBenefitListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisBenefitListPageAsync].
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

    /** A builder for [HrisBenefitListPageAsync]. */
    class Builder internal constructor() {

        private var service: BenefitServiceAsync? = null
        private var params: HrisBenefitListParams? = null
        private var items: List<CompanyBenefit>? = null

        @JvmSynthetic
        internal fun from(hrisBenefitListPageAsync: HrisBenefitListPageAsync) = apply {
            service = hrisBenefitListPageAsync.service
            params = hrisBenefitListPageAsync.params
            items = hrisBenefitListPageAsync.items
        }

        fun service(service: BenefitServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CompanyBenefit>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitListPageAsync].
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
        fun build(): HrisBenefitListPageAsync =
            HrisBenefitListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPageAsync{service=$service, params=$params, items=$items}"
}
