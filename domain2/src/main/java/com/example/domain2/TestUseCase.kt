package com.example.domain2

import com.example.data.repository.TestRepository
import javax.inject.Inject

class TestUseCase @Inject constructor(
    private val repository: TestRepository
) {
    operator fun invoke(value : Int) : Int{
        return repository.getTwoTimesInt(value)
    }
}