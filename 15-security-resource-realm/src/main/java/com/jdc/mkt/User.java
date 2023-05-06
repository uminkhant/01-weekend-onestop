package com.jdc.mkt;

public class User {

	private String loginId;
	private String password;
	private Role role;
	
	
	public enum Role{
		Admin,Member
	}

	public User(String loginId, String password, Role role) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}


	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
