package com.springframework.learning.LearningSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchIml {

	@Qualifier("quick")
	@Autowired
	private SortAlgorithm sortAlgorithm;

 
	public int bianarySearch(int[] numbers,int numberToSearchFor) {
		
		/*
		 * BubbleSortAlgorithm bubleSort = new BubbleSortAlgorithm();
		 * (2) in tight coupling -->new BubleSortAlgorithm()
		 * resolved by sortalgorithm interface object that intialized by constractor
		 */
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println("sortAlgorithm : " + sortAlgorithm);
		return 3;
	}

}
