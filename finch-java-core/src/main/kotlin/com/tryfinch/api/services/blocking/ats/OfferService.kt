@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtsOfferListPage
import com.tryfinch.api.models.AtsOfferListParams
import com.tryfinch.api.models.AtsOfferRetrieveParams
import com.tryfinch.api.models.Offer

interface OfferService {

    /** Get a single offer from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtsOfferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Offer

    /** Get all offers put out by an organization. */
    @JvmOverloads
    fun list(
        params: AtsOfferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsOfferListPage
}
