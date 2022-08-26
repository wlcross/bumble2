package dev.cross.model;

public class Login {

	String username;
	String password;
	
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	String getPassword() {
		return password;
	}
	
	String getUsername() {
		return username;
	}
	
	
}
