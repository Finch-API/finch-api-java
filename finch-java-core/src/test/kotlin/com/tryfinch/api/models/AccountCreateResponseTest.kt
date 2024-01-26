// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCreateResponseTest {

    @Test
    fun createAccountCreateResponse() {
        val accountCreateResponse =
            AccountCreateResponse.builder()
                .accessToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(AccountCreateResponse.AuthenticationType.CREDENTIAL)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .products(listOf("string"))
                .providerId("string")
                .build()
        assertThat(accountCreateResponse).isNotNull
        assertThat(accountCreateResponse.accessToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCreateResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCreateResponse.authenticationType())
            .isEqualTo(AccountCreateResponse.AuthenticationType.CREDENTIAL)
        assertThat(accountCreateResponse.companyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCreateResponse.products()).containsExactly("string")
        assertThat(accountCreateResponse.providerId()).isEqualTo("string")
    }
}
