package com.DemoTest.javaBasics;

public class DemoMethods {

	public static void test1() {

		System.out.println("I am static method.");
	}

	public void test2() {

		System.out.println("I am non static method.");
	}

	// non void method or return type method

	public int getTabCount() {

		int tabCount = 7;

		return tabCount;
	}

	public String getTabName() {
		String name = "MultiThreading";

		return name;
	}

	public static boolean isLoginBtnDisplayed() {

		boolean x = false;

		System.out.println("hello this is boolean return type method.");
		return x;

	}

	public static void main(String[] args) {
		boolean abc = isLoginBtnDisplayed();
		System.out.println(abc);
		test1();
	}

}
