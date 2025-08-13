// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PayStatementServiceAsync.retrieveMany */
class HrisPayStatementRetrieveManyPageAsync
private constructor(
    private val service: PayStatementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: HrisPayStatementRetrieveManyPageResponse,
) : PageAsync<PayStatementResponse> {

    /**
     * Delegates to [HrisPayStatementRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see HrisPayStatementRetrieveManyPageResponse.responses
     */
    fun responses(): List<PayStatementResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<PayStatementResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisPayStatementRetrieveManyParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<HrisPayStatementRetrieveManyPageAsync> =
        service.retrieveMany(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayStatementResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementRetrieveManyPageAsync].
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

    /** A builder for [HrisPayStatementRetrieveManyPageAsync]. */
    class Builder internal constructor() {

        private var service: PayStatementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisPayStatementRetrieveManyParams? = null
        private var response: HrisPayStatementRetrieveManyPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisPayStatementRetrieveManyPageAsync: HrisPayStatementRetrieveManyPageAsync
        ) = apply {
            service = hrisPayStatementRetrieveManyPageAsync.service
            streamHandlerExecutor = hrisPayStatementRetrieveManyPageAsync.streamHandlerExecutor
            params = hrisPayStatementRetrieveManyPageAsync.params
            response = hrisPayStatementRetrieveManyPageAsync.response
        }

        fun service(service: PayStatementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementRetrieveManyPageAsync].
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
        fun build(): HrisPayStatementRetrieveManyPageAsync =
            HrisPayStatementRetrieveManyPageAsync(
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

        return other is HrisPayStatementRetrieveManyPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "HrisPayStatementRetrieveManyPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
