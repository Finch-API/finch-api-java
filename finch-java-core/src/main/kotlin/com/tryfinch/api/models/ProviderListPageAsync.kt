// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [ProviderServiceAsync.list] */
class ProviderListPageAsync
private constructor(
    private val service: ProviderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) : PageAsync<Provider> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): ProviderListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<ProviderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Provider> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProviderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Provider> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProviderListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProviderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProviderListParams? = null
        private var items: List<Provider>? = null

        @JvmSynthetic
        internal fun from(providerListPageAsync: ProviderListPageAsync) = apply {
            service = providerListPageAsync.service
            streamHandlerExecutor = providerListPageAsync.streamHandlerExecutor
            params = providerListPageAsync.params
            items = providerListPageAsync.items
        }

        fun service(service: ProviderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Provider>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ProviderListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderListPageAsync =
            ProviderListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
