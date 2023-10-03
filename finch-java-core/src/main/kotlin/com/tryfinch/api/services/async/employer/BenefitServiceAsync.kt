@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.employer

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.EmployerBenefitRegisterParams
import com.tryfinch.api.models.RegisterCompanyBenefitsResponse
import java.util.concurrent.CompletableFuture

interface BenefitServiceAsync {

    /**
     * **Availability: Assisted Benefits providers only**
     *
     * Register existing benefits from the customer on the provider, on Finch's end. Please use the
     * `/provider` endpoint to view available types for each provider.
     */
    @JvmOverloads
    fun register(
        params: EmployerBenefitRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RegisterCompanyBenefitsResponse>
}
