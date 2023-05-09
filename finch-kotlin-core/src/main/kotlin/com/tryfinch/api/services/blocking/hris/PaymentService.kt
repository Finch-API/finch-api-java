@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriPaymentListPage
import com.tryfinch.api.models.HriPaymentListParams

interface PaymentService {

    /** Read payroll and contractor related payments by the company. */
    fun list(
        params: HriPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriPaymentListPage
}
