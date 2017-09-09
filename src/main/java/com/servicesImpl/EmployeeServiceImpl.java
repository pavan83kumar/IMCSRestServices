package com.servicesImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoImpl.EmployeeDaoImpl;
import com.entities.Employee;

@Service
public class EmployeeServiceImpl {

	@Autowired
	EmployeeDaoImpl daoInstance;

	public Employee getEmployeeById(int empNo) {
		return daoInstance.getEmployeeById(empNo);
	}

	public void loadEmployeeWithOutId(Employee employee) throws SQLException {
		daoInstance.loadEmployeeWithOutId(employee);
	}

	public boolean updateEmployee(int empNo, Employee emp) {
		return daoInstance.updateEmployee(empNo, emp);
	}
	public List<Employee> getEmployeesByDeptId(int deptId) {
		return daoInstance.getEmployeesByDeptId(deptId);
	}

	public boolean deleteEmployee(int empNo) {
		return daoInstance.deleteEmployee(empNo);
	}
}
