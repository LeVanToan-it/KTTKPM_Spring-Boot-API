package com.laptrinhspringboot.service;

import java.util.List;
import java.util.Optional;

import com.laptrinhspringboot.entity.EmployeeEntity;



public interface EmployeeService {
	public EmployeeEntity create(EmployeeEntity employee);
	public Iterable<EmployeeEntity> getAllByID(Iterable<Long> employeeID);
	public void updateEmployeeByID(EmployeeEntity employee);
	public void deleteEmployeeByID(Long employeeID);
	
}
