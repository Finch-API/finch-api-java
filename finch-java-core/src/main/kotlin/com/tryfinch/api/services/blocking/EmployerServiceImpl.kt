package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.employer.BenefitService
import com.tryfinch.api.services.blocking.employer.BenefitServiceImpl
import com.tryfinch.api.services.errorHandler

class EmployerServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EmployerService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val benefits: BenefitService by lazy { BenefitServiceImpl(clientOptions) }

    override fun benefits(): BenefitService = benefits
}
