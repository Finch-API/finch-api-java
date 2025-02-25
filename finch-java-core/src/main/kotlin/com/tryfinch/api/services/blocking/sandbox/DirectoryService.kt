// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxDirectoryCreateParams

interface DirectoryService {

    /** Add new individuals to a sandbox company */
    @JvmOverloads
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<JsonValue>

    /** Add new individuals to a sandbox company */
    fun create(requestOptions: RequestOptions): List<JsonValue> =
        create(SandboxDirectoryCreateParams.none(), requestOptions)
}
