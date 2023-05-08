@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtJobListPageAsync
import com.tryfinch.api.models.AtJobListParams
import com.tryfinch.api.models.AtJobRetrieveParams
import com.tryfinch.api.models.Job
import java.util.concurrent.CompletableFuture

interface JobServiceAsync {

    /** Gets a job from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Job>

    /** Gets all of an organization's jobs. */
    @JvmOverloads
    fun list(
        params: AtJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtJobListPageAsync>
}
