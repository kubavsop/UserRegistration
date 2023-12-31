package com.example.shiftlab.domain.usecase

import com.example.shiftlab.domain.model.User
import com.example.shiftlab.domain.repository.UserRepository

class GetUserUseCase(private val repository: UserRepository) {
    operator fun invoke(): User? {
        return repository.getUsername()
    }
}