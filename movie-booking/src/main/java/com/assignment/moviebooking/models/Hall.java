package com.assignment.moviebooking.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

public class Hall extends BaseEntity{
    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @OneToMany(mappedBy = "hall")
    private Set<Row> rows;

    @OneToMany(mappedBy = "hall")
    private Set<MovieSession> filmSessions;
}
