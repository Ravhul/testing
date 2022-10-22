package com.springlearning.test.firstspringproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgo{
	public int []sort(int arr[]){
		System.out.println("Quick Sort");
		return arr;
	}
}
