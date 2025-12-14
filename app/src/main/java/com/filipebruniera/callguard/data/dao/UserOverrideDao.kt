package com.filipebruniera.callguard.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.filipebruniera.callguard.data.entity.UserOverride

@Dao
interface UserOverrideDao {
    @Upsert
    suspend fun upsert(override: UserOverride)

    @Query("SELECT * FROM user_overrides WHERE phoneNumber = :phoneNumber LIMIT 1")
    suspend fun find(phoneNumber: String): UserOverride?

    @Query("DELETE FROM user_overrides WHERE phoneNumber = :phoneNumber")
    suspend fun delete(phoneNumber: String)
}
