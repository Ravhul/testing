package com.springlearning.test.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch(new QuickSort());
		int []arr = {1,2,3};
		int out = search.find(arr, 0);
		System.out.println(out);
		//SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

}
