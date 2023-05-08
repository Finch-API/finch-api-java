@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HriDirectoryListIndividualsParams
import java.util.concurrent.CompletableFuture

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun listIndividuals(
        params: HriDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriDirectoryListIndividualsPageAsync>
}
