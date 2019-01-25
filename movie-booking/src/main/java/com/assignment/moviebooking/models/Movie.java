package com.assignment.moviebooking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Movie extends BaseEntity  {
    private String title;
    private int duration;
    private String description;
    private String year;
    private String country;
    private int restriction;
    private LocalDate startFrom;
}
