package com.DemoTest.javaBasics;

public class DemoConstructor {

	 public  DemoConstructor(){
		System.out.println("Good Morning Hyderabad");
				
	}
	 
	 public  DemoConstructor(int a){
		System.out.println("Good Morning Hyderabad"+ a);
		
		
	}
	
	public void test(int a) {  
		System.out.println("hello good morning" );
		
		System.out.println("print parameter value : "+a);
	}
	
	public static void main(String[] args) {
		DemoConstructor dc2 = new DemoConstructor();
		DemoConstructor dc = new DemoConstructor(13);
//		dc.test(3);
		System.out.println("hello I am main method");
	}
	
	
}
  