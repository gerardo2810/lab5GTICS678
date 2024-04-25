package com.example.lab5.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Integer employee;

    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email;
    @Column
    private  String password;
    @Column
    private String phone_number;
    @Column
    private LocalDate hireDare;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;
    @Column
    private float salary;
    @Column
    private float commision;
    @ManyToOne
    @JoinColumn(name="department_id")
    private  Department department;
    @ManyToOne
    @JoinColumn(name="manager_id")
    private  Employees manager;
    @Column
    private  Integer enabled;

}
