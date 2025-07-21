package com.jspbasic.eljstl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspbasic.dto.Member;

@WebServlet("/ELScopeServlet")
public class ELScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ELScopeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Member member = new Member("gildong", "1234", "gildong@abc.com");
		
		request.setAttribute("member", member);
		request.setAttribute("result", "result");
		
		HttpSession ses = request.getSession();
		
		int num1 = 5, num2 = 3;
		int result = num1 + num2;
		ses.setAttribute("result", result);
		
		request.getRequestDispatcher("eljstl/elScope.jsp").forward(request, response);
	}


}
