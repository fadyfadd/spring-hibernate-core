package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

		Coach myCoach= context.getBean("myCoach" , Coach.class);
		myCoach.getDailyWorkout();
		

		context.close();

	}

}
