package com.example.hrmsdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
    @Id
    private long emp_id;
    private String emp_name;
    private String stack;
    private String designation;


public Employe(){

}

    public Employe(long emp_id, String emp_name, String stack, String designation) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.stack = stack;
        this.designation = designation;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
