package org.finch.api.services.async

import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.services.async.hris.BenefitServiceAsync
import org.finch.api.services.async.hris.BenefitServiceAsyncImpl
import org.finch.api.services.async.hris.CompanyServiceAsync
import org.finch.api.services.async.hris.CompanyServiceAsyncImpl
import org.finch.api.services.async.hris.DirectoryServiceAsync
import org.finch.api.services.async.hris.DirectoryServiceAsyncImpl
import org.finch.api.services.async.hris.IndividualServiceAsync
import org.finch.api.services.async.hris.IndividualServiceAsyncImpl
import org.finch.api.services.async.hris.PayStatementServiceAsync
import org.finch.api.services.async.hris.PayStatementServiceAsyncImpl
import org.finch.api.services.async.hris.PaymentServiceAsync
import org.finch.api.services.async.hris.PaymentServiceAsyncImpl
import org.finch.api.services.errorHandler

class HriServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : HriServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val company: CompanyServiceAsync by lazy { CompanyServiceAsyncImpl(clientOptions) }

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val payStatements: PayStatementServiceAsync by lazy {
        PayStatementServiceAsyncImpl(clientOptions)
    }

    private val directory: DirectoryServiceAsync by lazy {
        DirectoryServiceAsyncImpl(clientOptions)
    }

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    private val benefits: BenefitServiceAsync by lazy { BenefitServiceAsyncImpl(clientOptions) }

    override fun company(): CompanyServiceAsync = company

    override fun payments(): PaymentServiceAsync = payments

    override fun payStatements(): PayStatementServiceAsync = payStatements

    override fun directory(): DirectoryServiceAsync = directory

    override fun individuals(): IndividualServiceAsync = individuals

    override fun benefits(): BenefitServiceAsync = benefits
}
