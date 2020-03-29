package com.tyss.capgemini.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("newFile.txt");) {

			int charUnicode;// Unicode returns a integer. 
			while ((charUnicode = fileReader.read()) != -1) {
				System.out.print((char)charUnicode); // Since Unicode returns a integer, We cast this to char datatype.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
