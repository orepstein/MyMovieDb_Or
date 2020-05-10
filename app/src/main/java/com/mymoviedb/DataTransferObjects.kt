package com.mymoviedb

import com.squareup.moshi.Json



    data class NetworkMovie(
        val popularity: Double,
        @Json(name = "poster_path")
        val posterPath: String,
        val title: String,
        val overview: String
    )


