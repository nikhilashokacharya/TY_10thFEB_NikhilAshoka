package com.tyss.capgemini.cfs;

public class ElseIfLadder {

	public static void main(String[] args) {
		int number = 21;

		if (number < 13) {
			System.out.println("Not a Teen Number(Number is below 13)");
		} else if ((number >= 13) && (number <= 19)) {
			System.out.println("Teen Number");
		} else {
			System.out.println("Not a Teen Number(Number is above 19)");
		}
	}
}
