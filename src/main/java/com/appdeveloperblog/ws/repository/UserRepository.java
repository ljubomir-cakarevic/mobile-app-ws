package com.appdeveloperblog.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appdeveloperblog.ws.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	// we give user entity to save into database
	// Spring Data JPA created ready to use methods 
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);

}
