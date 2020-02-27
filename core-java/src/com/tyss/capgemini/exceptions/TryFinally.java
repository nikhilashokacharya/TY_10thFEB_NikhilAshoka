package com.tyss.capgemini.exceptions;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} finally { // Having a finally block is possible without a catch block.
			System.out.println("Code in finally block...");
		}
	}

}
