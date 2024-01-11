package com.avinash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.entity.Employee;
import com.avinash.service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable long id){
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable long id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted successfully.. with id = "+id;
	}
}
