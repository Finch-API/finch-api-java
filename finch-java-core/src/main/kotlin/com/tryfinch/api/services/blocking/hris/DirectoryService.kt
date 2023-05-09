@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriDirectoryListIndividualsPage
import com.tryfinch.api.models.HriDirectoryListIndividualsParams

interface DirectoryService {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun listIndividuals(
        params: HriDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriDirectoryListIndividualsPage
}
