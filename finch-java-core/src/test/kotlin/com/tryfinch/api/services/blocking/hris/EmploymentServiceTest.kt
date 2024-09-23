// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EmploymentServiceTest {

    @Test
    fun callRetrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val employmentService = client.hris().employments()
        val getEmploymentResponse =
            employmentService.retrieveMany(
                HrisEmploymentRetrieveManyParams.builder()
                    .requests(
                        listOf(
                            HrisEmploymentRetrieveManyParams.Request.builder()
                                .individualId("individual_id")
                                .build()
                        )
                    )
                    .build()
            )
        println(getEmploymentResponse)
        getEmploymentResponse.responses().forEach { it.validate() }
    }
}
