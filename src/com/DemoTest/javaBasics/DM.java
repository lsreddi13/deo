package com.DemoTest.javaBasics;

public class DM {

	
	public static void main(String[] args) {
		
		DemoMethods dmm = new DemoMethods();
		dmm.test1();
		dmm.test2();
		
		int ss = dmm.getTabCount();
		System.out.println(ss);
		int expTabCount = 7;
//		assert.assertEquals(ss,expTabCount);
		
		String expTabName = "MultiThreading";
		String actual_TabName = dmm.getTabName();
		System.out.println(actual_TabName);
		System.out.println(dmm.isLoginBtnDisplayed());
		
	}
}
