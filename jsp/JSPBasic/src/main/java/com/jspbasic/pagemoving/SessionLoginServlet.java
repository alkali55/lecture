package com.jspbasic.pagemoving;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionLoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post 호출됨");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		if(userId.equals("honggildong") && userPwd.equals("1234")) {
			// 로그인 성공 - 세션 객체에 로그인 정보를 남긴다.
			HttpSession ses = request.getSession();
			System.out.println("세션 id : " + ses.getId());
			
			ses.setAttribute("loginMemberId", userId); // 로그인한 멤버의 아이디를 세션 객체에 바인딩
			ses.setAttribute("loginMemberPwd", userPwd); // 로그인한 멤버의 비밀번호를 세션 객체에 바인딩
			
			response.sendRedirect("mainTest.jsp?status=loginSuccess");
		} else {
			response.sendRedirect("mainTest.jsp?status=loginFail");
		}
	}

}
