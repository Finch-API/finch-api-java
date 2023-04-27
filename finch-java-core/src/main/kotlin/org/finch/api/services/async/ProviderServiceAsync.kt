@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.ProviderListPageAsync
import org.finch.api.models.ProviderListParams

interface ProviderServiceAsync {

    /** Return details on all available payroll and HR systems. */
    @JvmOverloads
    fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProviderListPageAsync>
}
