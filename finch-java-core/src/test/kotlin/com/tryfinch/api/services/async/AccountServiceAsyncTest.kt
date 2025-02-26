// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceAsyncTest {

    @Test
    fun disconnect() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.account()

        val disconnectResponseFuture = accountServiceAsync.disconnect()

        val disconnectResponse = disconnectResponseFuture.get()
        disconnectResponse.validate()
    }

    @Test
    fun introspect() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.account()

        val introspectionFuture = accountServiceAsync.introspect()

        val introspection = introspectionFuture.get()
        introspection.validate()
    }
}
