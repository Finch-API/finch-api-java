package com.tryfinch.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OfferTest {

    @Test
    fun createOffer() {
        val offer =
            Offer.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .applicationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .candidateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(Offer.Status.SIGNED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(offer).isNotNull
        assertThat(offer.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offer.applicationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offer.candidateId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offer.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(offer.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(offer.status()).isEqualTo(Offer.Status.SIGNED)
    }
}
