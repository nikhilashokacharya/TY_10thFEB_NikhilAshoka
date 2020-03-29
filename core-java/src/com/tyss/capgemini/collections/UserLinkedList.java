package com.tyss.capgemini.collections;

import java.util.LinkedList;

import com.tyss.capgemini.encapsulation.User;

public class UserLinkedList {
public static void main(String[] args) {
	LinkedList<User> userLinkedList = new LinkedList<User>();
	
	User user1  =new User();
	User user2  =new User();
	User user3  =new User();
	User user4  =new User();
	
	user1.setUserid(2020001);
	user1.setUsername("Madan");
	user1.setPassword("qwerty1");

	user2.setUserid(2020002);
	user2.setUsername("Madana");
	user2.setPassword("qwerty12");

	user3.setUserid(2020003);
	user3.setUsername("Danam");
	user3.setPassword("qwerty123");
	
	user4.setUserid(2020004);
	user4.setUsername("Danama");
	user4.setPassword("qwerty1234");
	
	// User Insertion
	userLinkedList.add(user1);
	userLinkedList.add(user2);
	
	userLinkedList.addFirst(user4);
	userLinkedList.addLast(user3);
	
	//Retrieval of User
	for (User user : userLinkedList) {
		System.out.println(user);
	}
	System.out.println("************************************************");

	//Retrieval of Users using peek()
	System.out.println("Retrieval of Users using peek()");
	System.out.println(userLinkedList.peek());
	
	System.out.println("************************************************");

	//Retrieval and removal of User
	System.out.println("Retrieval and removal of User using poll()");
	System.out.println(userLinkedList.poll());
	System.out.println("************************************************");
	
	//Retrieval of User after the method is completed
	System.out.println("Retrieval of User after poll()");
	for (User user : userLinkedList) {
		System.out.println(user);
	}
	System.out.println("************************************************");

	
	//User after the poll() method
	System.out.println(userLinkedList);
	System.out.println("************************************************");
	
	
}
}
