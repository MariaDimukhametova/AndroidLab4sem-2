package com.example.androidlab4sem_2.data.api.mapper

import com.example.androidlab4sem_2.data.api.response.FilmResponse
import javax.inject.Inject

class FilmMapperImpl @Inject constructor() : FilmMapper{
    override fun mapFilmResponse(response: FilmResponse) = FilmResponse(
        id = response.id,
        title = response.title,
        year = response.year,
        rated = response.rated,
        released = response.released,
        runtime = response.runtime,
        genre = response.genre,
        director = response.director,
        plot = response.plot,
        type = response.type,
        writer = response.writer,
        language = response.language,
        country = response.country
    )
}