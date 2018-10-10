package com.midas.model;

public class UserRegister {
	
	private String userName;
	private String password;
	
	public UserRegister(){
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegister [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
