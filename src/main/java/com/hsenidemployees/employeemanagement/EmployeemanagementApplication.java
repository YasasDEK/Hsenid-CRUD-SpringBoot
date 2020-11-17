package com.hsenidemployees.employeemanagement;

import com.hsenidemployees.employeemanagement.model.Employee;
import com.hsenidemployees.employeemanagement.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

@SpringBootApplication
public class EmployeemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);

		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"my-beans.xml"});

		EmployeeServiceGetNameByXml employeeName1 = (EmployeeServiceGetNameByXml)context.getBean("employeeName1");
		EmployeeServiceGetNameByXml employeeName2= (EmployeeServiceGetNameByXml)context.getBean("employeeName2");
		EmployeeServiceGetNameByXml employeeName3 = (EmployeeServiceGetNameByXml)context.getBean("employeeName3");
		System.out.println(employeeName1);
		System.out.println(employeeName2);
		System.out.println(employeeName3);

		context.close();

		EmployeeServiceGetNameByXml employeeList = new EmployeeServiceGetNameByXml();
		System.out.println(employeeList.fetchEmployee());

	}

}
