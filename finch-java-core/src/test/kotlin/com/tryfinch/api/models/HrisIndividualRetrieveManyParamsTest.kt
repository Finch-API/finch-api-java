// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisIndividualRetrieveManyParamsTest {

    @Test
    fun createHrisIndividualRetrieveManyParams() {
        HrisIndividualRetrieveManyParams.builder()
            .options(
                HrisIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
            .requests(
                listOf(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisIndividualRetrieveManyParams.builder()
                .options(
                    HrisIndividualRetrieveManyParams.Options.builder()
                        .include(listOf("string"))
                        .build()
                )
                .requests(
                    listOf(
                        HrisIndividualRetrieveManyParams.Request.builder()
                            .individualId("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.options())
            .isEqualTo(
                HrisIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisIndividualRetrieveManyParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
