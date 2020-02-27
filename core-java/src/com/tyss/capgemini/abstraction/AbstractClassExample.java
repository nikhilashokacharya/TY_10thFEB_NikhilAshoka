package com.tyss.capgemini.abstraction;

import com.tyss.capgemini.polymorphism.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface{
	abstract String display();
	abstract String print();
	
	@Override
	public String printMessage() {
		return "printMessage() of MethodsInterface";
	}
}

