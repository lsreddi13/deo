package com.DemoTest.javaBasics;

public class IfElseDemo {

	String name = "fads";
	int age = 42;

	public void checkAgeLimit(int a) {


		if (60 <= a) {
			System.out.println("eligible");
		} else if (30 >= a) {
			System.out.println("xyz");
		}else {
			System.out.println("inter");
		}

	}

	public static void main(String[] args) {
		IfElseDemo ifd = new IfElseDemo();
		ifd.checkAgeLimit(ifd.age);
	}

}
