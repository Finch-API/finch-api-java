// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [BenefitServiceAsync.list] */
class HrisBenefitListPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) : PageAsync<CompanyBenefit> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HrisBenefitListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<HrisBenefitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CompanyBenefit> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CompanyBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisBenefitListPageAsync].
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

    /** A builder for [HrisBenefitListPageAsync]. */
    class Builder internal constructor() {

        private var service: BenefitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisBenefitListParams? = null
        private var items: List<CompanyBenefit>? = null

        @JvmSynthetic
        internal fun from(hrisBenefitListPageAsync: HrisBenefitListPageAsync) = apply {
            service = hrisBenefitListPageAsync.service
            streamHandlerExecutor = hrisBenefitListPageAsync.streamHandlerExecutor
            params = hrisBenefitListPageAsync.params
            items = hrisBenefitListPageAsync.items
        }

        fun service(service: BenefitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisBenefitListPageAsync =
            HrisBenefitListPageAsync(
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

        return /* spotless:off */ other is HrisBenefitListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
