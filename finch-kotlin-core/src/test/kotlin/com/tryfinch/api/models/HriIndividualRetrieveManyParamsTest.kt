package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HriIndividualRetrieveManyParamsTest {

    @Test
    fun createHriIndividualRetrieveManyParams() {
        HriIndividualRetrieveManyParams.builder()
            .requests(
                listOf(
                    HriIndividualRetrieveManyParams.Request.builder().individualId("string").build()
                )
            )
            .options(
                HriIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HriIndividualRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HriIndividualRetrieveManyParams.Request.builder()
                            .individualId("string")
                            .build()
                    )
                )
                .options(
                    HriIndividualRetrieveManyParams.Options.builder()
                        .include(listOf("string"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HriIndividualRetrieveManyParams.Request.builder().individualId("string").build()
                )
            )
        assertThat(body.options())
            .isEqualTo(
                HriIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HriIndividualRetrieveManyParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
