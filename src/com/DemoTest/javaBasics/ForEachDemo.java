package com.DemoTest.javaBasics;

public class ForEachDemo {

	
	public static void main(String[] args) {
		ForEachDemo obj = new ForEachDemo();
//		obj.testForEach();
//		obj.testForLoop();
		
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
	}
	
	
	
	public void testForLoop() {
		String[] name = {"selenium", "java", "testng", "maven", "apachepoi", "pageobjectmodel", "testngresults", "listeners", "git"};

		
		for(int i=0; i<9; i++){

			System.out.println(name[i]);

			}

	}
	
	
	public void testForEach() {
		String[] name = {"selenium", "java", "testng", "maven", "apachepoi", "pageobjectmodel", "testngresults", "listeners", "git"};

		
		for(String x : name){

			System.out.println(x);
			}

	}
}
