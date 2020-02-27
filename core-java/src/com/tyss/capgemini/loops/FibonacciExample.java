package com.tyss.capgemini.loops;

public class FibonacciExample {

	public static void main(String[] args) {
		
		int n=10;
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++)
		{
			int fib=a+b;
			a=b;
			b=fib;
			
			System.out.println(fib);
		}
		

	}

}
