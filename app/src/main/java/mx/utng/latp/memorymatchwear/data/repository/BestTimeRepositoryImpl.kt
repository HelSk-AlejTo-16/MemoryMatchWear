package mx.utng.latp.memorymatchwear.data.repository

import mx.utng.latp.memorymatchwear.data.datasource.BestTimeDataSource

// data/repository/BestTimeRepositoryImpl.kt
class BestTimeRepositoryImpl(private val ds: BestTimeDataSource) : BestTimeRepository {
    override suspend fun getBestTime() = ds.getBestTime()
    override suspend fun saveBestTime(seconds: Long) = ds.saveBestTime(seconds)
}
