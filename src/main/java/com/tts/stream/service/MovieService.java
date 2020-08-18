package com.tts.stream.service;

import java.util.ArrayList;
import java.util.List;

import com.tts.stream.model.Movie;
import com.tts.stream.model.MovieDisplay;
import com.tts.stream.model.User;
import com.tts.stream.repository.WatchlistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private WatchlistRepository watchListRepository;

    // public List<MovieDisplay> findAll(User user) {
    //     List<Movie> movies = watchListRepository.findAllByUser(user);
    //     return formatMovie(movies);
    // }

    private List<MovieDisplay> formatMovie(List<Movie> movies) {

        List<MovieDisplay> displayMovies = formatMovieList(movies);
        return displayMovies;
    }

    private List<MovieDisplay> formatMovieList(List<Movie> movies) {
        List<MovieDisplay> response = new ArrayList<>();
        for (Movie movie : movies) {
            MovieDisplay movieDisplay = new MovieDisplay();
            movie.setTitleId(movie.getTitleId());
            response.add(movieDisplay);
        }
        return response;
    }

}