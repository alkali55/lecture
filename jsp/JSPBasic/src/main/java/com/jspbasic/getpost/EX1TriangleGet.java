package com.jspbasic.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TriangleGet
 */
@WebServlet("/TriangleGet")
public class EX1TriangleGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EX1TriangleGet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		int base = Integer.parseInt(request.getParameter("base"));
		int height = Integer.parseInt(request.getParameter("height"));
		float volume = (float)base * height / 2;
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.write("<!DOCTYPE html>\r\n");
		out.write("<html>\r\n");
		out.write("<head>\r\n");
		out.write("<meta charset=\"UTF-8\">\r\n");
		out.write("<title>Get방식 삼각형</title>\r\n");
		out.write("</head>\r\n");
	    out.write("<body>\r\n");
	    out.write("	<div> 밑변은 " + base + "</div>\r\n");
	    out.write("	<div> 높이는 " + height + "</div>\r\n");
	    out.write("	<div> 넓이는 " + volume + "</div>\r\n");
	    out.write("</body>\r\n");
	    out.write("</html>");
	    
	    out.flush();
	    out.close();
		
//		PrintWriter writer = response.getWriter();
//		writer.print("<!DOCTYPE html>"
//				+ "<html>"
//				+ "<head>"
//				+ "<meta charset=\"UTF-8\">"
//				+ "<title>삼각형의 넓이</title>"
//				+ "</head>"
//				+ "<body>"
//				+ "<h1>삼각형의 넓이는 " + volume + "</h1>"
//				+ "</body>"
//				+ "</html>"
//				);
//		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
