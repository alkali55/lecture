package com.jspbasic.variousinputs;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VariousInputTypeServlet")
public class VariousInputTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VariousInputTypeServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("agree : " + request.getParameter("agree")); // null 또는 value값에 설정한 값 (Y)
		
		if (request.getParameter("agree") != null && request.getParameter("agree").equals("Y")) {
			String userId = request.getParameter("userId");
			String pwd = request.getParameter("pwd1");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String gender = request.getParameter("gender");
			String[] hobbys = request.getParameterValues("hobby");
			String hobby ="";
			String job = request.getParameter("job");
			String memo = request.getParameter("memo");
			
			System.out.println(userId + ", " + pwd);
			System.out.println("email : " + email);
			System.out.println("mobile : " + mobile);
			System.out.println("gender : " + gender);
			for (String h : hobbys) {
				System.out.println(h);
				hobby += h + ", ";
			}
			System.out.println("job : " + job);
			System.out.println("memo : " + memo);
			
			Member member = new Member(userId, pwd, email, mobile, gender, hobby, job, memo);
			
			request.setAttribute("member", member);
			RequestDispatcher rd = request.getRequestDispatcher("outputMember.jsp");
			rd.forward(request, response);
			
		}
	}

}
