package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	//@Autowired
	private Address address;

	private Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	private Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Address getAddress() {
		return address;
	}
@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("inside setter");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
