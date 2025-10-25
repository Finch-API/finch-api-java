// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisCompanyRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val companyServiceAsync = client.hris().company()

        val companyFuture =
            companyServiceAsync.retrieve(
                HrisCompanyRetrieveParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        val company = companyFuture.get()
        company.validate()
    }
}
