package com.tyss.capgemini.collections;

public class CustomListExecuter {
	public static void main(String[] args) {
		CustomList customList = new CustomList(4);
		
		customList.add("1");
		customList.add("4");
		customList.add("1");
		customList.add("12");
		customList.add("1");
		customList.add("2");
		
		System.out.println("Size of the CustomList : "+customList.size());
		System.out.println("*********************************************");
		
		for (int i = 0; i < customList.size(); i++) {
			System.out.println(customList.get(i));
		}
		System.out.println("*********************************************");
		
		System.out.println("customList contains 1 : "+ customList.contains("1"));
		System.out.println("customList contains 145 : "+ customList.contains("145"));
		
		System.out.println("*********************************************");
		System.out.println("Index value of 2 :"+ customList.getIndex("2"));
		
		

	}

}


