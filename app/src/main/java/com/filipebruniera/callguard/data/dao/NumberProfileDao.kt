package com.filipebruniera.callguard.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.filipebruniera.callguard.data.entity.NumberProfile

@Dao
interface NumberProfileDao {
    @Upsert
    suspend fun upsert(profile: NumberProfile)

    @Query("SELECT * FROM number_profiles WHERE phoneNumber = :phoneNumber LIMIT 1")
    suspend fun find(phoneNumber: String): NumberProfile?

    @Query("DELETE FROM number_profiles WHERE phoneNumber = :phoneNumber")
    suspend fun delete(phoneNumber: String)
}
