// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import com.tryfinch.api.services.async.hris.BenefitServiceAsyncImpl
import com.tryfinch.api.services.async.hris.CompanyServiceAsync
import com.tryfinch.api.services.async.hris.CompanyServiceAsyncImpl
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import com.tryfinch.api.services.async.hris.DirectoryServiceAsyncImpl
import com.tryfinch.api.services.async.hris.DocumentServiceAsync
import com.tryfinch.api.services.async.hris.DocumentServiceAsyncImpl
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import com.tryfinch.api.services.async.hris.EmploymentServiceAsyncImpl
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.IndividualServiceAsyncImpl
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import com.tryfinch.api.services.async.hris.PayStatementServiceAsyncImpl
import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import com.tryfinch.api.services.async.hris.PaymentServiceAsyncImpl

class HrisServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HrisServiceAsync {

    private val withRawResponse: HrisServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val company: CompanyServiceAsync by lazy { CompanyServiceAsyncImpl(clientOptions) }

    private val directory: DirectoryServiceAsync by lazy {
        DirectoryServiceAsyncImpl(clientOptions)
    }

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    private val employments: EmploymentServiceAsync by lazy {
        EmploymentServiceAsyncImpl(clientOptions)
    }

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val payStatements: PayStatementServiceAsync by lazy {
        PayStatementServiceAsyncImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val benefits: BenefitServiceAsync by lazy { BenefitServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): HrisServiceAsync.WithRawResponse = withRawResponse

    override fun company(): CompanyServiceAsync = company

    override fun directory(): DirectoryServiceAsync = directory

    override fun individuals(): IndividualServiceAsync = individuals

    override fun employments(): EmploymentServiceAsync = employments

    override fun payments(): PaymentServiceAsync = payments

    override fun payStatements(): PayStatementServiceAsync = payStatements

    override fun documents(): DocumentServiceAsync = documents

    override fun benefits(): BenefitServiceAsync = benefits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HrisServiceAsync.WithRawResponse {

        private val company: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val directory: DirectoryServiceAsync.WithRawResponse by lazy {
            DirectoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val individuals: IndividualServiceAsync.WithRawResponse by lazy {
            IndividualServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val employments: EmploymentServiceAsync.WithRawResponse by lazy {
            EmploymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payStatements: PayStatementServiceAsync.WithRawResponse by lazy {
            PayStatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val benefits: BenefitServiceAsync.WithRawResponse by lazy {
            BenefitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun company(): CompanyServiceAsync.WithRawResponse = company

        override fun directory(): DirectoryServiceAsync.WithRawResponse = directory

        override fun individuals(): IndividualServiceAsync.WithRawResponse = individuals

        override fun employments(): EmploymentServiceAsync.WithRawResponse = employments

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        override fun payStatements(): PayStatementServiceAsync.WithRawResponse = payStatements

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        override fun benefits(): BenefitServiceAsync.WithRawResponse = benefits
    }
}
