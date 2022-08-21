package com.dev.webhelpdeskapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webhelpdeskapp.model.DepartmentData;
import com.dev.webhelpdeskapp.model.EmployeeData;
import com.dev.webhelpdeskapp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeAPI {

    private final EmployeeService employeeService;

    public EmployeeAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentData>> viewDepartments() {
        return new ResponseEntity<>(employeeService.listDepartment(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeeData> addEmployeeData(@RequestBody EmployeeData employeeData) {
        System.out.println(employeeData.toString());
        EmployeeData newEmployee = employeeService.addEmployee(employeeData);
        // handling exception
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<EmployeeData>> viewEmployee() {
        List<EmployeeData> employeeDataList = employeeService.findAllEmployee();
        // handling exception
        return new ResponseEntity<>(employeeDataList, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<EmployeeData> updateEmployeeData(@RequestBody EmployeeData employeeData) {
        EmployeeData updateEmployee = employeeService.updateEmployee(employeeData);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delEmployeeData(@PathVariable("id") Integer id) {
        employeeService.delEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
