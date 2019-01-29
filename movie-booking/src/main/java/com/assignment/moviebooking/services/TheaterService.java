package com.assignment.moviebooking.services;

import com.assignment.moviebooking.models.Theater;
import com.assignment.moviebooking.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    @Autowired
    private  TheaterRepository theaterRepository;

    public Page<Theater> getAllCinemaPage(Pageable pageable) {
        return theaterRepository.findAll(pageable);
    }

    public List<Theater> getAllCinema() {
        return (List<Theater>) theaterRepository.findAll();
    }
    public void addTheater(Theater theater) {
        theaterRepository.save(theater);
    }
}
