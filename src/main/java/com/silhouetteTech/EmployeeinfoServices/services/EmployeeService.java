package com.silhouetteTech.EmployeeinfoServices.services;

import com.silhouetteTech.EmployeeinfoServices.entity.Employee;
import com.silhouetteTech.EmployeeinfoServices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> retrieveEmployee(){

        List<Employee> listOfEmployee = (List<Employee>)employeeRepository.findAll();

        return listOfEmployee;
    }
}
