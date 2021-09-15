package com.laptrinhspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.laptrinhspringboot.entity.Employees;
import com.laptrinhspringboot.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value= {"/employees","/"})
	public Iterable<Employees> findAllEmployee() {
		return employeeService.findAll();
	}
	
	@PostMapping(value="/create")
	public Employees createEmployee(@RequestBody Employees employee) {
		return employeeService.create(employee);
	}
	
	@PutMapping(value="/update/{id}")
	public void updateByID(@PathVariable("id")Long employeeID) {
		employeeService.deleteEmployeeByID(employeeID);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteEmployeeByID(@PathVariable("id") Long employeeID, @RequestBody Employees employee) {
		employeeService.deleteEmployeeByID(employeeID);
	}
}
