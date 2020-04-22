package com.example.sorting;

import com.example.softwarePatterns.StockItem;
import java.util.List;

public abstract class ProductSort {

	public final List<StockItem> sortProductsList(List<StockItem> products) {
		return checkForEmptyList(products);
	}

	public final List<StockItem> checkForEmptyList(List<StockItem> products) {
		if(products.isEmpty()) {
			return products;
		} else {
			return implementSortingAlgorithm(products);
		}
	}

	public abstract List<StockItem> implementSortingAlgorithm(List<StockItem> products);
}