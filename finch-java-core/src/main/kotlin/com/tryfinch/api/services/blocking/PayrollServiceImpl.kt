// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.payroll.PayGroupService
import com.tryfinch.api.services.blocking.payroll.PayGroupServiceImpl
import java.util.function.Consumer

class PayrollServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayrollService {

    private val withRawResponse: PayrollService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payGroups: PayGroupService by lazy { PayGroupServiceImpl(clientOptions) }

    override fun withRawResponse(): PayrollService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayrollService =
        PayrollServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun payGroups(): PayGroupService = payGroups

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayrollService.WithRawResponse {

        private val payGroups: PayGroupService.WithRawResponse by lazy {
            PayGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayrollService.WithRawResponse =
            PayrollServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun payGroups(): PayGroupService.WithRawResponse = payGroups
    }
}
