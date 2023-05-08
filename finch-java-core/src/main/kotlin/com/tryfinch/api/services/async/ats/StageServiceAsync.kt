@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtStageListPageAsync
import com.tryfinch.api.models.AtStageListParams
import java.util.concurrent.CompletableFuture

interface StageServiceAsync {

    /**
     * Get all job stages for an organization. Depending on the system, some jobs may have stages
     * specific to that job. Other job stages may apply broadly to all jobs in the system. Use the
     * `job_id` to determine whether a job applies specifically to a job.
     */
    @JvmOverloads
    fun list(
        params: AtStageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtStageListPageAsync>
}
