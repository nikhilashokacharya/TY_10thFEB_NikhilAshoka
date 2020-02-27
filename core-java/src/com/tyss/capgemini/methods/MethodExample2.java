package com.tyss.capgemini.methods;

public class MethodExample2 {
	public void displayMessage() {
		System.out.println("Start of displayMessage");
		System.out.println("Hello World");
		System.out.println("End of displayMessage");
		System.out.println("Returning to the main method now");
	}
	public static void main(String[] args) {
		// To call a non-static method, we need to create an object. It is then loaded into the heap area.
		MethodExample2 a = new MethodExample2();
		System.out.println("Called displayMessage method via Object 'a' ");
		a.displayMessage();
		System.out.println("End of Main method");
	}
}

	
