package com.DemoTest.javaBasics;

public class LoginDemo {

	
	public LoginDemo() {
		System.out.println("hello Good morning.");
	}
	
	
	public void loginTest(String emailID, String pwd) {
		System.out.println(emailID + " : " +pwd );
	}
	public void fruits(String f) {
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		LoginDemo ld = new LoginDemo();
		ld.fruits("apple");
		ld.fruits("mango");
		ld.fruits("mango");
//		
//		ld.loginTest("venu", "venu123");
//		ld.loginTest("venu1", "venu123");
//		ld.loginTest("venu2", "venu123");
//		ld.loginTest("venu3", "venu123");
		
		
		
		
	}


}

