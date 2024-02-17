package com.DemoTest.javaBasics;

public class Day2 {
	
	int sal;
	
	Day2 cdd = new Day2();
	public static void test3() {
		Day2 cd = new Day2();
		cd.test1();
		System.out.println("Hello i am test3");
	}
	
	 int course = 123; // non static vars
	 static String language = "java"; // static vars

	public void test1() { // non static method
		
		String city = "hyderabad"; //local vars
		
		System.out.println("I am test1");
		System.out.println(city);

	}

	public void test2() {
		test1();
		System.out.println("hello i am test2");
		System.out.println(course);
	}

	public static void main(String[] args) {
		
		test3();
		System.out.println(language);
		System.out.println(course);
		
		
		System.out.println("fasdfa");
		
		Day2 obj = new Day2();
		
		Day2 obj1 = new Day2();
		System.out.println(obj.course);
//		System.out.println(course);
		obj.test2();
		obj.test1();
	}
}
