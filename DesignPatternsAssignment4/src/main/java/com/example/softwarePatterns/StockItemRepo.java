package com.example.softwarePatterns;

import org.springframework.data.repository.CrudRepository;

public interface StockItemRepo extends CrudRepository<StockItem,Integer>{
	StockItem findByTitle(String title);
	}