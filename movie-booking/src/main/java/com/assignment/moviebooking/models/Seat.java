package com.assignment.moviebooking.models;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class Seat extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;

    private Integer seat;
}
