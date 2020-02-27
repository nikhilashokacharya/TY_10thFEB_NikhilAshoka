package com.tyss.capgemini.methods;

public class StaticMethodCallingClass {
	public static void main(String[] args) {
		// We are calling the add method from a different class (Arithmetic Operation)
		int sum=ArithmeticOperations.add(8,9);
		System.out.println(sum);
		System.out.println(ArithmeticOperations.add(8,9));
		System.out.println(ArithmeticOperations.sub(8,9));
		System.out.println(ArithmeticOperations.mul(8,9));
		System.out.println(ArithmeticOperations.div(8,9));
	}
}
