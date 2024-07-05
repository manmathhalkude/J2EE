package com.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotation/config2.xml");
		Student2 student =(Student2) context.getBean("student2");
		System.out.println(student);
	}

}
