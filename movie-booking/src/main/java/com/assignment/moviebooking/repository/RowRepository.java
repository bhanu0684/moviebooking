package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.Hall;
import com.assignment.moviebooking.models.Row;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RowRepository extends PagingAndSortingRepository<Row, Long>  {
}
