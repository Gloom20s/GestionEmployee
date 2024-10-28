package com.example.gestionemployee;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestionemployee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByEmail(String email);
}