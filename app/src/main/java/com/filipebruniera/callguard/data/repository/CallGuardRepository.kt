package com.filipebruniera.callguard.data.repository

import com.filipebruniera.callguard.data.entity.CallEvent
import com.filipebruniera.callguard.data.entity.NumberProfile
import com.filipebruniera.callguard.data.entity.RulesConfig
import com.filipebruniera.callguard.data.entity.UserOverride

interface CallGuardRepository {
    suspend fun recordCall(event: CallEvent): Long
    suspend fun recentCalls(limit: Int = 50): List<CallEvent>

    suspend fun upsertNumberProfile(profile: NumberProfile)
    suspend fun getNumberProfile(phoneNumber: String): NumberProfile?
    suspend fun deleteNumberProfile(phoneNumber: String)

    suspend fun upsertUserOverride(override: UserOverride)
    suspend fun getUserOverride(phoneNumber: String): UserOverride?
    suspend fun deleteUserOverride(phoneNumber: String)

    suspend fun getRulesConfig(): RulesConfig?
    suspend fun saveRulesConfig(config: RulesConfig)
}
