// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationService {

    /** Get configurations for sandbox jobs */
    @JvmOverloads
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<SandboxJobConfiguration>

    /** Update configurations for sandbox jobs */
    @JvmOverloads
    fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SandboxJobConfiguration
}
