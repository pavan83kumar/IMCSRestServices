/*package com.servicedatadao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.models.Department;
import com.repositories.DepartmentRepository;

public class DepartmentServiceImpl {

	@Autowired
	DepartmentRepository repo;

	public Department getDepartmentById(int deptNo) {
		return repo.findOne(deptNo);
	}

	public List<Department> getAllDepartments() {
		List<Department> deptList = new ArrayList<Department>();
		Iterable<Department> iterable = repo.findAll();
		for (Department dept : iterable) {
			deptList.add(dept);
		}
		return deptList;
	}

}
*/