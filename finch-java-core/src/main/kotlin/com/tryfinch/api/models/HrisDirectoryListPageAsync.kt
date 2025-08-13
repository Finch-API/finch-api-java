// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DirectoryServiceAsync.list */
class HrisDirectoryListPageAsync
private constructor(
    private val service: DirectoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisDirectoryListParams,
    private val response: HrisDirectoryListPageResponse,
) : PageAsync<IndividualInDirectory> {

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListPageResponse.individuals
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getOptional("individuals").getOrNull() ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListPageResponse.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<IndividualInDirectory> = individuals()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        val totalCount =
            paging().flatMap { it._count().getOptional("count") }.getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): HrisDirectoryListParams {
        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<HrisDirectoryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndividualInDirectory> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisDirectoryListPageAsync].
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

    /** A builder for [HrisDirectoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: DirectoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisDirectoryListParams? = null
        private var response: HrisDirectoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisDirectoryListPageAsync: HrisDirectoryListPageAsync) = apply {
            service = hrisDirectoryListPageAsync.service
            streamHandlerExecutor = hrisDirectoryListPageAsync.streamHandlerExecutor
            params = hrisDirectoryListPageAsync.params
            response = hrisDirectoryListPageAsync.response
        }

        fun service(service: DirectoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HrisDirectoryListPageAsync].
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
        fun build(): HrisDirectoryListPageAsync =
            HrisDirectoryListPageAsync(
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

        return other is HrisDirectoryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "HrisDirectoryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
