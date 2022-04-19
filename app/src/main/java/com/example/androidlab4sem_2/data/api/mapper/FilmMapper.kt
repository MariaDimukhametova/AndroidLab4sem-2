package com.example.androidlab4sem_2.data.api.mapper

import com.example.androidlab4sem_2.data.api.response.FilmResponse

interface FilmMapper {
    fun mapFilmResponse(response: FilmResponse) : FilmResponse
}