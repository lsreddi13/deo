package com.java.superKeyword;

public class ChildDemo extends SuperDemo {
	String name = "Performance automation tools";
	
	
	public ChildDemo(){
		super();
		System.out.println("loading xls files too");
//		super();
	}
	
	
	public void login() {
		super.login();
		System.out.println(super.name);
		System.out.println("+++++++++++++++++++i am from child class ");
	}

	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.login();
	}
}
