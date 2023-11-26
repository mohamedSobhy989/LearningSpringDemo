package com.springframework;

import com.springframework.ExternalData.ExternalService;
import com.springframework.learning.ExampleForBeanScope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication //SpringBootApplication used with spring boot or @Configuration in spring
@PropertySource("classpath:app.properties") //this use to make appcontext make @Value annotation see this file and get data from him
public class LearningSpringPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringPropertiesApplication.class);

	public static void main(String[] args) {
		
		//BinarySearchIml binarySearch = new BinarySearchIml(new BubbleSortAlgorithm());//first in tight coupling (1)-->new BinarySearchIml()
		ApplicationContext appContext =  SpringApplication.run(LearningSpringPropertiesApplication.class, args);

		ExternalService service= appContext.getBean(ExternalService.class);


		System.out.println("service 1 : " + service);
		System.out.println("service 1 - url : " + service.getExternalURL());


	}

}
