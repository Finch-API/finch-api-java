// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.services.async.AccessTokenServiceAsync
import com.tryfinch.api.services.async.AccountServiceAsync
import com.tryfinch.api.services.async.ConnectServiceAsync
import com.tryfinch.api.services.async.HrisServiceAsync
import com.tryfinch.api.services.async.JobServiceAsync
import com.tryfinch.api.services.async.PayrollServiceAsync
import com.tryfinch.api.services.async.ProviderServiceAsync
import com.tryfinch.api.services.async.RequestForwardingServiceAsync
import com.tryfinch.api.services.async.SandboxServiceAsync
import com.tryfinch.api.services.async.WebhookServiceAsync

interface FinchClientAsync {

    fun sync(): FinchClient

    fun accessTokens(): AccessTokenServiceAsync

    fun hris(): HrisServiceAsync

    fun providers(): ProviderServiceAsync

    fun account(): AccountServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun requestForwarding(): RequestForwardingServiceAsync

    fun jobs(): JobServiceAsync

    fun sandbox(): SandboxServiceAsync

    fun payroll(): PayrollServiceAsync

    fun connect(): ConnectServiceAsync
}
