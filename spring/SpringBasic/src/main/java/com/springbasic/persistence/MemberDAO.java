package com.springbasic.persistence;

import java.util.List;

import com.springbasic.domain.MemberDTO;

public interface MemberDAO {
	
	// DB에서 현재날짜시간을 얻어오는 메서드
	String getDateTime();
	
	// 회원가입
	int insertMember(MemberDTO dto);
	
	// 회원 정보 수정
	int updateMember(MemberDTO dto);
	
	// 회원 삭제
	int deleteMember(String memberId);
	
	// 전체 회원 조회
	List<MemberDTO> selectAllMembers();
	
	// 아이디로 회원 조회
	MemberDTO selectMemberById(String memberId);
	
	// 로그인
	MemberDTO loginMember(String memberId, String memberPwd);
}
