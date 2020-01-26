package ga.harrysullivan.langsy.repositories

import androidx.lifecycle.LiveData
import ga.harrysullivan.langsy.daos.ContentDao
import ga.harrysullivan.langsy.models.Content

class ContentRepository(private val contentDao: ContentDao) {
    val allContent: LiveData<List<Content>> = contentDao.fetchAll()

    suspend fun insert(arg: Content) {
        contentDao.insert(arg)
    }

    suspend fun update(arg: Content) {
        contentDao.update(arg)
    }

    suspend fun delete(arg: Content) {
        contentDao.delete(arg)
    }
}