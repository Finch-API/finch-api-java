// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.EmploymentService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see EmploymentService.retrieveMany */
class HrisEmploymentRetrieveManyPage
private constructor(
    private val service: EmploymentService,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) : Page<EmploymentDataResponse> {

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see HrisEmploymentRetrieveManyPageResponse.responses
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<EmploymentDataResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisEmploymentRetrieveManyParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): HrisEmploymentRetrieveManyPage = service.retrieveMany(nextPageParams())

    fun autoPager(): AutoPager<EmploymentDataResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisEmploymentRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisEmploymentRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisEmploymentRetrieveManyPage].
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

    /** A builder for [HrisEmploymentRetrieveManyPage]. */
    class Builder internal constructor() {

        private var service: EmploymentService? = null
        private var params: HrisEmploymentRetrieveManyParams? = null
        private var response: HrisEmploymentRetrieveManyPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisEmploymentRetrieveManyPage: HrisEmploymentRetrieveManyPage) = apply {
            service = hrisEmploymentRetrieveManyPage.service
            params = hrisEmploymentRetrieveManyPage.params
            response = hrisEmploymentRetrieveManyPage.response
        }

        fun service(service: EmploymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisEmploymentRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisEmploymentRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisEmploymentRetrieveManyPage].
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
        fun build(): HrisEmploymentRetrieveManyPage =
            HrisEmploymentRetrieveManyPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPage{service=$service, params=$params, response=$response}"
}
