// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPager
import com.tryfinch.api.core.Page
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BenefitService.listSupportedBenefits] */
class HrisBenefitListSupportedBenefitsPage
private constructor(
    private val service: BenefitService,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>,
) : Page<BenefitListSupportedBenefitsResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HrisBenefitListSupportedBenefitsParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): HrisBenefitListSupportedBenefitsPage =
        service.listSupportedBenefits(nextPageParams())

    fun autoPager(): AutoPager<BenefitListSupportedBenefitsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListSupportedBenefitsParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BenefitListSupportedBenefitsResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitListSupportedBenefitsPage].
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

    /** A builder for [HrisBenefitListSupportedBenefitsPage]. */
    class Builder internal constructor() {

        private var service: BenefitService? = null
        private var params: HrisBenefitListSupportedBenefitsParams? = null
        private var items: Optional<List<BenefitListSupportedBenefitsResponse>>? = null

        @JvmSynthetic
        internal fun from(
            hrisBenefitListSupportedBenefitsPage: HrisBenefitListSupportedBenefitsPage
        ) = apply {
            service = hrisBenefitListSupportedBenefitsPage.service
            params = hrisBenefitListSupportedBenefitsPage.params
            items = Optional.of(hrisBenefitListSupportedBenefitsPage.items)
        }

        fun service(service: BenefitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListSupportedBenefitsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: Optional<List<BenefitListSupportedBenefitsResponse>>) = apply {
            this.items = items
        }

        /**
         * Returns an immutable instance of [HrisBenefitListSupportedBenefitsPage].
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
        fun build(): HrisBenefitListSupportedBenefitsPage =
            HrisBenefitListSupportedBenefitsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items).getOrNull() ?: emptyList(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPage{service=$service, params=$params, items=$items}"
}
