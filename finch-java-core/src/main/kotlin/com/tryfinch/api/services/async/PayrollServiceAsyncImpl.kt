// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsyncImpl

class PayrollServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PayrollServiceAsync {

    private val withRawResponse: PayrollServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payGroups: PayGroupServiceAsync by lazy { PayGroupServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PayrollServiceAsync.WithRawResponse = withRawResponse

    override fun payGroups(): PayGroupServiceAsync = payGroups

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayrollServiceAsync.WithRawResponse {

        private val payGroups: PayGroupServiceAsync.WithRawResponse by lazy {
            PayGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun payGroups(): PayGroupServiceAsync.WithRawResponse = payGroups
    }
}
