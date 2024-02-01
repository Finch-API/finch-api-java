// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.ProviderListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProviderServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val providerService = client.providers()
        val getProvidersResponse = providerService.list(ProviderListParams.builder().build())
        println(getProvidersResponse)
        getProvidersResponse.items().forEach { it.validate() }
    }
}
