package com.tyss.capgemini.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println(linkedList.size());
		System.out.println("********************************");
		
		linkedList.add("1st");
		linkedList.add("2nd");
		linkedList.add("3rd");
		linkedList.add("4th");
		
		System.out.println("size of linkedList after add(): "+linkedList.size());
		System.out.println("********************************");

		System.out.println(linkedList);
		System.out.println("********************************");

		linkedList.addFirst("0th");
		linkedList.addLast("5th");
		System.out.println("size of linkedList after addFirst() and addLast(): "+linkedList.size());
		System.out.println("********************************");


		System.out.println("linkedList after addFirst() and addLast(): \n"+linkedList);
		System.out.println("********************************");
		
		System.out.println("linkedList.peek(): " + linkedList.peek());
		System.out.println("********************************");

		
		System.out.println("linkedList.peekFirst(): " + linkedList.peekFirst());
		System.out.println("********************************");
		
		System.out.println("linkedList.peekLast(): " + linkedList.peekLast());
		System.out.println("********************************");
		
		System.out.println("linkedList.poll(): " + linkedList.poll());
		System.out.println("********************************");
		
		System.out.println("linkedList.pollFirst(): " + linkedList.pollFirst());
		System.out.println("********************************");

		System.out.println("linkedList.pollLast(): " + linkedList.pollLast());
		System.out.println("********************************");
		
		System.out.println("linkedList after the poll() methods");
		System.out.println(linkedList);

		
		



	}
}
