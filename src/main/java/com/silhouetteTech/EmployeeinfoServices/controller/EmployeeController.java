package com.silhouetteTech.EmployeeinfoServices.controller;

import com.silhouetteTech.EmployeeinfoServices.entity.Employee;
import com.silhouetteTech.EmployeeinfoServices.repository.EmployeeRepository;
import com.silhouetteTech.EmployeeinfoServices.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {

    public EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService){

        this.employeeService = employeeService;
    }

    @GetMapping("/newEmployee")
    public List<Employee> getProfile(){

        return employeeService.retrieveEmployee();
    }

}
