package com.hsenidemployees.employeemanagement.controller;

import com.hsenidemployees.employeemanagement.model.Employee;
import com.hsenidemployees.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String getAllEmployees(Model model) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(employeeService.getAllEmployees());
        model.addAttribute("listEmployees",employeeList);
        return "index";
    }

}

