package com.tyss.capgemini.filehandling;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args)  {

		try (FileWriter fileWriter = new FileWriter("newFile.txt");) {

			fileWriter.write("FileWriter example of writing data...");
			fileWriter.write("FileWriter example of writing data(1st)...");
			fileWriter.append("FileWriter example of writing data(2nd)...");

			System.out.println("Data has been written in this file....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
