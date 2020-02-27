package com.tyss.capgemini.polymorphism;

public class OverloadedMethodsCallingClass {
	public static void main(String[] args) {
		OverloadedMethodsClass overloadedMethodsClass = new OverloadedMethodsClass();

		System.out.println("add(int i, int j) : " + overloadedMethodsClass.add(5, 6));
		System.out.println("add(int i, int j, int k) : " + overloadedMethodsClass.add(5, 6, 7));
		System.out.println("add(int i, double d) : " + overloadedMethodsClass.add(5, 6.5));
		System.out.println("add(double d, int i) : " + overloadedMethodsClass.add(5.6, 6));

	}
}
