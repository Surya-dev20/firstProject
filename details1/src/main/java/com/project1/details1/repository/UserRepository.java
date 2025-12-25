package com.project1.details1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.details1.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findByEmail(String email);
}
