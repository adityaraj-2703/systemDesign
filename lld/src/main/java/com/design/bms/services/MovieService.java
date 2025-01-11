package com.lld.sysdesign.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lld.sysdesign.bms.models.Movie;
import com.lld.sysdesign.bms.repositories.interfaces.MovieRepository;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> listMovies() {
        return movieRepository.findAll();
    }

    public List<Movie> searchMovies(String movieName) {
        return movieRepository.findByName(movieName);
    }

    public void save(Movie movie) {
        // TODO Auto-generated method stub
        movieRepository.save(movie);
    }

}
