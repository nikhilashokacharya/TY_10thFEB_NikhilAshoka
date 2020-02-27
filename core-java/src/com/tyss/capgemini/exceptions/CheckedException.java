package com.tyss.capgemini.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			properties.load(new FileReader("application.properties"));
			System.out.println(properties.getProperty("name"));
		} catch (Exception e) { // For a checked exception, having a catch block is mandatory, else the code
								// will not be executed.
			System.err.println("Exception in catch block for the checked Exception..");

		} finally {
			System.out.println("Code in finally block");

		}
	}
}
