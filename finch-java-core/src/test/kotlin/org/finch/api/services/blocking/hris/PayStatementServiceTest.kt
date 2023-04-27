package org.finch.api.services.blocking.hris

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisPayStatementRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PayStatementServiceTest {

    @Test
    fun callRetrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val payStatementService = client.hris().payStatements()
        val getPayStatementsResponse =
            payStatementService.retrieveMany(
                HrisPayStatementRetrieveManyParams.builder()
                    .requests(
                        listOf(
                            HrisPayStatementRetrieveManyParams.Request.builder()
                                .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
                                .build()
                        )
                    )
                    .build()
            )
        println(getPayStatementsResponse)
        getPayStatementsResponse.responses().forEach { it.validate() }
    }
}
