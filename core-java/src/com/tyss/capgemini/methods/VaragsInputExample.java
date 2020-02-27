package com.tyss.capgemini.methods;

public class VaragsInputExample {

	public int add(int... input) { // Here, We have created an array using 3 dots and the assigned a name as input
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		VaragsInputExample varagsInputExample = new VaragsInputExample();
		System.out.println("Sum : " + varagsInputExample.add(1,2,4,5,6,77,76,877)); // We can give as many inputs as we
																					// want
		
		
	}

}
