// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsyncImpl
import com.tryfinch.api.services.errorHandler

class PayrollServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PayrollServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val payGroups: PayGroupServiceAsync by lazy { PayGroupServiceAsyncImpl(clientOptions) }

    override fun payGroups(): PayGroupServiceAsync = payGroups
}
