package com.jspbasic.variousinputs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParameterNamesServlet
 */
@WebServlet("/GetParameterNamesServlet")
public class GetParameterNamesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetParameterNamesServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration<String> params = request.getParameterNames();
		
		while(params.hasMoreElements()) {
			
			String paramName = params.nextElement();
			
//			System.out.println(paramName);
//			System.out.println(request.getParameterValues(paramName));
			
			List<String> valueList = new ArrayList<String>();
			
			String[] valueArr = request.getParameterValues(paramName);
			
			// 일반 배열을 ArrayList에 담기
			// 1)
			for(String value : valueArr) {
				valueList.add(value);
			}
			
			// 2)
			valueList = Arrays.asList(valueArr);
			System.out.println("params = " + paramName + " : " + valueList);
			
		}
					
		// -----------------------------------------------------------------------------------------
		Map<String, String[]> paraMap = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : paraMap.entrySet()) {
			String key = entry.getKey();
			String[] values = entry.getValue();
			System.out.println("paraMap = " + key + " : " + Arrays.toString(values));
		}
		
	}

}
