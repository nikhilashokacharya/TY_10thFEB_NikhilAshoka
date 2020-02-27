package com.tyss.capgemini.loops;

public class PowerExample {

	public static void main(String[] args) {
		int i=5;
		int j=4;
		int pow=1;
		for(int k=1;k<=j;k++)
		{
			pow=pow*i;
		}
		System.out.println(i+ " to the power of " +j+" is: " +pow);

	}

}
