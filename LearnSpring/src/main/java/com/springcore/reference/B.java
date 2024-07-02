package com.springcore.reference;

public class B {
	private int y;

	private B(int y) {
		super();
		this.y = y;
	}


	private B() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
