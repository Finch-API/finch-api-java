// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.PaymentCreateResponse
import com.tryfinch.api.models.SandboxPaymentCreateParams

interface PaymentService {

    /** Add a new sandbox payment */
    @JvmOverloads
    fun create(
        params: SandboxPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentCreateResponse
}
