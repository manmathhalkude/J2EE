package com.springcore.stereotypeannotation.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotation/spel/NewFile.xml");
		SpELDemo s1 = context.getBean("demo",SpELDemo.class);
		System.out.println(s1);

	}

}
