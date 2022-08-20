package com.dev.webhelpdeskapp.service;

import com.dev.webhelpdeskapp.model.EmployeeData;
import com.dev.webhelpdeskapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    //adding employee
    public EmployeeData addEmployee(EmployeeData employeeData){
        return employeeRepo.save(employeeData);
    }

    public List<EmployeeData> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public EmployeeData updateEmployee(EmployeeData employeeData){
        return employeeRepo.save(employeeData);
    }

    public void delEmployee(Integer id){
       employeeRepo.deleteById(id);
    }
}
