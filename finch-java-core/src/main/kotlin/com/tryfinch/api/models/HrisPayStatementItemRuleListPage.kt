// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.payStatementItem.RuleService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see RuleService.list */
class HrisPayStatementItemRuleListPage
private constructor(
    private val service: RuleService,
    private val params: HrisPayStatementItemRuleListParams,
    private val response: HrisPayStatementItemRuleListPageResponse,
) : Page<RuleListResponse> {

    /**
     * Delegates to [HrisPayStatementItemRuleListPageResponse], but gracefully handles missing data.
     *
     * @see HrisPayStatementItemRuleListPageResponse.responses
     */
    fun responses(): List<RuleListResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun items(): List<RuleListResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisPayStatementItemRuleListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): HrisPayStatementItemRuleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RuleListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementItemRuleListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementItemRuleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementItemRuleListPage].
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

    /** A builder for [HrisPayStatementItemRuleListPage]. */
    class Builder internal constructor() {

        private var service: RuleService? = null
        private var params: HrisPayStatementItemRuleListParams? = null
        private var response: HrisPayStatementItemRuleListPageResponse? = null

        @JvmSynthetic
        internal fun from(hrisPayStatementItemRuleListPage: HrisPayStatementItemRuleListPage) =
            apply {
                service = hrisPayStatementItemRuleListPage.service
                params = hrisPayStatementItemRuleListPage.params
                response = hrisPayStatementItemRuleListPage.response
            }

        fun service(service: RuleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementItemRuleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementItemRuleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementItemRuleListPage].
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
        fun build(): HrisPayStatementItemRuleListPage =
            HrisPayStatementItemRuleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPayStatementItemRuleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HrisPayStatementItemRuleListPage{service=$service, params=$params, response=$response}"
}
