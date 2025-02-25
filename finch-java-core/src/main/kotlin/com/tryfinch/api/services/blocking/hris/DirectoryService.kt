// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListParams

interface DirectoryService {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListPage

    /** Read company directory and organization structure */
    fun list(requestOptions: RequestOptions): HrisDirectoryListPage =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListIndividualsPage

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(requestOptions: RequestOptions): HrisDirectoryListIndividualsPage =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
}
