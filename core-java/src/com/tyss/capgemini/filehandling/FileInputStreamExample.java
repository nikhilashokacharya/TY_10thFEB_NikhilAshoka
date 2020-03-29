package com.tyss.capgemini.filehandling;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("bg.jpg");){
			int imgCode = 0;
			
			while((imgCode = fileInputStream.read())!= -1) {
				System.out.println(imgCode);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
