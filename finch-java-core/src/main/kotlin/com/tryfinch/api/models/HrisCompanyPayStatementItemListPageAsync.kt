// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.company.PayStatementItemServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PayStatementItemServiceAsync.list] */
class HrisCompanyPayStatementItemListPageAsync
private constructor(
    private val service: PayStatementItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisCompanyPayStatementItemListParams,
    private val response: HrisCompanyPayStatementItemListPageResponse,
) : PageAsync<PayStatementItemListResponse> {

    /**
     * Delegates to [HrisCompanyPayStatementItemListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [HrisCompanyPayStatementItemListPageResponse.responses]
     */
    fun responses(): List<PayStatementItemListResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<PayStatementItemListResponse> = responses()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HrisCompanyPayStatementItemListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<HrisCompanyPayStatementItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayStatementItemListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisCompanyPayStatementItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisCompanyPayStatementItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayStatementItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisCompanyPayStatementItemListParams? = null
        private var response: HrisCompanyPayStatementItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisCompanyPayStatementItemListPageAsync: HrisCompanyPayStatementItemListPageAsync
        ) = apply {
            service = hrisCompanyPayStatementItemListPageAsync.service
            streamHandlerExecutor = hrisCompanyPayStatementItemListPageAsync.streamHandlerExecutor
            params = hrisCompanyPayStatementItemListPageAsync.params
            response = hrisCompanyPayStatementItemListPageAsync.response
        }

        fun service(service: PayStatementItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisCompanyPayStatementItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisCompanyPayStatementItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisCompanyPayStatementItemListPageAsync =
            HrisCompanyPayStatementItemListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
