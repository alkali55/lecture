package com.jspbasic.dto;

public class Member {
	
	private String userId;
	private String pwd;
	private String email;
	
	public Member() {}
	
	public Member(String userId, String pwd, String email) {
		super();
		this.userId = userId;
		this.pwd = pwd;
		this.email = email;
	}
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
}
