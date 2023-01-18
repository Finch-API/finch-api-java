@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.ats

import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsJobListPage
import org.finch.api.models.AtsJobListParams
import org.finch.api.models.AtsJobRetrieveParams
import org.finch.api.models.Job

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
