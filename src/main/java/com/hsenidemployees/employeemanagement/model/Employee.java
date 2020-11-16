package com.hsenidemployees.employeemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(EmployeePrimary.class)
public class Employee {
    @Id
    private Long employeeId;
    @Id
    private Long departmentId;
    @Column
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int sbuId;

    public Employee() {
    }

    public Employee(long employeeId, long departmentId, String email, String firstName, String lastName, int sbuId) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.sbuId = sbuId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSbuId() {
        return sbuId;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

}
