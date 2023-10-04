// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.google.common.collect.ImmutableListMultimap
import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.*
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceTest {

    @Test
    fun unwrap() {
        val client =
            FinchOkHttpClient.builder()
                .accessToken("test-access-token")
                .webhookSecret("5WbX5kEWLlfzsGNjH64I8lOOqUB6e8FH")
                .clock(Clock.fixed(Instant.ofEpochSecond(1676312382), ZoneOffset.UTC))
                .build()

        val payload = "{\"company_id\":\"720be419-0293-4d32-a707-32179b0827ab\"}"
        val headers =
            ImmutableListMultimap.of(
                "finch-event-id",
                "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj",
                "finch-timestamp",
                "1676312382",
                "finch-signature",
                "v1,m7y0TV2C+hlHxU42wCieApTSTaA8/047OAplBqxIV/s="
            )

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val client =
            FinchOkHttpClient.builder()
                .accessToken("test-access-token")
                .webhookSecret("5WbX5kEWLlfzsGNjH64I8lOOqUB6e8FH")
                .clock(Clock.fixed(Instant.ofEpochSecond(1676312382), ZoneOffset.UTC))
                .build()

        val payload = "{\"company_id\":\"720be419-0293-4d32-a707-32179b0827ab\"}"
        val webhookId = "msg_2Lh9KRb0pzN4LePd3XiA4v12Axj"
        val webhookTimestamp = "1676312382"
        val webhookSignature = "m7y0TV2C+hlHxU42wCieApTSTaA8/047OAplBqxIV/s="
        val headers =
            ImmutableListMultimap.of(
                "finch-event-id",
                webhookId,
                "finch-timestamp",
                webhookTimestamp,
                "finch-signature",
                "v1,$webhookSignature"
            )

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            "1676312022",
                            "finch-signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("Webhook timestamp too old")

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            "1676312742",
                            "finch-signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("Webhook timestamp too new")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "invalid-secret") }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("Invalid webhook secret")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "Zm9v") }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            webhookTimestamp,
                            "finch-signature",
                            "v1,$webhookSignature v1,Zm9v",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            webhookTimestamp,
                            "finch-signature",
                            "v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            webhookTimestamp,
                            "finch-signature",
                            "v1,$webhookSignature v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "finch-event-id",
                            webhookId,
                            "finch-timestamp",
                            webhookTimestamp,
                            "finch-signature",
                            webhookSignature,
                        ),
                        null
                    )
            }
            .isInstanceOf(FinchException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }
}
