package com.jspbasic.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletPost
 */
@WebServlet("/hPOST")
public class HelloServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServletPost() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("POST 요청됨");
		
		request.setCharacterEncoding("utf-8"); // request객체 인코딩 설정
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		
		System.out.println("이름은 : " + name + ", 나이는 : " + age);
		
		// 응답
		
				// 응답할 문서의 종류와 인코딩 방식을 설정 (out 객체를 얻어오기 전에 설정해야 한다.)
				response.setContentType("text/html; charset=utf-8");
				
				PrintWriter out = response.getWriter();
				out.write("<!DOCTYPE html>\r\n");
				out.write("<html>\r\n");
				out.write("<head>\r\n");
				out.write("<meta charset=\"UTF-8\">\r\n");
				out.write("<title>Get방식 출력 응답</title>\r\n");
				out.write("</head>\r\n");
			    out.write("<body>\r\n");
			    out.write("	<div> 이름은 " + name + "</div>\r\n");
			    out.write("	<div> 나이는 " + age + "</div>\r\n");
			    out.write("</body>\r\n");
			    out.write("</html>");
			    
			    out.flush();
			    out.close();
	}

}
