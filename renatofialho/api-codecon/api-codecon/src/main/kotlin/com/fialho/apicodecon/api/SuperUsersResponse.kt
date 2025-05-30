package com.fialho.apicodecon.api

import com.fialho.apicodecon.domain.User
import java.time.OffsetDateTime

data class SuperUsersResponse(
    val data: List<User>,
    val timestamp: OffsetDateTime,
    val executionTimeMs: Long
)
