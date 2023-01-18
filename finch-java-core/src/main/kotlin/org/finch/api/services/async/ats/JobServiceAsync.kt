@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsJobListPageAsync
import org.finch.api.models.AtsJobListParams
import org.finch.api.models.AtsJobRetrieveParams
import org.finch.api.models.Job

interface JobServiceAsync {

    /** Gets a job from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtsJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Job>

    /** Gets all of an organization's jobs. */
    @JvmOverloads
    fun list(
        params: AtsJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtsJobListPageAsync>
}
