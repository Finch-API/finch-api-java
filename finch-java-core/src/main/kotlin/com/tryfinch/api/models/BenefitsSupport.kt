// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Each benefit type and their supported features. If the benefit type is not supported, the
 * property will be null
 */
@JsonDeserialize(builder = BenefitsSupport.Builder::class)
@NoAutoDetect
class BenefitsSupport
private constructor(
    private val s125Medical: JsonField<BenefitFeaturesAndOperations>,
    private val s125Dental: JsonField<BenefitFeaturesAndOperations>,
    private val s125Vision: JsonField<BenefitFeaturesAndOperations>,
    private val hsaPre: JsonField<BenefitFeaturesAndOperations>,
    private val hsaPost: JsonField<BenefitFeaturesAndOperations>,
    private val fsaMedical: JsonField<BenefitFeaturesAndOperations>,
    private val fsaDependentCare: JsonField<BenefitFeaturesAndOperations>,
    private val simpleIra: JsonField<BenefitFeaturesAndOperations>,
    private val simple: JsonField<BenefitFeaturesAndOperations>,
    private val commuter: JsonField<BenefitFeaturesAndOperations>,
    private val customPostTax: JsonField<BenefitFeaturesAndOperations>,
    private val customPreTax: JsonField<BenefitFeaturesAndOperations>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun s125Medical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Medical.getNullable("s125_medical"))

    fun s125Dental(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Dental.getNullable("s125_dental"))

    fun s125Vision(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Vision.getNullable("s125_vision"))

    fun hsaPre(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPre.getNullable("hsa_pre"))

    fun hsaPost(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPost.getNullable("hsa_post"))

    fun fsaMedical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaMedical.getNullable("fsa_medical"))

    fun fsaDependentCare(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaDependentCare.getNullable("fsa_dependent_care"))

    fun simpleIra(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simpleIra.getNullable("simple_ira"))

    fun simple(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simple.getNullable("simple"))

    fun commuter(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(commuter.getNullable("commuter"))

    fun customPostTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPostTax.getNullable("custom_post_tax"))

    fun customPreTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPreTax.getNullable("custom_pre_tax"))

    @JsonProperty("s125_medical") @ExcludeMissing fun _s125Medical() = s125Medical

    @JsonProperty("s125_dental") @ExcludeMissing fun _s125Dental() = s125Dental

    @JsonProperty("s125_vision") @ExcludeMissing fun _s125Vision() = s125Vision

    @JsonProperty("hsa_pre") @ExcludeMissing fun _hsaPre() = hsaPre

    @JsonProperty("hsa_post") @ExcludeMissing fun _hsaPost() = hsaPost

    @JsonProperty("fsa_medical") @ExcludeMissing fun _fsaMedical() = fsaMedical

    @JsonProperty("fsa_dependent_care") @ExcludeMissing fun _fsaDependentCare() = fsaDependentCare

    @JsonProperty("simple_ira") @ExcludeMissing fun _simpleIra() = simpleIra

    @JsonProperty("simple") @ExcludeMissing fun _simple() = simple

    @JsonProperty("commuter") @ExcludeMissing fun _commuter() = commuter

    @JsonProperty("custom_post_tax") @ExcludeMissing fun _customPostTax() = customPostTax

    @JsonProperty("custom_pre_tax") @ExcludeMissing fun _customPreTax() = customPreTax

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BenefitsSupport = apply {
        if (!validated) {
            s125Medical().map { it.validate() }
            s125Dental().map { it.validate() }
            s125Vision().map { it.validate() }
            hsaPre().map { it.validate() }
            hsaPost().map { it.validate() }
            fsaMedical().map { it.validate() }
            fsaDependentCare().map { it.validate() }
            simpleIra().map { it.validate() }
            simple().map { it.validate() }
            commuter().map { it.validate() }
            customPostTax().map { it.validate() }
            customPreTax().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(benefitsSupport: BenefitsSupport) = apply {
            this.s125Medical = benefitsSupport.s125Medical
            this.s125Dental = benefitsSupport.s125Dental
            this.s125Vision = benefitsSupport.s125Vision
            this.hsaPre = benefitsSupport.hsaPre
            this.hsaPost = benefitsSupport.hsaPost
            this.fsaMedical = benefitsSupport.fsaMedical
            this.fsaDependentCare = benefitsSupport.fsaDependentCare
            this.simpleIra = benefitsSupport.simpleIra
            this.simple = benefitsSupport.simple
            this.commuter = benefitsSupport.commuter
            this.customPostTax = benefitsSupport.customPostTax
            this.customPreTax = benefitsSupport.customPreTax
            additionalProperties(benefitsSupport.additionalProperties)
        }

        fun s125Medical(s125Medical: BenefitFeaturesAndOperations) =
            s125Medical(JsonField.of(s125Medical))

        @JsonProperty("s125_medical")
        @ExcludeMissing
        fun s125Medical(s125Medical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Medical = s125Medical
        }

        fun s125Dental(s125Dental: BenefitFeaturesAndOperations) =
            s125Dental(JsonField.of(s125Dental))

        @JsonProperty("s125_dental")
        @ExcludeMissing
        fun s125Dental(s125Dental: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Dental = s125Dental
        }

        fun s125Vision(s125Vision: BenefitFeaturesAndOperations) =
            s125Vision(JsonField.of(s125Vision))

        @JsonProperty("s125_vision")
        @ExcludeMissing
        fun s125Vision(s125Vision: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Vision = s125Vision
        }

        fun hsaPre(hsaPre: BenefitFeaturesAndOperations) = hsaPre(JsonField.of(hsaPre))

        @JsonProperty("hsa_pre")
        @ExcludeMissing
        fun hsaPre(hsaPre: JsonField<BenefitFeaturesAndOperations>) = apply { this.hsaPre = hsaPre }

        fun hsaPost(hsaPost: BenefitFeaturesAndOperations) = hsaPost(JsonField.of(hsaPost))

        @JsonProperty("hsa_post")
        @ExcludeMissing
        fun hsaPost(hsaPost: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.hsaPost = hsaPost
        }

        fun fsaMedical(fsaMedical: BenefitFeaturesAndOperations) =
            fsaMedical(JsonField.of(fsaMedical))

        @JsonProperty("fsa_medical")
        @ExcludeMissing
        fun fsaMedical(fsaMedical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaMedical = fsaMedical
        }

        fun fsaDependentCare(fsaDependentCare: BenefitFeaturesAndOperations) =
            fsaDependentCare(JsonField.of(fsaDependentCare))

        @JsonProperty("fsa_dependent_care")
        @ExcludeMissing
        fun fsaDependentCare(fsaDependentCare: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaDependentCare = fsaDependentCare
        }

        fun simpleIra(simpleIra: BenefitFeaturesAndOperations) = simpleIra(JsonField.of(simpleIra))

        @JsonProperty("simple_ira")
        @ExcludeMissing
        fun simpleIra(simpleIra: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.simpleIra = simpleIra
        }

        fun simple(simple: BenefitFeaturesAndOperations) = simple(JsonField.of(simple))

        @JsonProperty("simple")
        @ExcludeMissing
        fun simple(simple: JsonField<BenefitFeaturesAndOperations>) = apply { this.simple = simple }

        fun commuter(commuter: BenefitFeaturesAndOperations) = commuter(JsonField.of(commuter))

        @JsonProperty("commuter")
        @ExcludeMissing
        fun commuter(commuter: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.commuter = commuter
        }

        fun customPostTax(customPostTax: BenefitFeaturesAndOperations) =
            customPostTax(JsonField.of(customPostTax))

        @JsonProperty("custom_post_tax")
        @ExcludeMissing
        fun customPostTax(customPostTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPostTax = customPostTax
        }

        fun customPreTax(customPreTax: BenefitFeaturesAndOperations) =
            customPreTax(JsonField.of(customPreTax))

        @JsonProperty("custom_pre_tax")
        @ExcludeMissing
        fun customPreTax(customPreTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPreTax = customPreTax
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

        fun build(): BenefitsSupport =
            BenefitsSupport(
                s125Medical,
                s125Dental,
                s125Vision,
                hsaPre,
                hsaPost,
                fsaMedical,
                fsaDependentCare,
                simpleIra,
                simple,
                commuter,
                customPostTax,
                customPreTax,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitsSupport && s125Medical == other.s125Medical && s125Dental == other.s125Dental && s125Vision == other.s125Vision && hsaPre == other.hsaPre && hsaPost == other.hsaPost && fsaMedical == other.fsaMedical && fsaDependentCare == other.fsaDependentCare && simpleIra == other.simpleIra && simple == other.simple && commuter == other.commuter && customPostTax == other.customPostTax && customPreTax == other.customPreTax && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(s125Medical, s125Dental, s125Vision, hsaPre, hsaPost, fsaMedical, fsaDependentCare, simpleIra, simple, commuter, customPostTax, customPreTax, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenefitsSupport{s125Medical=$s125Medical, s125Dental=$s125Dental, s125Vision=$s125Vision, hsaPre=$hsaPre, hsaPost=$hsaPost, fsaMedical=$fsaMedical, fsaDependentCare=$fsaDependentCare, simpleIra=$simpleIra, simple=$simple, commuter=$commuter, customPostTax=$customPostTax, customPreTax=$customPreTax, additionalProperties=$additionalProperties}"
}
