package com.tyss.capgemini.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileExample {

	public static void main(String[] args) {
		try {
		Properties properties  = new Properties();
		properties.load(new FileReader("batch"
				+ ".properties"));
		System.out.println(properties.getProperty("batch"));
		
//		properties.setProperty("batch", "Java Cloud"); // Set property Overwrites the value in the file and prints in the console in the next line.m
//		System.out.println(properties.getProperty("batch"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
