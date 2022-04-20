package com.example.androidlab4sem_2.domain.repository

import com.example.androidlab4sem_2.data.api.response.FilmResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Query

interface FilmRepository {
    fun getFilmByTitle(film: String) : Single<FilmResponse>

    fun getFilmById(id: Int) : Single<FilmResponse>

    fun getFilmByType(type: String) : Single<FilmResponse>
}