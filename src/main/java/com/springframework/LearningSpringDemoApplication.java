package com.springframework;

import com.springframework.learning.LearningSpringDemo.BinarySearchIml;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringDemoApplication {

	public static void main(String[] args) {
		
		//BinarySearchIml binarySearch = new BinarySearchIml(new BubbleSortAlgorithm());//first in tight coupling (1)-->new BinarySearchIml()
		ApplicationContext appContext =  SpringApplication.run(LearningSpringDemoApplication.class, args);
		BinarySearchIml binarySearch= appContext.getBean(BinarySearchIml.class);
		int result = binarySearch.bianarySearch(new int[] {12,4,6}, 3);
		System.out.println("result = " + result);
		
	}

}
