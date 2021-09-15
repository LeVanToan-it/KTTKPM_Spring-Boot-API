package com.laptrinhspringboot.service;

import java.util.List;
import java.util.Optional;

import com.laptrinhspringboot.entity.Employees;



public interface EmployeeService {
	public Employees create(Employees employee);
	public Iterable<Employees> getAllByID(Iterable<Long> employeeID);
	public void updateEmployeeByID(Employees employee);
	public void deleteEmployeeByID(Long employeeID);
	
}
