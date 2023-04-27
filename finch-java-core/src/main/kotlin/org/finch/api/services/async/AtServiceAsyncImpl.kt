package org.finch.api.services.async

import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.services.async.ats.ApplicationServiceAsync
import org.finch.api.services.async.ats.ApplicationServiceAsyncImpl
import org.finch.api.services.async.ats.CandidateServiceAsync
import org.finch.api.services.async.ats.CandidateServiceAsyncImpl
import org.finch.api.services.async.ats.JobServiceAsync
import org.finch.api.services.async.ats.JobServiceAsyncImpl
import org.finch.api.services.async.ats.OfferServiceAsync
import org.finch.api.services.async.ats.OfferServiceAsyncImpl
import org.finch.api.services.async.ats.StageServiceAsync
import org.finch.api.services.async.ats.StageServiceAsyncImpl
import org.finch.api.services.errorHandler

class AtServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AtServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val candidates: CandidateServiceAsync by lazy {
        CandidateServiceAsyncImpl(clientOptions)
    }

    private val applications: ApplicationServiceAsync by lazy {
        ApplicationServiceAsyncImpl(clientOptions)
    }

    private val stages: StageServiceAsync by lazy { StageServiceAsyncImpl(clientOptions) }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val offers: OfferServiceAsync by lazy { OfferServiceAsyncImpl(clientOptions) }

    override fun candidates(): CandidateServiceAsync = candidates

    override fun applications(): ApplicationServiceAsync = applications

    override fun stages(): StageServiceAsync = stages

    override fun jobs(): JobServiceAsync = jobs

    override fun offers(): OfferServiceAsync = offers
}
