package com.example.moviesapp.movieList.data.remote.response

data class MovieListDto(
   val page: Int,
   val results: List<MovieDto>,
   val total_page: Int,
   val total_results: Int
) {

}