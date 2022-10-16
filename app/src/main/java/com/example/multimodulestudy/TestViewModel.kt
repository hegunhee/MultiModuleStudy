package com.example.multimodulestudy

import androidx.lifecycle.ViewModel
import com.example.domain2.TestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val testUseCase: TestUseCase
    ) : ViewModel(){

    fun getUseCaseResult(value : Int) : Int{
        return testUseCase(value)
    }
}