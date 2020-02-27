package com.tyss.capgemini.operators;

public class Charincdec {

	public static void main(String[] args) {
		char c='A';
		
		
		System.out.println("Value of c for post-increment: "+ c++); //A
		System.out.println(c);										//B
		System.out.println("Value of c for pre-increment: "+ ++c);  //C
		System.out.println(c);										//C
		
		System.out.println();
		
		System.out.println("Value of c for post-decrement: "+ c--); //C
		System.out.println(c);										//B
		System.out.println("Value of c for pre-decrement: "+ --c);  //A
		System.out.println(c);										//A
		
		
	}

}
