package com.tyss.capgemini.primitivedatatypesandvariables;

public class MyFirst {

	public static void main(String[] args) {
		
		MyFirst f1 = new MyFirst();

		System.out.println("Hello World");
		f1.name1();
		f1.name();
	}
	
	
	public  void name1() {
		MyFirst f = new MyFirst();
		f.name();
	}
	
	public void name() {
		System.out.println("End");
	}
}
