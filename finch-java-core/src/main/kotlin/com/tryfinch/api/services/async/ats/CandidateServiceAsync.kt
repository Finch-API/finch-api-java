@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtsCandidateListPageAsync
import com.tryfinch.api.models.AtsCandidateListParams
import com.tryfinch.api.models.AtsCandidateRetrieveParams
import com.tryfinch.api.models.Candidate
import java.util.concurrent.CompletableFuture

interface CandidateServiceAsync {

    /**
     * Gets a candidate from an organization. A candidate represents an individual associated with
     * one or more applications.
     */
    @JvmOverloads
    fun retrieve(
        params: AtsCandidateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Candidate>

    /**
     * Gets all of an organization's candidates. A candidate represents an individual associated
     * with one or more applications.
     */
    @JvmOverloads
    fun list(
        params: AtsCandidateListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtsCandidateListPageAsync>
}
