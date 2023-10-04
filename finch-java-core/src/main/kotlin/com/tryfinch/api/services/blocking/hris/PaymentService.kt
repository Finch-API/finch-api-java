// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisPaymentListPage
import com.tryfinch.api.models.HrisPaymentListParams

interface PaymentService {

    /** Read payroll and contractor related payments by the company. */
    @JvmOverloads
    fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisPaymentListPage
}
