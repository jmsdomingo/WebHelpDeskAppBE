package com.dev.webhelpdeskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.webhelpdeskapp.model.DepartmentData;

public interface DepartmentRepo extends JpaRepository<DepartmentData, Integer> {

}
