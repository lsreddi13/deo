package com.DemoTest.OOPSTest.inheritance;

public abstract class ABS1 {

	// non abstract method
	public void login() {
		System.out.println("This is login method from ABS1 class.");
	}

	// abstract method
	public abstract void dashboard();// this method implementation in the child class

}
