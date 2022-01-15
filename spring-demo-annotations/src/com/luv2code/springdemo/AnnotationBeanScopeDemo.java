package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		Boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same result\n" + result);
		System.out.println("Address 1\n" + theCoach);
		System.out.println("Address 2\n" + alphaCoach);
		
		context.close();
		
	}

}
