package com.jspbasic.variousinputs;

import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputProd
 */
@WebServlet("/inputprod.do")
public class InputProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InputProd() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Queue<String> values = new LinkedList<String>();
		
		Enumeration<String> en = request.getParameterNames();
		
		while(en.hasMoreElements()) {
			String paraName = en.nextElement();
			String value = request.getParameter(paraName);
			
			values.add(value);
			
		}
		
		
//		String prodName = request.getParameter("prodName");
//		int quantity = Integer.parseInt(request.getParameter("quantity"));
//		int price = Integer.parseInt(request.getParameter("price"));
//		String color = request.getParameter("color");
		
		Product prod = new Product(values.poll(), Integer.parseInt(values.poll()), Integer.parseInt(values.poll()), values.poll());
//		Product prod = new Product(prodName, quantity, price, color);
		
		request.setAttribute("Product", prod);
		RequestDispatcher rd = request.getRequestDispatcher("productOutput.jsp");
		rd.forward(request, response);
		
	}

}
