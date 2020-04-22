package com.example.sorting;

import com.example.softwarePatterns.StockItem;

import java.util.ArrayList;
import java.util.List;

public class DescendingPriceSort extends ProductSort {

	@Override
	public List<StockItem> implementSortingAlgorithm(List<StockItem> products) {
		List<StockItem> sortedProducts = new ArrayList<>(products);
		sortedProducts.sort((product1, product2) -> Double.compare(product2.getPrice(), product1.getPrice()));
		return sortedProducts;
	}
}