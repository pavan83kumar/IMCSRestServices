package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoImpl.DepartmentDaoImpl;
import com.entities.Department;

@Service
public class DepartmentServiceImpl {
	@Autowired
	DepartmentDaoImpl deptDAO;

	public Department getDepartment(int deptNo) {
		return deptDAO.getDepartment(deptNo);
	}

	public List<Department> getAllDepartments() {
		return deptDAO.getAllDepartments();

	}
}
