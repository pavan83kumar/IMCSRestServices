package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.servicesImpl.DepartmentServiceImpl;
@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl instance;
	
	 @RequestMapping(method = RequestMethod.GET, value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> getDepartmentById(@PathVariable int id){
			com.entities.Department dept = instance.getDepartment(id);
			if(dept != null && dept.getDeptNo()!=0){
				return new ResponseEntity<>(dept, HttpStatus.OK);
			}else{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	 
	 /*@RequestMapping(method = RequestMethod.GET, value = "/dept/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public List<Department> getAllDepartments() {
			List<Department> department = instance.getAllDepartments();
			// if(employee.isEmpty()){
			// return new ResponseEntity<>(employee, HttpStatus.OK);
			// }else{
			// return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			// }
			return department;
		}*/
	

}
