package com.tyss.capgemini.threads;

public class PrintingMethodsClass2 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {
			System.err.println("Printing Values: " + i);
		}
	}
	
}
