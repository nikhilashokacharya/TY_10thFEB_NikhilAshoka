package com.tyss.capgemini.methods;

public class MethodExample1 
{
	//Called Method
	public static void displayMessage() 
	{
		System.out.println("Execution comes to displayMessage method");
		System.out.println("Hello World");
		System.out.println("End of displayMessage method");
		
	}
	
	//Calling Method
	public static void main(String[] args) 
	{
		System.out.println("displayMessage method is called");
		displayMessage();
		System.out.println("End of main method");
	}
	
	//We cannot create a method within a method
	/*
	 * public static void name() 
	 * { 
	 *    public static void name1() 
	 *    {
	 * 
	 *    }
	 * }
	 */
}
