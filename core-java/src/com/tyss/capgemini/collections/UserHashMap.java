package com.tyss.capgemini.collections;

import java.util.HashMap;

import com.tyss.capgemini.encapsulation.User;

public class UserHashMap {
	public static void main(String[] args) {

		HashMap<String, User> userHashMap = new HashMap<String, User>();

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();

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

		userHashMap.put("1st-user", user1);
		userHashMap.put("2nd-user", user2);
		userHashMap.put("3rd-user", user3);
		userHashMap.put("4th-user", user4);

		// Retrieval of Users\
		System.out.println("userHashMap after data insertion...");
		System.out.println(userHashMap);
		System.out.println("************************************************");

		// Update of User data

		user4.setPassword("qwerty@12345");
		userHashMap.put("4th-user", user4);

		// Retrieval of Users after update
		System.out.println("userHashMap after data updation...");
		System.out.println(userHashMap);
		System.out.println("************************************************");

		// Deletion of User
		userHashMap.remove("3rd-user");

		// Retrieval of Users after Deletion
		System.out.println("userHashMap after data deletion...");
		System.out.println(userHashMap);
		System.out.println("************************************************");

	}
}
