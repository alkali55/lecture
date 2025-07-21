package com.springbasic.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.springbasic.domain.MemberDTO;

@Repository // 아래의 클래스가 DAO객체임을 명시
public class MemberDAOImpl implements MemberDAO {
	
	private static String ns = "com.springbasic.mappers.memberMapper.";
	
	@Inject
	private SqlSession ses; // SqlSessionTemplate객체 주입
	
	@Override
	public String getDateTime() {
		String result = ses.selectOne(ns + "getDateTime");
		
		
		return result;
	}

	@Override
	public int insertMember(MemberDTO dto) {

		int result = ses.insert(ns + "insertMember", dto);
		
		return result;
	}

	@Override
	public int updateMember(MemberDTO dto) {
		
		int result = ses.update(ns + "updateMember", dto);
		
		return result;
	}

	@Override
	public int deleteMember(String memberId) {

		int result = ses.delete(ns + "deleteMember", memberId);
		
		return result;
	}

	@Override
	public List<MemberDTO> selectAllMembers() {

		List<MemberDTO> list = ses.selectList(ns + "viewAllMember");
		
		return list;
	}

	@Override
	public MemberDTO selectMemberById(String memberId) {

		return ses.selectOne(ns + "viewMemberById", memberId);
		
	}

	@Override
	public MemberDTO loginMember(String memberId, String memberPwd) {
		
		// 여러개의 파라메터 값을 Map으로 만들어서 넘길 수 있다.
		Map<String, String> param = new HashMap<String, String>();
		param.put("memberId", memberId);
		param.put("memberPwd", memberPwd);
		
		// 매퍼에서 #{memberId}, #{memberPwd} 는 Map의 key와 정확히 일치해야 한다.
		return ses.selectOne(ns + "loginMember", param);
	}
	
	

}
