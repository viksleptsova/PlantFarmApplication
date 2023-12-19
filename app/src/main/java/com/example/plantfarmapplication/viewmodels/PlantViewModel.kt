package com.example.plantfarmapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.repositories.PlantRepository
import kotlinx.coroutines.launch

class PlantViewModel (private val repository: PlantRepository) : ViewModel() {
    val allPlants: LiveData<List<Plant>> = repository.allPlants.asLiveData()

    fun upsert(plant: Plant) = viewModelScope.launch {
        repository.upsert(plant)
    }
}

class PlantViewModelFactory(private val repository: PlantRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlantViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PlantViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}