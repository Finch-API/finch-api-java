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

/**
 * A 2020 version of the W-4 tax form containing information on an individual's filing status,
 * dependents, and withholding details.
 */
@NoAutoDetect
class W42020
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("year") @ExcludeMissing private val year: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Detailed information specific to the 2020 W4 form. */
    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    /** Specifies the form type, indicating that this document is a 2020 W4 form. */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /** The tax year this W4 document applies to. */
    fun year(): Optional<Double> = Optional.ofNullable(year.getNullable("year"))

    /** Detailed information specific to the 2020 W4 form. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /** Specifies the form type, indicating that this document is a 2020 W4 form. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The tax year this W4 document applies to. */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Double> = year

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): W42020 = apply {
        if (!validated) {
            data().map { it.validate() }
            type()
            year()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var year: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(w42020: W42020) = apply {
            data = w42020.data
            type = w42020.type
            year = w42020.year
            additionalProperties = w42020.additionalProperties.toMutableMap()
        }

        /** Detailed information specific to the 2020 W4 form. */
        fun data(data: Data) = data(JsonField.of(data))

        /** Detailed information specific to the 2020 W4 form. */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Specifies the form type, indicating that this document is a 2020 W4 form. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Specifies the form type, indicating that this document is a 2020 W4 form. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The tax year this W4 document applies to. */
        fun year(year: Double?) = year(JsonField.ofNullable(year))

        /** The tax year this W4 document applies to. */
        fun year(year: Double) = year(year as Double?)

        /** The tax year this W4 document applies to. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun year(year: Optional<Double>) = year(year.orElse(null) as Double?)

        /** The tax year this W4 document applies to. */
        fun year(year: JsonField<Double>) = apply { this.year = year }

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

        fun build(): W42020 =
            W42020(
                data,
                type,
                year,
                additionalProperties.toImmutable(),
            )
    }

    /** Detailed information specific to the 2020 W4 form. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("amount_for_other_dependents")
        @ExcludeMissing
        private val amountForOtherDependents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_for_qualifying_children_under_17")
        @ExcludeMissing
        private val amountForQualifyingChildrenUnder17: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deductions")
        @ExcludeMissing
        private val deductions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extra_withholding")
        @ExcludeMissing
        private val extraWithholding: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filing_status")
        @ExcludeMissing
        private val filingStatus: JsonField<FilingStatus> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_income")
        @ExcludeMissing
        private val otherIncome: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_claim_dependent_and_other_credits")
        @ExcludeMissing
        private val totalClaimDependentAndOtherCredits: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
        fun amountForOtherDependents(): Optional<Long> =
            Optional.ofNullable(amountForOtherDependents.getNullable("amount_for_other_dependents"))

        /** Amount claimed for dependents under 17 years old (in cents). */
        fun amountForQualifyingChildrenUnder17(): Optional<Long> =
            Optional.ofNullable(
                amountForQualifyingChildrenUnder17.getNullable(
                    "amount_for_qualifying_children_under_17"
                )
            )

        /** Deductible expenses (in cents). */
        fun deductions(): Optional<Long> = Optional.ofNullable(deductions.getNullable("deductions"))

        /** Additional withholding amount (in cents). */
        fun extraWithholding(): Optional<Long> =
            Optional.ofNullable(extraWithholding.getNullable("extra_withholding"))

        /** The individual's filing status for tax purposes. */
        fun filingStatus(): Optional<FilingStatus> =
            Optional.ofNullable(filingStatus.getNullable("filing_status"))

        /** The unique identifier for the individual associated with this document. */
        fun individualId(): Optional<String> =
            Optional.ofNullable(individualId.getNullable("individual_id"))

        /** Additional income from sources outside of primary employment (in cents). */
        fun otherIncome(): Optional<Long> =
            Optional.ofNullable(otherIncome.getNullable("other_income"))

        /** Total amount claimed for dependents and other credits (in cents). */
        fun totalClaimDependentAndOtherCredits(): Optional<Long> =
            Optional.ofNullable(
                totalClaimDependentAndOtherCredits.getNullable(
                    "total_claim_dependent_and_other_credits"
                )
            )

        /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
        @JsonProperty("amount_for_other_dependents")
        @ExcludeMissing
        fun _amountForOtherDependents(): JsonField<Long> = amountForOtherDependents

        /** Amount claimed for dependents under 17 years old (in cents). */
        @JsonProperty("amount_for_qualifying_children_under_17")
        @ExcludeMissing
        fun _amountForQualifyingChildrenUnder17(): JsonField<Long> =
            amountForQualifyingChildrenUnder17

        /** Deductible expenses (in cents). */
        @JsonProperty("deductions") @ExcludeMissing fun _deductions(): JsonField<Long> = deductions

        /** Additional withholding amount (in cents). */
        @JsonProperty("extra_withholding")
        @ExcludeMissing
        fun _extraWithholding(): JsonField<Long> = extraWithholding

        /** The individual's filing status for tax purposes. */
        @JsonProperty("filing_status")
        @ExcludeMissing
        fun _filingStatus(): JsonField<FilingStatus> = filingStatus

        /** The unique identifier for the individual associated with this document. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /** Additional income from sources outside of primary employment (in cents). */
        @JsonProperty("other_income")
        @ExcludeMissing
        fun _otherIncome(): JsonField<Long> = otherIncome

        /** Total amount claimed for dependents and other credits (in cents). */
        @JsonProperty("total_claim_dependent_and_other_credits")
        @ExcludeMissing
        fun _totalClaimDependentAndOtherCredits(): JsonField<Long> =
            totalClaimDependentAndOtherCredits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                amountForOtherDependents()
                amountForQualifyingChildrenUnder17()
                deductions()
                extraWithholding()
                filingStatus()
                individualId()
                otherIncome()
                totalClaimDependentAndOtherCredits()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amountForOtherDependents: JsonField<Long> = JsonMissing.of()
            private var amountForQualifyingChildrenUnder17: JsonField<Long> = JsonMissing.of()
            private var deductions: JsonField<Long> = JsonMissing.of()
            private var extraWithholding: JsonField<Long> = JsonMissing.of()
            private var filingStatus: JsonField<FilingStatus> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var otherIncome: JsonField<Long> = JsonMissing.of()
            private var totalClaimDependentAndOtherCredits: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                amountForOtherDependents = data.amountForOtherDependents
                amountForQualifyingChildrenUnder17 = data.amountForQualifyingChildrenUnder17
                deductions = data.deductions
                extraWithholding = data.extraWithholding
                filingStatus = data.filingStatus
                individualId = data.individualId
                otherIncome = data.otherIncome
                totalClaimDependentAndOtherCredits = data.totalClaimDependentAndOtherCredits
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
            fun amountForOtherDependents(amountForOtherDependents: Long?) =
                amountForOtherDependents(JsonField.ofNullable(amountForOtherDependents))

            /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
            fun amountForOtherDependents(amountForOtherDependents: Long) =
                amountForOtherDependents(amountForOtherDependents as Long?)

            /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amountForOtherDependents(amountForOtherDependents: Optional<Long>) =
                amountForOtherDependents(amountForOtherDependents.orElse(null) as Long?)

            /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
            fun amountForOtherDependents(amountForOtherDependents: JsonField<Long>) = apply {
                this.amountForOtherDependents = amountForOtherDependents
            }

            /** Amount claimed for dependents under 17 years old (in cents). */
            fun amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17: Long?) =
                amountForQualifyingChildrenUnder17(
                    JsonField.ofNullable(amountForQualifyingChildrenUnder17)
                )

            /** Amount claimed for dependents under 17 years old (in cents). */
            fun amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17: Long) =
                amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17 as Long?)

            /** Amount claimed for dependents under 17 years old (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amountForQualifyingChildrenUnder17(
                amountForQualifyingChildrenUnder17: Optional<Long>
            ) =
                amountForQualifyingChildrenUnder17(
                    amountForQualifyingChildrenUnder17.orElse(null) as Long?
                )

            /** Amount claimed for dependents under 17 years old (in cents). */
            fun amountForQualifyingChildrenUnder17(
                amountForQualifyingChildrenUnder17: JsonField<Long>
            ) = apply {
                this.amountForQualifyingChildrenUnder17 = amountForQualifyingChildrenUnder17
            }

            /** Deductible expenses (in cents). */
            fun deductions(deductions: Long?) = deductions(JsonField.ofNullable(deductions))

            /** Deductible expenses (in cents). */
            fun deductions(deductions: Long) = deductions(deductions as Long?)

            /** Deductible expenses (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun deductions(deductions: Optional<Long>) =
                deductions(deductions.orElse(null) as Long?)

            /** Deductible expenses (in cents). */
            fun deductions(deductions: JsonField<Long>) = apply { this.deductions = deductions }

            /** Additional withholding amount (in cents). */
            fun extraWithholding(extraWithholding: Long?) =
                extraWithholding(JsonField.ofNullable(extraWithholding))

            /** Additional withholding amount (in cents). */
            fun extraWithholding(extraWithholding: Long) =
                extraWithholding(extraWithholding as Long?)

            /** Additional withholding amount (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun extraWithholding(extraWithholding: Optional<Long>) =
                extraWithholding(extraWithholding.orElse(null) as Long?)

            /** Additional withholding amount (in cents). */
            fun extraWithholding(extraWithholding: JsonField<Long>) = apply {
                this.extraWithholding = extraWithholding
            }

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: FilingStatus?) =
                filingStatus(JsonField.ofNullable(filingStatus))

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: Optional<FilingStatus>) =
                filingStatus(filingStatus.orElse(null))

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: JsonField<FilingStatus>) = apply {
                this.filingStatus = filingStatus
            }

            /** The unique identifier for the individual associated with this document. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The unique identifier for the individual associated with this document. */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /** Additional income from sources outside of primary employment (in cents). */
            fun otherIncome(otherIncome: Long?) = otherIncome(JsonField.ofNullable(otherIncome))

            /** Additional income from sources outside of primary employment (in cents). */
            fun otherIncome(otherIncome: Long) = otherIncome(otherIncome as Long?)

            /** Additional income from sources outside of primary employment (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun otherIncome(otherIncome: Optional<Long>) =
                otherIncome(otherIncome.orElse(null) as Long?)

            /** Additional income from sources outside of primary employment (in cents). */
            fun otherIncome(otherIncome: JsonField<Long>) = apply { this.otherIncome = otherIncome }

            /** Total amount claimed for dependents and other credits (in cents). */
            fun totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits: Long?) =
                totalClaimDependentAndOtherCredits(
                    JsonField.ofNullable(totalClaimDependentAndOtherCredits)
                )

            /** Total amount claimed for dependents and other credits (in cents). */
            fun totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits: Long) =
                totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits as Long?)

            /** Total amount claimed for dependents and other credits (in cents). */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun totalClaimDependentAndOtherCredits(
                totalClaimDependentAndOtherCredits: Optional<Long>
            ) =
                totalClaimDependentAndOtherCredits(
                    totalClaimDependentAndOtherCredits.orElse(null) as Long?
                )

            /** Total amount claimed for dependents and other credits (in cents). */
            fun totalClaimDependentAndOtherCredits(
                totalClaimDependentAndOtherCredits: JsonField<Long>
            ) = apply {
                this.totalClaimDependentAndOtherCredits = totalClaimDependentAndOtherCredits
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

            fun build(): Data =
                Data(
                    amountForOtherDependents,
                    amountForQualifyingChildrenUnder17,
                    deductions,
                    extraWithholding,
                    filingStatus,
                    individualId,
                    otherIncome,
                    totalClaimDependentAndOtherCredits,
                    additionalProperties.toImmutable(),
                )
        }

        class FilingStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HEAD_OF_HOUSEHOLD = of("head_of_household")

                @JvmField
                val MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE =
                    of("married_filing_jointly_or_qualifying_surviving_spouse")

                @JvmField
                val SINGLE_OR_MARRIED_FILING_SEPARATELY = of("single_or_married_filing_separately")

                @JvmStatic fun of(value: String) = FilingStatus(JsonField.of(value))
            }

            enum class Known {
                HEAD_OF_HOUSEHOLD,
                MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE,
                SINGLE_OR_MARRIED_FILING_SEPARATELY,
            }

            enum class Value {
                HEAD_OF_HOUSEHOLD,
                MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE,
                SINGLE_OR_MARRIED_FILING_SEPARATELY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    HEAD_OF_HOUSEHOLD -> Value.HEAD_OF_HOUSEHOLD
                    MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE ->
                        Value.MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE
                    SINGLE_OR_MARRIED_FILING_SEPARATELY -> Value.SINGLE_OR_MARRIED_FILING_SEPARATELY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    HEAD_OF_HOUSEHOLD -> Known.HEAD_OF_HOUSEHOLD
                    MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE ->
                        Known.MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE
                    SINGLE_OR_MARRIED_FILING_SEPARATELY -> Known.SINGLE_OR_MARRIED_FILING_SEPARATELY
                    else -> throw FinchInvalidDataException("Unknown FilingStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FilingStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && amountForOtherDependents == other.amountForOtherDependents && amountForQualifyingChildrenUnder17 == other.amountForQualifyingChildrenUnder17 && deductions == other.deductions && extraWithholding == other.extraWithholding && filingStatus == other.filingStatus && individualId == other.individualId && otherIncome == other.otherIncome && totalClaimDependentAndOtherCredits == other.totalClaimDependentAndOtherCredits && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountForOtherDependents, amountForQualifyingChildrenUnder17, deductions, extraWithholding, filingStatus, individualId, otherIncome, totalClaimDependentAndOtherCredits, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{amountForOtherDependents=$amountForOtherDependents, amountForQualifyingChildrenUnder17=$amountForQualifyingChildrenUnder17, deductions=$deductions, extraWithholding=$extraWithholding, filingStatus=$filingStatus, individualId=$individualId, otherIncome=$otherIncome, totalClaimDependentAndOtherCredits=$totalClaimDependentAndOtherCredits, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val W4_2020 = of("w4_2020")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            W4_2020,
        }

        enum class Value {
            W4_2020,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                W4_2020 -> Value.W4_2020
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                W4_2020 -> Known.W4_2020
                else -> throw FinchInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is W42020 && data == other.data && type == other.type && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, type, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "W42020{data=$data, type=$type, year=$year, additionalProperties=$additionalProperties}"
}
