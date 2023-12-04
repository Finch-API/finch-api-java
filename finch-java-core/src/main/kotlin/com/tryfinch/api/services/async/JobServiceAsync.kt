// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import com.tryfinch.api.services.async.jobs.ManualServiceAsync

interface JobServiceAsync {

    fun automated(): AutomatedServiceAsync

    fun manual(): ManualServiceAsync
}
