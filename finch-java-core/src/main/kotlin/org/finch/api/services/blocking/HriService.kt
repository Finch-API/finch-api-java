@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking

import org.finch.api.services.blocking.hris.BenefitService
import org.finch.api.services.blocking.hris.CompanyService
import org.finch.api.services.blocking.hris.DirectoryService
import org.finch.api.services.blocking.hris.IndividualService
import org.finch.api.services.blocking.hris.PayStatementService
import org.finch.api.services.blocking.hris.PaymentService

interface HriService {

    fun company(): CompanyService

    fun payments(): PaymentService

    fun payStatements(): PayStatementService

    fun directory(): DirectoryService

    fun individuals(): IndividualService

    fun benefits(): BenefitService
}
