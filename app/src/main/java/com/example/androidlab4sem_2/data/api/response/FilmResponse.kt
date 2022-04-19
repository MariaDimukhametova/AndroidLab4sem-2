package com.example.androidlab4sem_2.data.api.response

import com.google.gson.annotations.SerializedName


data class FilmResponse(
    @SerializedName(value = "id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("year")
    val year: Int,
    @SerializedName("released")
    val released: String,
    @SerializedName("genre")
    val genre: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("rated")
    var rated: String,
    @SerializedName("runtime")
    var runtime: String,
    @SerializedName("director")
    var director: String,
    @SerializedName("writer")
    var writer: String,
    @SerializedName("plot")
    var plot: String,
    @SerializedName("language")
    var language : String,
    @SerializedName("country")
    var country: String,
    )