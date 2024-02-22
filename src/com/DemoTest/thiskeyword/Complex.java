package com.DemoTest.thiskeyword;

public class Complex {

	static int a = 5, b = 10;
	
	Complex(int i, int j) {
		this.a = i;
		this.b = j;
	
	}

	public void tt(int x, int y) {
		a = x;
		b = y;
		System.out.println(this.a);
		System.out.println(this.b);
	}

	public static void main(String[] args) {

		Complex c1 = new Complex(5, 5);
		c1.tt(15, 20);
		System.out.println(this.a);
		System.out.println(this.b);
	    }
	}
}
