package com.assignment.moviebooking.models;

import javax.persistence.Entity;

@Entity
public class Row extends BaseEntity {
    private int rowIndex;

    private int seats;

}
