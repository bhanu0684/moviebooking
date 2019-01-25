package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {
    Page<Movie> findByTitleContaining(String title, Pageable pageable);
}
