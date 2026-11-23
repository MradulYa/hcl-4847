package org.abes.hrmsdatabse.controller;

import org.abes.hrmsdatabse.model.Employee;
import org.abes.hrmsdatabse.service.EmployeeService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/v1/user")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String msg(){
        return "<h2>Welcome to Sptinboot App development</h2>";
    }

    @PostMapping("/addemp")
    public String addnewEmployee(@RequestBody Employee emp){
        System.out.println(emp.getEmail());
        return  employeeService.createNewEmployee(emp);
    }


    @GetMapping("findbyid/{empid}")
    public Employee getEmpById(@PathVariable long empid){
        System.out.println("Employee id:"+empid);
        return employeeService.getEmployeeById(empid);
    }


}
