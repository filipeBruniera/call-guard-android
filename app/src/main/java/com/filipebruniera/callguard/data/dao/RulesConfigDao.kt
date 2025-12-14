package com.filipebruniera.callguard.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.filipebruniera.callguard.data.entity.RulesConfig

@Dao
interface RulesConfigDao {
    @Upsert
    suspend fun upsert(config: RulesConfig)

    @Query("SELECT * FROM rules_config WHERE id = 0 LIMIT 1")
    suspend fun get(): RulesConfig?
}
