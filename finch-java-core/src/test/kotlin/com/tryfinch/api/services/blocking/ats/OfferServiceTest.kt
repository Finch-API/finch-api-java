package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.AtsOfferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OfferServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val offerService = client.ats().offers()
        val offer =
            offerService.retrieve(AtsOfferRetrieveParams.builder().offerId("string").build())
        println(offer)
        offer.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val offerService = client.ats().offers()
        val response = offerService.list(AtsOfferListParams.builder().build())
        println(response)
        response.offers().forEach { it.validate() }
    }
}
