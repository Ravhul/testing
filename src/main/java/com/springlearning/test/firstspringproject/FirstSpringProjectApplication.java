package com.springlearning.test.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext =  SpringApplication.run(FirstSpringProjectApplication.class, args);
		BinarySearch binSearch = appContext.getBean(BinarySearch.class);
		int arr[] = {1,2,3,4,5};
		int out = binSearch.find(arr, 0);
		System.out.println(out);
	}

}
