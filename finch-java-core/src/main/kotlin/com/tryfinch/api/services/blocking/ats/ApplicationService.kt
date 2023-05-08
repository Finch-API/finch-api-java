@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Application
import com.tryfinch.api.models.AtApplicationListPage
import com.tryfinch.api.models.AtApplicationListParams
import com.tryfinch.api.models.AtApplicationRetrieveParams

interface ApplicationService {

    /** Gets an application from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Application

    /** Gets all of an organization's applications. */
    @JvmOverloads
    fun list(
        params: AtApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtApplicationListPage
}
