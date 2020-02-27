package com.tyss.capgemini.operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int i = 10;
		int k = 10;
		int l=10,m=10;
		boolean isTrue = true;

		// Convert a positive number to a negative number
		int j = -i;
		System.out.println(j);

		// Using the not operator
		System.out.println(!isTrue);

		// increment operator
		System.out.println("Value of i with pre-increment: "+ ++i); // pre-increment - first increment the value of i and then use this value to
									                                // display
		System.out.println(i);

		System.out.println("Value of k with post-increment: "+ k++); // post-increment - first display the current value of k and then increment its
									                                 // current value
		System.out.println(k);
		
		// decrement operator
		System.out.println("Value of l with pre-decrement: "+ --l); // pre-decrement - first decrement the value of l and then use this value to
        // display
		System.out.println(l);
		System.out.println("Value of m with post-decrement: "+ m--); // post-decrement - first display the current value of m and then decrement its
        // current value
		System.out.println(m);
		
		
		
		
		

	}

}
