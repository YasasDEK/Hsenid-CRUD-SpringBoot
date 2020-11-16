package com.hsenidemployees.employeemanagement.repository;

import com.hsenidemployees.employeemanagement.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}