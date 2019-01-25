package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.Hall;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HallRepository extends PagingAndSortingRepository<Hall, Long> {
}
