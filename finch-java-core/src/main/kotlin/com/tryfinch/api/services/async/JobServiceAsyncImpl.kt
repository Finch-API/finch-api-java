// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsyncImpl
import com.tryfinch.api.services.async.jobs.ManualServiceAsync
import com.tryfinch.api.services.async.jobs.ManualServiceAsyncImpl

class JobServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val automated: AutomatedServiceAsync by lazy { AutomatedServiceAsyncImpl(clientOptions) }

    private val manual: ManualServiceAsync by lazy { ManualServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun automated(): AutomatedServiceAsync = automated

    override fun manual(): ManualServiceAsync = manual

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : JobServiceAsync.WithRawResponse {

        private val automated: AutomatedServiceAsync.WithRawResponse by lazy { AutomatedServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        private val manual: ManualServiceAsync.WithRawResponse by lazy { ManualServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun automated(): AutomatedServiceAsync.WithRawResponse = automated

        override fun manual(): ManualServiceAsync.WithRawResponse = manual
    }
}
