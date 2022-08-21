package com.dev.webhelpdeskapp.service;

import com.dev.webhelpdeskapp.model.DepartmentData;
import com.dev.webhelpdeskapp.model.EmployeeData;
import com.dev.webhelpdeskapp.repository.DepartmentRepo;
import com.dev.webhelpdeskapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final DepartmentRepo deptRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo, DepartmentRepo deptRepo) {
        this.employeeRepo = employeeRepo;
        this.deptRepo = deptRepo;
    }

    public List<DepartmentData> listDepartment() {
        return deptRepo.findAll();
    }

    // adding employee
    public EmployeeData addEmployee(EmployeeData employeeData) {
        return employeeRepo.save(employeeData);
    }

    public List<EmployeeData> findAllEmployee() {
        return employeeRepo.findAll();
    }

    public EmployeeData updateEmployee(EmployeeData employeeData) {
        return employeeRepo.save(employeeData);
    }

    public void delEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }
}
