// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEventTest {

    @Test
    fun ofAccountUpdated() {
        val accountUpdated =
            AccountUpdateEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofAccountUpdated(accountUpdated)

        assertThat(webhookEvent.accountUpdated()).contains(accountUpdated)
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofJobCompletion() {
        val jobCompletion =
            JobCompletionEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofJobCompletion(jobCompletion)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).contains(jobCompletion)
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofCompanyUpdated() {
        val companyUpdated =
            CompanyEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofCompanyUpdated(companyUpdated)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).contains(companyUpdated)
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofDirectory() {
        val directory =
            DirectoryEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofDirectory(directory)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).contains(directory)
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofEmployment() {
        val employment =
            EmploymentEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofEmployment(employment)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).contains(employment)
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofIndividual() {
        val individual =
            IndividualEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofIndividual(individual)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).contains(individual)
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofPayment() {
        val payment = PaymentEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofPayment(payment)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).contains(payment)
        assertThat(webhookEvent.payStatement()).isEmpty
    }

    @Test
    fun ofPayStatement() {
        val payStatement =
            PayStatementEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofPayStatement(payStatement)

        assertThat(webhookEvent.accountUpdated()).isEmpty
        assertThat(webhookEvent.jobCompletion()).isEmpty
        assertThat(webhookEvent.companyUpdated()).isEmpty
        assertThat(webhookEvent.directory()).isEmpty
        assertThat(webhookEvent.employment()).isEmpty
        assertThat(webhookEvent.individual()).isEmpty
        assertThat(webhookEvent.payment()).isEmpty
        assertThat(webhookEvent.payStatement()).contains(payStatement)
    }
}
