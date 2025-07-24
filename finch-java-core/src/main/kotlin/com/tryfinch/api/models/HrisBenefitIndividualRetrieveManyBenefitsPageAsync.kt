// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see IndividualServiceAsync.retrieveManyBenefits */
class HrisBenefitIndividualRetrieveManyBenefitsPageAsync
private constructor(
    private val service: IndividualServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) : PageAsync<IndividualBenefit> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisBenefitIndividualRetrieveManyBenefitsParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        service.retrieveManyBenefits(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndividualBenefit> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitIndividualRetrieveManyBenefitsParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IndividualBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitIndividualRetrieveManyBenefitsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitIndividualRetrieveManyBenefitsPageAsync]. */
    class Builder internal constructor() {

        private var service: IndividualServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisBenefitIndividualRetrieveManyBenefitsParams? = null
        private var items: List<IndividualBenefit>? = null

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualRetrieveManyBenefitsPageAsync:
                HrisBenefitIndividualRetrieveManyBenefitsPageAsync
        ) = apply {
            service = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.service
            streamHandlerExecutor =
                hrisBenefitIndividualRetrieveManyBenefitsPageAsync.streamHandlerExecutor
            params = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.params
            items = hrisBenefitIndividualRetrieveManyBenefitsPageAsync.items
        }

        fun service(service: IndividualServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisBenefitIndividualRetrieveManyBenefitsPageAsync =
            HrisBenefitIndividualRetrieveManyBenefitsPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
