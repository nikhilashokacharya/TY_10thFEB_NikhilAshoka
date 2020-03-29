package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		scanner.close();

		try {
			System.out.println(10 / number);
		} catch (Exception e) {
			throw new InvalidNumberCustomException("Any Message");
			
			// Another way to write Custom exception
		}
	}
}
