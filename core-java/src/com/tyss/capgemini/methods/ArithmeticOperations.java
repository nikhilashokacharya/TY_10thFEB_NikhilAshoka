package com.tyss.capgemini.methods;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int res= add(3,4);
		System.out.println("Sum is "+res);
		System.out.println("New Sum is "+add(10, 20));
		System.out.println("New Sub is "+sub(10, 20));
		System.out.println("New Div is "+div(20, 15));
		System.out.println("New mul is "+mul(10, 20));
	}
	public ArithmeticOperations() {
		System.out.println("Basic Arithmetic Operations...");
	}
	/**
	 * This method returns the sum of the two integers
	 * 
	 * @param i
	 * @param j
	 * @return int i+ int j
	 */
	public static int add(int i,int j) 
	{
		/*
		 * int sum=i+j; 
		 * return sum;
		 */
		// A method can only have one return statement
		return i+j;
	}
	/**
	 * This method subtracts two given numbers
	 * 
	 * @param i
	 * @param j
	 * @return int i- int j
	 */
	public static int sub(int i,int j) {
		return i-j;
		
	}
	// If you are giving one value either double, float, then you will get the actual value of the output
	/**
	 * This method divides two given numbers
	 * 
	 * @param i
	 * @param j
	 * @return double i/ int j
	 */
	public static double div(double i, int j) {
		return i/j;
		
	}
	
	/**
	 * This method multiplies two given numbers
	 * 
	 * @param i
	 * @param j
	 * @return int i* int j
	 */
	public static int mul(int i,int j) {
		return i*j;
		
	}

}
