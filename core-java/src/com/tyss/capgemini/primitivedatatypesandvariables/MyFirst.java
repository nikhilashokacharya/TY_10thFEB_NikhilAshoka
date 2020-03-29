package com.tyss.capgemini.primitivedatatypesandvariables;

public class MyFirst {

	public static void main(String[] args) {
		
		MyFirst f1 = new MyFirst();

		System.out.println("Hello World");
		f1.name1();
		System.out.println("Reached main method, Now going to name method");
		f1.name();
		System.out.println("End of Main method and also the program.");
	}
	
	
	public  void name1() {
		System.out.println("Reached the name1 method");
//		MyFirst f = new MyFirst();
//		f1.name();
		System.out.println("Going back to main method now");
	}
	
	public void name() {
		System.out.println("End of the name method");
	}
}
