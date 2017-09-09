package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.servicesImpl.DepartmentServiceImpl;
import com.servicesImpl.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com");
		DepartmentServiceImpl dept = context.getBean(DepartmentServiceImpl.class);
		System.out.println(dept.getDepartment(1).toString());
		
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		System.out.println(service.getEmployeesByDeptId(1).toString());
	}

}
