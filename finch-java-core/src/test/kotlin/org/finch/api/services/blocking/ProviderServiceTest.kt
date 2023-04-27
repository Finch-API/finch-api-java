package org.finch.api.services.blocking

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.ProviderListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProviderServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val providerService = client.providers()
        val getProvidersResponse = providerService.list(ProviderListParams.builder().build())
        println(getProvidersResponse)
        getProvidersResponse.items().forEach { it.validate() }
    }
}
