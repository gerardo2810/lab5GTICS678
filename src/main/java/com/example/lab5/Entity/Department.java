package com.example.lab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private Integer idDepartment;

    @Column
    private String department;
    @ManyToOne
    private Employees manager;
    @ManyToOne
    private  Location location;
}
