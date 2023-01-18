package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class HrisIndividualRetrieveManyParamsTest {

    @Test
    fun createHrisIndividualRetrieveManyParams() {
        HrisIndividualRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .options(
                HrisIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisIndividualRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisIndividualRetrieveManyParams.Request.builder()
                            .individualId("string")
                            .build()
                    )
                )
                .options(
                    HrisIndividualRetrieveManyParams.Options.builder()
                        .include(listOf("string"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
        assertThat(body.options())
            .isEqualTo(
                HrisIndividualRetrieveManyParams.Options.builder().include(listOf("string")).build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisIndividualRetrieveManyParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
