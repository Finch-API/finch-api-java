@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking

import org.finch.api.services.blocking.ats.ApplicationService
import org.finch.api.services.blocking.ats.CandidateService
import org.finch.api.services.blocking.ats.JobService
import org.finch.api.services.blocking.ats.OfferService
import org.finch.api.services.blocking.ats.StageService

interface AtService {

    fun candidates(): CandidateService

    fun applications(): ApplicationService

    fun stages(): StageService

    fun jobs(): JobService

    fun offers(): OfferService
}
