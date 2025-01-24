// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = WebhookEvent.Deserializer::class)
@JsonSerialize(using = WebhookEvent.Serializer::class)
class WebhookEvent
private constructor(
    private val accountUpdate: AccountUpdateEvent? = null,
    private val jobCompletion: JobCompletionEvent? = null,
    private val company: CompanyEvent? = null,
    private val directory: DirectoryEvent? = null,
    private val employment: EmploymentEvent? = null,
    private val individual: IndividualEvent? = null,
    private val payment: PaymentEvent? = null,
    private val payStatement: PayStatementEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun accountUpdate(): Optional<AccountUpdateEvent> = Optional.ofNullable(accountUpdate)

    fun jobCompletion(): Optional<JobCompletionEvent> = Optional.ofNullable(jobCompletion)

    fun company(): Optional<CompanyEvent> = Optional.ofNullable(company)

    fun directory(): Optional<DirectoryEvent> = Optional.ofNullable(directory)

    fun employment(): Optional<EmploymentEvent> = Optional.ofNullable(employment)

    fun individual(): Optional<IndividualEvent> = Optional.ofNullable(individual)

    fun payment(): Optional<PaymentEvent> = Optional.ofNullable(payment)

    fun payStatement(): Optional<PayStatementEvent> = Optional.ofNullable(payStatement)

    fun isAccountUpdate(): Boolean = accountUpdate != null

    fun isJobCompletion(): Boolean = jobCompletion != null

    fun isCompany(): Boolean = company != null

    fun isDirectory(): Boolean = directory != null

    fun isEmployment(): Boolean = employment != null

    fun isIndividual(): Boolean = individual != null

    fun isPayment(): Boolean = payment != null

    fun isPayStatement(): Boolean = payStatement != null

    fun asAccountUpdate(): AccountUpdateEvent = accountUpdate.getOrThrow("accountUpdate")

    fun asJobCompletion(): JobCompletionEvent = jobCompletion.getOrThrow("jobCompletion")

    fun asCompany(): CompanyEvent = company.getOrThrow("company")

    fun asDirectory(): DirectoryEvent = directory.getOrThrow("directory")

    fun asEmployment(): EmploymentEvent = employment.getOrThrow("employment")

    fun asIndividual(): IndividualEvent = individual.getOrThrow("individual")

    fun asPayment(): PaymentEvent = payment.getOrThrow("payment")

    fun asPayStatement(): PayStatementEvent = payStatement.getOrThrow("payStatement")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            accountUpdate != null -> visitor.visitAccountUpdate(accountUpdate)
            jobCompletion != null -> visitor.visitJobCompletion(jobCompletion)
            company != null -> visitor.visitCompany(company)
            directory != null -> visitor.visitDirectory(directory)
            employment != null -> visitor.visitEmployment(employment)
            individual != null -> visitor.visitIndividual(individual)
            payment != null -> visitor.visitPayment(payment)
            payStatement != null -> visitor.visitPayStatement(payStatement)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountUpdate(accountUpdate: AccountUpdateEvent) {
                    accountUpdate.validate()
                }

                override fun visitJobCompletion(jobCompletion: JobCompletionEvent) {
                    jobCompletion.validate()
                }

                override fun visitCompany(company: CompanyEvent) {
                    company.validate()
                }

                override fun visitDirectory(directory: DirectoryEvent) {
                    directory.validate()
                }

                override fun visitEmployment(employment: EmploymentEvent) {
                    employment.validate()
                }

                override fun visitIndividual(individual: IndividualEvent) {
                    individual.validate()
                }

                override fun visitPayment(payment: PaymentEvent) {
                    payment.validate()
                }

                override fun visitPayStatement(payStatement: PayStatementEvent) {
                    payStatement.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEvent && accountUpdate == other.accountUpdate && jobCompletion == other.jobCompletion && company == other.company && directory == other.directory && employment == other.employment && individual == other.individual && payment == other.payment && payStatement == other.payStatement /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountUpdate, jobCompletion, company, directory, employment, individual, payment, payStatement) /* spotless:on */

    override fun toString(): String =
        when {
            accountUpdate != null -> "WebhookEvent{accountUpdate=$accountUpdate}"
            jobCompletion != null -> "WebhookEvent{jobCompletion=$jobCompletion}"
            company != null -> "WebhookEvent{company=$company}"
            directory != null -> "WebhookEvent{directory=$directory}"
            employment != null -> "WebhookEvent{employment=$employment}"
            individual != null -> "WebhookEvent{individual=$individual}"
            payment != null -> "WebhookEvent{payment=$payment}"
            payStatement != null -> "WebhookEvent{payStatement=$payStatement}"
            _json != null -> "WebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid WebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofAccountUpdate(accountUpdate: AccountUpdateEvent) =
            WebhookEvent(accountUpdate = accountUpdate)

        @JvmStatic
        fun ofJobCompletion(jobCompletion: JobCompletionEvent) =
            WebhookEvent(jobCompletion = jobCompletion)

        @JvmStatic fun ofCompany(company: CompanyEvent) = WebhookEvent(company = company)

        @JvmStatic fun ofDirectory(directory: DirectoryEvent) = WebhookEvent(directory = directory)

        @JvmStatic
        fun ofEmployment(employment: EmploymentEvent) = WebhookEvent(employment = employment)

        @JvmStatic
        fun ofIndividual(individual: IndividualEvent) = WebhookEvent(individual = individual)

        @JvmStatic fun ofPayment(payment: PaymentEvent) = WebhookEvent(payment = payment)

        @JvmStatic
        fun ofPayStatement(payStatement: PayStatementEvent) =
            WebhookEvent(payStatement = payStatement)
    }

    interface Visitor<out T> {

        fun visitAccountUpdate(accountUpdate: AccountUpdateEvent): T

        fun visitJobCompletion(jobCompletion: JobCompletionEvent): T

        fun visitCompany(company: CompanyEvent): T

        fun visitDirectory(directory: DirectoryEvent): T

        fun visitEmployment(employment: EmploymentEvent): T

        fun visitIndividual(individual: IndividualEvent): T

        fun visitPayment(payment: PaymentEvent): T

        fun visitPayStatement(payStatement: PayStatementEvent): T

        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown WebhookEvent: $json")
        }
    }

    class Deserializer : BaseDeserializer<WebhookEvent>(WebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): WebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<AccountUpdateEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(accountUpdate = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<JobCompletionEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(jobCompletion = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<CompanyEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(company = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<DirectoryEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(directory = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<EmploymentEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(employment = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<IndividualEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(individual = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PaymentEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(payment = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PayStatementEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(payStatement = it, _json = json)
                }

            return WebhookEvent(_json = json)
        }
    }

    class Serializer : BaseSerializer<WebhookEvent>(WebhookEvent::class) {

        override fun serialize(
            value: WebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.accountUpdate != null -> generator.writeObject(value.accountUpdate)
                value.jobCompletion != null -> generator.writeObject(value.jobCompletion)
                value.company != null -> generator.writeObject(value.company)
                value.directory != null -> generator.writeObject(value.directory)
                value.employment != null -> generator.writeObject(value.employment)
                value.individual != null -> generator.writeObject(value.individual)
                value.payment != null -> generator.writeObject(value.payment)
                value.payStatement != null -> generator.writeObject(value.payStatement)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid WebhookEvent")
            }
        }
    }
}
