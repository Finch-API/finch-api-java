// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse

interface AccessTokenService {

    /** Exchange the authorization code for an access token */
    @JvmOverloads
    fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateAccessTokenResponse
}
