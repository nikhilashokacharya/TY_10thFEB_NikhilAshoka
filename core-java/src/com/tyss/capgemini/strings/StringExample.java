package com.tyss.capgemini.strings;

public class StringExample {
	
	// String CLass is present in java.lang package
	// it is present since the first version of Java
	  // Strings are immutable = Strings are constant; their values cannot be changed after they are created.
	  // We have n number of constructors for String Class. (Check Ctrl+o)
	public static void main(String[] args) {
	
	
// string1,3,4 are present in a different location. Find out from Google		
	String string1 = "Some String";
	String string2 = new String("Some Other String");
	String string3 = "Some Other String";
	String string4 = "Some String";
	String string5 = new String("Some Other String");
	
	System.out.println(string1.hashCode());
	System.out.println(string2.hashCode());
	System.out.println(string3.hashCode());
	System.out.println(string4.hashCode());
	System.out.println(string5.hashCode());
	
	System.out.println("string1==string4 : "+string1.equals(string4));
	System.out.println("string2==string3 : "+string2.equals(string3));
	System.out.println("string2==string5 : "+string2.equals(string5));
	
	}
	
}
