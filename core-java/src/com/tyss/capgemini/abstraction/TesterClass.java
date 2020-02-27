package com.tyss.capgemini.abstraction;

public class TesterClass extends AbstractClassExample {

	@Override
	public String displayMessage() {

		return "displayMessage() of MethodInterface which was not overriden in AbstractClassExample";
	}

	@Override
	String display() {
		return "display() of AbstractClassExample";
	}

	@Override
	String print() {
		return "print() of AbstractClassExample";
	}

	public static void main(String[] args) {
		TesterClass testerClass = new TesterClass();

		System.out.println(testerClass.display());
		System.out.println(testerClass.print());
		System.out.println(testerClass.displayMessage());
		System.out.println(testerClass.printMessage());

	}

}
