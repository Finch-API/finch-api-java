@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsStageListPageAsync
import org.finch.api.models.AtsStageListParams

interface StageServiceAsync {

    /**
     * Get all job stages for an organization. Depending on the system, some jobs may have stages
     * specific to that job. Other job stages may apply broadly to all jobs in the system. Use the
     * `job_id` to determine whether a job applies specifically to a job.
     */
    @JvmOverloads
    fun list(
        params: AtsStageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtsStageListPageAsync>
}
