package com.example.plantfarmapplication.repositories
import androidx.annotation.WorkerThread
import com.example.plantfarmapplication.dao.EventDao
import com.example.plantfarmapplication.model.objects.Event
import java.util.concurrent.Flow

class EventRepository(private val eventDao: EventDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allEvents: Flow<List<Event>> = eventDao.getEvents()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(event: Event) {
        eventDao.upsertEvent(event)
    }
}