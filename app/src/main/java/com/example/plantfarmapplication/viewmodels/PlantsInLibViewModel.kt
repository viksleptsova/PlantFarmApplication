package com.example.plantfarmapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.repositories.PlantsInLibRepository
import kotlinx.coroutines.launch

class PlantsInLibViewModel (private val repository: PlantsInLibRepository) : ViewModel() {
    val allPlantsInLib: LiveData<List<PlantsInLib>> = repository.allPlantsInLib.asLiveData()

    fun upsert(plantsInLib: PlantsInLib) = viewModelScope.launch {
        repository.upsert(plantsInLib)
    }
}

class PlantsInLibViewModelFactory(private val repository: PlantsInLibRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlantsInLibViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PlantsInLibViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
