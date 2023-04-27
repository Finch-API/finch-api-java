@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async

import org.finch.api.services.async.hris.BenefitServiceAsync
import org.finch.api.services.async.hris.CompanyServiceAsync
import org.finch.api.services.async.hris.DirectoryServiceAsync
import org.finch.api.services.async.hris.IndividualServiceAsync
import org.finch.api.services.async.hris.PayStatementServiceAsync
import org.finch.api.services.async.hris.PaymentServiceAsync

interface HriServiceAsync {

    fun company(): CompanyServiceAsync

    fun payments(): PaymentServiceAsync

    fun payStatements(): PayStatementServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individuals(): IndividualServiceAsync

    fun benefits(): BenefitServiceAsync
}
