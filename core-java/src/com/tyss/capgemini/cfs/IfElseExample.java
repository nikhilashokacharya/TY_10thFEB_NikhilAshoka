package com.tyss.capgemini.cfs;

public class IfElseExample {

	public static void main(String[] args) {
		int time = 2359;
		
		if(time>=2300)
			System.out.println("Include Late Night Charges");
		else
			System.out.println("Exclude Late Night Charges");
		
		System.out.println("Pizza Delivered");
	}
}
