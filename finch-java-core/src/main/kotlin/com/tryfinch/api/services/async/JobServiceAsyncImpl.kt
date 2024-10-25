// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsyncImpl
import com.tryfinch.api.services.async.jobs.ManualServiceAsync
import com.tryfinch.api.services.async.jobs.ManualServiceAsyncImpl

class JobServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobServiceAsync {

    private val automated: AutomatedServiceAsync by lazy {
        AutomatedServiceAsyncImpl(clientOptions)
    }

    private val manual: ManualServiceAsync by lazy { ManualServiceAsyncImpl(clientOptions) }

    override fun automated(): AutomatedServiceAsync = automated

    override fun manual(): ManualServiceAsync = manual
}
