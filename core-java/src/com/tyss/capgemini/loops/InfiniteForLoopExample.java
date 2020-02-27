package com.tyss.capgemini.loops;

public class InfiniteForLoopExample {

	public static void main(String[] args) {
		int i=0;
		
		for(;;)
		{
			System.out.println(i);
		}
//      The contents after/outside n infinite loop will not be executed. Its throws an error.
 //      System.out.println("Hello");

	}

}
