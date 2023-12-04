// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.jobs.AutomatedService
import com.tryfinch.api.services.blocking.jobs.AutomatedServiceImpl
import com.tryfinch.api.services.blocking.jobs.ManualService
import com.tryfinch.api.services.blocking.jobs.ManualServiceImpl
import com.tryfinch.api.services.errorHandler

class JobServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val automated: AutomatedService by lazy { AutomatedServiceImpl(clientOptions) }

    private val manual: ManualService by lazy { ManualServiceImpl(clientOptions) }

    override fun automated(): AutomatedService = automated

    override fun manual(): ManualService = manual
}
