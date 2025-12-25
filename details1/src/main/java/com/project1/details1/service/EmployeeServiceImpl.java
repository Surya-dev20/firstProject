package com.project1.details1.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project1.details1.dto.EmployeeDto;
import com.project1.details1.entity.UserEntity;
import com.project1.details1.mapper.EmployeeMapper;
import com.project1.details1.repository.UserRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private final UserRepository employeeRepository;
	private final EmployeeMapper mapper;
	public EmployeeServiceImpl(UserRepository employeeRepository, EmployeeMapper mapper) {
		super();
		this.employeeRepository = employeeRepository;
		this.mapper = mapper;
	}
	public EmployeeDto createUser(EmployeeDto employeeDto) {
		UserEntity user = mapper.toEntity(employeeDto);
		UserEntity SavedUser = employeeRepository.save(user);
		return mapper.toDto(SavedUser);
	}
	@Override
	public List<EmployeeDto> getAllUsers() {
		return employeeRepository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
		
	}
	@Override
	public EmployeeDto getUserById(Long id) {
		UserEntity user = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
		
		return mapper.toDto(user);
	}
	
	
}
