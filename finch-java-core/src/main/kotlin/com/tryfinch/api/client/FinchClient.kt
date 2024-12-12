// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.services.blocking.*

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
}
