package webjis.member;

public class MemberService {
//	static Member[] members = new Member[10];
//	static int memCount = 0;
//	
//	public static void login(String id, String pwd) {
//		boolean logSuccess = false;
//		for(int i = 0; i < memCount; i++) {
//			if(members[i].getId().equals(id) && members[i].getPwd().equals(pwd)) {
//				logSuccess = true;
//				break;
//			}
//		}
//		if (logSuccess) {
//			System.out.println("로그인되었습니다");
//		} else {
//			System.out.println("아이디나 비밀번호가 틀립니다");
//		}
//	}
//	
//	public static void reg(Member member) {
//		
//		if (memCount < members.length) {
//		members[memCount] = member;
//		memCount++;
//		} else {
//			System.out.println("최대정원초과!!");
//		}
//		
//	}
	
	boolean login(String memberId, String memberPwd) {
		if (memberId.equals("gildong") && memberPwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
