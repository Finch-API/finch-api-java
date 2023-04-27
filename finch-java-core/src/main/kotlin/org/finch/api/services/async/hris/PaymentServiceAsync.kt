@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisPaymentListPageAsync
import org.finch.api.models.HrisPaymentListParams

interface PaymentServiceAsync {

    /** Read payroll and contractor related payments by the company. */
    @JvmOverloads
    fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisPaymentListPageAsync>
}
