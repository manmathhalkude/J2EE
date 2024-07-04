package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("/configcoll.xml");
   System.out.println("hello");
     
		Emp emp1 =(Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhoneno());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
	System.out.println(emp1.getProps());
	}

}
