// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountUpdateResponseTest {

    @Test
    fun createAccountUpdateResponse() {
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .accountId("account_id")
                .authenticationType(AccountUpdateResponse.AuthenticationType.CREDENTIAL)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .products(listOf("string"))
                .providerId("provider_id")
                .build()
        assertThat(accountUpdateResponse).isNotNull
        assertThat(accountUpdateResponse.accountId()).isEqualTo("account_id")
        assertThat(accountUpdateResponse.authenticationType())
            .isEqualTo(AccountUpdateResponse.AuthenticationType.CREDENTIAL)
        assertThat(accountUpdateResponse.companyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateResponse.products()).containsExactly("string")
        assertThat(accountUpdateResponse.providerId()).isEqualTo("provider_id")
    }
}
