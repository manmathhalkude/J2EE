package com.springcore.constructorinjection2;

public class Person {
	private String name;
	private int id;

	private Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.id;

	}

}
