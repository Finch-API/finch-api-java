// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountUpdateResponseTest {

    @Test
    fun createAccountUpdateResponse() {
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .accountId("string")
                .authenticationType(AccountUpdateResponse.AuthenticationType.CREDENTIALS)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .products(listOf("string"))
                .providerId("string")
                .build()
        assertThat(accountUpdateResponse).isNotNull
        assertThat(accountUpdateResponse.accountId()).isEqualTo("string")
        assertThat(accountUpdateResponse.authenticationType())
            .isEqualTo(AccountUpdateResponse.AuthenticationType.CREDENTIALS)
        assertThat(accountUpdateResponse.companyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.products()).containsExactly("string")
        assertThat(accountUpdateResponse.providerId()).isEqualTo("string")
    }
}
