package com.example.hrmsdatabase.service;

import com.example.hrmsdatabase.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.hrmsdatabase.repository.Employeerepo;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Employeservice {
    @Autowired
    private Employeerepo employeerepo;
@GetMapping("/addemp")
    public String createnewemployee(){
        Employe emp1=new Employe(200L, "Rao","java","developer");
        employeerepo.save(emp1);
        return "Employee is added successfully";
    }
    @GetMapping("findbyid/{empid}")
    public Employe getemployeebyid(long empid){
    return employeerepo.findById(empid).orElse(null);
    }

    public String DeleteEmploye(long empid){
    employeerepo.deleteById(empid);
    return "delete successfully";
    }
    public Employe Updatebyid(long empid){
    Employe emp=employeerepo.findById(empid).orElseThrow(()->new RuntimeException(("Employee not found")));
    emp.setEmp_name("rakesh");
    return employeerepo.save(emp);


    }
}
