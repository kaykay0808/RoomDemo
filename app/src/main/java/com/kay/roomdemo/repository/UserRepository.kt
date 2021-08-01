package com.kay.roomdemo.repository

import androidx.lifecycle.LiveData
import com.kay.roomdemo.data.UserDao
import com.kay.roomdemo.model.User

// UserRepository: A Repository class abstracts access to multiple data sources.
// The repository is not part of the Architecture components libraries, but is a suggested best practice for code separation and architecture.

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers() {
        userDao.deleteAllUsers()
    }
}
