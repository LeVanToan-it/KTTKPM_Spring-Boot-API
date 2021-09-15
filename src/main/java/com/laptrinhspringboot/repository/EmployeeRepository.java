package com.laptrinhspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhspringboot.entity.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
