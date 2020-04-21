package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

// This class will be AUTO IMPLEMENTED by Spring into a Bean called userRepository CRUD = Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByName(String name);
	User findByPassword(String password);
	User findByEmail(String email);
}