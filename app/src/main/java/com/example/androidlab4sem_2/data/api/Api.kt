package com.example.androidlab4sem_2.data.api

import com.example.androidlab4sem_2.data.api.response.FilmResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface Api{
    @GET("http://www.omdbapi.com/?t={title}")
    fun getFilmByTitle(@Query("query") query: String) : Single<FilmResponse>
    @GET("http://www.omdbapi.com/?i={id}")
    fun getFilmById(@Query("query") query: Int) : Single<FilmResponse>
    @GET("http://www.omdbapi.com/?type={type}")
    fun getFilmByType(@Query("query") query: String) : Single<FilmResponse>

}