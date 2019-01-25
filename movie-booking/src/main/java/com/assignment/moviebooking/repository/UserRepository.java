package com.assignment.moviebooking.repository;

import com.assignment.moviebooking.models.Theater;
import com.assignment.moviebooking.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String userName);

    User findByEmail(String email);

    User findByPhone(String phone);
}
