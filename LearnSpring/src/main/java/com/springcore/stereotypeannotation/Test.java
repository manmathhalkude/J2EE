package com.springcore.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowiring.qualifierannotation.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotation/config.xml");
		Student student =(Student) context.getBean("student");
		System.out.println(student);
	}

}
