package com.tts.stream.repository;

import com.tts.stream.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Movie, Long> {

}