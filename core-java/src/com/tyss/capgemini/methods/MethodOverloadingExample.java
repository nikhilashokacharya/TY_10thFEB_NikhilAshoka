package com.tyss.capgemini.methods;

public class MethodOverloadingExample {
// A method having the same name is called as method overloading, irrespective of its access- specifier, no. of arguments,
	public static void displayMessage() {
		System.out.println("public static void displayMessage()");
	}
    //Overloaded Method
	public static void displayMessage(String s) {
		System.out.println("public static void displayMessage(String s)");
	}
	 //Overloaded Method
	public void displayMessage(String s, int i) {
		System.out.println("public void displayMessage(String s, int i)");
	}
	 //Overloaded Method
	public void displayMessage(int i, String s) {
		System.out.println("public void displayMessage(int i,String s)");
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample moe = new MethodOverloadingExample();
		MethodOverloadingExample.displayMessage();
		displayMessage("ABC");
		// If the method is non-static, We have to create an object for calling it. We need to call using the reference. 
		moe.displayMessage(123, "Hello");
		moe.displayMessage("Hello", 1234);
		
		// The below classes are not defined by us in the code. But still accessible.  
		moe.getClass();
		moe.hashCode();
		
	}
}
