package com.example.lab5.Repository;

import com.example.lab5.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository  extends JpaRepository<Employees, Integer> {
}
