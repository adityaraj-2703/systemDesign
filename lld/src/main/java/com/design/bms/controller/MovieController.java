package com.lld.sysdesign.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lld.sysdesign.bms.models.Movie;
import com.lld.sysdesign.bms.services.MovieService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    @ResponseBody
    public List<Movie> requestMethodName() {
        return movieService.listMovies();
    }

    @GetMapping("/movie")
    public List<Movie> requestMethodName(@RequestParam(value = "movieName", required = true) String movieName) {
        return movieService.searchMovies(movieName);
    }

    @PostMapping("/addmovie")
    @ResponseBody
    public Movie requestMovieAddition(@RequestBody(required = true) Movie movie) {
        movieService.save(movie);
        return movie;
    }

}
