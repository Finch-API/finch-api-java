// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync

interface PayrollServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun payGroups(): PayGroupServiceAsync

    /**
     * A view of [PayrollServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun payGroups(): PayGroupServiceAsync.WithRawResponse
    }
}
