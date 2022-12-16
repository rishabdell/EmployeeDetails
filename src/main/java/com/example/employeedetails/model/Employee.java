package com.example.employeedetails.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @OneToMany(targetEntity = EmployeeDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER,orphanRemoval = true,mappedBy = "parent")
    private Set<EmployeeDetails> detailsSet;

}