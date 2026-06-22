// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.PayStatementItemService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see PayStatementItemService.list */
class HrisPayStatementItemListPage
private constructor(
    private val service: PayStatementItemService,
    private val params: HrisPayStatementItemListParams,
    private val response: HrisPayStatementItemListPageResponse,
) : Page<PayStatementItemListResponse> {

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

    override fun nextPage(): HrisPayStatementItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PayStatementItemListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisPayStatementItemListPage].
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

    /** A builder for [HrisPayStatementItemListPage]. */
    class Builder internal constructor() {

        private var service: PayStatementItemService? = null
        private var params: HrisPayStatementItemListParams? = null
        private var response: HrisPayStatementItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisPayStatementItemListPage: HrisPayStatementItemListPage) = apply {
            service = hrisPayStatementItemListPage.service
            params = hrisPayStatementItemListPage.params
            response = hrisPayStatementItemListPage.response
        }

        fun service(service: PayStatementItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementItemListPage].
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
        fun build(): HrisPayStatementItemListPage =
            HrisPayStatementItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPayStatementItemListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HrisPayStatementItemListPage{service=$service, params=$params, response=$response}"
}
