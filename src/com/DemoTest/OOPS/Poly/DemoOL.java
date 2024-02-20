package com.DemoTest.OOPS.Poly;

public class DemoOL {

	public DemoOL() {
		System.out.println("I am Default constructor.");

	}

	public int  m1(int a, int b) {
//		System.out.println(a + b);

		return a+b;
	}

	public void m1(String a, String b) {
		System.out.println(a + b);
	}

	public void m1(int a, String b) {
		System.out.println(a + b);
	}

	public void m1(String a, int b) {
		System.out.println(a + b);
	}

}
