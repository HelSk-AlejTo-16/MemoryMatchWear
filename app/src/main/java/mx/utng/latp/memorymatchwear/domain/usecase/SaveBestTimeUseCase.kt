package mx.utng.latp.memorymatchwear.domain.usecase

import mx.utng.latp.memorymatchwear.data.repository.BestTimeRepository

class SaveBestTimeUseCase(private val repository: BestTimeRepository) {
    suspend operator fun invoke(seconds: Long) = repository.saveBestTime(seconds)
}
