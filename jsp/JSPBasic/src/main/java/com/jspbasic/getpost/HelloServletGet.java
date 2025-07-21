package com.jspbasic.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hGET")
public class HelloServletGet extends HttpServlet{

	public HelloServletGet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("GET방식 요청됨");
		
		String name = req.getParameter("name");
		// 파라미터가 없으면 null반환 (./hGET)
		System.out.println("이름 : " + name);
		
		// 응답
		
		// 응답할 문서의 종류와 인코딩 방식을 설정 (out 객체를 얻어오기 전에 설정해야 한다.)
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.write("<!DOCTYPE html>\r\n");
		out.write("<html>\r\n");
		out.write("<head>\r\n");
		out.write("<meta charset=\"UTF-8\">\r\n");
		out.write("<title>Get방식 출력 응답</title>\r\n");
		out.write("</head>\r\n");
	    out.write("<body>\r\n");
	    out.write("	<h1> 이름은 " + name + "</h1>\r\n");
	    out.write("</body>\r\n");
	    out.write("</html>");
	    
	    out.flush();
	    out.close();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}
