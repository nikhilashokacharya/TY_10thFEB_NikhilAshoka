package com.tyss.capgemini.threads;

public class ComputerSystem2 extends Thread{
 PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication localPrintingApplication) {
		this.printingApplication = localPrintingApplication;
		
	}
	@Override
	public void run() {
		System.err.println(">>>> Printing from ComputerSystem2...");
		printingApplication.printingDocuments("SomeOtherDocument.pdf", 10);
	}
	

}
