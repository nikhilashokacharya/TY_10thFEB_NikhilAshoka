package com.tyss.capgemini.inheritance;

public class InterfacesImplClass implements MethodsInterface, AnotherMethodsInterface {
// If we implement an interface, it is mandatory that you implement all the methods in interface. 
	@Override
	public void displayMessage() {
		System.out.println("Overriden displayMessage() of Methods Interface");
	}

	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of Methods Interface");

	}

	@Override
	public void messageDisplay() {
		System.out.println("Overriden messageDisplay() of AnotherMethods Interface");

	}

	public static void main(String[] args) {
		// We cannot create an object of an interface
		/*
		 * MethodsInterface methodsInterface = new InterfacesImplClass(); //up-casting
		 * methodsInterface.displayMessage(); methodsInterface.printMessage(); // We
		 * cannot refer to the messageDisplay() because it is in AnotherMethods
		 * Interface
		 * 
		 * AnotherMethodsInterface anotherMethodsInterface = new InterfacesImplClass();
		 * anotherMethodsInterface.messageDisplay();
		 */

		InterfacesImplClass impl1 = new InterfacesImplClass();
		impl1.displayMessage();
		impl1.printMessage();
		impl1.messageDisplay();

	}

}
