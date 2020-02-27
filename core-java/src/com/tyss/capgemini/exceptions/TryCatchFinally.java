package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.err.println("It is an Arithmetic Exception");
			//System.exit(0);// The JVM will be shut down, hence further code will not be executed. Means,
							// The finally code will also will not be executed
		} catch (Exception e) {
			System.err.println("Exception caught in the code...");
		} finally {
			System.out.println("Code to be executed ,even though there is any exception.");

		}
		
		System.out.println("Some Code...");

	}
}
