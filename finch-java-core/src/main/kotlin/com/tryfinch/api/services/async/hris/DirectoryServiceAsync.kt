// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams
import java.util.concurrent.CompletableFuture

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisDirectoryListPageAsync>

    /** Read company directory and organization structure */
    fun list(requestOptions: RequestOptions): CompletableFuture<HrisDirectoryListPageAsync> =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync>

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
}
