package com.tryfinch.api.services.blocking.employer

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BenefitServiceTest {

    @Test
    fun callRegister() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.employer().benefits()
        val registerCompanyBenefitsResponse =
            benefitService.register(
                EmployerBenefitRegisterParams.builder()
                    .description("string")
                    .frequency(BenefitFrequency.ONE_TIME)
                    .type(BenefitType._401K)
                    .build()
            )
        println(registerCompanyBenefitsResponse)
        registerCompanyBenefitsResponse.validate()
    }
}
