package com.tyss.capgemini.cfs;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		System.out.println("Enter the current time in 24 hour format and in 4 digits:");
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		
		if(time>=2300)
			{
			System.out.println("Include Late Night Charges");
			}
		else
			{
			System.out.println("Exclude Late Night Charges");
			}
		System.out.println("Pizza Delivered");
	}
}
