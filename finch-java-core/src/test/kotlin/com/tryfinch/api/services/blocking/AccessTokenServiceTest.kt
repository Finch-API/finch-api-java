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
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val accessTokenService = client.accessTokens()
        val createAccessTokenResponse =
            accessTokenService.create(
                AccessTokenCreateParams.builder()
                    .code("<your_authorization_code>")
                    .clientId("12345678-1234-1234-1234-123456789ABC")
                    .clientSecret("<your_client_secret>")
                    .redirectUri("https://example.com")
                    .build()
            )
        println(createAccessTokenResponse)
        createAccessTokenResponse.validate()
    }
}
