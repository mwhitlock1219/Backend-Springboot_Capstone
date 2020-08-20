package com.tts.stream.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieResponse {
    private String movieId;
    private String userId;
    private String type;

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

    public MovieResponse(String movieId, String userId, String type) {
        this.movieId = movieId;
        this.userId = userId;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}