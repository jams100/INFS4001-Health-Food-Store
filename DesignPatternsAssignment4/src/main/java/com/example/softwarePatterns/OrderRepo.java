package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order,Integer> {
	Order findByName(String name);
}