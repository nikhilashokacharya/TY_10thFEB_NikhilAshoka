package com.tyss.capgemini.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		// We cannot give direct string value to string buffer.

		String string1 = "Some String";
		String str = "MALAYALAM";
		StringBuffer stringBuffer = new StringBuffer(string1);
		StringBuffer s2 = new StringBuffer(str);
		System.out.println(stringBuffer.getClass());

		System.out.println(stringBuffer.length());

		stringBuffer.append("Buffer");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());// If you want to reverse a string, you have to convert it into a
													// StringBuffer, then you have use reverse.
		System.out.println(stringBuffer.reverse());

		System.out.println(s2.reverse()); // Palindrome

		stringBuffer.replace(0, 1, "s"); // Here we can replace only the elements with our choice, i.e from position 0
											// to position 1 we are replacing only s
		System.out.println(stringBuffer);
		
		stringBuffer.insert(5, "ABC"); // Here the value ABC is inserted at the index 5
		System.out.println(stringBuffer);
		
		int index = stringBuffer.indexOf("AB");
		System.out.println(index);

	}

}
