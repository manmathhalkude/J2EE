package com.springcore.lifecycle;

public class Samosa {
	private double price;

	private Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		System.out.println("setting property");
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init");
	}
	
	public void destroy() {
		System.out.println("inside destroy");
		
	}
	

}
