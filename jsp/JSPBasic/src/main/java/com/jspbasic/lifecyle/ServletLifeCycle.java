package com.jspbasic.lifecyle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	
	int initCount = 1;
	int destroyCount = 1;
	int doGetCount = 1;
	
	@Override
	public void init() throws ServletException {
		// 현재 서블릿이 실행되기 전에 호출되는 메서드 (초기에 한번만 실행됨)
		System.out.println("init() 메서드는 첫 요청에서만 호출됨 " + this.initCount++);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() 메서드가 호출됨 " + this.doGetCount++);
	}
	@Override
	public void destroy() {
		// 종료될 때 호출됨.
		System.out.println("destroy() 메서드 호출됨 " + this.destroyCount++);
	}
	
}
