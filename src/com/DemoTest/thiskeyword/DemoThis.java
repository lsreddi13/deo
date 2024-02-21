package com.DemoTest.thiskeyword;

public class DemoThis {

	public String course;
	public String name = "Selenium";
	public static String environment ;
	 
	public DemoThis(String env) {
		environment = env;
	}
	
	public void T1(String s1) {
//		name = "Selenium JAVA";
		
		System.out.println(name);
		course = s1;
		System.out.println(course);
	}
	    

	
	
	public static void main(String[] args) {
		DemoThis dt = new DemoThis("Test");
		System.out.println("environment value : "+ environment );
		
		dt.T1("webautomation tool");
		
	}
	
	
}
