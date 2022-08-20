package com.dev.webhelpdeskapp.controller;

import com.dev.webhelpdeskapp.model.EmployeeData;
import com.dev.webhelpdeskapp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeAPI {

    private final EmployeeService employeeService;

    public EmployeeAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeeData> addEmployeeData(@RequestBody EmployeeData employeeData){
        EmployeeData newEmployee = employeeService.addEmployee(employeeData);
        //handling exception
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<EmployeeData>> viewEmployee(){
        List<EmployeeData> employeeDataList = employeeService.findAllEmployee();
        //handling exception
        return new ResponseEntity<>(employeeDataList, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<EmployeeData> updateEmployeeData(@RequestBody EmployeeData employeeData){
        EmployeeData updateEmployee = employeeService.updateEmployee(employeeData);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delEmployeeData(@PathVariable("id")Integer id){
        employeeService.delEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
