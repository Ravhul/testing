package com.springlearning.test.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	SortAlgo sortAlgorithm;
	
	BinarySearch(SortAlgo sortAlgo){
		this.sortAlgorithm = sortAlgo;
	}
	
	public int find(int []arr,int num) {
		sortAlgorithm.sort(arr);
		return num;
	}
}
