package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface {

	@Override
	public String displayMessage() {
		return "Overriden displayMessage() of MethodsInterface from MethodOverridingClass2";
	}

	@Override
	public String printMessage() {
		return "Overriden printMessage() of MethodsInterface from MethodOverridingClass2";
	}

}

