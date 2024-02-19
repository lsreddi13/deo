package com.DemoTest.OOPSTest.inheritance;

public class Demo {
	public static void main(String[] args) {
//		P1 pp = new P1(); //creating an obj for P1 class
//		
//		System.out.println(pp.course);
//		
//		pp.printStr();
		
		C1 cc = new C1();
		System.out.println(cc.automationTool);
		
		cc.printToolName();
		
		System.out.println(cc.course);
		
		
		cc.printStr();
		
		System.out.println(cc.city);
		
		cc.printCityName();
		

		System.out.println(cc.WeekDay);
		
		System.out.println(cc.month);
		cc.t1();
		
		C2 bb = new C2();
		bb.t1();
		
	}

}
