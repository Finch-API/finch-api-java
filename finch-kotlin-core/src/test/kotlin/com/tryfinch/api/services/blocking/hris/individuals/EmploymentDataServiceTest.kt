package com.tryfinch.api.services.blocking.hris.individuals

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HriIndividualEmploymentDataRetrieveManyParams
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
                HriIndividualEmploymentDataRetrieveManyParams.builder()
                    .requests(
                        listOf(
                            HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
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
