// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.jobs.AutomatedService
import com.tryfinch.api.services.blocking.jobs.ManualService

interface JobService {

    fun automated(): AutomatedService

    fun manual(): ManualService
}
