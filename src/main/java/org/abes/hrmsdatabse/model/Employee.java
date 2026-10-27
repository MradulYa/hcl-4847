package org.abes.hrmsdatabse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name = "empid")
    private long empId;
    private String empName;
    private String designation;
    private String stack;
    private String email;
    private String password;

    // Default Constructor (Required by JPA)
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(long empId, String empName, String designation, String stack, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.stack = stack;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
