@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.hris.BenefitService
import com.tryfinch.api.services.blocking.hris.CompanyService
import com.tryfinch.api.services.blocking.hris.DirectoryService
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

    fun benefits(): BenefitService
}
