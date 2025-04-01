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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Each benefit type and their supported features. If the benefit type is not supported, the
 * property will be null
 */
class BenefitsSupport
private constructor(
    private val commuter: JsonField<BenefitFeaturesAndOperations>,
    private val customPostTax: JsonField<BenefitFeaturesAndOperations>,
    private val customPreTax: JsonField<BenefitFeaturesAndOperations>,
    private val fsaDependentCare: JsonField<BenefitFeaturesAndOperations>,
    private val fsaMedical: JsonField<BenefitFeaturesAndOperations>,
    private val hsaPost: JsonField<BenefitFeaturesAndOperations>,
    private val hsaPre: JsonField<BenefitFeaturesAndOperations>,
    private val s125Dental: JsonField<BenefitFeaturesAndOperations>,
    private val s125Medical: JsonField<BenefitFeaturesAndOperations>,
    private val s125Vision: JsonField<BenefitFeaturesAndOperations>,
    private val simple: JsonField<BenefitFeaturesAndOperations>,
    private val simpleIra: JsonField<BenefitFeaturesAndOperations>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commuter")
        @ExcludeMissing
        commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("custom_post_tax")
        @ExcludeMissing
        customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("custom_pre_tax")
        @ExcludeMissing
        customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("fsa_dependent_care")
        @ExcludeMissing
        fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("fsa_medical")
        @ExcludeMissing
        fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("hsa_post")
        @ExcludeMissing
        hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("hsa_pre")
        @ExcludeMissing
        hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("s125_dental")
        @ExcludeMissing
        s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("s125_medical")
        @ExcludeMissing
        s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("s125_vision")
        @ExcludeMissing
        s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("simple")
        @ExcludeMissing
        simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
        @JsonProperty("simple_ira")
        @ExcludeMissing
        simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    ) : this(
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
        mutableMapOf(),
    )

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commuter(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(commuter.getNullable("commuter"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customPostTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPostTax.getNullable("custom_post_tax"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customPreTax(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(customPreTax.getNullable("custom_pre_tax"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsaDependentCare(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaDependentCare.getNullable("fsa_dependent_care"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsaMedical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(fsaMedical.getNullable("fsa_medical"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsaPost(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPost.getNullable("hsa_post"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsaPre(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(hsaPre.getNullable("hsa_pre"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Dental(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Dental.getNullable("s125_dental"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Medical(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Medical.getNullable("s125_medical"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Vision(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(s125Vision.getNullable("s125_vision"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simple(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simple.getNullable("simple"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simpleIra(): Optional<BenefitFeaturesAndOperations> =
        Optional.ofNullable(simpleIra.getNullable("simple_ira"))

    /**
     * Returns the raw JSON value of [commuter].
     *
     * Unlike [commuter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commuter")
    @ExcludeMissing
    fun _commuter(): JsonField<BenefitFeaturesAndOperations> = commuter

    /**
     * Returns the raw JSON value of [customPostTax].
     *
     * Unlike [customPostTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_post_tax")
    @ExcludeMissing
    fun _customPostTax(): JsonField<BenefitFeaturesAndOperations> = customPostTax

    /**
     * Returns the raw JSON value of [customPreTax].
     *
     * Unlike [customPreTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_pre_tax")
    @ExcludeMissing
    fun _customPreTax(): JsonField<BenefitFeaturesAndOperations> = customPreTax

    /**
     * Returns the raw JSON value of [fsaDependentCare].
     *
     * Unlike [fsaDependentCare], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fsa_dependent_care")
    @ExcludeMissing
    fun _fsaDependentCare(): JsonField<BenefitFeaturesAndOperations> = fsaDependentCare

    /**
     * Returns the raw JSON value of [fsaMedical].
     *
     * Unlike [fsaMedical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fsa_medical")
    @ExcludeMissing
    fun _fsaMedical(): JsonField<BenefitFeaturesAndOperations> = fsaMedical

    /**
     * Returns the raw JSON value of [hsaPost].
     *
     * Unlike [hsaPost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hsa_post")
    @ExcludeMissing
    fun _hsaPost(): JsonField<BenefitFeaturesAndOperations> = hsaPost

    /**
     * Returns the raw JSON value of [hsaPre].
     *
     * Unlike [hsaPre], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hsa_pre")
    @ExcludeMissing
    fun _hsaPre(): JsonField<BenefitFeaturesAndOperations> = hsaPre

    /**
     * Returns the raw JSON value of [s125Dental].
     *
     * Unlike [s125Dental], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_dental")
    @ExcludeMissing
    fun _s125Dental(): JsonField<BenefitFeaturesAndOperations> = s125Dental

    /**
     * Returns the raw JSON value of [s125Medical].
     *
     * Unlike [s125Medical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_medical")
    @ExcludeMissing
    fun _s125Medical(): JsonField<BenefitFeaturesAndOperations> = s125Medical

    /**
     * Returns the raw JSON value of [s125Vision].
     *
     * Unlike [s125Vision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_vision")
    @ExcludeMissing
    fun _s125Vision(): JsonField<BenefitFeaturesAndOperations> = s125Vision

    /**
     * Returns the raw JSON value of [simple].
     *
     * Unlike [simple], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("simple")
    @ExcludeMissing
    fun _simple(): JsonField<BenefitFeaturesAndOperations> = simple

    /**
     * Returns the raw JSON value of [simpleIra].
     *
     * Unlike [simpleIra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("simple_ira")
    @ExcludeMissing
    fun _simpleIra(): JsonField<BenefitFeaturesAndOperations> = simpleIra

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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

        /** Alias for calling [Builder.commuter] with `commuter.orElse(null)`. */
        fun commuter(commuter: Optional<BenefitFeaturesAndOperations>) =
            commuter(commuter.getOrNull())

        /**
         * Sets [Builder.commuter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commuter] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun commuter(commuter: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.commuter = commuter
        }

        fun customPostTax(customPostTax: BenefitFeaturesAndOperations?) =
            customPostTax(JsonField.ofNullable(customPostTax))

        /** Alias for calling [Builder.customPostTax] with `customPostTax.orElse(null)`. */
        fun customPostTax(customPostTax: Optional<BenefitFeaturesAndOperations>) =
            customPostTax(customPostTax.getOrNull())

        /**
         * Sets [Builder.customPostTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customPostTax] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customPostTax(customPostTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPostTax = customPostTax
        }

        fun customPreTax(customPreTax: BenefitFeaturesAndOperations?) =
            customPreTax(JsonField.ofNullable(customPreTax))

        /** Alias for calling [Builder.customPreTax] with `customPreTax.orElse(null)`. */
        fun customPreTax(customPreTax: Optional<BenefitFeaturesAndOperations>) =
            customPreTax(customPreTax.getOrNull())

        /**
         * Sets [Builder.customPreTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customPreTax] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customPreTax(customPreTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPreTax = customPreTax
        }

        fun fsaDependentCare(fsaDependentCare: BenefitFeaturesAndOperations?) =
            fsaDependentCare(JsonField.ofNullable(fsaDependentCare))

        /** Alias for calling [Builder.fsaDependentCare] with `fsaDependentCare.orElse(null)`. */
        fun fsaDependentCare(fsaDependentCare: Optional<BenefitFeaturesAndOperations>) =
            fsaDependentCare(fsaDependentCare.getOrNull())

        /**
         * Sets [Builder.fsaDependentCare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsaDependentCare] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fsaDependentCare(fsaDependentCare: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaDependentCare = fsaDependentCare
        }

        fun fsaMedical(fsaMedical: BenefitFeaturesAndOperations?) =
            fsaMedical(JsonField.ofNullable(fsaMedical))

        /** Alias for calling [Builder.fsaMedical] with `fsaMedical.orElse(null)`. */
        fun fsaMedical(fsaMedical: Optional<BenefitFeaturesAndOperations>) =
            fsaMedical(fsaMedical.getOrNull())

        /**
         * Sets [Builder.fsaMedical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsaMedical] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fsaMedical(fsaMedical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaMedical = fsaMedical
        }

        fun hsaPost(hsaPost: BenefitFeaturesAndOperations?) = hsaPost(JsonField.ofNullable(hsaPost))

        /** Alias for calling [Builder.hsaPost] with `hsaPost.orElse(null)`. */
        fun hsaPost(hsaPost: Optional<BenefitFeaturesAndOperations>) = hsaPost(hsaPost.getOrNull())

        /**
         * Sets [Builder.hsaPost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsaPost] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun hsaPost(hsaPost: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.hsaPost = hsaPost
        }

        fun hsaPre(hsaPre: BenefitFeaturesAndOperations?) = hsaPre(JsonField.ofNullable(hsaPre))

        /** Alias for calling [Builder.hsaPre] with `hsaPre.orElse(null)`. */
        fun hsaPre(hsaPre: Optional<BenefitFeaturesAndOperations>) = hsaPre(hsaPre.getOrNull())

        /**
         * Sets [Builder.hsaPre] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsaPre] with a well-typed [BenefitFeaturesAndOperations]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hsaPre(hsaPre: JsonField<BenefitFeaturesAndOperations>) = apply { this.hsaPre = hsaPre }

        fun s125Dental(s125Dental: BenefitFeaturesAndOperations?) =
            s125Dental(JsonField.ofNullable(s125Dental))

        /** Alias for calling [Builder.s125Dental] with `s125Dental.orElse(null)`. */
        fun s125Dental(s125Dental: Optional<BenefitFeaturesAndOperations>) =
            s125Dental(s125Dental.getOrNull())

        /**
         * Sets [Builder.s125Dental] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Dental] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Dental(s125Dental: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Dental = s125Dental
        }

        fun s125Medical(s125Medical: BenefitFeaturesAndOperations?) =
            s125Medical(JsonField.ofNullable(s125Medical))

        /** Alias for calling [Builder.s125Medical] with `s125Medical.orElse(null)`. */
        fun s125Medical(s125Medical: Optional<BenefitFeaturesAndOperations>) =
            s125Medical(s125Medical.getOrNull())

        /**
         * Sets [Builder.s125Medical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Medical] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Medical(s125Medical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Medical = s125Medical
        }

        fun s125Vision(s125Vision: BenefitFeaturesAndOperations?) =
            s125Vision(JsonField.ofNullable(s125Vision))

        /** Alias for calling [Builder.s125Vision] with `s125Vision.orElse(null)`. */
        fun s125Vision(s125Vision: Optional<BenefitFeaturesAndOperations>) =
            s125Vision(s125Vision.getOrNull())

        /**
         * Sets [Builder.s125Vision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Vision] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Vision(s125Vision: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Vision = s125Vision
        }

        fun simple(simple: BenefitFeaturesAndOperations?) = simple(JsonField.ofNullable(simple))

        /** Alias for calling [Builder.simple] with `simple.orElse(null)`. */
        fun simple(simple: Optional<BenefitFeaturesAndOperations>) = simple(simple.getOrNull())

        /**
         * Sets [Builder.simple] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simple] with a well-typed [BenefitFeaturesAndOperations]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun simple(simple: JsonField<BenefitFeaturesAndOperations>) = apply { this.simple = simple }

        fun simpleIra(simpleIra: BenefitFeaturesAndOperations?) =
            simpleIra(JsonField.ofNullable(simpleIra))

        /** Alias for calling [Builder.simpleIra] with `simpleIra.orElse(null)`. */
        fun simpleIra(simpleIra: Optional<BenefitFeaturesAndOperations>) =
            simpleIra(simpleIra.getOrNull())

        /**
         * Sets [Builder.simpleIra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simpleIra] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [BenefitsSupport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        (commuter.asKnown().getOrNull()?.validity() ?: 0) +
            (customPostTax.asKnown().getOrNull()?.validity() ?: 0) +
            (customPreTax.asKnown().getOrNull()?.validity() ?: 0) +
            (fsaDependentCare.asKnown().getOrNull()?.validity() ?: 0) +
            (fsaMedical.asKnown().getOrNull()?.validity() ?: 0) +
            (hsaPost.asKnown().getOrNull()?.validity() ?: 0) +
            (hsaPre.asKnown().getOrNull()?.validity() ?: 0) +
            (s125Dental.asKnown().getOrNull()?.validity() ?: 0) +
            (s125Medical.asKnown().getOrNull()?.validity() ?: 0) +
            (s125Vision.asKnown().getOrNull()?.validity() ?: 0) +
            (simple.asKnown().getOrNull()?.validity() ?: 0) +
            (simpleIra.asKnown().getOrNull()?.validity() ?: 0)

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
