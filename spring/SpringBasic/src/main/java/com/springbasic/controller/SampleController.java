package com.springbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
//	@ExceptionHandler(IllegalArgumentException.class)
//	public String exceptIllegal(Exception e, Model model) {
//		
//		model.addAttribute("e", e);
//		return "error";
//	}
//	
//	@ExceptionHandler(Exception.class)
//	public String exceptCommon(Exception e, Model model) {
//		
//		model.addAttribute("e", e);
//		return "error";
//	}
	
	@GetMapping("/exception1")
	public void doException1() {
		
		throw new IllegalArgumentException("IllegalArgumentException 예외 발생!!");
		
	}
	
	@GetMapping("/exception2")
	public void doException2() {
		
		throw new NumberFormatException("NumberFormatException 예외 발생!!");
	}
	
}
