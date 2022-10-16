package com.springlearning.test.firstspringproject;

public class BinarySearch {
	SortAlgo sortAlgo;
	BinarySearch(SortAlgo sortAlgo){
		this.sortAlgo = sortAlgo;
	}
	
	public int find(int []arr,int num) {
		sortAlgo.sort(arr);
		return num;
	}
}
