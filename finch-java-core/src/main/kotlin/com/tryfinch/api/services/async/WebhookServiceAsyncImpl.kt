// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.fasterxml.jackson.core.JsonProcessingException
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.getRequiredHeader
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.WebhookEvent
import java.security.MessageDigest
import java.time.Duration
import java.time.Instant
import java.util.Base64
import java.util.function.Consumer
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.jvm.optionals.getOrNull

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unwrap(payload: String, headers: Headers, secret: String?): WebhookEvent {
        verifySignature(payload, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(payload, WebhookEvent::class.java)
        } catch (e: JsonProcessingException) {
            throw FinchException("Invalid event payload", e)
        }
    }

    override fun verifySignature(payload: String, headers: Headers, secret: String?) {
        val webhookSecret =
            secret
                ?: clientOptions.webhookSecret().getOrNull()
                ?: throw FinchException(
                    "The webhook secret must either be set using the env var, FINCH_WEBHOOK_SECRET, on the client class, or passed to this method"
                )

        val parsedSecret =
            try {
                Base64.getDecoder().decode(webhookSecret)
            } catch (e: RuntimeException) {
                throw FinchException("Invalid webhook secret")
            }

        val eventId = headers.getRequiredHeader("finch-event-id")
        val msgSignature = headers.getRequiredHeader("finch-signature")
        val msgTimestamp = headers.getRequiredHeader("finch-timestamp")

        val timestamp =
            try {
                Instant.ofEpochSecond(msgTimestamp.toLong())
            } catch (e: RuntimeException) {
                throw FinchException("Invalid timestamp header: $msgTimestamp", e)
            }
        val now = Instant.now(clientOptions.clock)

        if (timestamp.isBefore(now.minus(Duration.ofMinutes(5)))) {
            throw FinchException("Webhook timestamp too old")
        }
        if (timestamp.isAfter(now.plus(Duration.ofMinutes(5)))) {
            throw FinchException("Webhook timestamp too new")
        }

        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(parsedSecret, "HmacSHA256"))
        val expectedSignature =
            mac.doFinal("$eventId.${timestamp.epochSecond}.$payload".toByteArray())

        msgSignature.splitToSequence(" ").forEach {
            val parts = it.split(",")
            if (parts.size != 2) {
                return@forEach
            }

            if (parts[0] != "v1") {
                return@forEach
            }

            if (MessageDigest.isEqual(Base64.getDecoder().decode(parts[1]), expectedSignature)) {
                return
            }
        }

        throw FinchException("None of the given webhook signatures match the expected signature")
    }
}
