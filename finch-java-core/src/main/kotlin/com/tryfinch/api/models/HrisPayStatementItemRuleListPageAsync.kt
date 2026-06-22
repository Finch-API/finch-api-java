// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.payStatementItem.RuleServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RuleServiceAsync.list */
class HrisPayStatementItemRuleListPageAsync
private constructor(
    private val service: RuleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HrisPayStatementItemRuleListParams,
    private val response: HrisPayStatementItemRuleListPageResponse,
) : PageAsync<RuleListResponse> {

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

    override fun nextPage(): CompletableFuture<HrisPayStatementItemRuleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RuleListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementItemRuleListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementItemRuleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementItemRuleListPageAsync].
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

    /** A builder for [HrisPayStatementItemRuleListPageAsync]. */
    class Builder internal constructor() {

        private var service: RuleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HrisPayStatementItemRuleListParams? = null
        private var response: HrisPayStatementItemRuleListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisPayStatementItemRuleListPageAsync: HrisPayStatementItemRuleListPageAsync
        ) = apply {
            service = hrisPayStatementItemRuleListPageAsync.service
            streamHandlerExecutor = hrisPayStatementItemRuleListPageAsync.streamHandlerExecutor
            params = hrisPayStatementItemRuleListPageAsync.params
            response = hrisPayStatementItemRuleListPageAsync.response
        }

        fun service(service: RuleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementItemRuleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementItemRuleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementItemRuleListPageAsync].
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
        fun build(): HrisPayStatementItemRuleListPageAsync =
            HrisPayStatementItemRuleListPageAsync(
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

        return other is HrisPayStatementItemRuleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "HrisPayStatementItemRuleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
