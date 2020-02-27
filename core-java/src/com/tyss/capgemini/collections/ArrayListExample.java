package com.tyss.capgemini.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(12);
		arrayList.add(0, 16); // Since 16 was inserted into the zeroth position, the value 12 is shifted to
								// first position.
		arrayList.add(34);
		arrayList.add(43);
		arrayList.add(100);
		arrayList.add(29);
		arrayList.add(11);
	//	arrayList.add(null);
		
		Collections.sort(arrayList);
		

		System.out.println("Size of arrayList : " + arrayList.size());
		System.out.println("********************");

		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("********************");

		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(3));  // At this moment there is actually no values within this position, hence we are getting an exception
		System.out.println("********************");

		System.out.println(arrayList); // This will display the arrayList contents.
		System.out.println("********************");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
		System.out.println("********************");
		 arrayList.remove(4); // The Argument in remove method is index value.
		 for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
				
			}
		 
		 Collections.rotate(arrayList, -(arrayList.size()-1));
		 for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
				
			}
		 
		 
		 System.out.println("Output of arrayList.contains(23) : "+ arrayList.contains(23));
		 System.out.println("Output of arrayList.contains(null) : "+ arrayList.contains(null));
		 
		
	}
}
