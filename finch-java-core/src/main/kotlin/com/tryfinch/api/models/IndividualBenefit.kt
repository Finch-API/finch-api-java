// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = IndividualBenefit.Builder::class)
@NoAutoDetect
class IndividualBenefit
private constructor(
    private val individualId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<Body>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    private var validated: Boolean = false

    fun validate(): IndividualBenefit = apply {
        if (!validated) {
            individualId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

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
            individualId = individualBenefit.individualId
            code = individualBenefit.code
            body = individualBenefit.body
            additionalProperties = individualBenefit.additionalProperties.toMutableMap()
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
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): IndividualBenefit =
            IndividualBenefit(
                individualId,
                code,
                body,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Body.Builder::class)
    @NoAutoDetect
    class Body
    private constructor(
        private val employeeDeduction: JsonField<BenefitContribution>,
        private val companyContribution: JsonField<BenefitContribution>,
        private val annualMaximum: JsonField<Long>,
        private val catchUp: JsonField<Boolean>,
        private val hsaContributionLimit: JsonField<HsaContributionLimit>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun employeeDeduction(): Optional<BenefitContribution> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        fun companyContribution(): Optional<BenefitContribution> =
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

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of()
            private var companyContribution: JsonField<BenefitContribution> = JsonMissing.of()
            private var annualMaximum: JsonField<Long> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                employeeDeduction = body.employeeDeduction
                companyContribution = body.companyContribution
                annualMaximum = body.annualMaximum
                catchUp = body.catchUp
                hsaContributionLimit = body.hsaContributionLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun employeeDeduction(employeeDeduction: BenefitContribution) =
                employeeDeduction(JsonField.of(employeeDeduction))

            @JsonProperty("employee_deduction")
            @ExcludeMissing
            fun employeeDeduction(employeeDeduction: JsonField<BenefitContribution>) = apply {
                this.employeeDeduction = employeeDeduction
            }

            fun companyContribution(companyContribution: BenefitContribution) =
                companyContribution(JsonField.of(companyContribution))

            @JsonProperty("company_contribution")
            @ExcludeMissing
            fun companyContribution(companyContribution: JsonField<BenefitContribution>) = apply {
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
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    employeeDeduction,
                    companyContribution,
                    annualMaximum,
                    catchUp,
                    hsaContributionLimit,
                    additionalProperties.toImmutable(),
                )
        }

        class HsaContributionLimit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INDIVIDUAL = of("individual")

                @JvmField val FAMILY = of("family")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is HsaContributionLimit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && employeeDeduction == other.employeeDeduction && companyContribution == other.companyContribution && annualMaximum == other.annualMaximum && catchUp == other.catchUp && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(employeeDeduction, companyContribution, annualMaximum, catchUp, hsaContributionLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{employeeDeduction=$employeeDeduction, companyContribution=$companyContribution, annualMaximum=$annualMaximum, catchUp=$catchUp, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualBenefit && individualId == other.individualId && code == other.code && body == other.body && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(individualId, code, body, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualBenefit{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"
}
