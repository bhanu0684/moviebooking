package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.MovieSession;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieSessionRepository extends PagingAndSortingRepository<MovieSession,Long> {
}
