@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import com.tryfinch.api.services.async.hris.CompanyServiceAsync
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import com.tryfinch.api.services.async.hris.PaymentServiceAsync

interface HriServiceAsync {

    fun company(): CompanyServiceAsync

    fun payments(): PaymentServiceAsync

    fun payStatements(): PayStatementServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individuals(): IndividualServiceAsync

    fun benefits(): BenefitServiceAsync
}
