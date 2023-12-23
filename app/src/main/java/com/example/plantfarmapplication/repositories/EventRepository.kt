package com.example.plantfarmapplication.repositories
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.EventDao
import com.example.plantfarmapplication.model.objects.Event
import java.util.concurrent.Flow

class EventRepository(private val eventDao: EventDao) {

    val allEvents: LiveData<List<Event>> = eventDao.getEvents()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(event: Event) {
        eventDao.upsertEvent(event)
    }
}