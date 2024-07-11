// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.payroll

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.PayrollPayGroupListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PayGroupServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val payGroupService = client.payroll().payGroups()
        val payGroupRetrieveResponse =
            payGroupService.retrieve(
                PayrollPayGroupRetrieveParams.builder().payGroupId("pay_group_id").build()
            )
        println(payGroupRetrieveResponse)
        payGroupRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val payGroupService = client.payroll().payGroups()
        val getAllPayGroupsResponse =
            payGroupService.list(PayrollPayGroupListParams.builder().build())
        println(getAllPayGroupsResponse)
        getAllPayGroupsResponse.items().forEach { it.validate() }
    }
}
