// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

/** Type of benefit. */
class BenefitType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val _401K = of("401k")

        @JvmField val _401K_ROTH = of("401k_roth")

        @JvmField val _401K_LOAN = of("401k_loan")

        @JvmField val _403B = of("403b")

        @JvmField val _403B_ROTH = of("403b_roth")

        @JvmField val _457 = of("457")

        @JvmField val _457_ROTH = of("457_roth")

        @JvmField val S125_MEDICAL = of("s125_medical")

        @JvmField val S125_DENTAL = of("s125_dental")

        @JvmField val S125_VISION = of("s125_vision")

        @JvmField val HSA_PRE = of("hsa_pre")

        @JvmField val HSA_POST = of("hsa_post")

        @JvmField val FSA_MEDICAL = of("fsa_medical")

        @JvmField val FSA_DEPENDENT_CARE = of("fsa_dependent_care")

        @JvmField val SIMPLE_IRA = of("simple_ira")

        @JvmField val SIMPLE = of("simple")

        @JvmField val COMMUTER = of("commuter")

        @JvmField val CUSTOM_POST_TAX = of("custom_post_tax")

        @JvmField val CUSTOM_PRE_TAX = of("custom_pre_tax")

        @JvmStatic fun of(value: String) = BenefitType(JsonField.of(value))
    }

    /** An enum containing [BenefitType]'s known values. */
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

    /**
     * An enum containing [BenefitType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BenefitType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
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
        /** An enum member indicating that [BenefitType] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
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

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws FinchInvalidDataException if this class instance's value is a not a known member.
     */
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

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws FinchInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): BenefitType = apply {
        if (validated) {
            return@apply
        }

        known()
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
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
