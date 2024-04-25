package com.example.lab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private String jobid;
    @Column
    private String jobtitle;
    @Column
    private Integer minsalary;
    @Column
    private Integer maxsalary;
}
