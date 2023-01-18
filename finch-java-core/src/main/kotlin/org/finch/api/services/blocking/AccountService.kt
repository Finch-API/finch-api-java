@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking

import org.finch.api.core.RequestOptions
import org.finch.api.models.AccountDisconnectParams
import org.finch.api.models.AccountIntrospectParams
import org.finch.api.models.DisconnectResponse
import org.finch.api.models.Introspection

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
