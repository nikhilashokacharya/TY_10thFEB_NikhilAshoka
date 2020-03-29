package com.tyss.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d"); // If you want a single digit(0-9). We cannot use new keyword for Pattern
													// because Pattern only contains one constructor and it also is
													// private.
		Matcher matcher = pattern.matcher("12");
		System.out.println(matcher.matches());

	}
}
