package com.dev.webhelpdeskapp.repository;

import com.dev.webhelpdeskapp.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeData, Integer> {
    void deleteEmployeeById(Integer id);
}
