package com.kay.roomdemo.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

// USER: Represent a table within the database.

@Parcelize
// we need to specify a table name
@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true) // <-- this will autogenerate the numbers for our ID column
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
) : Parcelable
