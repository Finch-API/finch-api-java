// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.async.sandbox.CompanyServiceAsync
import com.tryfinch.api.services.async.sandbox.CompanyServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.ConnectionServiceAsync
import com.tryfinch.api.services.async.sandbox.ConnectionServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.DirectoryServiceAsync
import com.tryfinch.api.services.async.sandbox.DirectoryServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.EmploymentServiceAsync
import com.tryfinch.api.services.async.sandbox.EmploymentServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.IndividualServiceAsync
import com.tryfinch.api.services.async.sandbox.IndividualServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.JobServiceAsync
import com.tryfinch.api.services.async.sandbox.JobServiceAsyncImpl
import com.tryfinch.api.services.async.sandbox.PaymentServiceAsync
import com.tryfinch.api.services.async.sandbox.PaymentServiceAsyncImpl
import com.tryfinch.api.services.errorHandler

class SandboxServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SandboxServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptions)
    }

    private val company: CompanyServiceAsync by lazy { CompanyServiceAsyncImpl(clientOptions) }

    private val directory: DirectoryServiceAsync by lazy {
        DirectoryServiceAsyncImpl(clientOptions)
    }

    private val individual: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    private val employment: EmploymentServiceAsync by lazy {
        EmploymentServiceAsyncImpl(clientOptions)
    }

    private val payment: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun connections(): ConnectionServiceAsync = connections

    override fun company(): CompanyServiceAsync = company

    override fun directory(): DirectoryServiceAsync = directory

    override fun individual(): IndividualServiceAsync = individual

    override fun employment(): EmploymentServiceAsync = employment

    override fun payment(): PaymentServiceAsync = payment

    override fun jobs(): JobServiceAsync = jobs
}
