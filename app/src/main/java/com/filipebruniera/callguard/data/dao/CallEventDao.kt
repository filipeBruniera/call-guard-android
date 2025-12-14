package com.filipebruniera.callguard.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.filipebruniera.callguard.data.entity.CallEvent

@Dao
interface CallEventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(callEvent: CallEvent): Long

    @Query("SELECT * FROM call_events ORDER BY timestampMs DESC LIMIT :limit")
    suspend fun recent(limit: Int = 50): List<CallEvent>
}
