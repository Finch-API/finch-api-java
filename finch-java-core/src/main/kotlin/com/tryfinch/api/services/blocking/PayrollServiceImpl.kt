// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.payroll.PayGroupService
import com.tryfinch.api.services.blocking.payroll.PayGroupServiceImpl
import com.tryfinch.api.services.errorHandler

class PayrollServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PayrollService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val payGroups: PayGroupService by lazy { PayGroupServiceImpl(clientOptions) }

    override fun payGroups(): PayGroupService = payGroups
}
