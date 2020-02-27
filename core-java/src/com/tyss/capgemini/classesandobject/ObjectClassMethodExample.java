package com.tyss.capgemini.classesandobject;

public class ObjectClassMethodExample {

	public static void main(String[] args) {
		ObjectClassMethodExample objectClassMethodExample = new ObjectClassMethodExample();
		// getClass() ----returns-Object
		System.out.println(objectClassMethodExample.getClass()); // To get the class of this particular object
		// hashCode()
		/*
		 * int hashCode = objectClassMethodExample.hashCode();
		 * System.out.println(hashCode);
		 */

		ObjectClassMethodExample objectClassMethodExample2 = new ObjectClassMethodExample();
// If we invoke constructor 2 times, It will be created in a different locations.
		// hashCode()  --- returns-Integer
		System.out.println(objectClassMethodExample);
		System.out.println(objectClassMethodExample2);
		System.out.println("With toString() : "+ objectClassMethodExample.toString());
		System.out.println("With toString() : "+ objectClassMethodExample2.toString());
		System.out.println(objectClassMethodExample.hashCode());
		System.out.println(objectClassMethodExample2.hashCode());
		// We are using equals method to check the locations here.....returns-boolean
		System.out.println(objectClassMethodExample.equals(objectClassMethodExample2));

		
	}

}
