package com.tyss.capgemini.threads;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PrintingValues {
	public static void main(String[] args) {

		System.out.println("++++++++++++++Application Started++++++++++++++");
		// The Threads are executed simultaneously, That is why we are getting a
		// different output each time.
		PrintingMethodsClass1 printingMethodsClass1 = new PrintingMethodsClass1();

		try {
			printingMethodsClass1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		printingMethodsClass1.start();
		Thread thread = new Thread(new PrintingMethodsClass2());

		try {
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		thread.start();
		
		try {
			thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("++++++++++++++Application Ended++++++++++++++");

	}
}