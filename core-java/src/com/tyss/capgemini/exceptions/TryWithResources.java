package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) { // Using this block of try, We dont need to close the scanner
															// multiple times. Try with rosource is internally
															// implementing the interface Closeable which internally
															// implement the AutoCloseable Interface. That is reason for
															// no warning of the scanner class overflow.
// We can have ONLY the try block, when we are having try with resource as given above in try(Scanner scanner = new Scanner(System.in)).
			int i = 10;
			int j = scanner.nextInt();

			if (j == 0)
				System.err.println("Should not divide the number by zero...");
			else
				System.out.println(i / j);
		}
	}
}
