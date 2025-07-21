package webjis.member;

public class Member {
//	private String memberId;
//	private String memberPwd;
//	private String memberName;
//	private int memberAge;
//	
//	Member(String memberId, String memberPwd, String memberName, int memberAge){
//		this.memberId = memberId;
//		this.memberPwd = memberPwd;
//		this.memberName = memberName;
//		this.memberAge = memberAge;
//	}
//	
//	public String getId() {
//		return memberId;
//	}
//	public String getPwd() {
//		return memberPwd;
//	}
//	public String getName() {
//		return memberName;
//	}
//	public int getAge() {
//		return memberAge;
//	}
	
	// 멤버변수
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberAge;
	
	// 생성자
	public Member(String memberId, String memberPwd) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}
	
	// 메서드
	// getter
	public String getId() {
		return memberId;
	}
	public String getPwd() {
		return memberPwd;
	}
	public String getName() {
		return memberName;
	}
	public int getAge() {
		return memberAge;
	}
}
