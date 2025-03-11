// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualUpdateResponseTest {

    @Test
    fun createIndividualUpdateResponse() {
      val individualUpdateResponse = IndividualUpdateResponse.builder()
          .id("id")
          .dob("dob")
          .addEmail(IndividualUpdateResponse.Email.builder()
              .data("data")
              .type(IndividualUpdateResponse.Email.Type.WORK)
              .build())
          .encryptedSsn("encrypted_ssn")
          .ethnicity(IndividualUpdateResponse.Ethnicity.ASIAN)
          .firstName("first_name")
          .gender(IndividualUpdateResponse.Gender.FEMALE)
          .lastName("last_name")
          .middleName("middle_name")
          .addPhoneNumber(IndividualUpdateResponse.PhoneNumber.builder()
              .data("data")
              .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
              .build())
          .preferredName("preferred_name")
          .residence(Location.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .name("name")
              .postalCode("postal_code")
              .sourceId("source_id")
              .state("state")
              .build())
          .ssn("ssn")
          .build()
      assertThat(individualUpdateResponse).isNotNull
      assertThat(individualUpdateResponse.id()).contains("id")
      assertThat(individualUpdateResponse.dob()).contains("dob")
      assertThat(individualUpdateResponse.emails().get()).containsExactly(IndividualUpdateResponse.Email.builder()
          .data("data")
          .type(IndividualUpdateResponse.Email.Type.WORK)
          .build())
      assertThat(individualUpdateResponse.encryptedSsn()).contains("encrypted_ssn")
      assertThat(individualUpdateResponse.ethnicity()).contains(IndividualUpdateResponse.Ethnicity.ASIAN)
      assertThat(individualUpdateResponse.firstName()).contains("first_name")
      assertThat(individualUpdateResponse.gender()).contains(IndividualUpdateResponse.Gender.FEMALE)
      assertThat(individualUpdateResponse.lastName()).contains("last_name")
      assertThat(individualUpdateResponse.middleName()).contains("middle_name")
      assertThat(individualUpdateResponse.phoneNumbers().get()).containsExactly(IndividualUpdateResponse.PhoneNumber.builder()
          .data("data")
          .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
          .build())
      assertThat(individualUpdateResponse.preferredName()).contains("preferred_name")
      assertThat(individualUpdateResponse.residence()).contains(Location.builder()
          .city("city")
          .country("country")
          .line1("line1")
          .line2("line2")
          .name("name")
          .postalCode("postal_code")
          .sourceId("source_id")
          .state("state")
          .build())
      assertThat(individualUpdateResponse.ssn()).contains("ssn")
    }
}
