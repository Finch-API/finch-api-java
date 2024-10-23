// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import com.tryfinch.api.services.async.jobs.ManualServiceAsync

interface JobServiceAsync {

    fun automated(): AutomatedServiceAsync

    fun manual(): ManualServiceAsync
}
