package com.laptrinhspringboot.service;

import java.util.List;
import java.util.Optional;

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
	public Iterable<EmployeeEntity> getAllByID(Iterable<Long> employeeID) {
		// TODO Auto-generated method stub
			return employeeRepository.findAllById(employeeID);
	}

	@Override
	public void updateEmployeeByID(EmployeeEntity employee) {
		// TODO Auto-generated method stub		
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeByID(Long employeeID) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeID);
	}

}
