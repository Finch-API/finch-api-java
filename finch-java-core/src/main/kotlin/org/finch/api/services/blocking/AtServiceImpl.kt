package org.finch.api.services.blocking

import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.services.blocking.ats.ApplicationService
import org.finch.api.services.blocking.ats.ApplicationServiceImpl
import org.finch.api.services.blocking.ats.CandidateService
import org.finch.api.services.blocking.ats.CandidateServiceImpl
import org.finch.api.services.blocking.ats.JobService
import org.finch.api.services.blocking.ats.JobServiceImpl
import org.finch.api.services.blocking.ats.OfferService
import org.finch.api.services.blocking.ats.OfferServiceImpl
import org.finch.api.services.blocking.ats.StageService
import org.finch.api.services.blocking.ats.StageServiceImpl
import org.finch.api.services.errorHandler

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
