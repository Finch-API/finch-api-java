// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PayGroupServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val payGroupServiceAsync = client.payroll().payGroups()

        val payGroupFuture =
            payGroupServiceAsync.retrieve(
                PayrollPayGroupRetrieveParams.builder().payGroupId("pay_group_id").build()
            )

        val payGroup = payGroupFuture.get()
        payGroup.validate()
    }

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val payGroupServiceAsync = client.payroll().payGroups()

        val pageFuture = payGroupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
