package org.finch.api.services.blocking

import org.finch.api.core.ClientOptions
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.services.blocking.hris.BenefitService
import org.finch.api.services.blocking.hris.BenefitServiceImpl
import org.finch.api.services.blocking.hris.CompanyService
import org.finch.api.services.blocking.hris.CompanyServiceImpl
import org.finch.api.services.blocking.hris.DirectoryService
import org.finch.api.services.blocking.hris.DirectoryServiceImpl
import org.finch.api.services.blocking.hris.IndividualService
import org.finch.api.services.blocking.hris.IndividualServiceImpl
import org.finch.api.services.blocking.hris.PayStatementService
import org.finch.api.services.blocking.hris.PayStatementServiceImpl
import org.finch.api.services.blocking.hris.PaymentService
import org.finch.api.services.blocking.hris.PaymentServiceImpl
import org.finch.api.services.errorHandler

class HriServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : HriService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val company: CompanyService by lazy { CompanyServiceImpl(clientOptions) }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    private val payStatements: PayStatementService by lazy {
        PayStatementServiceImpl(clientOptions)
    }

    private val directory: DirectoryService by lazy { DirectoryServiceImpl(clientOptions) }

    private val individuals: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    private val benefits: BenefitService by lazy { BenefitServiceImpl(clientOptions) }

    override fun company(): CompanyService = company

    override fun payments(): PaymentService = payments

    override fun payStatements(): PayStatementService = payStatements

    override fun directory(): DirectoryService = directory

    override fun individuals(): IndividualService = individuals

    override fun benefits(): BenefitService = benefits
}
