@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriPaymentListPageAsync
import com.tryfinch.api.models.HriPaymentListParams
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /** Read payroll and contractor related payments by the company. */
    @JvmOverloads
    fun list(
        params: HriPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriPaymentListPageAsync>
}
