@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris

import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisDirectoryListIndividualsPage
import org.finch.api.models.HrisDirectoryListIndividualsParams

interface DirectoryService {

    /** Read company directory and organization structure */
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisDirectoryListIndividualsPage
}
