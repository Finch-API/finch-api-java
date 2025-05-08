// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.payroll.PayGroupService
import java.util.Objects

/** @see [PayGroupService.list] */
class PayrollPayGroupListPage
private constructor(
    private val service: PayGroupService,
    private val params: PayrollPayGroupListParams,
    private val items: List<PayGroupListResponse>,
) : Page<PayGroupListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PayrollPayGroupListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): PayrollPayGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PayGroupListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PayrollPayGroupListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PayGroupListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayrollPayGroupListPage].
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

    /** A builder for [PayrollPayGroupListPage]. */
    class Builder internal constructor() {

        private var service: PayGroupService? = null
        private var params: PayrollPayGroupListParams? = null
        private var items: List<PayGroupListResponse>? = null

        @JvmSynthetic
        internal fun from(payrollPayGroupListPage: PayrollPayGroupListPage) = apply {
            service = payrollPayGroupListPage.service
            params = payrollPayGroupListPage.params
            items = payrollPayGroupListPage.items
        }

        fun service(service: PayGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PayrollPayGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PayGroupListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PayrollPayGroupListPage].
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
        fun build(): PayrollPayGroupListPage =
            PayrollPayGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPage{service=$service, params=$params, items=$items}"
}
