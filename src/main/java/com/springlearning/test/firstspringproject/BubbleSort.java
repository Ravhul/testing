package com.springlearning.test.firstspringproject;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgo{
	public int []sort(int arr[]){
		System.out.println("Bubble Sort");
		return arr;
	}
}
