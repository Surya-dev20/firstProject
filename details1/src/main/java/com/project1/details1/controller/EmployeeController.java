package com.project1.details1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.details1.dto.EmployeeDto;
import com.project1.details1.service.EmployeeService;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/users")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("/post") 
	public EmployeeDto create(@RequestBody EmployeeDto dto) {
		return employeeService.createUser(dto);
	}
	@GetMapping("/get/{id}")
	public EmployeeDto Find(Long id) {
		return employeeService.getUserById(id);
	}
	@GetMapping("/all")
	public List<EmployeeDto> getAll(){
		return employeeService.getAllUsers();
	}
	
	
}
