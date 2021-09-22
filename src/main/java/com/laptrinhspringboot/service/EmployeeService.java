package com.laptrinhspringboot.service;

import java.util.List;

import com.laptrinhspringboot.entity.EmployeeEntity;



public interface EmployeeService {
	public EmployeeEntity create(EmployeeEntity employee);
	public List<EmployeeEntity> findAllEmployee();
	public EmployeeEntity findEmployeeByID(Long employeeID);
	public EmployeeEntity updateEmployeeByID(Long employeeID,EmployeeEntity employee);
	public void deleteEmployeeByID(Long employeeID);
	
}
