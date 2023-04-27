package org.finch.api.services.blocking.hris.individuals

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisIndividualsEmploymentDataRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EmploymentDataServiceTest {

    @Test
    fun callRetrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val employmentDataService = client.hris().individuals().employmentData()
        val getEmploymentResponse =
            employmentDataService.retrieveMany(
                HrisIndividualsEmploymentDataRetrieveManyParams.builder()
                    .requests(
                        listOf(
                            HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
                                .individualId("string")
                                .build()
                        )
                    )
                    .build()
            )
        println(getEmploymentResponse)
        getEmploymentResponse.responses().forEach { it.validate() }
    }
}
