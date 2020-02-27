package com.tyss.capgemini.inheritance;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample, FunctionalInterfaceExample2 {

	@Override
	public void showMessage() {
		System.out.println("Overridden showMessage() of FunctionalInterfaceExample");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceImpl f = new FunctionalInterfaceImpl();
		
		
		// Functional Interface Example 1 contents //
		f.showMessage();
		f.displayMessage();
		    // Static method - printMessage() in FunctionalInterfaceExample
		FunctionalInterfaceExample.printMessage();
		
		
		// Functional Interface Example 2 contents //
		System.out.println(f.add(4, 6));
		f.display1Message();
		    // Static method - print1Message() in FunctionalInterfaceExample2
		FunctionalInterfaceExample2.print1Message();
		
		
		
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
