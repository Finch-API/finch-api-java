@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.ats

import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsCandidateListPage
import org.finch.api.models.AtsCandidateListParams
import org.finch.api.models.AtsCandidateRetrieveParams
import org.finch.api.models.Candidate

interface CandidateService {

    /**
     * Gets a candidate from an organization. A candidate represents an individual associated with
     * one or more applications.
     */
    @JvmOverloads
    fun retrieve(
        params: AtsCandidateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Candidate

    /**
     * Gets all of an organization's candidates. A candidate represents an individual associated
     * with one or more applications.
     */
    @JvmOverloads
    fun list(
        params: AtsCandidateListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsCandidateListPage
}
