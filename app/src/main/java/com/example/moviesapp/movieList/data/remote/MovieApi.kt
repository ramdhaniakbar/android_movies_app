package com.example.moviesapp.movieList.data.remote

import com.example.moviesapp.movieList.data.remote.response.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

   @GET("movie/{category}")
   suspend fun getMoviesList(
      @Path("category") category: String,
      @Query("page") page: Int,
      @Query("api_key") api_key: String = API_KEY
   ) : MovieListDto

   companion object {
      const val BASE_URL = "https://api.themoviedb.org/3/"
      const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
      const val API_KEY = "5b23b7b7eeb84ffc1d4f843da1ac08e8"
   }
}