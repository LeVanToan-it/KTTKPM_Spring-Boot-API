package com.laptrinhspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.laptrinhspringboot.entity.EmployeeEntity;
import com.laptrinhspringboot.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value= {"/employees","/"})
	public List<EmployeeEntity> findAllEmployee() {
		return employeeService.findAllEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public EmployeeEntity findEmployeeByID(@PathVariable("id")Long employeeID) {
		return employeeService.findEmployeeByID(employeeID);
	}
	
	@PostMapping(value="/create")
	public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.create(employee);
	}
	
	@PutMapping(value="/update/{id}")
	public void updateByID(@PathVariable("id")Long employeeID) {
		employeeService.deleteEmployeeByID(employeeID);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteEmployeeByID(@PathVariable("id") Long employeeID, @RequestBody EmployeeEntity employee) {
		employeeService.deleteEmployeeByID(employeeID);
	}
}
