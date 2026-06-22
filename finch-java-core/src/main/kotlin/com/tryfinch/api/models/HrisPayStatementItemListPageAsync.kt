// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.PayStatementItemServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PayStatementItemServiceAsync.list */
class HrisPayStatementItemListPageAsync
private constructor(
    private val service: PayStatementItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisPayStatementItemListParams,
    private val response: HrisPayStatementItemListPageResponse,
) : PageAsync<PayStatementItemListResponse> {

    /**
     * Delegates to [HrisPayStatementItemListPageResponse], but gracefully handles missing data.
     *
     * @see HrisPayStatementItemListPageResponse.responses
     */
    fun responses(): List<PayStatementItemListResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<PayStatementItemListResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisPayStatementItemListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<HrisPayStatementItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayStatementItemListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementItemListPageAsync].
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

    /** A builder for [HrisPayStatementItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayStatementItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisPayStatementItemListParams? = null
        private var response: HrisPayStatementItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisPayStatementItemListPageAsync: HrisPayStatementItemListPageAsync) =
            apply {
                service = hrisPayStatementItemListPageAsync.service
                streamHandlerExecutor = hrisPayStatementItemListPageAsync.streamHandlerExecutor
                params = hrisPayStatementItemListPageAsync.params
                response = hrisPayStatementItemListPageAsync.response
            }

        fun service(service: PayStatementItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementItemListPageAsync].
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
        fun build(): HrisPayStatementItemListPageAsync =
            HrisPayStatementItemListPageAsync(
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

        return other is HrisPayStatementItemListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "HrisPayStatementItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
