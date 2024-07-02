package com.springcore.constructorinjection;

public class Certi {
	String name;

	private Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
