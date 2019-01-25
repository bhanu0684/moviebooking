package com.assignment.moviebooking.models;

import sun.security.krb5.internal.Ticket;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class User extends BaseEntity {
    private String username;

    private String firstName;

    private String lastName;

    private String phone;

    private String password;

    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Ticket> tickets;

}
