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

/**
 * A client for interacting with the Finch REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
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
