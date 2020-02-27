package com.tyss.capgemini.inheritance;

import com.tyss.capgemini.methods.Methods;

public class DifferentPackageMethodOverridingClass extends Methods{
	@Override
	public String printMessage() {
		return "DifferentPackageMethodOverridingClass.printMessage()";
	}
	
	@Override
	protected String welcomeMessage() {
		return "DifferentPackageMethodOverridingClass.welcomeMessage()";
	}
	//Public and protected methods of the Methods.class are visible
	//Default methods are not visible because this Methods.class is in different package
	//Private methods are also not visible.
	
	
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass 	d = new DifferentPackageMethodOverridingClass();
		
		System.out.println(d.printMessage());
		System.out.println(d.welcomeMessage());
	}
	
	
	

}
