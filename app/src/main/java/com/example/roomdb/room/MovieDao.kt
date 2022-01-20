package com.example.roomdb.room

import androidx.room.*


@Dao
interface MovieDao {

    @Insert
    fun addMovie(movie: Movie)

    @Update
    fun updateMovie(movie: Movie)

    @Delete
    fun deleteMovie(movie: Movie)

    @Query("SELECT * FROM movie")
    fun getMovies(): List<Movie>

    @Query("SELECT * FROM movie WHERE id=:movie_id")
    fun getMovie(movie_id: Int): List<Movie>
}