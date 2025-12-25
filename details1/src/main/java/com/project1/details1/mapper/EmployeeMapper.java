package com.project1.details1.mapper;

import org.springframework.stereotype.Component;

import com.project1.details1.dto.EmployeeDto;
import com.project1.details1.entity.UserEntity;

@Component
public class EmployeeMapper {
	public EmployeeDto toDto(UserEntity user) {
		if(user == null) return null;
		EmployeeDto dto = new EmployeeDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		return dto;
	}
	public UserEntity toEntity(EmployeeDto dto) {
		if(dto == null) return null;
		UserEntity entity = new UserEntity();
		entity.setId(dto.getId());
		entity.setEmail(dto.getEmail());
		entity.setName(dto.getName());
		return entity;
	}
}
