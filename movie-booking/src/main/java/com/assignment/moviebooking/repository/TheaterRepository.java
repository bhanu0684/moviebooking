package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.Theater;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TheaterRepository extends PagingAndSortingRepository<Theater, Long>  {
}
