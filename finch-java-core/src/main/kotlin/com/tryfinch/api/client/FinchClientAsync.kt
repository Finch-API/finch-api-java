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

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
