@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.ats

import org.finch.api.core.RequestOptions
import org.finch.api.models.Application
import org.finch.api.models.AtsApplicationListPage
import org.finch.api.models.AtsApplicationListParams
import org.finch.api.models.AtsApplicationRetrieveParams

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
