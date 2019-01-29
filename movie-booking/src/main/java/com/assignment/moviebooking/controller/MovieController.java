package com.assignment.moviebooking.controller;

import com.assignment.moviebooking.models.Movie;
import com.assignment.moviebooking.services.MovieService;
import com.assignment.moviebooking.services.TheaterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MovieController {

    private static final Logger LOGGER = LogManager.getLogger(MovieController.class.getName());

    @Autowired
    private MovieService movieService;

    @Autowired
    private TheaterService theaterService;

    @RequestMapping(value = "api/movies", method = RequestMethod.GET)
    public List<Movie> getMovies(Pageable pageable) {
        try {
            List<Movie> movieList = movieService.getAllMoviesPage(pageable);
            return movieList;
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
            return null;
        }
    }
}
