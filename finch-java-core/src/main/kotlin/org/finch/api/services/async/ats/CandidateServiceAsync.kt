@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsCandidateListPageAsync
import org.finch.api.models.AtsCandidateListParams
import org.finch.api.models.AtsCandidateRetrieveParams
import org.finch.api.models.Candidate

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
