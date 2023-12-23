package com.example.plantfarmapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.repositories.EventRepository
import kotlinx.coroutines.launch

class EventViewModel (private val repository: EventRepository) : ViewModel() {
    val allEvents: LiveData<List<Event>> = repository.allEvents

    fun upsert(event: Event) = viewModelScope.launch {
        repository.upsert(event)
    }
}

class EventViewModelFactory(private val repository: EventRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EventViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return EventViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}