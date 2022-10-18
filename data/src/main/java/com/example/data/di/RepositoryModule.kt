package com.example.data.di

import com.example.data.repository.DefaultTestRepository
import com.example.domain2.repository.TestRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideTestRepository() : TestRepository{
        return DefaultTestRepository()
    }
}