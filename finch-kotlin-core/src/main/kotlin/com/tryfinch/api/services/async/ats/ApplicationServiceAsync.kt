@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Application
import com.tryfinch.api.models.AtApplicationListPageAsync
import com.tryfinch.api.models.AtApplicationListParams
import com.tryfinch.api.models.AtApplicationRetrieveParams

interface ApplicationServiceAsync {

    /** Gets an application from an organization. */
    suspend fun retrieve(
        params: AtApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Application

    /** Gets all of an organization's applications. */
    suspend fun list(
        params: AtApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtApplicationListPageAsync
}
