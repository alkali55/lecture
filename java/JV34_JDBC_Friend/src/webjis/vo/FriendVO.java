package webjis.vo;

public class FriendVO {
	
	// 멤버변수
	private int friendNo;
	private String friendName;
	private String mobile;
	private String addr;
	

	public FriendVO(int friendNo, String friendName, String mobile, String addr) {
		super();
		this.friendNo = friendNo;
		this.friendName = friendName;
		this.mobile = mobile;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "FriendVO [friendNo=" + friendNo + ", friendName=" + friendName + ", mobile=" + mobile + ", addr=" + addr
				+ "]";
	}
	
	
}
