package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.async.employer.BenefitServiceAsync
import com.tryfinch.api.services.async.employer.BenefitServiceAsyncImpl
import com.tryfinch.api.services.errorHandler

class EmployerServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EmployerServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val benefits: BenefitServiceAsync by lazy { BenefitServiceAsyncImpl(clientOptions) }

    override fun benefits(): BenefitServiceAsync = benefits
}
