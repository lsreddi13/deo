package com.DemoTest.thiskeyword;

public class DemoThis2 {

	String loginID;
	String password;

	public void setData(String id, String pwd) {
		loginID = id;
		password = pwd;

	}

	public static void main(String[] args) {
		DemoThis2 dt2 = new DemoThis2();
		dt2.setData("sasi", "sasi123");
		dt2.getData();
		
	}

	public void getData() {
		
		System.out.println("Ener login id : "+ loginID);
		
		System.out.println("Ener password : "+ password);
		
		
	}
	
}
