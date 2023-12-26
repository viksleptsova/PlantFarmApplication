package com.example.plantfarmapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.plantfarmapplication.model.objects.Request
import com.example.plantfarmapplication.repositories.RequestRepository
import kotlinx.coroutines.launch

class RequestViewModel (private val repository: RequestRepository) : ViewModel() {
    val allRequests: LiveData<List<Request>> = repository.allRequests.asLiveData()

    fun upsert(request: Request) = viewModelScope.launch {
        repository.upsert(request)
    }
}

class RequestViewModelFactory(private val repository: RequestRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RequestViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RequestViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}