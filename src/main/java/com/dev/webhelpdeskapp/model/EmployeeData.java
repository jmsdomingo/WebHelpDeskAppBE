package com.dev.webhelpdeskapp.model;

import javax.persistence.*;

@Entity
@Table(name = "employee", uniqueConstraints = { @UniqueConstraint(columnNames = { "employee_number" }) })
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employee_number", length = 50, nullable = false)
    private int employeeNumber;

    @Column(name = "first_name", length = 50, nullable = false)
    private String employeeFirstName;

    @Column(name = "middle_name", length = 50, nullable = false)
    private String employeeMiddleName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String employeeLastName;

    @Column(name = "department" ,length = 50, nullable = false)
    private String employeeDepartment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public void setEmployeeMiddleName(String employeeMiddleName) {
        this.employeeMiddleName = employeeMiddleName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", employeeNumber=" + employeeNumber +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeMiddleName='" + employeeMiddleName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }

    public EmployeeData(Integer id, int employeeNumber, String employeeFirstName, String employeeMiddleName, String employeeLastName, String employeeDepartment) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
        this.employeeLastName = employeeLastName;
        this.employeeDepartment = employeeDepartment;
    }

    public EmployeeData(){

    }
}
