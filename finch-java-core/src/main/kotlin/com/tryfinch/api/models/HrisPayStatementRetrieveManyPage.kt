// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.PayStatementService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [PayStatementService.retrieveMany] */
class HrisPayStatementRetrieveManyPage
private constructor(
    private val service: PayStatementService,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: HrisPayStatementRetrieveManyPageResponse,
) : Page<PayStatementResponse> {

    /**
     * Delegates to [HrisPayStatementRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisPayStatementRetrieveManyPageResponse.responses]
     */
    fun responses(): List<PayStatementResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<PayStatementResponse> = responses()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HrisPayStatementRetrieveManyParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): HrisPayStatementRetrieveManyPage =
        service.retrieveMany(nextPageParams())

    fun autoPager(): AutoPager<PayStatementResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementRetrieveManyPage].
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

    /** A builder for [HrisPayStatementRetrieveManyPage]. */
    class Builder internal constructor() {

        private var service: PayStatementService? = null
        private var params: HrisPayStatementRetrieveManyParams? = null
        private var response: HrisPayStatementRetrieveManyPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisPayStatementRetrieveManyPage: HrisPayStatementRetrieveManyPage) =
            apply {
                service = hrisPayStatementRetrieveManyPage.service
                params = hrisPayStatementRetrieveManyPage.params
                response = hrisPayStatementRetrieveManyPage.response
            }

        fun service(service: PayStatementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementRetrieveManyPage].
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
        fun build(): HrisPayStatementRetrieveManyPage =
            HrisPayStatementRetrieveManyPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPage{service=$service, params=$params, response=$response}"
}
