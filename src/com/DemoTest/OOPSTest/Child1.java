package com.DemoTest.OOPSTest;

public class Child1 extends Parent1{

	
	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.testCourse();
		System.out.println(c1.course);
		System.out.println(c1.duration);
		
	}
	
	public void testCase() {
		testCourse();
	}
}
