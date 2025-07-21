package com.springbasic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice // 컨트롤러에서 발생하는 예외에 맞게 처리할 수 있는 기능을 제공
public class CommonExceptionAdvice {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String exceptIllegal(Exception e, Model model) {
		
		model.addAttribute("e", e);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptCommon(Exception e, Model model) {
		
		model.addAttribute("e", e);
		return "error";
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String notFound() {
		
		return "error404";
	}
}
