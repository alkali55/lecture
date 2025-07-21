package com.jspbasic.variousinputs;

public class Member {
	
	private String userId; 
	private String pwd; 
	private String email; 
	private String mobile; 
	private String gender; 
	private String hobby; 
	private String job; 
	private String memo;
	
	public Member(String userId, String pwd, String email, String mobile, String gender, String hobby, String job,
			String memo) {
		this.userId = userId;
		this.pwd = pwd;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.hobby = hobby;
		this.job = job;
		this.memo = memo;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}


	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pwd=" + pwd + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", hobby=" + hobby + ", job=" + job + ", memo=" + memo + "]";
	}

	
}
