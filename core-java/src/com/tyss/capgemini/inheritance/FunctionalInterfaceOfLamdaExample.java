package com.tyss.capgemini.inheritance;

public class FunctionalInterfaceOfLamdaExample {

	// Lambda expression
	static String string = "Lambda Expression Example for FunctionalInterfaceExample";
	static FunctionalInterfaceExample f = () -> {
		System.out.println(string);
		System.out.println("Another Line with Lamdba Implementation");
	};
static FunctionalInterfaceExample2 f1 = (i, j) -> {
		System.out.print("TO Add in Lambda : ");
		return i + j;
	}; 
	// OR  
	//f1=(i,j) -> i+j;    // Also Works 
	//We cannot use sop here because internally sop converts
		// to toString(), but here the return type of add is
		// int.

	public static void main(String[] args) {
		f.displayMessage();
		f.showMessage();
		FunctionalInterfaceExample.printMessage(); // Static Method
		System.out.println(f1.add(4, 5));
		f1.display1Message();
		FunctionalInterfaceExample2.print1Message();

	}

}
