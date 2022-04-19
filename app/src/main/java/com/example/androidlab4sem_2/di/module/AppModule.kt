package com.example.androidlab4sem_2.di.module

import android.app.Application
import android.content.Context
import com.example.androidlab4sem_2.data.api.mapper.FilmMapperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideContext(app: Application): Context = app.applicationContext

    @Provides
    fun provideFilmMapper(): FilmMapperImpl = FilmMapperImpl()
}