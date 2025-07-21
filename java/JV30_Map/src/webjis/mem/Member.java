package webjis.mem;

import java.util.Objects;

public class Member {
	
	private String memberId;
	private String memberName;
	
	
	
	
	Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Member) {
			Member tmp = (Member)obj;
			if(memberId == tmp.memberId) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "[" + memberId + ", " + memberName + "]";
	}
	
}
