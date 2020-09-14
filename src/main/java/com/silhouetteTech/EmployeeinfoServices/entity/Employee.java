package com.silhouetteTech.EmployeeinfoServices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long employee_no;
    private String name;
    private String gender;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    private String dob;


    public Employee(){
    }

    public Employee(long employee_no, String name, String gender, String dob) {
        this.employee_no = employee_no;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public long getEmployee_no() {
        return employee_no;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setEmployee_no(long employee_no) {
        this.employee_no = employee_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
