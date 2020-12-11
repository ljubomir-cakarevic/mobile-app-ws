package com.appdeveloperblog.ws.model.response;

public class UserRest {
	//conver Java class into JSON response and contains user info that is
	//being sent back as a confirmation(user stored into database)
	//this class only contains details that we want to be returned back as response
	//make sure that we don't return any sensitive information
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
