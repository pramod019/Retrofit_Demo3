package com.pramodk.myapp3.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.pramodk.myapp3.repositoty.Repository
import com.pramodk.myapp3.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = repository.getPhotos()))// fetching the data from repository
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}