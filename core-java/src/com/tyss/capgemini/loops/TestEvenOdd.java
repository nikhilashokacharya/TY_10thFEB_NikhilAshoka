package com.tyss.capgemini.loops;
import java.util.Scanner;
public class TestEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int i=scan.nextInt();
		if(i%2==0) {
			for(int j=1;j<=i;j++)
			{
				System.out.println(i+" is an even number");
			}
		}
		else
			System.out.println(i+" is odd number");
      scan.close(); // to over the resource leak problem
	}

}
