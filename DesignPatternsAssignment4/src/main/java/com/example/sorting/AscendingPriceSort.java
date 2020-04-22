package com.example.sorting;

import com.example.softwarePatterns.StockItem;
import java.util.*;

public class AscendingPriceSort extends ProductSort {

	@Override
	public List<StockItem> implementSortingAlgorithm(List<StockItem> products) {
		List<StockItem> sortedProducts = new ArrayList<>(products);
		sortedProducts.sort(Comparator.comparingDouble(StockItem::getPrice));
		return sortedProducts;
	}
}