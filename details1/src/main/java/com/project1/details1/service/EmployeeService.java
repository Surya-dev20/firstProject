package com.project1.details1.service;

import com.project1.details1.dto.EmployeeDto;
import java.util.List;


public interface EmployeeService {
	EmployeeDto createUser(EmployeeDto employeeDto);
	List<EmployeeDto> getAllUsers();
	EmployeeDto getUserById(Long id);
}
