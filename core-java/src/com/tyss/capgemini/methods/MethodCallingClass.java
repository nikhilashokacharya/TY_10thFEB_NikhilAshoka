package com.tyss.capgemini.methods;

public class MethodCallingClass {

	public static void main(String[] args) {
		AreaCalculator a = new AreaCalculator();
		// To use the method of a different class, We need to create an object of that
		// class, Here, Create the Object of AreaCalculator class.
		System.out.println("Area of Square: " + a.calculateAreaOfSquare(4));
		System.out.println("Area of Rectangle: " + a.calculateAreaOfRectangle(4, 5));
		System.out.println("Area of Circle: " + a.calculateAreaOfCircle(4));
	}

}
