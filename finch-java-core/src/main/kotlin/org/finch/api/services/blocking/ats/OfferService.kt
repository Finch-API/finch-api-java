@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.ats

import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsOfferListPage
import org.finch.api.models.AtsOfferListParams
import org.finch.api.models.AtsOfferRetrieveParams
import org.finch.api.models.Offer

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
