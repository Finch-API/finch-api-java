// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Each benefit type and their supported features. If the benefit type is not supported, the
 * property will be null
 */
@NoAutoDetect
class BenefitsSupport
@JsonCreator
private constructor(
    @JsonProperty("commuter")
    @ExcludeMissing
    private val commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("custom_post_tax")
    @ExcludeMissing
    private val customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("custom_pre_tax")
    @ExcludeMissing
    private val customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("fsa_dependent_care")
    @ExcludeMissing
    private val fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("fsa_medical")
    @ExcludeMissing
    private val fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("hsa_post")
    @ExcludeMissing
    private val hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("hsa_pre")
    @ExcludeMissing
    private val hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_dental")
    @ExcludeMissing
    private val s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_medical")
    @ExcludeMissing
    private val s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_vision")
    @ExcludeMissing
    private val s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("simple")
    @ExcludeMissing
    private val simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("simple_ira")
    @ExcludeMissing
    private val simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun commuter(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(commuter.getNullable("commuter"))

    fun customPostTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPostTax.getNullable("custom_post_tax"))

    fun customPreTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPreTax.getNullable("custom_pre_tax"))

    fun fsaDependentCare(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaDependentCare.getNullable("fsa_dependent_care"))

    fun fsaMedical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaMedical.getNullable("fsa_medical"))

    fun hsaPost(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPost.getNullable("hsa_post"))

    fun hsaPre(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPre.getNullable("hsa_pre"))

    fun s125Dental(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Dental.getNullable("s125_dental"))

    fun s125Medical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Medical.getNullable("s125_medical"))

    fun s125Vision(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Vision.getNullable("s125_vision"))

    fun simple(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simple.getNullable("simple"))

    fun simpleIra(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simpleIra.getNullable("simple_ira"))

    @JsonProperty("commuter")
    @ExcludeMissing
    fun _commuter(): JsonField<BenefitFeaturesAndOperations> = commuter

    @JsonProperty("custom_post_tax")
    @ExcludeMissing
    fun _customPostTax(): JsonField<BenefitFeaturesAndOperations> = customPostTax

    @JsonProperty("custom_pre_tax")
    @ExcludeMissing
    fun _customPreTax(): JsonField<BenefitFeaturesAndOperations> = customPreTax

    @JsonProperty("fsa_dependent_care")
    @ExcludeMissing
    fun _fsaDependentCare(): JsonField<BenefitFeaturesAndOperations> = fsaDependentCare

    @JsonProperty("fsa_medical")
    @ExcludeMissing
    fun _fsaMedical(): JsonField<BenefitFeaturesAndOperations> = fsaMedical

    @JsonProperty("hsa_post")
    @ExcludeMissing
    fun _hsaPost(): JsonField<BenefitFeaturesAndOperations> = hsaPost

    @JsonProperty("hsa_pre")
    @ExcludeMissing
    fun _hsaPre(): JsonField<BenefitFeaturesAndOperations> = hsaPre

    @JsonProperty("s125_dental")
    @ExcludeMissing
    fun _s125Dental(): JsonField<BenefitFeaturesAndOperations> = s125Dental

    @JsonProperty("s125_medical")
    @ExcludeMissing
    fun _s125Medical(): JsonField<BenefitFeaturesAndOperations> = s125Medical

    @JsonProperty("s125_vision")
    @ExcludeMissing
    fun _s125Vision(): JsonField<BenefitFeaturesAndOperations> = s125Vision

    @JsonProperty("simple")
    @ExcludeMissing
    fun _simple(): JsonField<BenefitFeaturesAndOperations> = simple

    @JsonProperty("simple_ira")
    @ExcludeMissing
    fun _simpleIra(): JsonField<BenefitFeaturesAndOperations> = simpleIra

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BenefitsSupport = apply {
        if (validated) {
            return@apply
        }

        commuter().ifPresent { it.validate() }
        customPostTax().ifPresent { it.validate() }
        customPreTax().ifPresent { it.validate() }
        fsaDependentCare().ifPresent { it.validate() }
        fsaMedical().ifPresent { it.validate() }
        hsaPost().ifPresent { it.validate() }
        hsaPre().ifPresent { it.validate() }
        s125Dental().ifPresent { it.validate() }
        s125Medical().ifPresent { it.validate() }
        s125Vision().ifPresent { it.validate() }
        simple().ifPresent { it.validate() }
        simpleIra().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [BenefitsSupport]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BenefitsSupport]. */
    class Builder internal constructor() {

        private var commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(benefitsSupport: BenefitsSupport) = apply {
            commuter = benefitsSupport.commuter
            customPostTax = benefitsSupport.customPostTax
            customPreTax = benefitsSupport.customPreTax
            fsaDependentCare = benefitsSupport.fsaDependentCare
            fsaMedical = benefitsSupport.fsaMedical
            hsaPost = benefitsSupport.hsaPost
            hsaPre = benefitsSupport.hsaPre
            s125Dental = benefitsSupport.s125Dental
            s125Medical = benefitsSupport.s125Medical
            s125Vision = benefitsSupport.s125Vision
            simple = benefitsSupport.simple
            simpleIra = benefitsSupport.simpleIra
            additionalProperties = benefitsSupport.additionalProperties.toMutableMap()
        }

        fun commuter(commuter: BenefitFeaturesAndOperations?) =
            commuter(JsonField.ofNullable(commuter))

        fun commuter(commuter: Optional<BenefitFeaturesAndOperations>) =
            commuter(commuter.getOrNull())

        fun commuter(commuter: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.commuter = commuter
        }

        fun customPostTax(customPostTax: BenefitFeaturesAndOperations?) =
            customPostTax(JsonField.ofNullable(customPostTax))

        fun customPostTax(customPostTax: Optional<BenefitFeaturesAndOperations>) =
            customPostTax(customPostTax.getOrNull())

        fun customPostTax(customPostTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPostTax = customPostTax
        }

        fun customPreTax(customPreTax: BenefitFeaturesAndOperations?) =
            customPreTax(JsonField.ofNullable(customPreTax))

        fun customPreTax(customPreTax: Optional<BenefitFeaturesAndOperations>) =
            customPreTax(customPreTax.getOrNull())

        fun customPreTax(customPreTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPreTax = customPreTax
        }

        fun fsaDependentCare(fsaDependentCare: BenefitFeaturesAndOperations?) =
            fsaDependentCare(JsonField.ofNullable(fsaDependentCare))

        fun fsaDependentCare(fsaDependentCare: Optional<BenefitFeaturesAndOperations>) =
            fsaDependentCare(fsaDependentCare.getOrNull())

        fun fsaDependentCare(fsaDependentCare: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaDependentCare = fsaDependentCare
        }

        fun fsaMedical(fsaMedical: BenefitFeaturesAndOperations?) =
            fsaMedical(JsonField.ofNullable(fsaMedical))

        fun fsaMedical(fsaMedical: Optional<BenefitFeaturesAndOperations>) =
            fsaMedical(fsaMedical.getOrNull())

        fun fsaMedical(fsaMedical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaMedical = fsaMedical
        }

        fun hsaPost(hsaPost: BenefitFeaturesAndOperations?) = hsaPost(JsonField.ofNullable(hsaPost))

        fun hsaPost(hsaPost: Optional<BenefitFeaturesAndOperations>) = hsaPost(hsaPost.getOrNull())

        fun hsaPost(hsaPost: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.hsaPost = hsaPost
        }

        fun hsaPre(hsaPre: BenefitFeaturesAndOperations?) = hsaPre(JsonField.ofNullable(hsaPre))

        fun hsaPre(hsaPre: Optional<BenefitFeaturesAndOperations>) = hsaPre(hsaPre.getOrNull())

        fun hsaPre(hsaPre: JsonField<BenefitFeaturesAndOperations>) = apply { this.hsaPre = hsaPre }

        fun s125Dental(s125Dental: BenefitFeaturesAndOperations?) =
            s125Dental(JsonField.ofNullable(s125Dental))

        fun s125Dental(s125Dental: Optional<BenefitFeaturesAndOperations>) =
            s125Dental(s125Dental.getOrNull())

        fun s125Dental(s125Dental: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Dental = s125Dental
        }

        fun s125Medical(s125Medical: BenefitFeaturesAndOperations?) =
            s125Medical(JsonField.ofNullable(s125Medical))

        fun s125Medical(s125Medical: Optional<BenefitFeaturesAndOperations>) =
            s125Medical(s125Medical.getOrNull())

        fun s125Medical(s125Medical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Medical = s125Medical
        }

        fun s125Vision(s125Vision: BenefitFeaturesAndOperations?) =
            s125Vision(JsonField.ofNullable(s125Vision))

        fun s125Vision(s125Vision: Optional<BenefitFeaturesAndOperations>) =
            s125Vision(s125Vision.getOrNull())

        fun s125Vision(s125Vision: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Vision = s125Vision
        }

        fun simple(simple: BenefitFeaturesAndOperations?) = simple(JsonField.ofNullable(simple))

        fun simple(simple: Optional<BenefitFeaturesAndOperations>) = simple(simple.getOrNull())

        fun simple(simple: JsonField<BenefitFeaturesAndOperations>) = apply { this.simple = simple }

        fun simpleIra(simpleIra: BenefitFeaturesAndOperations?) =
            simpleIra(JsonField.ofNullable(simpleIra))

        fun simpleIra(simpleIra: Optional<BenefitFeaturesAndOperations>) =
            simpleIra(simpleIra.getOrNull())

        fun simpleIra(simpleIra: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.simpleIra = simpleIra
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

        fun build(): BenefitsSupport =
            BenefitsSupport(
                commuter,
                customPostTax,
                customPreTax,
                fsaDependentCare,
                fsaMedical,
                hsaPost,
                hsaPre,
                s125Dental,
                s125Medical,
                s125Vision,
                simple,
                simpleIra,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitsSupport && commuter == other.commuter && customPostTax == other.customPostTax && customPreTax == other.customPreTax && fsaDependentCare == other.fsaDependentCare && fsaMedical == other.fsaMedical && hsaPost == other.hsaPost && hsaPre == other.hsaPre && s125Dental == other.s125Dental && s125Medical == other.s125Medical && s125Vision == other.s125Vision && simple == other.simple && simpleIra == other.simpleIra && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(commuter, customPostTax, customPreTax, fsaDependentCare, fsaMedical, hsaPost, hsaPre, s125Dental, s125Medical, s125Vision, simple, simpleIra, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenefitsSupport{commuter=$commuter, customPostTax=$customPostTax, customPreTax=$customPreTax, fsaDependentCare=$fsaDependentCare, fsaMedical=$fsaMedical, hsaPost=$hsaPost, hsaPre=$hsaPre, s125Dental=$s125Dental, s125Medical=$s125Medical, s125Vision=$s125Vision, simple=$simple, simpleIra=$simpleIra, additionalProperties=$additionalProperties}"
}
