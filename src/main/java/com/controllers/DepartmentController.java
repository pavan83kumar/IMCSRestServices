package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Department;

import com.servicesImpl.DepartmentServiceImpl;
@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl instance;
	
	 @RequestMapping(method = RequestMethod.GET, value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> getEmployeeById(@PathVariable int id){
			Department dept = instance.getDepartment(id);
			if(dept != null && dept.getDeptNo()!=0){
				return new ResponseEntity<>(dept, HttpStatus.OK);
			}else{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	

}
