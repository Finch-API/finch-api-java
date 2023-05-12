@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtsStageListPage
import com.tryfinch.api.models.AtsStageListParams

interface StageService {

    /**
     * Get all job stages for an organization. Depending on the system, some jobs may have stages
     * specific to that job. Other job stages may apply broadly to all jobs in the system. Use the
     * `job_id` to determine whether a job applies specifically to a job.
     */
    @JvmOverloads
    fun list(
        params: AtsStageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsStageListPage
}
