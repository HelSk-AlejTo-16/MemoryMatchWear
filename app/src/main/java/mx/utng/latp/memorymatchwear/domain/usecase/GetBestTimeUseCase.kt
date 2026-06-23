package mx.utng.latp.memorymatchwear.domain.usecase

import mx.utng.latp.memorymatchwear.data.repository.BestTimeRepository

class GetBestTimeUseCase(private val repository: BestTimeRepository) {
    suspend operator fun invoke(): Long = repository.getBestTime()
}
