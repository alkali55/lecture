package com.jspbasic.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("GET방식 호출");
		
		// 파라미터 수집
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int tot = kor + eng + math;
		float avg = tot / 3f;
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
		if (kor < 0 || kor > 100) {
			out.print("<script>");
			out.print("alert('국어 점수가 잘못 입력되었습니다.');");
			out.print("location.href='inputScore.jsp';");
			out.print("</script>");
		}
		
		
		// 출력방식 (1)
//		out.write("<!DOCTYPE html>\r\n");
//		out.write("<html>\r\n");
//		out.write("<head>\r\n");
//		out.write("<meta charset=\"UTF-8\">\r\n");
//		out.write("<title>성적표</title>\r\n");
//		out.write("</head>\r\n");
//	    out.write("<body>\r\n");
//	    out.write("	<div> 국어 : " + kor + "</div>\r\n");
//	    out.write("	<div> 영어 : " + eng + "</div>\r\n");
//	    out.write("	<div> 수학 : " + math + "</div>\r\n");
//	    out.write("	<div> 총점 : " + tot + "</div>\r\n");
//	    out.write("	<div> 평균 : " + avg + "</div>\r\n");
//	    out.write("</body>\r\n");
//	    out.write("</html>");
		
		
		// 출력방식 (2)
		// 출력할 변수를 바인딩
		request.setAttribute("kor", kor);
		request.setAttribute("eng", eng);
		request.setAttribute("math", math);
		request.setAttribute("tot", tot);
		request.setAttribute("avg", avg);
		
		// 전송
		RequestDispatcher rd = request.getRequestDispatcher("outputScore.jsp");
		rd.forward(request, response);
		
		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
