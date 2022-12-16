package com.example.employeedetails.repository;

import com.example.employeedetails.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeDao2 extends JpaRepository<EmployeeDetails,Long> {

}
