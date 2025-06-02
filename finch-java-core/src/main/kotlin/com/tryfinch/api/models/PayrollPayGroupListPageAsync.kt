// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [PayGroupServiceAsync.list] */
class PayrollPayGroupListPageAsync
private constructor(
    private val service: PayGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PayrollPayGroupListParams,
    private val items: List<PayGroupListResponse>,
) : PageAsync<PayGroupListResponse> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): PayrollPayGroupListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<PayrollPayGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayGroupListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PayrollPayGroupListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PayGroupListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayrollPayGroupListPageAsync].
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

    /** A builder for [PayrollPayGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PayrollPayGroupListParams? = null
        private var items: List<PayGroupListResponse>? = null

        @JvmSynthetic
        internal fun from(payrollPayGroupListPageAsync: PayrollPayGroupListPageAsync) = apply {
            service = payrollPayGroupListPageAsync.service
            streamHandlerExecutor = payrollPayGroupListPageAsync.streamHandlerExecutor
            params = payrollPayGroupListPageAsync.params
            items = payrollPayGroupListPageAsync.items
        }

        fun service(service: PayGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PayrollPayGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PayGroupListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PayrollPayGroupListPageAsync].
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
        fun build(): PayrollPayGroupListPageAsync =
            PayrollPayGroupListPageAsync(
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

        return /* spotless:off */ other is PayrollPayGroupListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
