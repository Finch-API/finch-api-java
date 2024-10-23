// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.connect.SessionService

interface ConnectService {

    fun sessions(): SessionService
}
