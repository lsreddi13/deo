package com.DemoTest.OOPS.Poly;

public class DemoOverLoad {

	// login with valid data
	public void loginTest(String name, String pwd) {
		System.out.println("Enter user name : " + name);
		System.out.println("Enter password : " + pwd);
		System.out.println("Click Login button");

	}
	


	public void checkDashboard() {
		System.out.println("Verify dasboard page.");
	}

	public void testError() {
		System.out.println("Verify error when user enter invalid login data.");

	}

	public void loginTest(String name, String pwd, String error) {
		System.out.println("Enter user name : " + name);
		System.out.println("Enter password : " + pwd);
		System.out.println("Click Login button");
	}

	public void logoutTest() {
		System.out.println("Click Logout button");
		System.out.println("Check Login page should display.");
	}
	
	public static void main(String[] args) {
		
		DemoOverLoad dol = new DemoOverLoad();
		//scenario1
		dol.loginTest("sasi", "sasi123");
		dol.checkDashboard();
		dol.logoutTest();
		
		
		//scenario2
		dol.loginTest("sasi123", "sasi", "Please enter valid details");
		dol.testError();
		dol.logoutTest();
		
	}

}
