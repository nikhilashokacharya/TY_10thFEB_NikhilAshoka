package com.tyss.capgemini.cfs;

import java.lang.invoke.SwitchPoint;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// String is case sensitive
		String day = "Monday";
		switch (day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Weekday");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Invalid Day!!!!");
			break;
		}
	}

}
