package com.tyss.capgemini.loops;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("**************for-loop1**********************");
		for (int i = 0; i <= 10; i++) {
			System.out.println((i+1)*13);
		}
		
		System.out.println("**************for-loop2**********************");
		int j=0;
		for (; j < 10; j++) {
			System.out.println((j+1)*12);
			
		}
		System.out.println("**************for-loop3**********************");
		int k=0;
		for (; k < 10; ) {
			System.out.println((k+1)*11);
			k++;
		}
		
	}

}
