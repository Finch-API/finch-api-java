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
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = Provider.Builder::class)
@NoAutoDetect
class Provider
private constructor(
    private val id: JsonField<String>,
    private val displayName: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val icon: JsonField<String>,
    private val logo: JsonField<String>,
    private val mfaRequired: JsonField<Boolean>,
    private val primaryColor: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The id of the payroll provider used in Connect. */
    fun id(): String? = id.getNullable("id")

    /** The display name of the payroll provider. */
    fun displayName(): String? = displayName.getNullable("display_name")

    /** The list of Finch products supported on this payroll provider. */
    fun products(): List<String>? = products.getNullable("products")

    /** The url to the official icon of the payroll provider. */
    fun icon(): String? = icon.getNullable("icon")

    /** The url to the official logo of the payroll provider. */
    fun logo(): String? = logo.getNullable("logo")

    /** whether MFA is required for the provider. */
    fun mfaRequired(): Boolean? = mfaRequired.getNullable("mfa_required")

    /** The hex code for the primary color of the payroll provider. */
    fun primaryColor(): String? = primaryColor.getNullable("primary_color")

    /**
     * Whether the Finch integration with this provider uses the Assisted Connect Flow by default.
     */
    fun manual(): Boolean? = manual.getNullable("manual")

    /** The id of the payroll provider used in Connect. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The display name of the payroll provider. */
    @JsonProperty("display_name") @ExcludeMissing fun _displayName() = displayName

    /** The list of Finch products supported on this payroll provider. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The url to the official icon of the payroll provider. */
    @JsonProperty("icon") @ExcludeMissing fun _icon() = icon

    /** The url to the official logo of the payroll provider. */
    @JsonProperty("logo") @ExcludeMissing fun _logo() = logo

    /** whether MFA is required for the provider. */
    @JsonProperty("mfa_required") @ExcludeMissing fun _mfaRequired() = mfaRequired

    /** The hex code for the primary color of the payroll provider. */
    @JsonProperty("primary_color") @ExcludeMissing fun _primaryColor() = primaryColor

    /**
     * Whether the Finch integration with this provider uses the Assisted Connect Flow by default.
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual() = manual

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            displayName()
            products()
            icon()
            logo()
            mfaRequired()
            primaryColor()
            manual()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Provider &&
            this.id == other.id &&
            this.displayName == other.displayName &&
            this.products == other.products &&
            this.icon == other.icon &&
            this.logo == other.logo &&
            this.mfaRequired == other.mfaRequired &&
            this.primaryColor == other.primaryColor &&
            this.manual == other.manual &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    displayName,
                    products,
                    icon,
                    logo,
                    mfaRequired,
                    primaryColor,
                    manual,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Provider{id=$id, displayName=$displayName, products=$products, icon=$icon, logo=$logo, mfaRequired=$mfaRequired, primaryColor=$primaryColor, manual=$manual, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var icon: JsonField<String> = JsonMissing.of()
        private var logo: JsonField<String> = JsonMissing.of()
        private var mfaRequired: JsonField<Boolean> = JsonMissing.of()
        private var primaryColor: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(provider: Provider) = apply {
            this.id = provider.id
            this.displayName = provider.displayName
            this.products = provider.products
            this.icon = provider.icon
            this.logo = provider.logo
            this.mfaRequired = provider.mfaRequired
            this.primaryColor = provider.primaryColor
            this.manual = provider.manual
            additionalProperties(provider.additionalProperties)
        }

        /** The id of the payroll provider used in Connect. */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the payroll provider used in Connect. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The display name of the payroll provider. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /** The display name of the payroll provider. */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** The list of Finch products supported on this payroll provider. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** The list of Finch products supported on this payroll provider. */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The url to the official icon of the payroll provider. */
        fun icon(icon: String) = icon(JsonField.of(icon))

        /** The url to the official icon of the payroll provider. */
        @JsonProperty("icon")
        @ExcludeMissing
        fun icon(icon: JsonField<String>) = apply { this.icon = icon }

        /** The url to the official logo of the payroll provider. */
        fun logo(logo: String) = logo(JsonField.of(logo))

        /** The url to the official logo of the payroll provider. */
        @JsonProperty("logo")
        @ExcludeMissing
        fun logo(logo: JsonField<String>) = apply { this.logo = logo }

        /** whether MFA is required for the provider. */
        fun mfaRequired(mfaRequired: Boolean) = mfaRequired(JsonField.of(mfaRequired))

        /** whether MFA is required for the provider. */
        @JsonProperty("mfa_required")
        @ExcludeMissing
        fun mfaRequired(mfaRequired: JsonField<Boolean>) = apply { this.mfaRequired = mfaRequired }

        /** The hex code for the primary color of the payroll provider. */
        fun primaryColor(primaryColor: String) = primaryColor(JsonField.of(primaryColor))

        /** The hex code for the primary color of the payroll provider. */
        @JsonProperty("primary_color")
        @ExcludeMissing
        fun primaryColor(primaryColor: JsonField<String>) = apply {
            this.primaryColor = primaryColor
        }

        /**
         * Whether the Finch integration with this provider uses the Assisted Connect Flow by
         * default.
         */
        fun manual(manual: Boolean) = manual(JsonField.of(manual))

        /**
         * Whether the Finch integration with this provider uses the Assisted Connect Flow by
         * default.
         */
        @JsonProperty("manual")
        @ExcludeMissing
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

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

        fun build(): Provider =
            Provider(
                id,
                displayName,
                products.map { it.toUnmodifiable() },
                icon,
                logo,
                mfaRequired,
                primaryColor,
                manual,
                additionalProperties.toUnmodifiable(),
            )
    }
}
