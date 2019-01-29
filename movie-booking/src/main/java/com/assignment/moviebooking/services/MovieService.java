package com.assignment.moviebooking.services;

import com.assignment.moviebooking.models.Movie;
import com.assignment.moviebooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }
    public Movie getMovieByID(Long id) {
        return movieRepository.findById(id).get();
    }
    public List<Movie> getAllMoviesPage(Pageable pageable) {

        return (List<Movie>) movieRepository.findAll(pageable).get();
    }
    public Page<Movie> searchByTittle(String movieTittle, Pageable pageable) {
        return movieRepository.findByTitleContaining(movieTittle, pageable);
    }
    public Movie addMovie(Movie film) {
        return movieRepository.save(film);
    }
}
