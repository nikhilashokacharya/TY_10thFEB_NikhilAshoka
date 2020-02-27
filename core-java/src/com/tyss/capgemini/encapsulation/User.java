package com.tyss.capgemini.encapsulation;

public class User {

	// We are using private because it is most secure access specifier
	private String username;
	private String password;
	private Integer userid; // Integer is a class in Java which just acts as a int datatype. But it contains
							// many in-built methods
	
	// Press alt+shift+s and select generate getters and setters, then check.
	// The getters and setters are of Public.
	
	public User(String username, String password, Integer userid) {
		this.username = username;
		this.password = password;
		this.userid = userid;
	}
	public User() {
		
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + "]";
	}

	
	
	

}
