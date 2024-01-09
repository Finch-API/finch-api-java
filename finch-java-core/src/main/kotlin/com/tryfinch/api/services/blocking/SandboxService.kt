// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.sandbox.CompanyService
import com.tryfinch.api.services.blocking.sandbox.ConnectionService
import com.tryfinch.api.services.blocking.sandbox.DirectoryService
import com.tryfinch.api.services.blocking.sandbox.EmploymentService
import com.tryfinch.api.services.blocking.sandbox.IndividualService
import com.tryfinch.api.services.blocking.sandbox.JobService
import com.tryfinch.api.services.blocking.sandbox.PaymentService

interface SandboxService {

    fun connections(): ConnectionService

    fun company(): CompanyService

    fun directory(): DirectoryService

    fun individual(): IndividualService

    fun employment(): EmploymentService

    fun payment(): PaymentService

    fun jobs(): JobService
}
