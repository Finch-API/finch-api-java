// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.ProviderService
import java.util.Objects

/** @see ProviderService.list */
class ProviderListPage
private constructor(
    private val service: ProviderService,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) : Page<Provider> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): ProviderListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): ProviderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Provider> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProviderListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Provider> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProviderListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderListPage]. */
    class Builder internal constructor() {

        private var service: ProviderService? = null
        private var params: ProviderListParams? = null
        private var items: List<Provider>? = null

        @JvmSynthetic
        internal fun from(providerListPage: ProviderListPage) = apply {
            service = providerListPage.service
            params = providerListPage.params
            items = providerListPage.items
        }

        fun service(service: ProviderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Provider>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ProviderListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderListPage =
            ProviderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProviderListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "ProviderListPage{service=$service, params=$params, items=$items}"
}
