package com.avinash.service;

import java.util.List;

import com.avinash.entity.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	
	void deleteEmployee(long id);

}
