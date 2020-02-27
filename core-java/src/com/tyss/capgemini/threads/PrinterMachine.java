package com.tyss.capgemini.threads;

public class PrinterMachine {
	synchronized public static void main(String[] args) {
		// Read about synchronized keyword
		System.out.println("++++++++++Printer Machine started++++++++++++++++");
		
		PrintingApplication printingApplication = new PrintingApplication();
		ComputerSystem1 computerSystem1 = new ComputerSystem1(printingApplication);
		ComputerSystem2 computerSystem2 = new ComputerSystem2(printingApplication);
		
		computerSystem1.start();
		try {
			computerSystem1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		computerSystem2.start();
		try {
			computerSystem2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("++++++++++Printer Machine stopped++++++++++++++++");
		
		
	}

}
