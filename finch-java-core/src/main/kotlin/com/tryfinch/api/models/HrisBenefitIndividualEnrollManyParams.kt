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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Enroll an individual into a deduction or contribution. This is an overwrite operation. If the
 * employee is already enrolled, the enrollment amounts will be adjusted. Making the same request
 * multiple times will not create new enrollments, but will continue to set the state of the
 * existing enrollment.
 */
class HrisBenefitIndividualEnrollManyParams
private constructor(
    private val benefitId: String?,
    private val entityIds: List<String>?,
    private val individuals: List<Individual>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun benefitId(): Optional<String> = Optional.ofNullable(benefitId)

    /** The entity IDs to specify which entities' data to access. */
    fun entityIds(): Optional<List<String>> = Optional.ofNullable(entityIds)

    /** Array of the individual_id to enroll and a configuration object. */
    fun individuals(): Optional<List<Individual>> = Optional.ofNullable(individuals)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HrisBenefitIndividualEnrollManyParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitIndividualEnrollManyParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitIndividualEnrollManyParams]. */
    class Builder internal constructor() {

        private var benefitId: String? = null
        private var entityIds: MutableList<String>? = null
        private var individuals: MutableList<Individual>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualEnrollManyParams: HrisBenefitIndividualEnrollManyParams
        ) = apply {
            benefitId = hrisBenefitIndividualEnrollManyParams.benefitId
            entityIds = hrisBenefitIndividualEnrollManyParams.entityIds?.toMutableList()
            individuals = hrisBenefitIndividualEnrollManyParams.individuals?.toMutableList()
            additionalHeaders = hrisBenefitIndividualEnrollManyParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                hrisBenefitIndividualEnrollManyParams.additionalQueryParams.toBuilder()
        }

        fun benefitId(benefitId: String?) = apply { this.benefitId = benefitId }

        /** Alias for calling [Builder.benefitId] with `benefitId.orElse(null)`. */
        fun benefitId(benefitId: Optional<String>) = benefitId(benefitId.getOrNull())

        /** The entity IDs to specify which entities' data to access. */
        fun entityIds(entityIds: List<String>?) = apply {
            this.entityIds = entityIds?.toMutableList()
        }

        /** Alias for calling [Builder.entityIds] with `entityIds.orElse(null)`. */
        fun entityIds(entityIds: Optional<List<String>>) = entityIds(entityIds.getOrNull())

        /**
         * Adds a single [String] to [entityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityId(entityId: String) = apply {
            entityIds = (entityIds ?: mutableListOf()).apply { add(entityId) }
        }

        /** Array of the individual_id to enroll and a configuration object. */
        fun individuals(individuals: List<Individual>?) = apply {
            this.individuals = individuals?.toMutableList()
        }

        /** Alias for calling [Builder.individuals] with `individuals.orElse(null)`. */
        fun individuals(individuals: Optional<List<Individual>>) =
            individuals(individuals.getOrNull())

        /**
         * Adds a single [Individual] to [individuals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndividual(individual: Individual) = apply {
            individuals = (individuals ?: mutableListOf()).apply { add(individual) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [HrisBenefitIndividualEnrollManyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HrisBenefitIndividualEnrollManyParams =
            HrisBenefitIndividualEnrollManyParams(
                benefitId,
                entityIds?.toImmutable(),
                individuals?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<List<Individual>> = Optional.ofNullable(individuals)

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> benefitId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                entityIds?.forEach { put("entity_ids[]", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Individual
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val configuration: JsonField<Configuration>,
        private val individualId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
        ) : this(configuration, individualId, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * Finch id (uuidv4) for the individual to enroll
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun individualId(): Optional<String> = individualId.getOptional("individual_id")

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

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

            /** Returns a mutable builder for constructing an instance of [Individual]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Individual]. */
        class Builder internal constructor() {

            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individual: Individual) = apply {
                configuration = individual.configuration
                individualId = individual.individualId
                additionalProperties = individual.additionalProperties.toMutableMap()
            }

            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /** Finch id (uuidv4) for the individual to enroll */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Individual].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Individual =
                Individual(configuration, individualId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws FinchInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            configuration().ifPresent { it.validate() }
            individualId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (individualId.asKnown().isPresent) 1 else 0)

        class Configuration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val annualContributionLimit: JsonField<AnnualContributionLimit>,
            private val annualMaximum: JsonField<Long>,
            private val catchUp: JsonField<Boolean>,
            private val companyContribution: JsonField<CompanyContribution>,
            private val effectiveDate: JsonField<LocalDate>,
            private val employeeDeduction: JsonField<EmployeeDeduction>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("annual_contribution_limit")
                @ExcludeMissing
                annualContributionLimit: JsonField<AnnualContributionLimit> = JsonMissing.of(),
                @JsonProperty("annual_maximum")
                @ExcludeMissing
                annualMaximum: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("catch_up")
                @ExcludeMissing
                catchUp: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("company_contribution")
                @ExcludeMissing
                companyContribution: JsonField<CompanyContribution> = JsonMissing.of(),
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("employee_deduction")
                @ExcludeMissing
                employeeDeduction: JsonField<EmployeeDeduction> = JsonMissing.of(),
            ) : this(
                annualContributionLimit,
                annualMaximum,
                catchUp,
                companyContribution,
                effectiveDate,
                employeeDeduction,
                mutableMapOf(),
            )

            /**
             * For HSA benefits only - whether the contribution limit is for an individual or family
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun annualContributionLimit(): Optional<AnnualContributionLimit> =
                annualContributionLimit.getOptional("annual_contribution_limit")

            /**
             * Maximum annual amount in cents
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun annualMaximum(): Optional<Long> = annualMaximum.getOptional("annual_maximum")

            /**
             * For retirement benefits only - whether catch up contributions are enabled
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun catchUp(): Optional<Boolean> = catchUp.getOptional("catch_up")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyContribution(): Optional<CompanyContribution> =
                companyContribution.getOptional("company_contribution")

            /**
             * The date the enrollment will take effect
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun effectiveDate(): Optional<LocalDate> = effectiveDate.getOptional("effective_date")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employeeDeduction(): Optional<EmployeeDeduction> =
                employeeDeduction.getOptional("employee_deduction")

            /**
             * Returns the raw JSON value of [annualContributionLimit].
             *
             * Unlike [annualContributionLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("annual_contribution_limit")
            @ExcludeMissing
            fun _annualContributionLimit(): JsonField<AnnualContributionLimit> =
                annualContributionLimit

            /**
             * Returns the raw JSON value of [annualMaximum].
             *
             * Unlike [annualMaximum], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("annual_maximum")
            @ExcludeMissing
            fun _annualMaximum(): JsonField<Long> = annualMaximum

            /**
             * Returns the raw JSON value of [catchUp].
             *
             * Unlike [catchUp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("catch_up") @ExcludeMissing fun _catchUp(): JsonField<Boolean> = catchUp

            /**
             * Returns the raw JSON value of [companyContribution].
             *
             * Unlike [companyContribution], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("company_contribution")
            @ExcludeMissing
            fun _companyContribution(): JsonField<CompanyContribution> = companyContribution

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /**
             * Returns the raw JSON value of [employeeDeduction].
             *
             * Unlike [employeeDeduction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("employee_deduction")
            @ExcludeMissing
            fun _employeeDeduction(): JsonField<EmployeeDeduction> = employeeDeduction

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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var annualContributionLimit: JsonField<AnnualContributionLimit> =
                    JsonMissing.of()
                private var annualMaximum: JsonField<Long> = JsonMissing.of()
                private var catchUp: JsonField<Boolean> = JsonMissing.of()
                private var companyContribution: JsonField<CompanyContribution> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var employeeDeduction: JsonField<EmployeeDeduction> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    annualContributionLimit = configuration.annualContributionLimit
                    annualMaximum = configuration.annualMaximum
                    catchUp = configuration.catchUp
                    companyContribution = configuration.companyContribution
                    effectiveDate = configuration.effectiveDate
                    employeeDeduction = configuration.employeeDeduction
                    additionalProperties = configuration.additionalProperties.toMutableMap()
                }

                /**
                 * For HSA benefits only - whether the contribution limit is for an individual or
                 * family
                 */
                fun annualContributionLimit(annualContributionLimit: AnnualContributionLimit) =
                    annualContributionLimit(JsonField.of(annualContributionLimit))

                /**
                 * Sets [Builder.annualContributionLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualContributionLimit] with a well-typed
                 * [AnnualContributionLimit] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun annualContributionLimit(
                    annualContributionLimit: JsonField<AnnualContributionLimit>
                ) = apply { this.annualContributionLimit = annualContributionLimit }

                /** Maximum annual amount in cents */
                fun annualMaximum(annualMaximum: Long?) =
                    annualMaximum(JsonField.ofNullable(annualMaximum))

                /**
                 * Alias for [Builder.annualMaximum].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun annualMaximum(annualMaximum: Long) = annualMaximum(annualMaximum as Long?)

                /** Alias for calling [Builder.annualMaximum] with `annualMaximum.orElse(null)`. */
                fun annualMaximum(annualMaximum: Optional<Long>) =
                    annualMaximum(annualMaximum.getOrNull())

                /**
                 * Sets [Builder.annualMaximum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualMaximum] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annualMaximum(annualMaximum: JsonField<Long>) = apply {
                    this.annualMaximum = annualMaximum
                }

                /** For retirement benefits only - whether catch up contributions are enabled */
                fun catchUp(catchUp: Boolean) = catchUp(JsonField.of(catchUp))

                /**
                 * Sets [Builder.catchUp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.catchUp] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

                fun companyContribution(companyContribution: CompanyContribution) =
                    companyContribution(JsonField.of(companyContribution))

                /**
                 * Sets [Builder.companyContribution] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyContribution] with a well-typed
                 * [CompanyContribution] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun companyContribution(companyContribution: JsonField<CompanyContribution>) =
                    apply {
                        this.companyContribution = companyContribution
                    }

                /** The date the enrollment will take effect */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun employeeDeduction(employeeDeduction: EmployeeDeduction) =
                    employeeDeduction(JsonField.of(employeeDeduction))

                /**
                 * Sets [Builder.employeeDeduction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.employeeDeduction] with a well-typed
                 * [EmployeeDeduction] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun employeeDeduction(employeeDeduction: JsonField<EmployeeDeduction>) = apply {
                    this.employeeDeduction = employeeDeduction
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration =
                    Configuration(
                        annualContributionLimit,
                        annualMaximum,
                        catchUp,
                        companyContribution,
                        effectiveDate,
                        employeeDeduction,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws FinchInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Configuration = apply {
                if (validated) {
                    return@apply
                }

                annualContributionLimit().ifPresent { it.validate() }
                annualMaximum()
                catchUp()
                companyContribution().ifPresent { it.validate() }
                effectiveDate()
                employeeDeduction().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (annualContributionLimit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (annualMaximum.asKnown().isPresent) 1 else 0) +
                    (if (catchUp.asKnown().isPresent) 1 else 0) +
                    (companyContribution.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                    (employeeDeduction.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * For HSA benefits only - whether the contribution limit is for an individual or family
             */
            class AnnualContributionLimit
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INDIVIDUAL = of("individual")

                    @JvmField val FAMILY = of("family")

                    @JvmStatic fun of(value: String) = AnnualContributionLimit(JsonField.of(value))
                }

                /** An enum containing [AnnualContributionLimit]'s known values. */
                enum class Known {
                    INDIVIDUAL,
                    FAMILY,
                }

                /**
                 * An enum containing [AnnualContributionLimit]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AnnualContributionLimit] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    FAMILY,
                    /**
                     * An enum member indicating that [AnnualContributionLimit] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INDIVIDUAL -> Value.INDIVIDUAL
                        FAMILY -> Value.FAMILY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        INDIVIDUAL -> Known.INDIVIDUAL
                        FAMILY -> Known.FAMILY
                        else ->
                            throw FinchInvalidDataException(
                                "Unknown AnnualContributionLimit: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        FinchInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws FinchInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): AnnualContributionLimit = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AnnualContributionLimit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class CompanyContribution
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val tiers: JsonField<List<Tier>>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    tiers: JsonField<List<Tier>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(amount, tiers, type, mutableMapOf())

                /**
                 * Amount in cents for fixed type or basis points (1/100th of a percent) for percent
                 * type
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * Array of tier objects for tiered contribution matching (required when type is
                 * tiered)
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [tiers].
                 *
                 * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [CompanyContribution].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CompanyContribution]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var tiers: JsonField<MutableList<Tier>>? = null
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(companyContribution: CompanyContribution) = apply {
                        amount = companyContribution.amount
                        tiers = companyContribution.tiers.map { it.toMutableList() }
                        type = companyContribution.type
                        additionalProperties =
                            companyContribution.additionalProperties.toMutableMap()
                    }

                    /**
                     * Amount in cents for fixed type or basis points (1/100th of a percent) for
                     * percent type
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Array of tier objects for tiered contribution matching (required when type is
                     * tiered)
                     */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Sets [Builder.tiers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tiers(tiers: JsonField<List<Tier>>) = apply {
                        this.tiers = tiers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Tier] to [tiers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTier(tier: Tier) = apply {
                        tiers =
                            (tiers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tiers", it).add(tier)
                            }
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CompanyContribution].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CompanyContribution =
                        CompanyContribution(
                            amount,
                            (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws FinchInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CompanyContribution = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    tiers().ifPresent { it.forEach { it.validate() } }
                    type().ifPresent { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Tier
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val match: JsonField<Long>,
                    private val threshold: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("match")
                        @ExcludeMissing
                        match: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("threshold")
                        @ExcludeMissing
                        threshold: JsonField<Long> = JsonMissing.of(),
                    ) : this(match, threshold, mutableMapOf())

                    /**
                     * The employer match percentage in basis points (0-10000 = 0-100%)
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun match(): Long = match.getRequired("match")

                    /**
                     * The employee contribution threshold in basis points (0-10000 = 0-100%)
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun threshold(): Long = threshold.getRequired("threshold")

                    /**
                     * Returns the raw JSON value of [match].
                     *
                     * Unlike [match], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<Long> = match

                    /**
                     * Returns the raw JSON value of [threshold].
                     *
                     * Unlike [threshold], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("threshold")
                    @ExcludeMissing
                    fun _threshold(): JsonField<Long> = threshold

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

                        /**
                         * Returns a mutable builder for constructing an instance of [Tier].
                         *
                         * The following fields are required:
                         * ```java
                         * .match()
                         * .threshold()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Tier]. */
                    class Builder internal constructor() {

                        private var match: JsonField<Long>? = null
                        private var threshold: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tier: Tier) = apply {
                            match = tier.match
                            threshold = tier.threshold
                            additionalProperties = tier.additionalProperties.toMutableMap()
                        }

                        /** The employer match percentage in basis points (0-10000 = 0-100%) */
                        fun match(match: Long) = match(JsonField.of(match))

                        /**
                         * Sets [Builder.match] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.match] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun match(match: JsonField<Long>) = apply { this.match = match }

                        /**
                         * The employee contribution threshold in basis points (0-10000 = 0-100%)
                         */
                        fun threshold(threshold: Long) = threshold(JsonField.of(threshold))

                        /**
                         * Sets [Builder.threshold] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.threshold] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun threshold(threshold: JsonField<Long>) = apply {
                            this.threshold = threshold
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Tier].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .match()
                         * .threshold()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Tier =
                            Tier(
                                checkRequired("match", match),
                                checkRequired("threshold", threshold),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws FinchInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Tier = apply {
                        if (validated) {
                            return@apply
                        }

                        match()
                        threshold()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (match.asKnown().isPresent) 1 else 0) +
                            (if (threshold.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            match == other.match &&
                            threshold == other.threshold &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(match, threshold, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Tier{match=$match, threshold=$threshold, additionalProperties=$additionalProperties}"
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FIXED = of("fixed")

                        @JvmField val PERCENT = of("percent")

                        @JvmField val TIERED = of("tiered")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        FIXED,
                        PERCENT,
                        TIERED,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FIXED,
                        PERCENT,
                        TIERED,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FIXED -> Value.FIXED
                            PERCENT -> Value.PERCENT
                            TIERED -> Value.TIERED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws FinchInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FIXED -> Known.FIXED
                            PERCENT -> Known.PERCENT
                            TIERED -> Known.TIERED
                            else -> throw FinchInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws FinchInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            FinchInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws FinchInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CompanyContribution &&
                        amount == other.amount &&
                        tiers == other.tiers &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, tiers, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CompanyContribution{amount=$amount, tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
            }

            class EmployeeDeduction
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(amount, type, mutableMapOf())

                /**
                 * Amount in cents for fixed type or basis points (1/100th of a percent) for percent
                 * type
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [EmployeeDeduction].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EmployeeDeduction]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                        amount = employeeDeduction.amount
                        type = employeeDeduction.type
                        additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
                    }

                    /**
                     * Amount in cents for fixed type or basis points (1/100th of a percent) for
                     * percent type
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [EmployeeDeduction].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): EmployeeDeduction =
                        EmployeeDeduction(amount, type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws FinchInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): EmployeeDeduction = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    type().ifPresent { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val FIXED = of("fixed")

                        @JvmField val PERCENT = of("percent")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        FIXED,
                        PERCENT,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        FIXED,
                        PERCENT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            FIXED -> Value.FIXED
                            PERCENT -> Value.PERCENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws FinchInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            FIXED -> Known.FIXED
                            PERCENT -> Known.PERCENT
                            else -> throw FinchInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws FinchInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            FinchInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws FinchInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Type = apply {
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EmployeeDeduction &&
                        amount == other.amount &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EmployeeDeduction{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Configuration &&
                    annualContributionLimit == other.annualContributionLimit &&
                    annualMaximum == other.annualMaximum &&
                    catchUp == other.catchUp &&
                    companyContribution == other.companyContribution &&
                    effectiveDate == other.effectiveDate &&
                    employeeDeduction == other.employeeDeduction &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    annualContributionLimit,
                    annualMaximum,
                    catchUp,
                    companyContribution,
                    effectiveDate,
                    employeeDeduction,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Configuration{annualContributionLimit=$annualContributionLimit, annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, effectiveDate=$effectiveDate, employeeDeduction=$employeeDeduction, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Individual &&
                configuration == other.configuration &&
                individualId == other.individualId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(configuration, individualId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{configuration=$configuration, individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisBenefitIndividualEnrollManyParams &&
            benefitId == other.benefitId &&
            entityIds == other.entityIds &&
            individuals == other.individuals &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(benefitId, entityIds, individuals, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "HrisBenefitIndividualEnrollManyParams{benefitId=$benefitId, entityIds=$entityIds, individuals=$individuals, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
