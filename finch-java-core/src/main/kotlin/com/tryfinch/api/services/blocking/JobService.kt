// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.jobs.AutomatedService
import com.tryfinch.api.services.blocking.jobs.ManualService

interface JobService {

    fun automated(): AutomatedService

    fun manual(): ManualService
}
