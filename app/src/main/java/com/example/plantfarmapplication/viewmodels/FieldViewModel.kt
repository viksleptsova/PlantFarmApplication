package com.example.plantfarmapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.repositories.FieldRepository
import kotlinx.coroutines.launch

class FieldViewModel (private val repository: FieldRepository) : ViewModel() {
    val allFields: LiveData<List<Field>> = repository.allFields.asLiveData()

    fun upsert(field: Field) = viewModelScope.launch {
        repository.upsert(field)
    }
}

class FieldViewModelFactory(private val repository: FieldRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FieldViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FieldViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}