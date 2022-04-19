package com.example.androidlab4sem_2.data.api

import com.example.androidlab4sem_2.data.api.mapper.FilmMapper
import com.example.androidlab4sem_2.data.api.response.FilmResponse
import com.example.androidlab4sem_2.domain.repository.FilmRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val api: Api,
    private val mapper: FilmMapper
) : FilmRepository{
    override fun getFilmByTitle(film: String): Single<FilmResponse> = api.getFilmByTitle(film)
        .map {
            mapper.mapFilmResponse(it)
        }

    override fun getFilmById(id: Int): Single<FilmResponse> = api.getFilmById(id)
        .map {
            mapper.mapFilmResponse(it)
        }

    override fun getFilmByType(type: String): Single<FilmResponse> = api.getFilmByType(type)
        .map {
            mapper.mapFilmResponse(it)
        }
}