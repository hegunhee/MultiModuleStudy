package com.example.data.repository


import javax.inject.Inject

class DefaultTestRepository @Inject constructor() : TestRepository {

    override fun getTwoTimesInt(value: Int): Int {
        return value * 2
    }

}