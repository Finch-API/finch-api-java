@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.ats.ApplicationService
import com.tryfinch.api.services.blocking.ats.CandidateService
import com.tryfinch.api.services.blocking.ats.JobService
import com.tryfinch.api.services.blocking.ats.OfferService
import com.tryfinch.api.services.blocking.ats.StageService

interface AtsService {

    fun candidates(): CandidateService

    fun applications(): ApplicationService

    fun stages(): StageService

    fun jobs(): JobService

    fun offers(): OfferService
}
