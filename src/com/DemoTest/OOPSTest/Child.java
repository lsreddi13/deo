package com.DemoTest.OOPSTest;

public class Child extends Parent {

	public void loginTest(String id, String pwd) {
		System.out.println("enter user id : " + id );
		System.out.println("enter password : "+ pwd);
		System.out.println("Click Login button");
	}
	public void verifyDashboard(String id) {
		System.out.println("Verified Dashboard page for "+id);
		
		System.out.println("All items displayed from "+Header);
}
	public void logout() {
		System.out.println("logout");
	}

}
