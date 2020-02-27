package com.tyss.capgemini.exceptions;

import java.io.ObjectInputStream.GetField;

public class ExceptionExample {
	public static void main(String[] args) {
		String string = "";

		System.out.println(string.length());

		// The message displayed for exception is from the String class.
		// Exceptions - 2 types.
		// checked - compile time exception.
		// and unchecked exception - run time exception.

		// Exceptions can be handled.
		try {
			int a[] = new int[2];
			System.out.println(a[3]);
			System.out.println(string.charAt(3));
			int i = 10 / 0;
			System.out.println(i);
		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace(); // Not recommended
			System.out.println("charAt(int index) should not be called on null strings."); // Custom message can be
																							// printed in the
																							// exceptions.
			System.out.println(e.getClass()); // Gets the Class of the Exception occured here. It is
												// java.lang.StringIndexOutOfBoundsException
			System.out.println(e.getCause()); // The return type is Throwable, So, Nothing it is throwing, Hence null...
			System.out.println(e.getMessage()); //
		} catch (ArithmeticException e) {
			System.err.println("Should not be divided by zero");
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.err.println(e.getMessage());
		} catch (Exception e) { // If there is any exception that is not in the above catch blocks, then this
								// block of catch is executed. This should be last catch block, else there will
								// be an error saying that unreachable code
			System.err.println("It is a Super Exception.");
			System.out.println(e.getClass());
			System.err.println(e.getMessage());
		}

	}
}
