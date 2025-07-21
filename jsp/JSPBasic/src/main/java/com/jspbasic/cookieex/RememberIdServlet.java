package com.jspbasic.cookieex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RememberIdServlet")
public class RememberIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RememberIdServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String rememberId = request.getParameter("rememberId");
		PrintWriter out = response.getWriter();
		
		if("asdf".equals(userId) && "1234".equals(userPwd)) {
			Cookie c1 = new Cookie("rememberId", rememberId);
			Cookie c2 = new Cookie("userId", userId);
			if(rememberId != null) {
				if(rememberId.equals("Y")) {
					c1.setMaxAge(24*60*60);
					c2.setMaxAge(24*60*60);
					
				}
			} else {
				c1.setMaxAge(0);
				c2.setMaxAge(0);
			}
			response.addCookie(c1);
			response.addCookie(c2);
		} else {
//			out.print("<script>alert('로그인 실패!')</script>");
			response.sendRedirect("rememberId.jsp");
		}
	}

}
