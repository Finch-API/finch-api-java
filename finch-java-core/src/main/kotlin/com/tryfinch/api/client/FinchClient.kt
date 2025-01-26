// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.services.blocking.AccessTokenService
import com.tryfinch.api.services.blocking.AccountService
import com.tryfinch.api.services.blocking.ConnectService
import com.tryfinch.api.services.blocking.HrisService
import com.tryfinch.api.services.blocking.JobService
import com.tryfinch.api.services.blocking.PayrollService
import com.tryfinch.api.services.blocking.ProviderService
import com.tryfinch.api.services.blocking.RequestForwardingService
import com.tryfinch.api.services.blocking.SandboxService
import com.tryfinch.api.services.blocking.WebhookService

interface FinchClient {

    fun async(): FinchClientAsync

    fun accessTokens(): AccessTokenService

    fun hris(): HrisService

    fun providers(): ProviderService

    fun account(): AccountService

    fun webhooks(): WebhookService

    fun requestForwarding(): RequestForwardingService

    fun jobs(): JobService

    fun sandbox(): SandboxService

    fun payroll(): PayrollService

    fun connect(): ConnectService

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
