package com.example.lab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer locationId;
    @Column
    private String street;
    @Column
    private String postal;
    @Column
    private  String city;
    @Column
    private String state;
    @Column
    private String country_id;
}
