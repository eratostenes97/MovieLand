package apps.paprika.movieland.services

import apps.paprika.movieland.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface{
    @GET("/3/movie/popular?api_key=666422038d3e9669dbdc6f1be0b86293")
    fun getMovieList(): Call<MovieResponse>
}