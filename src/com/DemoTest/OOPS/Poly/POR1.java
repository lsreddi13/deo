package com.DemoTest.OOPS.Poly;

public class POR1 {

	public void login(String uname, String pwd) {
		System.out.println("i am from Parent class " + uname + pwd);
	}
//
//	final void testfinal() {
//		System.out.println("this is final method in the parent class");
//	}
	
	public void testStaticMethod() {
		System.out.println("*****************this is static method in the Parent class");
	}

//Rules -verride
	// we can not override private methods

	// we can not inheritance private methods

	// static method ? no

	// final methods ? no

}
