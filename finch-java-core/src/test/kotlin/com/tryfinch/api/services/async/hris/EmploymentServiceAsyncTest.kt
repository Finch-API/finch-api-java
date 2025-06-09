// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmploymentServiceAsyncTest {

    @Test
    fun retrieveMany() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val employmentServiceAsync = client.hris().employments()

        val pageFuture =
            employmentServiceAsync.retrieveMany(
                HrisEmploymentRetrieveManyParams.builder()
                    .addRequest(
                        HrisEmploymentRetrieveManyParams.Request.builder()
                            .individualId("individual_id")
                            .build()
                    )
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
