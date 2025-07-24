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

/** @see DirectoryServiceAsync.listIndividuals */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPageAsync
private constructor(
    private val service: DirectoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) : PageAsync<IndividualInDirectory> {

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListIndividualsPageResponse.individuals
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getOptional("individuals").getOrNull() ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListIndividualsPageResponse.paging
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

    fun nextPageParams(): HrisDirectoryListIndividualsParams {
        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        service.listIndividuals(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndividualInDirectory> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListIndividualsParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisDirectoryListIndividualsPageAsync].
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

    /** A builder for [HrisDirectoryListIndividualsPageAsync]. */
    class Builder internal constructor() {

        private var service: DirectoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisDirectoryListIndividualsParams? = null
        private var response: HrisDirectoryListIndividualsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisDirectoryListIndividualsPageAsync: HrisDirectoryListIndividualsPageAsync
        ) = apply {
            service = hrisDirectoryListIndividualsPageAsync.service
            streamHandlerExecutor = hrisDirectoryListIndividualsPageAsync.streamHandlerExecutor
            params = hrisDirectoryListIndividualsPageAsync.params
            response = hrisDirectoryListIndividualsPageAsync.response
        }

        fun service(service: DirectoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListIndividualsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListIndividualsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisDirectoryListIndividualsPageAsync].
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
        fun build(): HrisDirectoryListIndividualsPageAsync =
            HrisDirectoryListIndividualsPageAsync(
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

        return /* spotless:off */ other is HrisDirectoryListIndividualsPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListIndividualsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
