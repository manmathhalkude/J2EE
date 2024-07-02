package com.springcore.ambiguityproblmSoln;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor: int, int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor: double, double");
	}

	public void Sum() {
		System.out.println("val of a:"+ this.a);
		System.out.println("val of b:"+ this.b);
		System.out.println("sum:" + (this.a + this.b));
	}
}
