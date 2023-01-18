@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisDirectoryListIndividualsPageAsync
import org.finch.api.models.HrisDirectoryListIndividualsParams

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync>
}
