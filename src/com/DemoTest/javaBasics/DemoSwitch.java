package com.DemoTest.javaBasics;

public class DemoSwitch {
	public void test(String browserName) {
		
//	String browserName = "chrome";
	switch(browserName)
	{
      case "chrome":
          System.out.println("We are in the " + " " + browserName + " browser");
         
          break;
      case "edge":
          System.out.println("We are in the " + " " + browserName + " browser");
          break;
      case "firefox":
          System.out.println("We are in the " + " " + browserName + " browser");
          
          break;
      case "ie":
          System.out.println("We are in the " + " " + browserName + " browser");
         
          break;

      default:
          System.out.println("There is no implementation for the given browser" + " :" + browserName);
          break;

  }
	}

	public static void main(String[] args) {
		DemoSwitch Launch= new DemoSwitch();
	    	Launch.test("edge");
		}
}
