// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.models.ConnectionStatusType
import com.tryfinch.api.models.Individual
import com.tryfinch.api.models.IndividualInDirectory
import com.tryfinch.api.models.Location
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/finch-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = FinchOkHttpClient.builder().accessToken("My Access Token").build()

        assertThat(client).isNotNull()
        assertThat(client.accessTokens()).isNotNull()
        assertThat(client.hris()).isNotNull()
        assertThat(client.providers()).isNotNull()
        assertThat(client.account()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.requestForwarding()).isNotNull()
        assertThat(client.jobs()).isNotNull()
        assertThat(client.sandbox()).isNotNull()
        assertThat(client.payroll()).isNotNull()
        assertThat(client.connect()).isNotNull()
    }

    @Test
    fun individualInDirectoryRoundtrip() {
        val jsonMapper = jsonMapper()
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(
                    IndividualInDirectory.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .build()

        val roundtrippedIndividualInDirectory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualInDirectory),
                jacksonTypeRef<IndividualInDirectory>(),
            )

        assertThat(roundtrippedIndividualInDirectory).isEqualTo(individualInDirectory)
    }

    @Test
    fun individualRoundtrip() {
        val jsonMapper = jsonMapper()
        val individual =
            Individual.ofUnionMember0(
                Individual.UnionMember0.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dob("dob")
                    .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                    .firstName("first_name")
                    .gender(Individual.UnionMember0.Gender.FEMALE)
                    .lastName("last_name")
                    .middleName("middle_name")
                    .addPhoneNumber(
                        Individual.UnionMember0.PhoneNumber.builder()
                            .data("data")
                            .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
                            .build()
                    )
                    .preferredName("preferred_name")
                    .residence(
                        Location.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .name("name")
                            .sourceId("source_id")
                            .build()
                    )
                    .addEmail(
                        Individual.UnionMember0.Email.builder()
                            .data("data")
                            .type(Individual.UnionMember0.Email.Type.WORK)
                            .build()
                    )
                    .encryptedSsn("encrypted_ssn")
                    .ssn("ssn")
                    .build()
            )

        val roundtrippedIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individual),
                jacksonTypeRef<Individual>(),
            )

        assertThat(roundtrippedIndividual).isEqualTo(individual)
    }

    @Test
    fun connectionStatusTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectionStatusType = ConnectionStatusType.PENDING

        val roundtrippedConnectionStatusType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionStatusType),
                jacksonTypeRef<ConnectionStatusType>(),
            )

        assertThat(roundtrippedConnectionStatusType).isEqualTo(connectionStatusType)
    }
}
