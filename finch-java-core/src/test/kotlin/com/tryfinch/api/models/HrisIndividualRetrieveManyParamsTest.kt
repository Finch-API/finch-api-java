// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisIndividualRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisIndividualRetrieveManyParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .options(
                HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
            )
            .addRequest(
                HrisIndividualRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisIndividualRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .options(
                    HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
                )
                .addRequest(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisIndividualRetrieveManyParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisIndividualRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .options(
                    HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
                )
                .addRequest(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.options())
            .contains(
                HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
            )
        assertThat(body.requests().getOrNull())
            .containsExactly(
                HrisIndividualRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisIndividualRetrieveManyParams.builder().build()

        val body = params._body()
    }
}
