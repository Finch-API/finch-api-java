// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.sandbox.jobs.ConfigurationService
import com.tryfinch.api.services.blocking.sandbox.jobs.ConfigurationServiceImpl
import com.tryfinch.api.services.errorHandler

class JobServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val configuration: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptions)
    }

    override fun configuration(): ConfigurationService = configuration
}
