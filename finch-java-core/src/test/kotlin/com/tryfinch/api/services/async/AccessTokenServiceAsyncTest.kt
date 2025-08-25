// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.AccessTokenCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessTokenServiceAsyncTest {

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
                    .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .clientSecret("client_secret")
                    .code("code")
                    .redirectUri("redirect_uri")
                    .build()
            )

        val createAccessTokenResponse = createAccessTokenResponseFuture.get()
        createAccessTokenResponse.validate()
    }
}
