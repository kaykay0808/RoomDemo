package com.kay.roomdemo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// USER: Represent a table within the database.

// we need to specify a table name
@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true) // <-- this will autogenerate the numbers for our ID column
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
