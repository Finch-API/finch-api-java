// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PayStatementServiceTest {

    @Test
    fun callRetrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val payStatementService = client.hris().payStatements()
        val getPayStatementsResponse =
            payStatementService.retrieveMany(
                HrisPayStatementRetrieveManyParams.builder()
                    .requests(
                        listOf(
                            HrisPayStatementRetrieveManyParams.Request.builder()
                                .paymentId("payment_id")
                                .build()
                        )
                    )
                    .build()
            )
        println(getPayStatementsResponse)
        getPayStatementsResponse.responses().forEach { it.validate() }
    }
}
