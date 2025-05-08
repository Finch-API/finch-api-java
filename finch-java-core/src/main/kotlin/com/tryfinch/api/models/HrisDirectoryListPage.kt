// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [DirectoryService.list] */
class HrisDirectoryListPage
private constructor(
    private val service: DirectoryService,
    private val params: HrisDirectoryListParams,
    private val response: HrisDirectoryListPageResponse,
) : Page<IndividualInDirectory> {

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.individuals]
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getOptional("individuals").getOrNull() ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.paging]
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

    override fun nextPage(): HrisDirectoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IndividualInDirectory> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisDirectoryListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisDirectoryListPage]. */
    class Builder internal constructor() {

        private var service: DirectoryService? = null
        private var params: HrisDirectoryListParams? = null
        private var response: HrisDirectoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisDirectoryListPage: HrisDirectoryListPage) = apply {
            service = hrisDirectoryListPage.service
            params = hrisDirectoryListPage.params
            response = hrisDirectoryListPage.response
        }

        fun service(service: DirectoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HrisDirectoryListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisDirectoryListPage =
            HrisDirectoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPage{service=$service, params=$params, response=$response}"
}
