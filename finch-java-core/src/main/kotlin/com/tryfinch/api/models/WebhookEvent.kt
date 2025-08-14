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
import com.tryfinch.api.core.allMaxBy
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = WebhookEvent.Deserializer::class)
@JsonSerialize(using = WebhookEvent.Serializer::class)
class WebhookEvent
private constructor(
    private val accountUpdated: AccountUpdateEvent? = null,
    private val jobCompletion: JobCompletionEvent? = null,
    private val companyUpdated: CompanyEvent? = null,
    private val directory: DirectoryEvent? = null,
    private val employment: EmploymentEvent? = null,
    private val individual: IndividualEvent? = null,
    private val payment: PaymentEvent? = null,
    private val payStatement: PayStatementEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun accountUpdated(): Optional<AccountUpdateEvent> = Optional.ofNullable(accountUpdated)

    fun jobCompletion(): Optional<JobCompletionEvent> = Optional.ofNullable(jobCompletion)

    fun companyUpdated(): Optional<CompanyEvent> = Optional.ofNullable(companyUpdated)

    fun directory(): Optional<DirectoryEvent> = Optional.ofNullable(directory)

    fun employment(): Optional<EmploymentEvent> = Optional.ofNullable(employment)

    fun individual(): Optional<IndividualEvent> = Optional.ofNullable(individual)

    fun payment(): Optional<PaymentEvent> = Optional.ofNullable(payment)

    fun payStatement(): Optional<PayStatementEvent> = Optional.ofNullable(payStatement)

    fun isAccountUpdated(): Boolean = accountUpdated != null

    fun isJobCompletion(): Boolean = jobCompletion != null

    fun isCompanyUpdated(): Boolean = companyUpdated != null

    fun isDirectory(): Boolean = directory != null

    fun isEmployment(): Boolean = employment != null

    fun isIndividual(): Boolean = individual != null

    fun isPayment(): Boolean = payment != null

    fun isPayStatement(): Boolean = payStatement != null

    fun asAccountUpdated(): AccountUpdateEvent = accountUpdated.getOrThrow("accountUpdated")

    fun asJobCompletion(): JobCompletionEvent = jobCompletion.getOrThrow("jobCompletion")

    fun asCompanyUpdated(): CompanyEvent = companyUpdated.getOrThrow("companyUpdated")

    fun asDirectory(): DirectoryEvent = directory.getOrThrow("directory")

    fun asEmployment(): EmploymentEvent = employment.getOrThrow("employment")

    fun asIndividual(): IndividualEvent = individual.getOrThrow("individual")

    fun asPayment(): PaymentEvent = payment.getOrThrow("payment")

    fun asPayStatement(): PayStatementEvent = payStatement.getOrThrow("payStatement")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountUpdated != null -> visitor.visitAccountUpdated(accountUpdated)
            jobCompletion != null -> visitor.visitJobCompletion(jobCompletion)
            companyUpdated != null -> visitor.visitCompanyUpdated(companyUpdated)
            directory != null -> visitor.visitDirectory(directory)
            employment != null -> visitor.visitEmployment(employment)
            individual != null -> visitor.visitIndividual(individual)
            payment != null -> visitor.visitPayment(payment)
            payStatement != null -> visitor.visitPayStatement(payStatement)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountUpdated(accountUpdated: AccountUpdateEvent) {
                    accountUpdated.validate()
                }

                override fun visitJobCompletion(jobCompletion: JobCompletionEvent) {
                    jobCompletion.validate()
                }

                override fun visitCompanyUpdated(companyUpdated: CompanyEvent) {
                    companyUpdated.validate()
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAccountUpdated(accountUpdated: AccountUpdateEvent) =
                    accountUpdated.validity()

                override fun visitJobCompletion(jobCompletion: JobCompletionEvent) =
                    jobCompletion.validity()

                override fun visitCompanyUpdated(companyUpdated: CompanyEvent) =
                    companyUpdated.validity()

                override fun visitDirectory(directory: DirectoryEvent) = directory.validity()

                override fun visitEmployment(employment: EmploymentEvent) = employment.validity()

                override fun visitIndividual(individual: IndividualEvent) = individual.validity()

                override fun visitPayment(payment: PaymentEvent) = payment.validity()

                override fun visitPayStatement(payStatement: PayStatementEvent) =
                    payStatement.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEvent &&
            accountUpdated == other.accountUpdated &&
            jobCompletion == other.jobCompletion &&
            companyUpdated == other.companyUpdated &&
            directory == other.directory &&
            employment == other.employment &&
            individual == other.individual &&
            payment == other.payment &&
            payStatement == other.payStatement
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountUpdated,
            jobCompletion,
            companyUpdated,
            directory,
            employment,
            individual,
            payment,
            payStatement,
        )

    override fun toString(): String =
        when {
            accountUpdated != null -> "WebhookEvent{accountUpdated=$accountUpdated}"
            jobCompletion != null -> "WebhookEvent{jobCompletion=$jobCompletion}"
            companyUpdated != null -> "WebhookEvent{companyUpdated=$companyUpdated}"
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
        fun ofAccountUpdated(accountUpdated: AccountUpdateEvent) =
            WebhookEvent(accountUpdated = accountUpdated)

        @JvmStatic
        fun ofJobCompletion(jobCompletion: JobCompletionEvent) =
            WebhookEvent(jobCompletion = jobCompletion)

        @JvmStatic
        fun ofCompanyUpdated(companyUpdated: CompanyEvent) =
            WebhookEvent(companyUpdated = companyUpdated)

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

    /**
     * An interface that defines how to map each variant of [WebhookEvent] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitAccountUpdated(accountUpdated: AccountUpdateEvent): T

        fun visitJobCompletion(jobCompletion: JobCompletionEvent): T

        fun visitCompanyUpdated(companyUpdated: CompanyEvent): T

        fun visitDirectory(directory: DirectoryEvent): T

        fun visitEmployment(employment: EmploymentEvent): T

        fun visitIndividual(individual: IndividualEvent): T

        fun visitPayment(payment: PaymentEvent): T

        fun visitPayStatement(payStatement: PayStatementEvent): T

        /**
         * Maps an unknown variant of [WebhookEvent] to a value of type [T].
         *
         * An instance of [WebhookEvent] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws FinchInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown WebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<WebhookEvent>(WebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): WebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountUpdateEvent>())?.let {
                            WebhookEvent(accountUpdated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JobCompletionEvent>())?.let {
                            WebhookEvent(jobCompletion = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CompanyEvent>())?.let {
                            WebhookEvent(companyUpdated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DirectoryEvent>())?.let {
                            WebhookEvent(directory = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EmploymentEvent>())?.let {
                            WebhookEvent(employment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IndividualEvent>())?.let {
                            WebhookEvent(individual = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentEvent>())?.let {
                            WebhookEvent(payment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PayStatementEvent>())?.let {
                            WebhookEvent(payStatement = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> WebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<WebhookEvent>(WebhookEvent::class) {

        override fun serialize(
            value: WebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountUpdated != null -> generator.writeObject(value.accountUpdated)
                value.jobCompletion != null -> generator.writeObject(value.jobCompletion)
                value.companyUpdated != null -> generator.writeObject(value.companyUpdated)
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
