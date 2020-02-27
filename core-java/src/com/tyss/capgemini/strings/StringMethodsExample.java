package com.tyss.capgemini.strings;

public class StringMethodsExample {

	public static void main(String[] args) {
		String string1 = "Some String";
		String string2 = "";
		String string3 = "sOmE sTRiNG";
        
        //System.out.println(a);
		System.out.println("Length of string1 : " + string1.length());
		System.out.println("Length of string2 : " + string2.length());

		System.out.println("isEmpty() of string1 : " + string1.isEmpty());
		System.out.println("isEmpty() of string2 : " + string2.isEmpty());

		System.out.println("charAt(7) of string1 : " + string1.charAt(7));
	//	System.out.println(string2.charAt(7));   // It throws an StringIndexOutOfBoundsException
		
		System.out.println("charAt(string1.length()-1) of string1 : "+string1.charAt(string1.length()-1));  // To print the last char, -1 because the length is count from 1 but the index of charAt is count from 0.Throws OutOfBoundsException
		System.out.println("equals() method of String : "+ string1.equals(string3));
		
		System.out.println("equalsIgnoreCase(string3) : " + string1.equalsIgnoreCase(string3));
		
		System.out.println(string1.concat(" to print")); // Here we have concatenated with string1. But in the next line, The value is still the initial assignment. This is the meaning of immutable
		System.out.println(string1); // In the above line we are actually not concatenating the " to print". We are just executing concat method.
		
		// To overcome the above problem, We can assign it.
		
		string1 = string1.concat(" to be printed");
		String string4 = string1.concat(" Today");
		
		System.out.println(string1);
		System.out.println(string4);
		
		String string5 = string1.replace('S', 's');  // Caps 'S' is replaced with the 's'
		System.out.println("replace() output : "+string5);
		
		String string6 = String.valueOf(1234); // converts data into String.
		System.out.println(string6);
		
		System.out.println("string1 to UpperCase() : "+string1.toUpperCase());
		System.out.println("string1 to LowerCase() : "+string1.toLowerCase());
		
		System.out.println("substring from 11th pos to end : "+string1.substring(10));
		System.out.println("substring from 4th pos to 11th pos : "+string1.substring(3, 11));
		
		System.out.println("startsWith(String prefix) of String : "+string1.startsWith("om"));
		System.out.println("endsWith(String postfix) of String : "+string1.endsWith("d")); // returns boolean value
		
	
	}
}
