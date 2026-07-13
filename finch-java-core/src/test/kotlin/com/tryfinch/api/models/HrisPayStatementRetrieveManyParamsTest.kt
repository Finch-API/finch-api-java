// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisPayStatementRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisPayStatementRetrieveManyParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .addRequest(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                    .limit(100L)
                    .offset(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                        .limit(100L)
                        .offset(0L)
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
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                        .limit(100L)
                        .offset(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requests())
            .containsExactly(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                    .limit(100L)
                    .offset(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requests())
            .containsExactly(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("fc8b024e-d373-4c9c-80fc-f1625383d142")
                    .build()
            )
    }
}
