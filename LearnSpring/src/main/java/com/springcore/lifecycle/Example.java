package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//implementing bean liufecycle using Annotations
//@PostConstruct
//@preDestroy
public class Example {
	private String subject;

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
@PostConstruct
public void start() {
	System.out.println("starting method");
}
@PreDestroy
public void end() {
	System.out.println("end method");
}
}
