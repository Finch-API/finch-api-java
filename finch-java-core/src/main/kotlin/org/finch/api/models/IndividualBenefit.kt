package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable
import org.finch.api.errors.FinchInvalidDataException

@JsonDeserialize(builder = IndividualBenefit.Builder::class)
@NoAutoDetect
class IndividualBenefit
private constructor(
    private val individualId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<Body>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            individualId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndividualBenefit &&
            this.individualId == other.individualId &&
            this.code == other.code &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    individualId,
                    code,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "IndividualBenefit{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<Body> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualBenefit: IndividualBenefit) = apply {
            this.individualId = individualBenefit.individualId
            this.code = individualBenefit.code
            this.body = individualBenefit.body
            additionalProperties(individualBenefit.additionalProperties)
        }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: Body) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<Body>) = apply { this.body = body }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): IndividualBenefit =
            IndividualBenefit(
                individualId,
                code,
                body,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Body.Builder::class)
    @NoAutoDetect
    class Body
    private constructor(
        private val employeeDeduction: JsonField<BenfitContribution>,
        private val companyContribution: JsonField<BenfitContribution>,
        private val annualMaximum: JsonField<Long>,
        private val catchUp: JsonField<Boolean>,
        private val hsaContributionLimit: JsonField<HsaContributionLimit>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun employeeDeduction(): Optional<BenfitContribution> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        fun companyContribution(): Optional<BenfitContribution> =
            Optional.ofNullable(companyContribution.getNullable("company_contribution"))

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        fun annualMaximum(): Optional<Long> =
            Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

        /** Type for HSA contribution limit if the benefit is a HSA. */
        fun hsaContributionLimit(): Optional<HsaContributionLimit> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction() = employeeDeduction

        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun _companyContribution() = companyContribution

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        @JsonProperty("annual_maximum") @ExcludeMissing fun _annualMaximum() = annualMaximum

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        @JsonProperty("catch_up") @ExcludeMissing fun _catchUp() = catchUp

        /** Type for HSA contribution limit if the benefit is a HSA. */
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        fun _hsaContributionLimit() = hsaContributionLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                employeeDeduction().map { it.validate() }
                companyContribution().map { it.validate() }
                annualMaximum()
                catchUp()
                hsaContributionLimit()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                this.employeeDeduction == other.employeeDeduction &&
                this.companyContribution == other.companyContribution &&
                this.annualMaximum == other.annualMaximum &&
                this.catchUp == other.catchUp &&
                this.hsaContributionLimit == other.hsaContributionLimit &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        employeeDeduction,
                        companyContribution,
                        annualMaximum,
                        catchUp,
                        hsaContributionLimit,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Body{employeeDeduction=$employeeDeduction, companyContribution=$companyContribution, annualMaximum=$annualMaximum, catchUp=$catchUp, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var employeeDeduction: JsonField<BenfitContribution> = JsonMissing.of()
            private var companyContribution: JsonField<BenfitContribution> = JsonMissing.of()
            private var annualMaximum: JsonField<Long> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                this.employeeDeduction = body.employeeDeduction
                this.companyContribution = body.companyContribution
                this.annualMaximum = body.annualMaximum
                this.catchUp = body.catchUp
                this.hsaContributionLimit = body.hsaContributionLimit
                additionalProperties(body.additionalProperties)
            }

            fun employeeDeduction(employeeDeduction: BenfitContribution) =
                employeeDeduction(JsonField.of(employeeDeduction))

            @JsonProperty("employee_deduction")
            @ExcludeMissing
            fun employeeDeduction(employeeDeduction: JsonField<BenfitContribution>) = apply {
                this.employeeDeduction = employeeDeduction
            }

            fun companyContribution(companyContribution: BenfitContribution) =
                companyContribution(JsonField.of(companyContribution))

            @JsonProperty("company_contribution")
            @ExcludeMissing
            fun companyContribution(companyContribution: JsonField<BenfitContribution>) = apply {
                this.companyContribution = companyContribution
            }

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            fun annualMaximum(annualMaximum: Long) = annualMaximum(JsonField.of(annualMaximum))

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            @JsonProperty("annual_maximum")
            @ExcludeMissing
            fun annualMaximum(annualMaximum: JsonField<Long>) = apply {
                this.annualMaximum = annualMaximum
            }

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            fun catchUp(catchUp: Boolean) = catchUp(JsonField.of(catchUp))

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            @JsonProperty("catch_up")
            @ExcludeMissing
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            /** Type for HSA contribution limit if the benefit is a HSA. */
            fun hsaContributionLimit(hsaContributionLimit: HsaContributionLimit) =
                hsaContributionLimit(JsonField.of(hsaContributionLimit))

            /** Type for HSA contribution limit if the benefit is a HSA. */
            @JsonProperty("hsa_contribution_limit")
            @ExcludeMissing
            fun hsaContributionLimit(hsaContributionLimit: JsonField<HsaContributionLimit>) =
                apply {
                    this.hsaContributionLimit = hsaContributionLimit
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Body =
                Body(
                    employeeDeduction,
                    companyContribution,
                    annualMaximum,
                    catchUp,
                    hsaContributionLimit,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class HsaContributionLimit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HsaContributionLimit && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INDIVIDUAL = HsaContributionLimit(JsonField.of("individual"))

                @JvmField val FAMILY = HsaContributionLimit(JsonField.of("family"))

                @JvmStatic fun of(value: String) = HsaContributionLimit(JsonField.of(value))
            }

            enum class Known {
                INDIVIDUAL,
                FAMILY,
            }

            enum class Value {
                INDIVIDUAL,
                FAMILY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INDIVIDUAL -> Value.INDIVIDUAL
                    FAMILY -> Value.FAMILY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INDIVIDUAL -> Known.INDIVIDUAL
                    FAMILY -> Known.FAMILY
                    else -> throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
