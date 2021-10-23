package de.thi.inf.sesa.spring.controller;

public class UserRequest {
	private String name;
	private String password;
	
	public UserRequest() {
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
