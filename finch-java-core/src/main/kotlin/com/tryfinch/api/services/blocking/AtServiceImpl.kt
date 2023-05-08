package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.ats.ApplicationService
import com.tryfinch.api.services.blocking.ats.ApplicationServiceImpl
import com.tryfinch.api.services.blocking.ats.CandidateService
import com.tryfinch.api.services.blocking.ats.CandidateServiceImpl
import com.tryfinch.api.services.blocking.ats.JobService
import com.tryfinch.api.services.blocking.ats.JobServiceImpl
import com.tryfinch.api.services.blocking.ats.OfferService
import com.tryfinch.api.services.blocking.ats.OfferServiceImpl
import com.tryfinch.api.services.blocking.ats.StageService
import com.tryfinch.api.services.blocking.ats.StageServiceImpl
import com.tryfinch.api.services.errorHandler

class AtServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AtService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val candidates: CandidateService by lazy { CandidateServiceImpl(clientOptions) }

    private val applications: ApplicationService by lazy { ApplicationServiceImpl(clientOptions) }

    private val stages: StageService by lazy { StageServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val offers: OfferService by lazy { OfferServiceImpl(clientOptions) }

    override fun candidates(): CandidateService = candidates

    override fun applications(): ApplicationService = applications

    override fun stages(): StageService = stages

    override fun jobs(): JobService = jobs

    override fun offers(): OfferService = offers
}
