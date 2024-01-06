// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
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
                    .clientId("<your_client_id>")
                    .clientSecret("<your_client_secret>")
                    .code("<your_authorization_code>")
                    .redirectUri("https://example.com")
                    .build()
            )
        println(createAccessTokenResponse)
        createAccessTokenResponse.validate()
    }
}
