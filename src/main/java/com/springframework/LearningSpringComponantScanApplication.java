package com.springframework;

import com.springframework.Basics.ComponantDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// to use spring code
@Configuration
// to use spring boot
//@SpringBootApplication
@ComponentScan("com.springframework.Basics")
public class LearningSpringComponantScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringComponantScanApplication.class);

	public static void main(String[] args) {
		// to use spring core
		AnnotationConfigApplicationContext appContextCore = new AnnotationConfigApplicationContext(LearningSpringComponantScanApplication.class);
		// to use spring boot
		ApplicationContext appContextBoot = SpringApplication.run(LearningSpringComponantScanApplication.class,args);

		ComponantDao componantDao= appContextCore.getBean(ComponantDao.class);
		ComponantDao componantDao2= appContextBoot.getBean(ComponantDao.class);

		System.out.println("ComponantDao Core : " + componantDao);
		System.out.println("ComponantDao Boot : " + componantDao2);
		appContextCore.close();

	}

}
