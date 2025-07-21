package com.springbasic.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbasic.domain.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
//	@Inject
	@Autowired
	private MemberDAO dao;
	
//	@Test
//	public void getDateTime() {
//		System.out.println(dao.getDateTime());
//		
//	}
	
//	@Test
//	public void insertMember() {
//		MemberDTO member = new MemberDTO("asdfgh", "1234", "asdfgh@abc.con", "010-1111-3333", "F", null, null, null, "잘 저장되나요?", "Y");
//		
//		if (dao.insertMember(member) == 1) {
//			System.out.println("회원 저장 성공");
//		}
//	}
	
//	@Test
//	public void updateMember() {
//		
//		MemberDTO member = new MemberDTO("asdfgh", "1234", null, "010-5555-1298", null, null, null, null, null, null);
//		if( dao.updateMember(member) == 1) {
//			System.out.println("전화번호 수정 완료");
//		}
//	}
	
//	@Test
//	public void deleteMember() {
//		
//		String memberId = "asdfgh";
//		if(dao.deleteMember(memberId) == 1) {
//			System.out.println("회원 삭제 성공");
//		}
//	}
	
//	@Test
//	public void viewAllMember() {
//		
//		List<MemberDTO> list = dao.selectAllMembers();
//		
//		for (MemberDTO member : list) {
//			System.out.println(member);
//		}
//	}
	
//	@Test
//	public void viewMemberById() {
//		System.out.println(dao.selectMemberById("qwerty"));
//	}
	
	@Test
	public void loginMember() {
//		System.out.println(dao.loginMember("asdfgh", "1234"));
		
		if(dao.loginMember("asdfgh", "1234") != null) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
