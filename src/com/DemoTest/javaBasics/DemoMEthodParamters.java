package com.DemoTest.javaBasics;

public class DemoMEthodParamters {
	public static void main(String[] args) {

		DemoMEthodParamters obj = new DemoMEthodParamters();
		
//		obj.test();
		obj.test("Fdasdf","Karthik", 50000);

	}
	public void test(int id, String name, int sal){

		System.out.println(id);
		System.out.println(sal);
		System.out.println(name);

		}
	
	public void test(){

		System.out.println("fsafdad");
		System.out.println("50000");

		}
}
