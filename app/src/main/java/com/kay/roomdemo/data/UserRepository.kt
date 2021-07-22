package com.kay.roomdemo.data

import androidx.lifecycle.LiveData


// UserRepository: A Repository class abstracts access to multiple data sources.
// The repository is not part of the Architecture components libraries, but is a suggested best practice for code separation and architecture.

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}