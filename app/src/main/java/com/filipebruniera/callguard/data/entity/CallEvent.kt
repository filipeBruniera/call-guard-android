package com.filipebruniera.callguard.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "call_events")
data class CallEvent(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val phoneNumber: String,
    val timestampMs: Long,
    val action: String,
    val note: String? = null
)
