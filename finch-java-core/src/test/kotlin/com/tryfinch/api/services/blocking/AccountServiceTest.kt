// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceTest {

    @Test
    fun callDisconnect() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.account()
        val disconnectResponse =
            accountService.disconnect(AccountDisconnectParams.builder().build())
        println(disconnectResponse)
        disconnectResponse.validate()
    }

    @Test
    fun callIntrospect() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.account()
        val introspection = accountService.introspect(AccountIntrospectParams.builder().build())
        println(introspection)
        introspection.validate()
    }
}
