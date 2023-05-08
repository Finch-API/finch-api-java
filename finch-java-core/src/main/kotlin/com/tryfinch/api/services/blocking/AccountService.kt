@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

interface AccountService {

    /**
     * Disconnect an employer from your application and invalidate all `access_token`s associated
     * with the employer. We require applications to implement the Disconnect endpoint for billing
     * and security purposes.
     */
    @JvmOverloads
    fun disconnect(
        params: AccountDisconnectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisconnectResponse

    /** Read account information associated with an `access_token` */
    @JvmOverloads
    fun introspect(
        params: AccountIntrospectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Introspection
}
