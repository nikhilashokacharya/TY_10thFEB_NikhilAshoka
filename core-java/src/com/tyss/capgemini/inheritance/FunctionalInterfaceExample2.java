package com.tyss.capgemini.inheritance;

@FunctionalInterface
public interface FunctionalInterfaceExample2 {
	//abstract method
	public int add(int a, int b); 
	
	public static void print1Message() {
		System.out.println("Static Method in FunctionalInterfaceExample2");
	}
	
	default void display1Message() {
		System.out.println("Default method in FunctionalInterfaceExample2");
	}
	
}
