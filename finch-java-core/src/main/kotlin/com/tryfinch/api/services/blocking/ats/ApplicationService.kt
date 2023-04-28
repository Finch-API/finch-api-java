@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Application
import com.tryfinch.api.models.AtsApplicationListPage
import com.tryfinch.api.models.AtsApplicationListParams
import com.tryfinch.api.models.AtsApplicationRetrieveParams

interface ApplicationService {

    /** Gets an application from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtsApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Application

    /** Gets all of an organization's applications. */
    @JvmOverloads
    fun list(
        params: AtsApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsApplicationListPage
}
