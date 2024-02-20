package com.DemoTest.OOPS.Poly;

public class COR1 extends POR1 {
	public void login(String uname, String pwd) {
		System.out.println("i am from child class " + uname + pwd);
	}

	public static void main(String[] args) {
		COR1 c = new COR1();
		c.login("java", "selenium");
		
		POR1 p = new POR1();
		p.login("testng", "maven");
		
		
		
		POR1 pc = new COR1();
		pc.login("testng", "maven");
		
		
//		COR1 cp = new POR1();
//		pc.login("testng", "maven");
		
	}

}
