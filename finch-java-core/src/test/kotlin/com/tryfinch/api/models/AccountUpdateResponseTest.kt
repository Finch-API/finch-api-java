// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateResponseTest {

    @Test
    fun create() {
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(AccountUpdateResponse.AuthenticationType.CREDENTIAL)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct("string")
                .providerId("provider_id")
                .build()

        assertThat(accountUpdateResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.authenticationType())
            .isEqualTo(AccountUpdateResponse.AuthenticationType.CREDENTIAL)
        assertThat(accountUpdateResponse.companyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.connectionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.entityId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.products()).containsExactly("string")
        assertThat(accountUpdateResponse.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(AccountUpdateResponse.AuthenticationType.CREDENTIAL)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct("string")
                .providerId("provider_id")
                .build()

        val roundtrippedAccountUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountUpdateResponse),
                jacksonTypeRef<AccountUpdateResponse>(),
            )

        assertThat(roundtrippedAccountUpdateResponse).isEqualTo(accountUpdateResponse)
    }
}
