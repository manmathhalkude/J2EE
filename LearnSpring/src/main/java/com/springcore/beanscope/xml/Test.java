package com.springcore.beanscope.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanscope/xml/config.xml");
		Teacher t1 = context.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = context.getBean("teacher", Teacher.class);
		System.out.println(t2.hashCode());
		
		
		//Singelton-- container ek bar object banayega aur wohi object aap ko baar baar dega 
		             // sare objects ka hashcode same rahgega
		
		
		//Prototype--- container har baar naya object banayega aur aaapko dega aur hashcode har object ka different rahega
	}

}
