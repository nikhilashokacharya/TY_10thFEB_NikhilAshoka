package com.tyss.capgemini.polymorphism;

public class MethodsInterfaceCaller {
	public static void main(String[] args) {
		MethodOverridingClass1 methodOverridingClass1 = new MethodOverridingClass1();
		MethodOverridingClass2 methodOverridingClass2 = new MethodOverridingClass2();

		System.out.println(methodOverridingClass1.displayMessage());
		System.out.println(methodOverridingClass1.printMessage());
		
		System.out.println("**********************************************************************************");
		
		System.out.println(methodOverridingClass2.displayMessage());
		System.out.println(methodOverridingClass2.printMessage());
	}
}
