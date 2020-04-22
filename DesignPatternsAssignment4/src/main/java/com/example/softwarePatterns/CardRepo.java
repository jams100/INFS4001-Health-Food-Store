package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface CardRepo extends CrudRepository<Card, Integer>{
	Card findById(int id);
}
