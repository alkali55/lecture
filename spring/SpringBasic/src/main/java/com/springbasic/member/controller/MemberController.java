package com.springbasic.member.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
//	@RequestMapping(value = "memberSave", method = RequestMethod.GET)
	// 매핑 주소, 방식이 일치하는 경우 Ambiguous handler methods mapped for HTTP path
	// IllegalStateException 예외 발생
	@RequestMapping("memberView")
	public String doMemberView() {
		System.out.println("doMemberView 호출됨");
		
		return "doMemberView";
	}
	
	@RequestMapping(value = {"memberSave", "memberSave2"}, method = RequestMethod.GET)
	public String doMemberSave() {
		System.out.println("doMemberSave 호출됨");
		
		return "memberSave";
	}
	
	// 파라미터 수집
	// /memberTest?name=hong&age=10
	@RequestMapping(value ="memberTest")
//	public void doMemeberTest(@RequestParam(name="name") String name, @RequestParam(name="age", required = false) int age) {
	//  Optional int parameter 'age' is present but cannot be translated into a null value due to being declared as a primitive type. Consider declaring it as object wrapper for the corresponding primitive type.
	public void doMemeberTest(@RequestParam(name="name") String name, @RequestParam(name="age", required = false, defaultValue = "0") int age) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		// 1 - 1) String age (required = true)
		// memberTest 쿼리스트링이 없는 경우 => 400에러
		// memberTest?name=hong&age=         => name : hong, age :  (빈문자)
		// memberTest?name=hong				 => 400에러
		
		// 1 - 2) String age (required = false)
		// memberTest 쿼리스트링이 없는 경우 => 400에러
		// memberTest?name=hong&age=         => name : hong, age :  (빈문자)
		// memberTest?name=hong				 => name : hong, age : null
		
		
		// 2) int age (required = true)
		// memberTest 쿼리스트링이 없는 경우 => 400에러
		// memberTest?name=hong&age=         => 400에러
		// memberTest?name=hong		         => 400에러
		
		// 2-2) int age (required = false)
		// memberTest 쿼리스트링이 없는 경우 => 400에러
		// memberTest?name=hong&age=         => 400에러
		// memberTest?name=hong				 => 500에러 (Integer age로 수정하면 age : null)
		
		// 2-3) int age (required = false, defaultValue = "0")
		// memberTest?name=hong				 => name : hong, age : 0
	}
	
	@RequestMapping("paramTest")
	public void doParamTest(String name) {
		// paramTest?name=hong
		System.out.println("name : " + name);
	}
	
	/**
	 * 
	 * 요청 : praramTest2?name=hong&age=10
	 * @param paramMap
	 */
	
	@RequestMapping("paramTest2")
	public void doParamTest2(@RequestParam Map<String, Object> paramMap) {
		
		System.out.println("paramTest2 호출됨");
		System.out.println("name : " + paramMap.get("name"));
		System.out.println("age : " + paramMap.get("age"));
	}
}
