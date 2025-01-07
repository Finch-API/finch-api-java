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

class HrisServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : HrisService {

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

    override fun company(): CompanyService = company

    override fun directory(): DirectoryService = directory

    override fun individuals(): IndividualService = individuals

    override fun employments(): EmploymentService = employments

    override fun payments(): PaymentService = payments

    override fun payStatements(): PayStatementService = payStatements

    override fun documents(): DocumentService = documents

    override fun benefits(): BenefitService = benefits
}
