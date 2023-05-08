@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtCandidateListPageAsync
import com.tryfinch.api.models.AtCandidateListParams
import com.tryfinch.api.models.AtCandidateRetrieveParams
import com.tryfinch.api.models.Candidate
import java.util.concurrent.CompletableFuture

interface CandidateServiceAsync {

    /**
     * Gets a candidate from an organization. A candidate represents an individual associated with
     * one or more applications.
     */
    @JvmOverloads
    fun retrieve(
        params: AtCandidateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Candidate>

    /**
     * Gets all of an organization's candidates. A candidate represents an individual associated
     * with one or more applications.
     */
    @JvmOverloads
    fun list(
        params: AtCandidateListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtCandidateListPageAsync>
}
