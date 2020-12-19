package com.example.project2;

public class Movie {

    private int movieId;
    private int movieId2;
    private String movieName;
    private String movieYear;


    public Movie(int id, int id2, String name, String year){
        movieId = id;
        movieId2 = id2;
        movieName = name;
        movieYear = year;

    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public int getMovieId2() {
        return movieId2;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public void setMovieId2(int movieId2) {
        this.movieId2 = movieId2;
    }
}
