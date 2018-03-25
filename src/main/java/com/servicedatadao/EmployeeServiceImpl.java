/*package com.servicedatadao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.models.Employee;
import com.repositories.EmployeeRepository;

public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeRepository repo;
	
	public Employee loadEmployeeWithOutId(Employee emp){
		return repo.save(emp);
	}
	public Employee updateEmployee(Employee emp){
		return repo.save(emp);
	}
	public void deleteEmployee(int empNo){
		repo.delete(empNo);
	}
	public Employee getEmployeeById(int empNo){
		return repo.findOne(empNo);
	}
	
	public List<Employee> getEmployeesByDeptId(int deptNo){
		return repo.findByDeptNo(deptNo);
	}
}
*/