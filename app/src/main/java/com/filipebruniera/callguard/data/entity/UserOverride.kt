package com.filipebruniera.callguard.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_overrides")
data class UserOverride(
    @PrimaryKey val phoneNumber: String,
    val action: String,
    val note: String? = null
)
