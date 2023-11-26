package com.springframework;

import com.springframework.TestXmlAppCont.XmlPersonDao;
import com.springframework.learning.ExampleForBeanScope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class LearningSpringXmlApplicationContext {

	private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringXmlApplicationContext.class);

	public static void main(String[] args) {
		
		//BinarySearchIml binarySearch = new BinarySearchIml(new BubbleSortAlgorithm());//first in tight coupling (1)-->new BinarySearchIml()
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("app context : " + appContext);
		XmlPersonDao person = appContext.getBean(XmlPersonDao.class);
		System.out.println("person : " + person);
		System.out.println("jdbcConnection : " + person.getXmlJdbcConnection());


	}

}
