// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams

interface DirectoryService {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisDirectoryListIndividualsPage
}
