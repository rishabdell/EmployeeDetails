package com.example.employeedetails.model;

import javax.persistence.*;

@Entity
@Table(name="details")
public class EmployeeDetails {
    @Id
    private long projId;
    private String projName;
    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Parent", referencedColumnName = "id")
    private Employee parent;
}
