package com.silhouetteTech.EmployeeinfoServices.repository;

import com.silhouetteTech.EmployeeinfoServices.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

   @Repository
   public interface EmployeeRepository extends CrudRepository<Employee, Long> {


   }
