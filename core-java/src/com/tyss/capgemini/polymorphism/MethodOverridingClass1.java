package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass1 implements MethodsInterface {

	@Override
	public String displayMessage() {
		return "Overriden displayMessage() of MethodsInterface from MethodOverridingClass1";
	}

	@Override
	public String printMessage() {
		return "Overriden printMessage() of MethodsInterface from MethodOverridingClass1";
	}

}
