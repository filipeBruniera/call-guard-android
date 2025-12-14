package com.filipebruniera.callguard.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rules_config")
data class RulesConfig(
    @PrimaryKey val id: Int = 0,
    val blockHiddenNumbers: Boolean = false,
    val allowContactsOnly: Boolean = false,
    val lastUpdatedMs: Long = 0
)
