package com.tyss.capgemini.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		
		System.out.println("Size of linkedHashMap: "+ linkedHashMap.size());
		System.out.println("*********************************");
		
		linkedHashMap.put("1st key", 1);
		linkedHashMap.put("2nd key", 2);
		linkedHashMap.put("3rd key", 3);
		
		System.out.println("Size of linkedHashMap after put: "+ linkedHashMap.size());
		System.out.println("*********************************");
		
		System.out.println(linkedHashMap);
		System.out.println("*********************************");

		System.out.println("isEmpty() on linkedHashMap: "+ linkedHashMap.isEmpty());
		System.out.println("*********************************");

		System.out.println("remove() on linkedHashMap: "+ linkedHashMap.remove("4th key"));
		System.out.println("*********************************");

		System.out.println("linkedHashMap After the remove(): "+ linkedHashMap.size());
		System.out.println("*********************************");

	}
}
