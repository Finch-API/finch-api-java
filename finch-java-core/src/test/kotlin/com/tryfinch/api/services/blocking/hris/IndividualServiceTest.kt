// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceTest {

    @Test
    fun retrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.hris().individuals()

        val page =
            individualService.retrieveMany(
                HrisIndividualRetrieveManyParams.builder()
                    .addRequest(
                        HrisIndividualRetrieveManyParams.Request.builder()
                            .individualId("individual_id")
                            .build()
                    )
                    .build()
            )

        page.response().validate()
    }
}
