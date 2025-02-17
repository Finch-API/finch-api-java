// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisIndividualRetrieveManyPage
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

interface IndividualService {

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisIndividualRetrieveManyPage
}
