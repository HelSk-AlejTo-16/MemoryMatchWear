package mx.utng.latp.memorymatchwear.data.repository

interface BestTimeRepository {
    suspend fun getBestTime(): Long
    suspend fun saveBestTime(seconds: Long)
}
