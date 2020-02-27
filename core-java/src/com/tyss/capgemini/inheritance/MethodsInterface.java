package com.tyss.capgemini.inheritance;

public interface MethodsInterface {
	// The method within an Interface is abstract
	public void displayMessage();

	public void printMessage();

	// You can have a  static concrete method in interface after Java 8
	public static void showMessage() {
		System.out.println("public static showMessage() of method interface... ");

	}
	
	public static void helloMessage() {
		System.out.println("Hello static message");
	}

	// You can have a default method in interface, BUT it must be NON-STATIC.
	default void defaultMethodMessage() {
		System.out.println("defaultMethodMessage() of method interface...");
	}
	default void defaultMethodMessage1() {
		System.out.println("defaultMethodMessage1() of method interface...");
	}

}
