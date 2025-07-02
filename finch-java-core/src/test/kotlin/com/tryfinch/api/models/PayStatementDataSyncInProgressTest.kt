// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayStatementDataSyncInProgressTest {

    @Test
    fun create() {
        val payStatementDataSyncInProgress =
            PayStatementDataSyncInProgress.builder()
                .code(PayStatementDataSyncInProgress.Code._202)
                .finchCode(PayStatementDataSyncInProgress.FinchCode.DATA_SYNC_IN_PROGRESS)
                .message(
                    PayStatementDataSyncInProgress.Message
                        .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
                )
                .name(PayStatementDataSyncInProgress.Name.ACCEPTED)
                .build()

        assertThat(payStatementDataSyncInProgress.code())
            .isEqualTo(PayStatementDataSyncInProgress.Code._202)
        assertThat(payStatementDataSyncInProgress.finchCode())
            .isEqualTo(PayStatementDataSyncInProgress.FinchCode.DATA_SYNC_IN_PROGRESS)
        assertThat(payStatementDataSyncInProgress.message())
            .isEqualTo(
                PayStatementDataSyncInProgress.Message
                    .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
            )
        assertThat(payStatementDataSyncInProgress.name())
            .isEqualTo(PayStatementDataSyncInProgress.Name.ACCEPTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementDataSyncInProgress =
            PayStatementDataSyncInProgress.builder()
                .code(PayStatementDataSyncInProgress.Code._202)
                .finchCode(PayStatementDataSyncInProgress.FinchCode.DATA_SYNC_IN_PROGRESS)
                .message(
                    PayStatementDataSyncInProgress.Message
                        .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
                )
                .name(PayStatementDataSyncInProgress.Name.ACCEPTED)
                .build()

        val roundtrippedPayStatementDataSyncInProgress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementDataSyncInProgress),
                jacksonTypeRef<PayStatementDataSyncInProgress>(),
            )

        assertThat(roundtrippedPayStatementDataSyncInProgress)
            .isEqualTo(payStatementDataSyncInProgress)
    }
}
