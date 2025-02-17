// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.payroll.PayGroupService
import com.tryfinch.api.services.blocking.payroll.PayGroupServiceImpl

class PayrollServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayrollService {

    private val payGroups: PayGroupService by lazy { PayGroupServiceImpl(clientOptions) }

    override fun payGroups(): PayGroupService = payGroups
}
