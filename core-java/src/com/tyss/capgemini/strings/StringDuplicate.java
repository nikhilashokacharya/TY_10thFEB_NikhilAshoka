package com.tyss.capgemini.strings;

public class StringDuplicate {

	public static void main(String[] args) {
		String s1="amamya";
		String s2=new String();
		for(int i = 0;i<s1.length();i++) {
			
		for(int j=i+1;j<s1.length();j++) {
			if (s1.charAt(i)==s1.charAt(j)) {
				
				s2 = s1.valueOf(s1.charAt(j));
			}
			
		}
		
		
	 
		}
		System.out.println(s2);
	}

}
