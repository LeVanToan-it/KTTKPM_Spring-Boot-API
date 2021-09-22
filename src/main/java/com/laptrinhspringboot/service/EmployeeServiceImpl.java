package com.laptrinhspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.laptrinhspringboot.entity.EmployeeEntity;
import com.laptrinhspringboot.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeEntity create(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		// TODO Auto-generated method stub
			return employeeRepository.findAll();
	}

	@Override
	public EmployeeEntity updateEmployeeByID(Long employeeID, EmployeeEntity employee) {
		// TODO Auto-generated method stub		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeByID(Long employeeID) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeID);
	}

	@Override
	public EmployeeEntity findEmployeeByID(Long employeeID) {
		// TODO Auto-generated method stub
		return employeeRepository.getById(employeeID);
	}

}
