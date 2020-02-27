package com.tyss.capgemini.methods;

public class MethodOverridingClass extends Methods {
	
	

	// @Override //
	public static String displayMessage() {
		
		return "Static MethodOverridingClass.printMessage()";
	}
@Override
protected String welcomeMessage() {
	return super.welcomeMessage();
}
@Override
int addingTwoIntegers(int i, int j) {
	return super.addingTwoIntegers(i, j);
}

	// Static methods cannot be overridden.
	
	public static void main(String[] args) {
		MethodOverridingClass methodOverridingClass = new MethodOverridingClass();
		System.out.println(methodOverridingClass.printMessage());
		System.out.println(methodOverridingClass.welcomeMessage());
		System.out.println(methodOverridingClass.addingTwoIntegers(2, 3));

		System.out.println(displayMessage());
		System.out.println(Methods.displayMessage());
		System.out.println();
	}
	
	
}
