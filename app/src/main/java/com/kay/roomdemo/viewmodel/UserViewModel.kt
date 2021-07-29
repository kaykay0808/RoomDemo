package com.kay.roomdemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.kay.roomdemo.data.UserDatabase
import com.kay.roomdemo.repository.UserRepository
import com.kay.roomdemo.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// UserViewModel: The ViewModel's role is to provide data to the UI and survive configuration changes. A ViewModel acts as a communication center between the Repository and the UI.

class UserViewModel(application: Application): AndroidViewModel(application) {

    val readAllData: LiveData<List<User>>
    private val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(user)
        }
    }

}