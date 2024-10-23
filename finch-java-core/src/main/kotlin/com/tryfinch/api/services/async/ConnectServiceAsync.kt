// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.connect.SessionServiceAsync

interface ConnectServiceAsync {

    fun sessions(): SessionServiceAsync
}
