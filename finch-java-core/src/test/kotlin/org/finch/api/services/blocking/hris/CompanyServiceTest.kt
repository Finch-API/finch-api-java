package org.finch.api.services.blocking.hris

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompanyServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val companyService = client.hris().company()
        val company = companyService.retrieve(HrisCompanyRetrieveParams.builder().build())
        println(company)
        company.validate()
    }
}
