package com.tyss.capgemini.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ThrowsKeywordClassExample {	
	// If there is a checked exception, We have to mandatorily write a throws exception
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
//		properties.load(new FileReader("application.properties"));   // Exception will Occur
		
		properties.load(new FileReader("application.properties"));
		System.out.println(properties.getProperty("name"));
		System.out.println("Some COde");
		
	}
}
