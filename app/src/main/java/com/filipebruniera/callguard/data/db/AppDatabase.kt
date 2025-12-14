package com.filipebruniera.callguard.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.filipebruniera.callguard.data.dao.CallEventDao
import com.filipebruniera.callguard.data.dao.NumberProfileDao
import com.filipebruniera.callguard.data.dao.RulesConfigDao
import com.filipebruniera.callguard.data.dao.UserOverrideDao
import com.filipebruniera.callguard.data.entity.CallEvent
import com.filipebruniera.callguard.data.entity.NumberProfile
import com.filipebruniera.callguard.data.entity.RulesConfig
import com.filipebruniera.callguard.data.entity.UserOverride

@Database(
    entities = [
        CallEvent::class,
        NumberProfile::class,
        UserOverride::class,
        RulesConfig::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun callEventDao(): CallEventDao
    abstract fun numberProfileDao(): NumberProfileDao
    abstract fun userOverrideDao(): UserOverrideDao
    abstract fun rulesConfigDao(): RulesConfigDao

    companion object {
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                // Placeholder: add schema changes for version 2 here.
            }
        }

        fun build(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "call_guard.db")
                .addMigrations(MIGRATION_1_2)
                .build()
    }
}
