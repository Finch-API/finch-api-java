// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.AccessTokenCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccessTokenServiceAsyncTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accessTokenServiceAsync = client.accessTokens()

        val createAccessTokenResponseFuture =
            accessTokenServiceAsync.create(
                AccessTokenCreateParams.builder()
                    .code("<your_authorization_code>")
                    .clientId("6d28c315-5eaa-4071-8ea5-f030eb45edbc")
                    .clientSecret("<your_client_secret>")
                    .redirectUri("https://example.com")
                    .build()
            )

        val createAccessTokenResponse = createAccessTokenResponseFuture.get()
        createAccessTokenResponse.validate()
    }
}
