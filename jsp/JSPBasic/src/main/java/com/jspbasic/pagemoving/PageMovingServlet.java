package com.jspbasic.pagemoving;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagemove.do")
public class PageMovingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PageMovingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서블릿에서 페이지를 이동시키는 방법들
		PrintWriter out = response.getWriter();
		
		// 1) javascript의 location.href를 이용하는 방법
//		out.print("<script>");
//		out.print("location.href='mainTest.jsp'");
//		out.print("</script>");
		
		// 2) response.sendRedirect() 를 이용하는 방법 ***
		response.sendRedirect("mainTest.jsp");
		
		
		// 3) RequestDispatcher객체를 이용하여 forwarding하는 방법 ***
//		request.getRequestDispatcher("mainTest.jsp").forward(request, response);;
		
		// 4) meta태그
//		out.print("<html>");
//		out.print("<head>");
//		out.print("<meta http-equiv='refresh' content='5; URL=mainTest.jsp'>");
//		out.print("</head>");
//		out.print("</html>");
		
		out.flush();
		out.close();
	}


}
