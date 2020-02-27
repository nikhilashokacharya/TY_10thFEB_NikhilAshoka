package com.tyss.capgemini.loops;

public class SumOfFiftyEven {

	public static void main(String[] args) {
		
int count=0;
		int i=2;
		while(i<=50)
		{
			count=count+i;
			i+=2;
		}
		System.out.println("Sum of 1st 50 even numbers: "+count);
	}

}
