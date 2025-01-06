// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class IndividualBenefit
@JsonCreator
private constructor(
    @JsonProperty("body") @ExcludeMissing private val body: JsonField<Body> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IndividualBenefit = apply {
        if (!validated) {
            body().map { it.validate() }
            code()
            individualId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var body: JsonField<Body> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualBenefit: IndividualBenefit) = apply {
            body = individualBenefit.body
            code = individualBenefit.code
            individualId = individualBenefit.individualId
            additionalProperties = individualBenefit.additionalProperties.toMutableMap()
        }

        fun body(body: Body) = body(JsonField.of(body))

        fun body(body: JsonField<Body>) = apply { this.body = body }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

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
                body,
                code,
                individualId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        private val annualMaximum: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("catch_up")
        @ExcludeMissing
        private val catchUp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("company_contribution")
        @ExcludeMissing
        private val companyContribution: JsonField<BenefitContribution> = JsonMissing.of(),
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        private val employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of(),
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        private val hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        fun annualMaximum(): Optional<Long> =
            Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

        fun companyContribution(): Optional<BenefitContribution> =
            Optional.ofNullable(companyContribution.getNullable("company_contribution"))

        fun employeeDeduction(): Optional<BenefitContribution> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        /** Type for HSA contribution limit if the benefit is a HSA. */
        fun hsaContributionLimit(): Optional<HsaContributionLimit> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        @JsonProperty("annual_maximum") @ExcludeMissing fun _annualMaximum() = annualMaximum

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        @JsonProperty("catch_up") @ExcludeMissing fun _catchUp() = catchUp

        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun _companyContribution() = companyContribution

        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction() = employeeDeduction

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
                annualMaximum()
                catchUp()
                companyContribution().map { it.validate() }
                employeeDeduction().map { it.validate() }
                hsaContributionLimit()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var annualMaximum: JsonField<Long> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var companyContribution: JsonField<BenefitContribution> = JsonMissing.of()
            private var employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of()
            private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                annualMaximum = body.annualMaximum
                catchUp = body.catchUp
                companyContribution = body.companyContribution
                employeeDeduction = body.employeeDeduction
                hsaContributionLimit = body.hsaContributionLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            fun annualMaximum(annualMaximum: Long) = annualMaximum(JsonField.of(annualMaximum))

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
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
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            fun companyContribution(companyContribution: BenefitContribution) =
                companyContribution(JsonField.of(companyContribution))

            fun companyContribution(companyContribution: JsonField<BenefitContribution>) = apply {
                this.companyContribution = companyContribution
            }

            fun employeeDeduction(employeeDeduction: BenefitContribution) =
                employeeDeduction(JsonField.of(employeeDeduction))

            fun employeeDeduction(employeeDeduction: JsonField<BenefitContribution>) = apply {
                this.employeeDeduction = employeeDeduction
            }

            /** Type for HSA contribution limit if the benefit is a HSA. */
            fun hsaContributionLimit(hsaContributionLimit: HsaContributionLimit) =
                hsaContributionLimit(JsonField.of(hsaContributionLimit))

            /** Type for HSA contribution limit if the benefit is a HSA. */
            fun hsaContributionLimit(hsaContributionLimit: JsonField<HsaContributionLimit>) =
                apply {
                    this.hsaContributionLimit = hsaContributionLimit
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

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
                    annualMaximum,
                    catchUp,
                    companyContribution,
                    employeeDeduction,
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

            return /* spotless:off */ other is Body && annualMaximum == other.annualMaximum && catchUp == other.catchUp && companyContribution == other.companyContribution && employeeDeduction == other.employeeDeduction && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annualMaximum, catchUp, companyContribution, employeeDeduction, hsaContributionLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, employeeDeduction=$employeeDeduction, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualBenefit && body == other.body && code == other.code && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, code, individualId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualBenefit{body=$body, code=$code, individualId=$individualId, additionalProperties=$additionalProperties}"
}
