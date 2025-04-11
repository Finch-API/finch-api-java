// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BenefitServiceAsync.listSupportedBenefits] */
class HrisBenefitListSupportedBenefitsPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): Optional<HrisBenefitListSupportedBenefitsParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisBenefitListSupportedBenefitsPageAsync>> =
        getNextPageParams()
            .map { service.listSupportedBenefits(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListSupportedBenefitsParams = params

    /** The response that this page was parsed from. */
    fun items(): List<BenefitListSupportedBenefitsResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitListSupportedBenefitsPageAsync].
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

    /** A builder for [HrisBenefitListSupportedBenefitsPageAsync]. */
    class Builder internal constructor() {

        private var service: BenefitServiceAsync? = null
        private var params: HrisBenefitListSupportedBenefitsParams? = null
        private var items: Optional<List<BenefitListSupportedBenefitsResponse>>? = null

        @JvmSynthetic
        internal fun from(
            hrisBenefitListSupportedBenefitsPageAsync: HrisBenefitListSupportedBenefitsPageAsync
        ) = apply {
            service = hrisBenefitListSupportedBenefitsPageAsync.service
            params = hrisBenefitListSupportedBenefitsPageAsync.params
            items = Optional.of(hrisBenefitListSupportedBenefitsPageAsync.items)
        }

        fun service(service: BenefitServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListSupportedBenefitsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: Optional<List<BenefitListSupportedBenefitsResponse>>) = apply {
            this.items = items
        }

        /**
         * Returns an immutable instance of [HrisBenefitListSupportedBenefitsPageAsync].
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
        fun build(): HrisBenefitListSupportedBenefitsPageAsync =
            HrisBenefitListSupportedBenefitsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items).getOrNull() ?: emptyList(),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPageAsync{service=$service, params=$params, items=$items}"
}
