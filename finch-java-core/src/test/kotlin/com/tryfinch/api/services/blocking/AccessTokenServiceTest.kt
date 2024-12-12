// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.AccessTokenCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccessTokenServiceTest {

    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accessTokenService = client.accessTokens()
        val createAccessTokenResponse =
            accessTokenService.create(
                AccessTokenCreateParams.builder()
                    .code("<your_authorization_code>")
                    .clientId("6d28c315-5eaa-4071-8ea5-f030eb45edbc")
                    .clientSecret("<your_client_secret>")
                    .redirectUri("https://example.com")
                    .build()
            )
        println(createAccessTokenResponse)
        createAccessTokenResponse.validate()
    }
}
