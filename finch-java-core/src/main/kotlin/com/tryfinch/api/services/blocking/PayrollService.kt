// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.payroll.PayGroupService

interface PayrollService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun payGroups(): PayGroupService

    /**
     * A view of [PayrollService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun payGroups(): PayGroupService.WithRawResponse
    }
}
