package com.example.androidlab4sem_2.di.module

import com.example.androidlab4sem_2.data.api.FilmRepositoryImpl
import com.example.androidlab4sem_2.domain.repository.FilmRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepoModule {
    @Binds
    fun filmRepository(
        impl: FilmRepositoryImpl
    ) : FilmRepository
}