package webjis.member;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member mem1 = new Member("qwe", "123", "aaa", 15);
//		MemberService.reg(mem1);
//		MemberService.login("qwe", "123");
		
		Member loginInfo = new Member("gildong", "1234");
		MemberService ms = new MemberService();
		boolean result = ms.login(loginInfo.getId(), loginInfo.getPwd());
		
		if (result) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("아이디나 패스워드가 틀립니다.");
		}
	}

}
