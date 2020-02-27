package com.tyss.capgemini.inheritance;

public  class MethodsInterfaceJ8Impl implements MethodsInterface {

	@Override
	public void displayMessage() {
		System.out.println("Overridden displayMessage() of MethodsInterface");
	}

	@Override
	public void printMessage() {
		System.out.println("Overridden printMessage() of MethodsInterface");
	}

	public static void main(String[] args) {
		MethodsInterfaceJ8Impl m = new MethodsInterfaceJ8Impl();
		m.displayMessage();
		m.printMessage();
		m.defaultMethodMessage();
		
	
		// Method is static within the interface, hence we are calling it using the
		// Interface-name and not calling via reference of OBJ.
		MethodsInterface.showMessage();
	}

	

}
