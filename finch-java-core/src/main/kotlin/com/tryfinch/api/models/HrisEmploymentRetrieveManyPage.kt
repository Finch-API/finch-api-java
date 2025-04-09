// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.EmploymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [EmploymentService.retrieveMany] */
class HrisEmploymentRetrieveManyPage
private constructor(
    private val service: EmploymentService,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) {

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisEmploymentRetrieveManyPageResponse.responses]
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisEmploymentRetrieveManyParams> = Optional.empty()

    fun getNextPage(): Optional<HrisEmploymentRetrieveManyPage> =
        getNextPageParams().map { service.retrieveMany(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: HrisEmploymentRetrieveManyPage) :
        Iterable<EmploymentDataResponse> {

        override fun iterator(): Iterator<EmploymentDataResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<EmploymentDataResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
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
