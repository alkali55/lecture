package com.springbasic.domain;

public class MemberDTO {
	
	private String memberId;
	private String memberPwd;
	private String memberEmail;
	private String memberMobile;
	private String memberGender;
	private String memberHobby;
	private String job;
	private String userImg;
	private String memo;
	private String isAdmin;
	
	public MemberDTO() {}

	public MemberDTO(String memberId, String memberPwd, String memberEmail, String memberMobile, String memberGender,
			String memberHobby, String job, String userImg, String memo, String isAdmin) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberEmail = memberEmail;
		this.memberMobile = memberMobile;
		this.memberGender = memberGender;
		this.memberHobby = memberHobby;
		this.job = job;
		this.userImg = userImg;
		this.memo = memo;
		this.isAdmin = isAdmin;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberHobby() {
		return memberHobby;
	}

	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberEmail=" + memberEmail
				+ ", memberMobile=" + memberMobile + ", memberGender=" + memberGender + ", memberHobby=" + memberHobby
				+ ", job=" + job + ", userImg=" + userImg + ", memo=" + memo + ", isAdmin=" + isAdmin + "]";
	}
}
