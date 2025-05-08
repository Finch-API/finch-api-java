// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.company.PayStatementItemService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [PayStatementItemService.list] */
class HrisCompanyPayStatementItemListPage
private constructor(
    private val service: PayStatementItemService,
    private val params: HrisCompanyPayStatementItemListParams,
    private val response: HrisCompanyPayStatementItemListPageResponse,
) : Page<PayStatementItemListResponse> {

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

    override fun nextPage(): HrisCompanyPayStatementItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PayStatementItemListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisCompanyPayStatementItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemListPage].
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

    /** A builder for [HrisCompanyPayStatementItemListPage]. */
    class Builder internal constructor() {

        private var service: PayStatementItemService? = null
        private var params: HrisCompanyPayStatementItemListParams? = null
        private var response: HrisCompanyPayStatementItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisCompanyPayStatementItemListPage: HrisCompanyPayStatementItemListPage
        ) = apply {
            service = hrisCompanyPayStatementItemListPage.service
            params = hrisCompanyPayStatementItemListPage.params
            response = hrisCompanyPayStatementItemListPage.response
        }

        fun service(service: PayStatementItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisCompanyPayStatementItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisCompanyPayStatementItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemListPage].
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
        fun build(): HrisCompanyPayStatementItemListPage =
            HrisCompanyPayStatementItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPage{service=$service, params=$params, response=$response}"
}
