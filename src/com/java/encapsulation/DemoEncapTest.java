package com.java.encapsulation;

import org.testng.annotations.Test;

public class DemoEncapTest {
	public static void main(String[] args) {

		DemoEncap de = new DemoEncap();
		de.setAge(25);
		int x = de.getAge();
		System.out.println("Age value : " + x);
	}

}
