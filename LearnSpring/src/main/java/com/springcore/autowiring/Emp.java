package com.springcore.autowiring;

public class Emp {
private Address address;

private Emp() {
	super();
	// TODO Auto-generated constructor stub
}

private Emp(Address address) {
	super();
	this.address = address;
	System.out.println("inside constructor");
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("inside setter");
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

}
