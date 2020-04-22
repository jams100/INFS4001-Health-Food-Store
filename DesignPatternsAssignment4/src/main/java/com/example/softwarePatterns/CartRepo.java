package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface CartRepo extends CrudRepository<Cart, Integer>{
	Cart findById(int id);
}