package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Use AnnotationConfigApplicationContext
        // instead of ClassPathXmlApplicationContext
        // because we are not using XML Configuration
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student1", Student.class);
		System.out.println(student);
		student.study();
		
	}

}
