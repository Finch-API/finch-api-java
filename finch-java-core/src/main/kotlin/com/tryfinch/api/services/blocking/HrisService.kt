// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.hris.BenefitService
import com.tryfinch.api.services.blocking.hris.CompanyService
import com.tryfinch.api.services.blocking.hris.DirectoryService
import com.tryfinch.api.services.blocking.hris.DocumentService
import com.tryfinch.api.services.blocking.hris.EmploymentService
import com.tryfinch.api.services.blocking.hris.IndividualService
import com.tryfinch.api.services.blocking.hris.PayStatementService
import com.tryfinch.api.services.blocking.hris.PaymentService

interface HrisService {

    fun company(): CompanyService

    fun directory(): DirectoryService

    fun individuals(): IndividualService

    fun employments(): EmploymentService

    fun payments(): PaymentService

    fun payStatements(): PayStatementService

    fun documents(): DocumentService

    fun benefits(): BenefitService
}
