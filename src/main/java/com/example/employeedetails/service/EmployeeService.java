package com.example.employeedetails.service;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.model.EmployeeDetails;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    void saveEmployeeDetails(EmployeeDetails employeeDetails);
    Employee getById(long id);
}
