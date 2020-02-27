package com.tyss.capgemini.methods;

public class AreaCalculator {
	public int calculateAreaOfSquare(int side) {
		return side*side;				
	}
	public int calculateAreaOfRectangle(int length,int width) {
		return length*width;		
	}
	public double calculateAreaOfCircle(int radius) {
		return 3.14*radius*radius;
	}
}
