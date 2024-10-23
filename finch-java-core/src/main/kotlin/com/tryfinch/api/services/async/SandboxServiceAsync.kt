// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.sandbox.CompanyServiceAsync
import com.tryfinch.api.services.async.sandbox.ConnectionServiceAsync
import com.tryfinch.api.services.async.sandbox.DirectoryServiceAsync
import com.tryfinch.api.services.async.sandbox.EmploymentServiceAsync
import com.tryfinch.api.services.async.sandbox.IndividualServiceAsync
import com.tryfinch.api.services.async.sandbox.JobServiceAsync
import com.tryfinch.api.services.async.sandbox.PaymentServiceAsync

interface SandboxServiceAsync {

    fun connections(): ConnectionServiceAsync

    fun company(): CompanyServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individual(): IndividualServiceAsync

    fun employment(): EmploymentServiceAsync

    fun payment(): PaymentServiceAsync

    fun jobs(): JobServiceAsync
}
