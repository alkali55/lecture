package com.jspbasic.cookieex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCook.do")
public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReadCookieServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		// 쿠키 읽기
		Cookie[] cooks = request.getCookies();
		
		// myCook 이라는 쿠키의 값 출력
		String cookieName = "myCook";
		for (Cookie c : cooks) {
			if(c.getName().equals(cookieName)) {
				out.print(c.getName() + " : " + c.getValue());
			}
		}
		
		// 전체 쿠키 출력
		out.print(" <br> 전체쿠키 <br>");
		for (Cookie c : cooks) {
			out.print(c.getName() + " : " + c.getValue() + "<br>");
		}
		
		// 쿠키 삭제
		for (Cookie c : cooks) {
			if(c.getName().equals(cookieName)) {
				c.setMaxAge(0); // 쿠키 만료일을 0초로 설정 = 쿠키 삭제
				c.setPath("/"); // myCook 쿠키 삭제시 경로를 일치시켜준다.
				response.addCookie(c);
			}
		}
	}

}
