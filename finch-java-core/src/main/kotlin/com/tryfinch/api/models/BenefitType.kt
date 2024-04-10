// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException

class BenefitType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BenefitType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val _401K = BenefitType(JsonField.of("401k"))

        @JvmField val _401K_ROTH = BenefitType(JsonField.of("401k_roth"))

        @JvmField val _401K_LOAN = BenefitType(JsonField.of("401k_loan"))

        @JvmField val _403B = BenefitType(JsonField.of("403b"))

        @JvmField val _403B_ROTH = BenefitType(JsonField.of("403b_roth"))

        @JvmField val _457 = BenefitType(JsonField.of("457"))

        @JvmField val _457_ROTH = BenefitType(JsonField.of("457_roth"))

        @JvmField val S125_MEDICAL = BenefitType(JsonField.of("s125_medical"))

        @JvmField val S125_DENTAL = BenefitType(JsonField.of("s125_dental"))

        @JvmField val S125_VISION = BenefitType(JsonField.of("s125_vision"))

        @JvmField val HSA_PRE = BenefitType(JsonField.of("hsa_pre"))

        @JvmField val HSA_POST = BenefitType(JsonField.of("hsa_post"))

        @JvmField val FSA_MEDICAL = BenefitType(JsonField.of("fsa_medical"))

        @JvmField val FSA_DEPENDENT_CARE = BenefitType(JsonField.of("fsa_dependent_care"))

        @JvmField val SIMPLE_IRA = BenefitType(JsonField.of("simple_ira"))

        @JvmField val SIMPLE = BenefitType(JsonField.of("simple"))

        @JvmField val COMMUTER = BenefitType(JsonField.of("commuter"))

        @JvmField val CUSTOM_POST_TAX = BenefitType(JsonField.of("custom_post_tax"))

        @JvmField val CUSTOM_PRE_TAX = BenefitType(JsonField.of("custom_pre_tax"))

        @JvmStatic fun of(value: String) = BenefitType(JsonField.of(value))
    }

    enum class Known {
        _401K,
        _401K_ROTH,
        _401K_LOAN,
        _403B,
        _403B_ROTH,
        _457,
        _457_ROTH,
        S125_MEDICAL,
        S125_DENTAL,
        S125_VISION,
        HSA_PRE,
        HSA_POST,
        FSA_MEDICAL,
        FSA_DEPENDENT_CARE,
        SIMPLE_IRA,
        SIMPLE,
        COMMUTER,
        CUSTOM_POST_TAX,
        CUSTOM_PRE_TAX,
    }

    enum class Value {
        _401K,
        _401K_ROTH,
        _401K_LOAN,
        _403B,
        _403B_ROTH,
        _457,
        _457_ROTH,
        S125_MEDICAL,
        S125_DENTAL,
        S125_VISION,
        HSA_PRE,
        HSA_POST,
        FSA_MEDICAL,
        FSA_DEPENDENT_CARE,
        SIMPLE_IRA,
        SIMPLE,
        COMMUTER,
        CUSTOM_POST_TAX,
        CUSTOM_PRE_TAX,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            _401K -> Value._401K
            _401K_ROTH -> Value._401K_ROTH
            _401K_LOAN -> Value._401K_LOAN
            _403B -> Value._403B
            _403B_ROTH -> Value._403B_ROTH
            _457 -> Value._457
            _457_ROTH -> Value._457_ROTH
            S125_MEDICAL -> Value.S125_MEDICAL
            S125_DENTAL -> Value.S125_DENTAL
            S125_VISION -> Value.S125_VISION
            HSA_PRE -> Value.HSA_PRE
            HSA_POST -> Value.HSA_POST
            FSA_MEDICAL -> Value.FSA_MEDICAL
            FSA_DEPENDENT_CARE -> Value.FSA_DEPENDENT_CARE
            SIMPLE_IRA -> Value.SIMPLE_IRA
            SIMPLE -> Value.SIMPLE
            COMMUTER -> Value.COMMUTER
            CUSTOM_POST_TAX -> Value.CUSTOM_POST_TAX
            CUSTOM_PRE_TAX -> Value.CUSTOM_PRE_TAX
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            _401K -> Known._401K
            _401K_ROTH -> Known._401K_ROTH
            _401K_LOAN -> Known._401K_LOAN
            _403B -> Known._403B
            _403B_ROTH -> Known._403B_ROTH
            _457 -> Known._457
            _457_ROTH -> Known._457_ROTH
            S125_MEDICAL -> Known.S125_MEDICAL
            S125_DENTAL -> Known.S125_DENTAL
            S125_VISION -> Known.S125_VISION
            HSA_PRE -> Known.HSA_PRE
            HSA_POST -> Known.HSA_POST
            FSA_MEDICAL -> Known.FSA_MEDICAL
            FSA_DEPENDENT_CARE -> Known.FSA_DEPENDENT_CARE
            SIMPLE_IRA -> Known.SIMPLE_IRA
            SIMPLE -> Known.SIMPLE
            COMMUTER -> Known.COMMUTER
            CUSTOM_POST_TAX -> Known.CUSTOM_POST_TAX
            CUSTOM_PRE_TAX -> Known.CUSTOM_PRE_TAX
            else -> throw FinchInvalidDataException("Unknown BenefitType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
