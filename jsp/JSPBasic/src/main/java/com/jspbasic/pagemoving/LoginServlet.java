package com.jspbasic.pagemoving;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//			String query = request.getQueryString();
//			response.sendRedirect("mainTest.jsp?" + query);
//		
//		
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		if(userId.equals("honggildong") && userPwd.equals("1234")) {
			response.sendRedirect("mainTest.jsp?status=loginSuccess");
		} else {
			response.sendRedirect("mainTest.jsp?status=loginFail");
		}
		
	
		
	}


}
