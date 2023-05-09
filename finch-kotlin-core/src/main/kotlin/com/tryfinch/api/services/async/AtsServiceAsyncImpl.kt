package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.async.ats.ApplicationServiceAsync
import com.tryfinch.api.services.async.ats.ApplicationServiceAsyncImpl
import com.tryfinch.api.services.async.ats.CandidateServiceAsync
import com.tryfinch.api.services.async.ats.CandidateServiceAsyncImpl
import com.tryfinch.api.services.async.ats.JobServiceAsync
import com.tryfinch.api.services.async.ats.JobServiceAsyncImpl
import com.tryfinch.api.services.async.ats.OfferServiceAsync
import com.tryfinch.api.services.async.ats.OfferServiceAsyncImpl
import com.tryfinch.api.services.async.ats.StageServiceAsync
import com.tryfinch.api.services.async.ats.StageServiceAsyncImpl
import com.tryfinch.api.services.errorHandler

class AtsServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AtsServiceAsync {

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
