package com.springcore.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages= "com.springcore.removexml") // which pacvkage to scan  ,
//here@ComponentScan not required with @BeanAnnotattion



@Configuration   //handles java configuration , also class has @Bean Definition
public class JavaConfig2 {
	
//@Bean annotation is applied on a method to specify that it returns a bean to be managed by Spring context.
	//Spring Bean annotation is usually declared in Configuration classes methods. 
	
	@Bean
	public Student getStudent( ) {

	    // Here the method name is the bean id/bean name
		//creating a new object
		Student student = new Student();
		return student;
	}
}
