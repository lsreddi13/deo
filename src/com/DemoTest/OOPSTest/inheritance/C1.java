package com.DemoTest.OOPSTest.inheritance;

public class C1 extends P1 implements D1, D2{
	
	public static String automationTool = "Selenium";
	
	public static void printToolName() {
		System.out.println("Child class method printing "+ automationTool);
		
//		System.out.println(WeekDay);
//		
//		System.out.println(month);
	}

	
	public void t1() {
		System.out.println("this method from interface");
	}


}
