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

/** @see DirectoryService.listIndividuals */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPage
private constructor(
    private val service: DirectoryService,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) : Page<IndividualInDirectory> {

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

    override fun nextPage(): HrisDirectoryListIndividualsPage =
        service.listIndividuals(nextPageParams())

    fun autoPager(): AutoPager<IndividualInDirectory> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListIndividualsParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisDirectoryListIndividualsPage].
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

    /** A builder for [HrisDirectoryListIndividualsPage]. */
    class Builder internal constructor() {

        private var service: DirectoryService? = null
        private var params: HrisDirectoryListIndividualsParams? = null
        private var response: HrisDirectoryListIndividualsPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisDirectoryListIndividualsPage: HrisDirectoryListIndividualsPage) =
            apply {
                service = hrisDirectoryListIndividualsPage.service
                params = hrisDirectoryListIndividualsPage.params
                response = hrisDirectoryListIndividualsPage.response
            }

        fun service(service: DirectoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListIndividualsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListIndividualsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisDirectoryListIndividualsPage].
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
        fun build(): HrisDirectoryListIndividualsPage =
            HrisDirectoryListIndividualsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListIndividualsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListIndividualsPage{service=$service, params=$params, response=$response}"
}
