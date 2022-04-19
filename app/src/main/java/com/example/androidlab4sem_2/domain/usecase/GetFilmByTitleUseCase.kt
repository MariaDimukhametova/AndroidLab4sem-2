package com.example.androidlab4sem_2.domain.usecase

import com.example.androidlab4sem_2.data.api.response.FilmResponse
import com.example.androidlab4sem_2.domain.repository.FilmRepository
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class GetFilmByTitleUseCase @Inject constructor(
    private val filmRepository: FilmRepository
) {
    operator fun invoke(
        recipe: String
    ): Single<FilmResponse> = filmRepository.getFilmByTitle(recipe)
        .subscribeOn(Schedulers.io())
}