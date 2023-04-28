@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtsJobListPage
import com.tryfinch.api.models.AtsJobListParams
import com.tryfinch.api.models.AtsJobRetrieveParams
import com.tryfinch.api.models.Job

interface JobService {

    /** Gets a job from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtsJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Job

    /** Gets all of an organization's jobs. */
    @JvmOverloads
    fun list(
        params: AtsJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsJobListPage
}
