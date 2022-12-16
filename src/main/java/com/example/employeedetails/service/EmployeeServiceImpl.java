package com.example.employeedetails.service;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.model.EmployeeDetails;
import com.example.employeedetails.repository.EmployeeDAO;
import com.example.employeedetails.repository.EmployeeDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeDao2 employeeDao2;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeDAO.save(employee);
    }
    @Override
    public Employee getEmployeeById(long id) {
        Optional< Employee > optional = employeeDAO.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }
    @Override
    public void deleteEmployeeById(long id) {
        this.employeeDAO.deleteById(id);
    }
    @Override
    public Employee getById(long id){
        Optional<Employee> employeeOptional = employeeDAO.findById(id);
        return employeeOptional.get();
    }
    @Override
    public void saveEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDao2.save(employeeDetails);
    }
}
