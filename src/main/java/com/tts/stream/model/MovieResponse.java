package com.tts.stream.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieResponse {
    private String movieId;
    private String userId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MovieResponse(String movieId, String userId) {
        this.movieId = movieId;
        this.userId = userId;
    }
}