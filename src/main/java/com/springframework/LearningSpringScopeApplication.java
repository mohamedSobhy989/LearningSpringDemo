package com.springframework;

import com.springframework.learning.ExampleForBeanScope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringScopeApplication.class);

	public static void main(String[] args) {
		
		//BinarySearchIml binarySearch = new BinarySearchIml(new BubbleSortAlgorithm());//first in tight coupling (1)-->new BinarySearchIml()
		ApplicationContext appContext =  SpringApplication.run(LearningSpringScopeApplication.class, args);

		PersonDao person= appContext.getBean(PersonDao.class);
		PersonDao person2= appContext.getBean(PersonDao.class);

		System.out.println("person 1 : " + person);
		System.out.println("person 1 - jdbc : " + person.getJdbcCon());

		System.out.println("person 2 : " + person2);
		System.out.println("person 2 - jdbc : " + person.getJdbcCon());

	}

}
