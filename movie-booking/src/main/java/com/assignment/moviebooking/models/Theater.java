package com.assignment.moviebooking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theater extends BaseEntity {

    private String title;
    private String address;
    private String phone;
    private String email;


}
