package com.springframework.learning.LearningSpringDemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//use to make container return diffrance instance of bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//used with autowire 
@Qualifier("quick")
@Component
public class QuickSortAlgorithm implements SortAlgorithm {

	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
