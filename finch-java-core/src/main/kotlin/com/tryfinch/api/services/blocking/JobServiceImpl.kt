// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.jobs.AutomatedService
import com.tryfinch.api.services.blocking.jobs.AutomatedServiceImpl
import com.tryfinch.api.services.blocking.jobs.ManualService
import com.tryfinch.api.services.blocking.jobs.ManualServiceImpl

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val automated: AutomatedService by lazy { AutomatedServiceImpl(clientOptions) }

    private val manual: ManualService by lazy { ManualServiceImpl(clientOptions) }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun automated(): AutomatedService = automated

    override fun manual(): ManualService = manual

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val automated: AutomatedService.WithRawResponse by lazy {
            AutomatedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val manual: ManualService.WithRawResponse by lazy {
            ManualServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun automated(): AutomatedService.WithRawResponse = automated

        override fun manual(): ManualService.WithRawResponse = manual
    }
}
