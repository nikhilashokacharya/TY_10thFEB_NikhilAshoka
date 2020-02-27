package com.tyss.capgemini.inheritance;

import com.tyss.capgemini.methods.ArithmeticOperations;

public class SomeArithmeticOperations extends ArithmeticOperations {
	
	public SomeArithmeticOperations() {
	//	super();
		System.out.println("SomeArithmeticOperations");
	}
	public static void main(String[] args) {

		SomeArithmeticOperations someArithmeticOperations = new SomeArithmeticOperations();

		System.out.println("Add method of Super Class : " + add(45, 60));
		System.out.println("Sub method of Super Class : " + sub(60, 45));
		System.out.println("Mul method of Super Class : " + mul(10, 8));
		System.out.println("Div method of Super Class : " + div(18, 4));

	}

}
