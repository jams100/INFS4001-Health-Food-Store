package com.example.softwarePatterns.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	@Autowired
	private StockItemRepository repo;
//	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/...")
//	public void addItem(@RequestBody @PathVariable) {
//	}
	
}