package webjis.mem;

import java.util.HashMap;

public class ManageMember {
	
	private static HashMap<String, Member> memberList = new HashMap<String, Member>();
	
	public static HashMap<String, Member> getMemberList() {
		return memberList;
	}

	public static void insertMember(Member m) {
		
		if(memberList.containsKey(m.getMemberId())) {
			System.out.println("동일한 아이디가 존재합니다.");
		} else {
			memberList.put(m.getMemberId(), m);
		}
	}
	
	public static void selectMember(String memberId) {
		
		if (memberList.containsKey(memberId)){
			System.out.println(memberList.get(memberId));
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
	}
	
	public static void deleteMember(String memberId) {
		memberList.remove(memberId);
	}
	
	
}
