// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import com.tryfinch.api.services.async.jobs.ManualServiceAsync

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun automated(): AutomatedServiceAsync

    fun manual(): ManualServiceAsync

    /**
     * A view of [JobServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun automated(): AutomatedServiceAsync.WithRawResponse

        fun manual(): ManualServiceAsync.WithRawResponse
    }
}
