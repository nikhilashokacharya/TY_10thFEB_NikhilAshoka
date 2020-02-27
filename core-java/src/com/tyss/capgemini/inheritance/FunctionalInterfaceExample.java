package com.tyss.capgemini.inheritance;
// We can use an annotation @FunctionInterface to make this interface as a functional type. Here, if we add another method there be a error
// Here we can have only one abstract method. Not more then one 
@FunctionalInterface
public interface FunctionalInterfaceExample {

	public void showMessage();
//	public void displayMessage();
//	 void printMessage();
	
	public static void printMessage() {
		System.out.println("Static Method in FunctionalInterfaceExample");
	}
	
	default void displayMessage() {
		System.out.println("Default method in FunctionalInterfaceExample");
		
	}
	
	

}
