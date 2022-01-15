package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach myCoach= context.getBean("myCoach" , Coach.class);	
		Coach alphaCoach = context.getBean("myCoach" , Coach.class);	
		
		 Boolean result = myCoach == alphaCoach; 
		 
		 System.out.println("\nPointing to the same object" + result);
		 System.out.println("\nMemory Location for theCoach" + myCoach);
		 System.out.println("\nMemory Location for alfa coach" + alphaCoach);

		context.close();

	}

}
