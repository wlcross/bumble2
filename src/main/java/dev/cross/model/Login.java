package dev.cross.model;

public class Login {

	String username;
	String password;
	
	
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	
}
