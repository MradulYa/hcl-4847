package org.abes.hrmsdatabse.service;

import org.abes.hrmsdatabse.model.Employee;
import org.abes.hrmsdatabse.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createNewEmployee(Employee newEmp){
//        Employee emp1=new Employee(200l,"Ram","Java FSD","developer","djkjk","ghgh");
        employeeRepository.save(newEmp);
           return "Employee is addedd successfully";
    }

    public Employee getEmployeeById(long empid){
        return  employeeRepository.findById(empid).orElse(null);
    }


}
