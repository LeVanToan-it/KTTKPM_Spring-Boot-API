package com.laptrinhspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.laptrinhspringboot.entity.Employees;
import com.laptrinhspringboot.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/createEmployee")
	public Employees createEmployee(@RequestBody Employees employee) {
		return employeeService.create(employee);
	}
	
	@GetMapping(value="/findEmployee")
	public Iterable<Employees> findEmployeeByID(@PathVariable("id")Long employeeID) {
		return null;
	}
}
