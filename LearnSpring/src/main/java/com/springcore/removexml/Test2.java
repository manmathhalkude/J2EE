package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Use AnnotationConfigApplicationContext
        // instead of ClassPathXmlApplicationContext
        // because we are not using XML Configuration
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//here getstudent is the methd name
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.study();
		
	}

}
