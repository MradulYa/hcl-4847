package com.example.hrmsdatabase.controller;

import com.example.hrmsdatabase.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.hrmsdatabase.service.Employeservice;

@RestController
public class Employeecontroller {
    @Autowired
    private Employeservice employeservice;

    @GetMapping("/")
    public String msg(){
        return "<h2> wlcm to springboot database </h2>";
    }
    @GetMapping("/addemp")
    public String addnewemployee(){
        return employeservice.createnewemployee();
    }
    @GetMapping("findbyid/{empid}")
    public Employe getempbyid(@PathVariable long empid){
        return employeservice.getemployeebyid(empid);
    }
    @DeleteMapping("/deleteid")
    public String deletebyid(@PathVariable long empid){
        return employeservice.DeleteEmploye(empid);
    }
    @PutMapping("updatebyid/{empid}")
    public Employe updatebyid(@PathVariable long empid){
        return employeservice.Updatebyid(empid);
    }
}
