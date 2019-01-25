package com.assignment.moviebooking.models;

import sun.security.krb5.internal.Ticket;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

public class MovieSession extends BaseEntity {
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Movie film;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    @OneToMany(mappedBy = "filmSession")
    private Set<Ticket> tickets;
}
