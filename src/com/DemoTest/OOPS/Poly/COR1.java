package com.DemoTest.OOPS.Poly;

import org.testng.annotations.Test;

public class COR1 extends POR1 {
	public void login(String uname, String pwd) {
		System.out.println("+++++++++++++++++++i am from child class " + uname + pwd);
	}

//	final void testfinal() {
//		System.out.println("this is final method in the Child class");
//	}
	
	
	public void testStaticMethod() {
		System.out.println("this is static method in the Child class");
	}
	
//	@Test
//	public void test() {
//		COR1 c = new COR1();
//		c.login("java", "selenium");
//		
//		c.testStaticMethod();
//	}
//	
	public static void main(String[] args) {
//		COR1 c = new COR1();
//		c.login("java", "selenium");
		
//		testStaticMethod();

//		POR1 p = new POR1();
//		p.login("testng", "maven");
//
		POR1 pc = new COR1();
		pc.login("testng", "maven");
		pc.testStaticMethod();

//		COR1 cp = new POR1();
//		pc.login("testng", "maven");

	}

}
