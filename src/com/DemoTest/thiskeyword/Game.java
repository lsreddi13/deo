package com.DemoTest.thiskeyword;

public class Game{
	
	public String gameName = "Cricket";
	
	final String schoolName = "Nagarjuna High School";
	
	private int teamSize = 15;
	
	protected double sal = 30000;
	
	  String course = "Automation classes";
	
	  void printDefaultVar() {
	
		 System.out.println("print default var : "+ course);
	 }
	 
	protected void printSal() {
		System.out.println("printing protected value "+ sal);
	}
	
	public void playGame() {
		System.out.println("I am playing "+ gameName);
	}
	
	
	private void playPrivateGame() {
		System.out.println("I am playing private "+ gameName);
	}

	
	public void printTeamSize() {
		System.out.println("print private var "+ teamSize);
	}
}
