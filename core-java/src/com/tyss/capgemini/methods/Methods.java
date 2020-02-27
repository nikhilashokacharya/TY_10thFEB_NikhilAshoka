package com.tyss.capgemini.methods;

public class Methods {
	public static String displayMessage() {
		return "Static Methods.displayMessage()";
	}
	public String printMessage() {
		return "Non-Static Methods.printMessage()";		
	}
	/**
	 * 
	 * @param i
	 * @param j
	 * @return i + j;
	 */
	int addingTwoIntegers(int i,int j) {
		return i+j;
		
	}
	
	protected String welcomeMessage() {
		return "Hello World";
	}
	// SuppressWarnings
	@SuppressWarnings("Unused")
	private String messageDisplay() {
		return "privateMessageDisplay()";
	}
	
	
	

}
