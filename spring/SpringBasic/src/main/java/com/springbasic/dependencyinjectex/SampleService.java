package com.springbasic.dependencyinjectex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	
//	---- 필드 주입 방식 ----
//	@Autowired // 객체 주입
//	@Qualifier("special")
//	private SampleDAO sampleDAO; // 필드 주입 방식
//	// SampleService는 SampleDAO 인터페이스만 바라보고 있다.
//	// 느슨한 결합 (loose coupling) 이라서, 나중에 SampleDAO 타입의 객체가 다른 객체로 변경되더라도
//	// SampleService 타입을 이용하는 코드를 수정할 일 없다. -> 유연한 구조가 된다.
	
	@Qualifier("special")
	private final SampleDAO sampleDAO; // ---- 생성자 주입 방식 (권장)
	
	
	
	
	public void serviceMethod() {
		sampleDAO.sampleMethod();
	}
}
