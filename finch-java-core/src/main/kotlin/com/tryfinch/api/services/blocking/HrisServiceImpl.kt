// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.hris.BenefitService
import com.tryfinch.api.services.blocking.hris.BenefitServiceImpl
import com.tryfinch.api.services.blocking.hris.CompanyService
import com.tryfinch.api.services.blocking.hris.CompanyServiceImpl
import com.tryfinch.api.services.blocking.hris.DirectoryService
import com.tryfinch.api.services.blocking.hris.DirectoryServiceImpl
import com.tryfinch.api.services.blocking.hris.DocumentService
import com.tryfinch.api.services.blocking.hris.DocumentServiceImpl
import com.tryfinch.api.services.blocking.hris.EmploymentService
import com.tryfinch.api.services.blocking.hris.EmploymentServiceImpl
import com.tryfinch.api.services.blocking.hris.IndividualService
import com.tryfinch.api.services.blocking.hris.IndividualServiceImpl
import com.tryfinch.api.services.blocking.hris.PayStatementService
import com.tryfinch.api.services.blocking.hris.PayStatementServiceImpl
import com.tryfinch.api.services.blocking.hris.PaymentService
import com.tryfinch.api.services.blocking.hris.PaymentServiceImpl
import java.util.function.Consumer

class HrisServiceImpl internal constructor(private val clientOptions: ClientOptions) : HrisService {

    private val withRawResponse: HrisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val company: CompanyService by lazy { CompanyServiceImpl(clientOptions) }

    private val directory: DirectoryService by lazy { DirectoryServiceImpl(clientOptions) }

    private val individuals: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    private val employments: EmploymentService by lazy { EmploymentServiceImpl(clientOptions) }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    private val payStatements: PayStatementService by lazy {
        PayStatementServiceImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val benefits: BenefitService by lazy { BenefitServiceImpl(clientOptions) }

    override fun withRawResponse(): HrisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HrisService =
        HrisServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun company(): CompanyService = company

    override fun directory(): DirectoryService = directory

    override fun individuals(): IndividualService = individuals

    override fun employments(): EmploymentService = employments

    override fun payments(): PaymentService = payments

    override fun payStatements(): PayStatementService = payStatements

    override fun documents(): DocumentService = documents

    override fun benefits(): BenefitService = benefits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HrisService.WithRawResponse {

        private val company: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val directory: DirectoryService.WithRawResponse by lazy {
            DirectoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val individuals: IndividualService.WithRawResponse by lazy {
            IndividualServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val employments: EmploymentService.WithRawResponse by lazy {
            EmploymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payStatements: PayStatementService.WithRawResponse by lazy {
            PayStatementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val benefits: BenefitService.WithRawResponse by lazy {
            BenefitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HrisService.WithRawResponse =
            HrisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun company(): CompanyService.WithRawResponse = company

        override fun directory(): DirectoryService.WithRawResponse = directory

        override fun individuals(): IndividualService.WithRawResponse = individuals

        override fun employments(): EmploymentService.WithRawResponse = employments

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun payStatements(): PayStatementService.WithRawResponse = payStatements

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun benefits(): BenefitService.WithRawResponse = benefits
    }
}
