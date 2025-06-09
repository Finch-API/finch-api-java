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
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update sandbox employment */
class SandboxEmploymentUpdateParams
private constructor(
    private val individualId: String?,
    private val body: EmploymentWithoutId,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    /**
     * Worker's compensation classification code for this employee
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun classCode(): Optional<String> = body.classCode()

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system. Custom fields are not currently supported for assisted connections.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<List<CustomField>> = body.customFields()

    /**
     * The department object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun department(): Optional<Department> = body.department()

    /**
     * The employment object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employment(): Optional<Employment> = body.employment()

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employmentStatus(): Optional<EmploymentStatus> = body.employmentStatus()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<String> = body.endDate()

    /**
     * The legal first name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun income(): Optional<Income> = body.income()

    /**
     * The array of income history.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incomeHistory(): Optional<List<Income?>> = body.incomeHistory()

    /**
     * `true` if the individual an an active employee or contractor at the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * The legal last name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestRehireDate(): Optional<String> = body.latestRehireDate()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<Location> = body.location()

    /**
     * The manager object representing the manager of the individual within the org.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manager(): Optional<Manager> = body.manager()

    /**
     * The legal middle name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = body.middleName()

    /**
     * The source system's unique employment identifier for this individual
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = body.sourceId()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<String> = body.startDate()

    /**
     * The current title of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * Returns the raw JSON value of [classCode].
     *
     * Unlike [classCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _classCode(): JsonField<String> = body._classCode()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<List<CustomField>> = body._customFields()

    /**
     * Returns the raw JSON value of [department].
     *
     * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _department(): JsonField<Department> = body._department()

    /**
     * Returns the raw JSON value of [employment].
     *
     * Unlike [employment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _employment(): JsonField<Employment> = body._employment()

    /**
     * Returns the raw JSON value of [employmentStatus].
     *
     * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _employmentStatus(): JsonField<EmploymentStatus> = body._employmentStatus()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<String> = body._endDate()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [income].
     *
     * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _income(): JsonField<Income> = body._income()

    /**
     * Returns the raw JSON value of [incomeHistory].
     *
     * Unlike [incomeHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _incomeHistory(): JsonField<List<Income?>> = body._incomeHistory()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [latestRehireDate].
     *
     * Unlike [latestRehireDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _latestRehireDate(): JsonField<String> = body._latestRehireDate()

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _location(): JsonField<Location> = body._location()

    /**
     * Returns the raw JSON value of [manager].
     *
     * Unlike [manager], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _manager(): JsonField<Manager> = body._manager()

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _middleName(): JsonField<String> = body._middleName()

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceId(): JsonField<String> = body._sourceId()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<String> = body._startDate()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SandboxEmploymentUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxEmploymentUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxEmploymentUpdateParams]. */
    class Builder internal constructor() {

        private var individualId: String? = null
        private var body: EmploymentWithoutId.Builder = EmploymentWithoutId.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxEmploymentUpdateParams: SandboxEmploymentUpdateParams) = apply {
            individualId = sandboxEmploymentUpdateParams.individualId
            body = sandboxEmploymentUpdateParams.body.toBuilder()
            additionalHeaders = sandboxEmploymentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxEmploymentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String?) = apply { this.individualId = individualId }

        /** Alias for calling [Builder.individualId] with `individualId.orElse(null)`. */
        fun individualId(individualId: Optional<String>) = individualId(individualId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [classCode]
         * - [customFields]
         * - [department]
         * - [employment]
         * - [employmentStatus]
         * - etc.
         */
        fun body(body: EmploymentWithoutId) = apply { this.body = body.toBuilder() }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String?) = apply { body.classCode(classCode) }

        /** Alias for calling [Builder.classCode] with `classCode.orElse(null)`. */
        fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

        /**
         * Sets [Builder.classCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun classCode(classCode: JsonField<String>) = apply { body.classCode(classCode) }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(customFields: List<CustomField>?) = apply {
            body.customFields(customFields)
        }

        /** Alias for calling [Builder.customFields] with `customFields.orElse(null)`. */
        fun customFields(customFields: Optional<List<CustomField>>) =
            customFields(customFields.getOrNull())

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customFields(customFields: JsonField<List<CustomField>>) = apply {
            body.customFields(customFields)
        }

        /**
         * Adds a single [CustomField] to [customFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomField(customField: CustomField) = apply { body.addCustomField(customField) }

        /** The department object. */
        fun department(department: Department?) = apply { body.department(department) }

        /** Alias for calling [Builder.department] with `department.orElse(null)`. */
        fun department(department: Optional<Department>) = department(department.getOrNull())

        /**
         * Sets [Builder.department] to an arbitrary JSON value.
         *
         * You should usually call [Builder.department] with a well-typed [Department] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun department(department: JsonField<Department>) = apply { body.department(department) }

        /** The employment object. */
        fun employment(employment: Employment?) = apply { body.employment(employment) }

        /** Alias for calling [Builder.employment] with `employment.orElse(null)`. */
        fun employment(employment: Optional<Employment>) = employment(employment.getOrNull())

        /**
         * Sets [Builder.employment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employment] with a well-typed [Employment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun employment(employment: JsonField<Employment>) = apply { body.employment(employment) }

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         */
        fun employmentStatus(employmentStatus: EmploymentStatus?) = apply {
            body.employmentStatus(employmentStatus)
        }

        /** Alias for calling [Builder.employmentStatus] with `employmentStatus.orElse(null)`. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
            employmentStatus(employmentStatus.getOrNull())

        /**
         * Sets [Builder.employmentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employmentStatus] with a well-typed [EmploymentStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            body.employmentStatus(employmentStatus)
        }

        fun endDate(endDate: String?) = apply { body.endDate(endDate) }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endDate(endDate: JsonField<String>) = apply { body.endDate(endDate) }

        /** The legal first name of the individual. */
        fun firstName(firstName: String?) = apply { body.firstName(firstName) }

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income?) = apply { body.income(income) }

        /** Alias for calling [Builder.income] with `income.orElse(null)`. */
        fun income(income: Optional<Income>) = income(income.getOrNull())

        /**
         * Sets [Builder.income] to an arbitrary JSON value.
         *
         * You should usually call [Builder.income] with a well-typed [Income] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun income(income: JsonField<Income>) = apply { body.income(income) }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>?) = apply {
            body.incomeHistory(incomeHistory)
        }

        /** Alias for calling [Builder.incomeHistory] with `incomeHistory.orElse(null)`. */
        fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
            incomeHistory(incomeHistory.getOrNull())

        /**
         * Sets [Builder.incomeHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeHistory] with a well-typed `List<Income?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
            body.incomeHistory(incomeHistory)
        }

        /**
         * Adds a single [Income] to [Builder.incomeHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncomeHistory(incomeHistory: Income) = apply { body.addIncomeHistory(incomeHistory) }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean?) = apply { body.isActive(isActive) }

        /**
         * Alias for [Builder.isActive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

        /** Alias for calling [Builder.isActive] with `isActive.orElse(null)`. */
        fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** The legal last name of the individual. */
        fun lastName(lastName: String?) = apply { body.lastName(lastName) }

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        fun latestRehireDate(latestRehireDate: String?) = apply {
            body.latestRehireDate(latestRehireDate)
        }

        /** Alias for calling [Builder.latestRehireDate] with `latestRehireDate.orElse(null)`. */
        fun latestRehireDate(latestRehireDate: Optional<String>) =
            latestRehireDate(latestRehireDate.getOrNull())

        /**
         * Sets [Builder.latestRehireDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestRehireDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
            body.latestRehireDate(latestRehireDate)
        }

        fun location(location: Location?) = apply { body.location(location) }

        /** Alias for calling [Builder.location] with `location.orElse(null)`. */
        fun location(location: Optional<Location>) = location(location.getOrNull())

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { body.location(location) }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager?) = apply { body.manager(manager) }

        /** Alias for calling [Builder.manager] with `manager.orElse(null)`. */
        fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

        /**
         * Sets [Builder.manager] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manager] with a well-typed [Manager] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun manager(manager: JsonField<Manager>) = apply { body.manager(manager) }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String?) = apply { body.middleName(middleName) }

        /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { body.middleName(middleName) }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String?) = apply { body.sourceId(sourceId) }

        /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { body.sourceId(sourceId) }

        fun startDate(startDate: String?) = apply { body.startDate(startDate) }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<String>) = apply { body.startDate(startDate) }

        /** The current title of the individual. */
        fun title(title: String?) = apply { body.title(title) }

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [SandboxEmploymentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxEmploymentUpdateParams =
            SandboxEmploymentUpdateParams(
                individualId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EmploymentWithoutId = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> individualId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class EmploymentWithoutId
    private constructor(
        private val classCode: JsonField<String>,
        private val customFields: JsonField<List<CustomField>>,
        private val department: JsonField<Department>,
        private val employment: JsonField<Employment>,
        private val employmentStatus: JsonField<EmploymentStatus>,
        private val endDate: JsonField<String>,
        private val firstName: JsonField<String>,
        private val income: JsonField<Income>,
        private val incomeHistory: JsonField<List<Income?>>,
        private val isActive: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val latestRehireDate: JsonField<String>,
        private val location: JsonField<Location>,
        private val manager: JsonField<Manager>,
        private val middleName: JsonField<String>,
        private val sourceId: JsonField<String>,
        private val startDate: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("class_code")
            @ExcludeMissing
            classCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<List<CustomField>> = JsonMissing.of(),
            @JsonProperty("department")
            @ExcludeMissing
            department: JsonField<Department> = JsonMissing.of(),
            @JsonProperty("employment")
            @ExcludeMissing
            employment: JsonField<Employment> = JsonMissing.of(),
            @JsonProperty("employment_status")
            @ExcludeMissing
            employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("income") @ExcludeMissing income: JsonField<Income> = JsonMissing.of(),
            @JsonProperty("income_history")
            @ExcludeMissing
            incomeHistory: JsonField<List<Income?>> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latest_rehire_date")
            @ExcludeMissing
            latestRehireDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("manager") @ExcludeMissing manager: JsonField<Manager> = JsonMissing.of(),
            @JsonProperty("middle_name")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            classCode,
            customFields,
            department,
            employment,
            employmentStatus,
            endDate,
            firstName,
            income,
            incomeHistory,
            isActive,
            lastName,
            latestRehireDate,
            location,
            manager,
            middleName,
            sourceId,
            startDate,
            title,
            mutableMapOf(),
        )

        /**
         * Worker's compensation classification code for this employee
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classCode(): Optional<String> = classCode.getOptional("class_code")

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): Optional<List<CustomField>> = customFields.getOptional("custom_fields")

        /**
         * The department object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun department(): Optional<Department> = department.getOptional("department")

        /**
         * The employment object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employment(): Optional<Employment> = employment.getOptional("employment")

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employmentStatus(): Optional<EmploymentStatus> =
            employmentStatus.getOptional("employment_status")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<String> = endDate.getOptional("end_date")

        /**
         * The legal first name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun income(): Optional<Income> = income.getOptional("income")

        /**
         * The array of income history.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun incomeHistory(): Optional<List<Income?>> = incomeHistory.getOptional("income_history")

        /**
         * `true` if the individual an an active employee or contractor at the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * The legal last name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latestRehireDate(): Optional<String> =
            latestRehireDate.getOptional("latest_rehire_date")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Optional<Location> = location.getOptional("location")

        /**
         * The manager object representing the manager of the individual within the org.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manager(): Optional<Manager> = manager.getOptional("manager")

        /**
         * The legal middle name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun middleName(): Optional<String> = middleName.getOptional("middle_name")

        /**
         * The source system's unique employment identifier for this individual
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceId(): Optional<String> = sourceId.getOptional("source_id")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<String> = startDate.getOptional("start_date")

        /**
         * The current title of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [classCode].
         *
         * Unlike [classCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("class_code") @ExcludeMissing fun _classCode(): JsonField<String> = classCode

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<List<CustomField>> = customFields

        /**
         * Returns the raw JSON value of [department].
         *
         * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("department")
        @ExcludeMissing
        fun _department(): JsonField<Department> = department

        /**
         * Returns the raw JSON value of [employment].
         *
         * Unlike [employment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("employment")
        @ExcludeMissing
        fun _employment(): JsonField<Employment> = employment

        /**
         * Returns the raw JSON value of [employmentStatus].
         *
         * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [income].
         *
         * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

        /**
         * Returns the raw JSON value of [incomeHistory].
         *
         * Unlike [incomeHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun _incomeHistory(): JsonField<List<Income?>> = incomeHistory

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [latestRehireDate].
         *
         * Unlike [latestRehireDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        fun _latestRehireDate(): JsonField<String> = latestRehireDate

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [manager].
         *
         * Unlike [manager], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("manager") @ExcludeMissing fun _manager(): JsonField<Manager> = manager

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [EmploymentWithoutId]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EmploymentWithoutId]. */
        class Builder internal constructor() {

            private var classCode: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<MutableList<CustomField>>? = null
            private var department: JsonField<Department> = JsonMissing.of()
            private var employment: JsonField<Employment> = JsonMissing.of()
            private var employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of()
            private var endDate: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var income: JsonField<Income> = JsonMissing.of()
            private var incomeHistory: JsonField<MutableList<Income?>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var latestRehireDate: JsonField<String> = JsonMissing.of()
            private var location: JsonField<Location> = JsonMissing.of()
            private var manager: JsonField<Manager> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employmentWithoutId: EmploymentWithoutId) = apply {
                classCode = employmentWithoutId.classCode
                customFields = employmentWithoutId.customFields.map { it.toMutableList() }
                department = employmentWithoutId.department
                employment = employmentWithoutId.employment
                employmentStatus = employmentWithoutId.employmentStatus
                endDate = employmentWithoutId.endDate
                firstName = employmentWithoutId.firstName
                income = employmentWithoutId.income
                incomeHistory = employmentWithoutId.incomeHistory.map { it.toMutableList() }
                isActive = employmentWithoutId.isActive
                lastName = employmentWithoutId.lastName
                latestRehireDate = employmentWithoutId.latestRehireDate
                location = employmentWithoutId.location
                manager = employmentWithoutId.manager
                middleName = employmentWithoutId.middleName
                sourceId = employmentWithoutId.sourceId
                startDate = employmentWithoutId.startDate
                title = employmentWithoutId.title
                additionalProperties = employmentWithoutId.additionalProperties.toMutableMap()
            }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String?) = classCode(JsonField.ofNullable(classCode))

            /** Alias for calling [Builder.classCode] with `classCode.orElse(null)`. */
            fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

            /**
             * Sets [Builder.classCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>?) =
                customFields(JsonField.ofNullable(customFields))

            /** Alias for calling [Builder.customFields] with `customFields.orElse(null)`. */
            fun customFields(customFields: Optional<List<CustomField>>) =
                customFields(customFields.getOrNull())

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customFields(customFields: JsonField<List<CustomField>>) = apply {
                this.customFields = customFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomField] to [customFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomField(customField: CustomField) = apply {
                customFields =
                    (customFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customFields", it).add(customField)
                    }
            }

            /** The department object. */
            fun department(department: Department?) = department(JsonField.ofNullable(department))

            /** Alias for calling [Builder.department] with `department.orElse(null)`. */
            fun department(department: Optional<Department>) = department(department.getOrNull())

            /**
             * Sets [Builder.department] to an arbitrary JSON value.
             *
             * You should usually call [Builder.department] with a well-typed [Department] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun department(department: JsonField<Department>) = apply {
                this.department = department
            }

            /** The employment object. */
            fun employment(employment: Employment?) = employment(JsonField.ofNullable(employment))

            /** Alias for calling [Builder.employment] with `employment.orElse(null)`. */
            fun employment(employment: Optional<Employment>) = employment(employment.getOrNull())

            /**
             * Sets [Builder.employment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employment] with a well-typed [Employment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employment(employment: JsonField<Employment>) = apply {
                this.employment = employment
            }

            /**
             * The detailed employment status of the individual. Available options: `active`,
             * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
             */
            fun employmentStatus(employmentStatus: EmploymentStatus?) =
                employmentStatus(JsonField.ofNullable(employmentStatus))

            /**
             * Alias for calling [Builder.employmentStatus] with `employmentStatus.orElse(null)`.
             */
            fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
                employmentStatus(employmentStatus.getOrNull())

            /**
             * Sets [Builder.employmentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employmentStatus] with a well-typed
             * [EmploymentStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
                this.employmentStatus = employmentStatus
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Income?) = income(JsonField.ofNullable(income))

            /** Alias for calling [Builder.income] with `income.orElse(null)`. */
            fun income(income: Optional<Income>) = income(income.getOrNull())

            /**
             * Sets [Builder.income] to an arbitrary JSON value.
             *
             * You should usually call [Builder.income] with a well-typed [Income] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun income(income: JsonField<Income>) = apply { this.income = income }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>?) =
                incomeHistory(JsonField.ofNullable(incomeHistory))

            /** Alias for calling [Builder.incomeHistory] with `incomeHistory.orElse(null)`. */
            fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
                incomeHistory(incomeHistory.getOrNull())

            /**
             * Sets [Builder.incomeHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incomeHistory] with a well-typed `List<Income?>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
                this.incomeHistory = incomeHistory.map { it.toMutableList() }
            }

            /**
             * Adds a single [Income] to [Builder.incomeHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncomeHistory(incomeHistory: Income) = apply {
                this.incomeHistory =
                    (this.incomeHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("incomeHistory", it).add(incomeHistory)
                    }
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

            /**
             * Alias for [Builder.isActive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /** Alias for calling [Builder.isActive] with `isActive.orElse(null)`. */
            fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun latestRehireDate(latestRehireDate: String?) =
                latestRehireDate(JsonField.ofNullable(latestRehireDate))

            /**
             * Alias for calling [Builder.latestRehireDate] with `latestRehireDate.orElse(null)`.
             */
            fun latestRehireDate(latestRehireDate: Optional<String>) =
                latestRehireDate(latestRehireDate.getOrNull())

            /**
             * Sets [Builder.latestRehireDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestRehireDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
                this.latestRehireDate = latestRehireDate
            }

            fun location(location: Location?) = location(JsonField.ofNullable(location))

            /** Alias for calling [Builder.location] with `location.orElse(null)`. */
            fun location(location: Optional<Location>) = location(location.getOrNull())

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

            /** Alias for calling [Builder.manager] with `manager.orElse(null)`. */
            fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

            /**
             * Sets [Builder.manager] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manager] with a well-typed [Manager] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

            /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
            fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
            fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            /** The current title of the individual. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [EmploymentWithoutId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EmploymentWithoutId =
                EmploymentWithoutId(
                    classCode,
                    (customFields ?: JsonMissing.of()).map { it.toImmutable() },
                    department,
                    employment,
                    employmentStatus,
                    endDate,
                    firstName,
                    income,
                    (incomeHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    isActive,
                    lastName,
                    latestRehireDate,
                    location,
                    manager,
                    middleName,
                    sourceId,
                    startDate,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EmploymentWithoutId = apply {
            if (validated) {
                return@apply
            }

            classCode()
            customFields().ifPresent { it.forEach { it.validate() } }
            department().ifPresent { it.validate() }
            employment().ifPresent { it.validate() }
            employmentStatus().ifPresent { it.validate() }
            endDate()
            firstName()
            income().ifPresent { it.validate() }
            incomeHistory().ifPresent { it.forEach { it?.validate() } }
            isActive()
            lastName()
            latestRehireDate()
            location().ifPresent { it.validate() }
            manager().ifPresent { it.validate() }
            middleName()
            sourceId()
            startDate()
            title()
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
            (if (classCode.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (department.asKnown().getOrNull()?.validity() ?: 0) +
                (employment.asKnown().getOrNull()?.validity() ?: 0) +
                (employmentStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (income.asKnown().getOrNull()?.validity() ?: 0) +
                (incomeHistory.asKnown().getOrNull()?.sumOf { (it?.validity() ?: 0).toInt() }
                    ?: 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (latestRehireDate.asKnown().isPresent) 1 else 0) +
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                (manager.asKnown().getOrNull()?.validity() ?: 0) +
                (if (middleName.asKnown().isPresent) 1 else 0) +
                (if (sourceId.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmploymentWithoutId && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmploymentWithoutId{classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
    }

    class CustomField
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [CustomField]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomField]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customField: CustomField) = apply {
                name = customField.name
                value = customField.value
                additionalProperties = customField.additionalProperties.toMutableMap()
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: JsonValue) = apply { this.value = value }

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
             * Returns an immutable instance of [CustomField].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomField = CustomField(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CustomField = apply {
            if (validated) {
                return@apply
            }

            name()
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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomField && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The department object. */
    class Department
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /**
         * The name of the department associated with the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Department]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Department]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                name = department.name
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The name of the department associated with the individual. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Department].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Department = Department(name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Department && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Department{name=$name, additionalProperties=$additionalProperties}"
    }

    /** The employment object. */
    class Employment
    private constructor(
        private val subtype: JsonField<Subtype>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<Subtype> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(subtype, type, mutableMapOf())

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtype(): Optional<Subtype> = subtype.getOptional("subtype")

        /**
         * The main employment type of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Employment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Employment]. */
        class Builder internal constructor() {

            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employment: Employment) = apply {
                subtype = employment.subtype
                type = employment.type
                additionalProperties = employment.additionalProperties.toMutableMap()
            }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /** Alias for calling [Builder.subtype] with `subtype.orElse(null)`. */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.getOrNull())

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [Subtype] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The main employment type of the individual. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Employment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Employment = Employment(subtype, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Employment = apply {
            if (validated) {
                return@apply
            }

            subtype().ifPresent { it.validate() }
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
            (subtype.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FULL_TIME = of("full_time")

                @JvmField val INTERN = of("intern")

                @JvmField val PART_TIME = of("part_time")

                @JvmField val TEMP = of("temp")

                @JvmField val SEASONAL = of("seasonal")

                @JvmField val INDIVIDUAL_CONTRACTOR = of("individual_contractor")

                @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
            }

            /** An enum containing [Subtype]'s known values. */
            enum class Known {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
            }

            /**
             * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Subtype] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
                /**
                 * An enum member indicating that [Subtype] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FULL_TIME -> Value.FULL_TIME
                    INTERN -> Value.INTERN
                    PART_TIME -> Value.PART_TIME
                    TEMP -> Value.TEMP
                    SEASONAL -> Value.SEASONAL
                    INDIVIDUAL_CONTRACTOR -> Value.INDIVIDUAL_CONTRACTOR
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
                    FULL_TIME -> Known.FULL_TIME
                    INTERN -> Known.INTERN
                    PART_TIME -> Known.PART_TIME
                    TEMP -> Known.TEMP
                    SEASONAL -> Known.SEASONAL
                    INDIVIDUAL_CONTRACTOR -> Known.INDIVIDUAL_CONTRACTOR
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Subtype = apply {
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

                return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The main employment type of the individual. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMPLOYEE = of("employee")

                @JvmField val CONTRACTOR = of("contractor")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                EMPLOYEE,
                CONTRACTOR,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMPLOYEE,
                CONTRACTOR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EMPLOYEE -> Value.EMPLOYEE
                    CONTRACTOR -> Value.CONTRACTOR
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
                    EMPLOYEE -> Known.EMPLOYEE
                    CONTRACTOR -> Known.CONTRACTOR
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     */
    class EmploymentStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val DECEASED = of("deceased")

            @JvmField val LEAVE = of("leave")

            @JvmField val ONBOARDING = of("onboarding")

            @JvmField val PREHIRE = of("prehire")

            @JvmField val RETIRED = of("retired")

            @JvmField val TERMINATED = of("terminated")

            @JvmStatic fun of(value: String) = EmploymentStatus(JsonField.of(value))
        }

        /** An enum containing [EmploymentStatus]'s known values. */
        enum class Known {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
        }

        /**
         * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
            /**
             * An enum member indicating that [EmploymentStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DECEASED -> Value.DECEASED
                LEAVE -> Value.LEAVE
                ONBOARDING -> Value.ONBOARDING
                PREHIRE -> Value.PREHIRE
                RETIRED -> Value.RETIRED
                TERMINATED -> Value.TERMINATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DECEASED -> Known.DECEASED
                LEAVE -> Known.LEAVE
                ONBOARDING -> Known.ONBOARDING
                PREHIRE -> Known.PREHIRE
                RETIRED -> Known.RETIRED
                TERMINATED -> Known.TERMINATED
                else -> throw FinchInvalidDataException("Unknown EmploymentStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): EmploymentStatus = apply {
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

            return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The manager object representing the manager of the individual within the org. */
    class Manager
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

            /** Returns a mutable builder for constructing an instance of [Manager]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Manager]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manager: Manager) = apply {
                id = manager.id
                additionalProperties = manager.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [Manager].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Manager = Manager(id, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Manager = apply {
            if (validated) {
                return@apply
            }

            id()
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
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxEmploymentUpdateParams && individualId == other.individualId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxEmploymentUpdateParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
