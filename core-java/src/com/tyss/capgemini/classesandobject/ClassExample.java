package com.tyss.capgemini.classesandobject;

public class ClassExample {
	/*
	 * public static void main(String[] args) { ClassExample ce = new
	 * ClassExample(); // Object of this particular class is created. Each and every
	 * concrete class will have a constructor.
	 * A class can have any number of constructors.
	 * types - 1) default constructor - No need to do anything, compiler will create 
	 *       - 2) zero-argument constructor - we will create this constructor, but will not add anything.(Only one)
	 *       - 3) parameterized constructor - We will create this constructor, but we will input arguments here. (Any Number***)
	 * }
	 * ***- Conditions apply
	 * If we already have any type of constructor in the code, then, Default constructor will not be created.
	 */
	//Example of Zero-argument constructor
	public ClassExample() {
		System.out.println("Zero-Argument Constructor");
	}
	// Example of parameterized constructor ; Constructor Overloading
	public ClassExample(String s) {
		System.out.println("Constructor with one string argument");
	}
	public ClassExample(String s, int i) {
		System.out.println("Constructor with one string and one int argument");
	}
	public ClassExample(int i,String s) {
		System.out.println("Constructor with one int and one string argument");
	}
  public static void main(String[] args) {
	ClassExample ce = new ClassExample();
	ClassExample ce1 = new ClassExample("Any String");
	ClassExample ce2 = new ClassExample("Any String",1234);
	ClassExample ce3 = new ClassExample(12345,"Any String");


}
}
