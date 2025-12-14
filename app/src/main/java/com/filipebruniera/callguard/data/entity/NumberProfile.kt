package com.filipebruniera.callguard.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "number_profiles")
data class NumberProfile(
    @PrimaryKey val phoneNumber: String,
    val spamScore: Int = 0,
    val label: String? = null,
    val lastUpdatedMs: Long = 0
)
