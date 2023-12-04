// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob

interface ManualService {

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    @JvmOverloads
    fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManualAsyncJob
}
