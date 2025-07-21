package com.springbasic.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springbasic.domain.Student;

/**
 * Handles requests for the application home page.
 */
@Controller	// 현재 클래스가 컨트롤러단임을 명시
public class HomeController {
	
	// 로그를 남길 수 있도록 하는 객체
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// servlet으로부터 요청된 객체를 매핑
	// "/"가 GET방식으로 요청되면, 아래의 home메서드를 호출한다.
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		// model : controller 단에서 view단으로 바인딩된 데이터를 넘겨주는 객체.
		model.addAttribute("serverTime", formattedDate );
		
		// view resolver에게 "home"문자열을 반환
		// "/WEB-INF/views/" + "home" + ".jsp"
		// 최종적으로 Dispatcher Servlet에 의해 response가 됨.
		return "home";
	}
	
	@RequestMapping(value = "/doAct1")
	public String doAction1() {
		System.out.println("doAction1이 호출됨");
		
		return "doAction1"; // "/WEB-INF/views/" + 반환값 + ".jsp" 페이지로 렌더링.
	}
	
	@RequestMapping(value = "/doAct2")
	public void doAction2() { // 반환값이 void이면 요청url과 같은 이름의 jsp페이지로 렌더링
		logger.info("doAct2 요청됨");
	}
	
	@RequestMapping(value = "/doAct3")
	public String doAction3(Model model) {
		
		logger.info("doAction3() 호출됨");
		String name = "jis";
		model.addAttribute("name", name); // model 객체에 바인딩
		return "doAction3";
	}
	
	@RequestMapping(value = "/doAct4")
	public ModelAndView doAction4() {
		logger.info("doAction4() 호출됨");
		
		String name = "jis";
		// ModelAndView 객체에 바인딩
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name); // 데이터 바인딩
		mav.setViewName("doAction4"); // 뷰이름
		
		return mav;
		
	}
	
	@RequestMapping(value = "/doAct5")
	public void doAction5(Model model) {
		
		Student stu = new Student("25001", "홍길동");
//		model.addAttribute("stu", stu);
		
		// 바인딩하는 객체의 파라미터 이름을 지정하지 않은 경우에는
		// 자동으로 클래스명 앞글자를 소문자로 바꿔서 바인딩
		model.addAttribute(stu);
	}
	
	@GetMapping("/exception3")
	public void doException3() {
		throw new ArithmeticException("ArithmeticException 예외 발생!!");
	}
}
