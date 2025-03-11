// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxCompanyUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompanyServiceAsyncTest {

    @Test
    fun update() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val companyServiceAsync = client.sandbox().company()

      val companyFuture = companyServiceAsync.update(SandboxCompanyUpdateParams.builder()
          .addAccount(SandboxCompanyUpdateParams.Account.builder()
              .accountName("account_name")
              .accountNumber("account_number")
              .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
              .institutionName("institution_name")
              .routingNumber("routing_number")
              .build())
          .addDepartment(SandboxCompanyUpdateParams.Department.builder()
              .name("name")
              .parent(SandboxCompanyUpdateParams.Department.Parent.builder()
                  .name("name")
                  .build())
              .build())
          .ein("ein")
          .entity(SandboxCompanyUpdateParams.Entity.builder()
              .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
              .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
              .build())
          .legalName("legal_name")
          .addLocation(Location.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .name("name")
              .postalCode("postal_code")
              .sourceId("source_id")
              .state("state")
              .build())
          .primaryEmail("primary_email")
          .primaryPhoneNumber("primary_phone_number")
          .build())

      val company = companyFuture.get()
      company.validate()
    }
}
