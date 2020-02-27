package com.tyss.capgemini.threads;

public class PrintingMethodsClass1 extends Thread{
	@Override
	public void run() {
		
		for (int i = 1; i < 10; i++) {
			System.out.println("Printing Values: " + i);
		}
	}
	
}
