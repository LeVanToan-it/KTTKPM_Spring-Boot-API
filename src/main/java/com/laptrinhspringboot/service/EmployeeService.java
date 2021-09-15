package com.laptrinhspringboot.service;

import com.laptrinhspringboot.entity.Employees;



public interface EmployeeService {
	public Employees create(Employees employee);
	public Iterable<Employees> findAll();
	public void save(Employees employee);
	public void deleteEmployeeByID(Long employeeID);
	
}
