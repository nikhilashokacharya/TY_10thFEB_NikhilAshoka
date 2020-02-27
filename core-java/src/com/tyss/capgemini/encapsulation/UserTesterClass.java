package com.tyss.capgemini.encapsulation;

public class UserTesterClass {
	
	public static void main(String[] args) {
		
		User user1 = new User("Mike", "qwerty", 2020001);
		User user2 = new User();
		
		user2.setUsername("Toby");
		user2.setUserid(2020002);
		user2.setPassword("password");
		
		System.out.println(user1); // We are getting the correct output because of the toString method, Else We wil
									// get the address of the oject user1

		//
		System.out.println(user1.getUsername());
		System.out.println(user1.getUserid());

		System.out.println(user2);
	}
}
